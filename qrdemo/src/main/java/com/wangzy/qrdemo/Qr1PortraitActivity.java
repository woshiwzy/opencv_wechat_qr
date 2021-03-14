package com.wangzy.qrdemo;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.SurfaceView;
import android.view.WindowManager;

import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.CameraActivity;
import org.opencv.android.CameraBridgeViewBase;
import org.opencv.android.CameraBridgeViewBase.CvCameraViewFrame;
import org.opencv.android.CameraBridgeViewBase.CvCameraViewListener2;
import org.opencv.android.LoaderCallbackInterface;
import org.opencv.android.OpenCVLoader;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;
import org.opencv.wechat_qrcode.WeChatQRCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Qr1PortraitActivity extends CameraActivity implements CvCameraViewListener2 {
    private static final String TAG = "opencv";

    private CameraBridgeViewBase mOpenCvCameraView;
    private boolean mIsJavaCamera = true;
    private MenuItem mItemSwitchCamera = null;


    private BaseLoaderCallback mLoaderCallback = new BaseLoaderCallback(this) {
        @Override
        public void onManagerConnected(int status) {
            switch (status) {
                case LoaderCallbackInterface.SUCCESS: {
                    Log.i(TAG, "OpenCV loaded successfully");
                    mOpenCvCameraView.enableView();
                }
                break;
                default: {
                    super.onManagerConnected(status);
                }
                break;
            }
        }
    };

    public Qr1PortraitActivity() {
        Log.i(TAG, "Instantiated new " + this.getClass());
    }


    WeChatQRCode weChatQRCode = null;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "called onCreate");
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.qr1_portrait);
        mOpenCvCameraView = (CameraBridgeViewBase) findViewById(R.id.tutorial1_activity_java_surface_view);
        mOpenCvCameraView.setVisibility(SurfaceView.VISIBLE);
        mOpenCvCameraView.setCvCameraViewListener(this);
    }

    @Override
    public void onPause() {
        super.onPause();
        if (mOpenCvCameraView != null)
            mOpenCvCameraView.disableView();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (!OpenCVLoader.initDebug()) {
            Log.d(TAG, "Internal OpenCV library not found. Using OpenCV Manager for initialization");
            OpenCVLoader.initAsync(OpenCVLoader.OPENCV_VERSION_3_0_0, this, mLoaderCallback);
        } else {
            Log.d(TAG, "OpenCV library found inside package. Using it!");
            mLoaderCallback.onManagerConnected(LoaderCallbackInterface.SUCCESS);
        }

        weChatQRCode = WechatQr.init(this);

    }

    @Override
    protected List<? extends CameraBridgeViewBase> getCameraViewList() {
        return Collections.singletonList(mOpenCvCameraView);
    }

    public void onDestroy() {
        super.onDestroy();
        if (mOpenCvCameraView != null)
            mOpenCvCameraView.disableView();
    }

    public void onCameraViewStarted(int width, int height) {
    }

    public void onCameraViewStopped() {
    }

    List<Mat> points = new ArrayList<>();
    Scalar scalar = new Scalar(255, 255, 0, 0);
    Point center = new Point();

    Mat dstRgb = null;
    Mat dstGray = null;

    Mat m = null;

    Size size=null;

    public Mat onCameraFrame(CvCameraViewFrame inputFrame) {
        points.clear();
        if(null!=dstGray){
            dstGray.release();
        }
        if(null!=dstRgb){
            dstRgb.release();
        }

        Mat rgba = inputFrame.rgba();//原彩图
        Mat grayMat = inputFrame.gray();//原灰度图

        center.x = rgba.cols() / 2;
        center.y = rgba.rows() / 2;

        if (null == dstRgb) {
            m = Imgproc.getRotationMatrix2D(center, 270, 1);
            //如果只处理彩图，就只需要创建和处理dstRgb，如果只需要处理灰度图，就只需要创建和处理dstGray
            dstRgb = new Mat(rgba.cols(), rgba.rows(), rgba.type());//接受旋转后的彩色图
            dstGray = new Mat(rgba.cols(), rgba.rows(), rgba.type());//接受旋转后的灰度图
            size=new Size(rgba.cols(), rgba.rows());
        }

        //如果只处理彩图，就只需要创建和处理dstRgb，如果只需要处理灰度图，就只需要创建和处理dstGray
        //旋转原彩图
        Imgproc.warpAffine(rgba, dstRgb, m,size );
        //旋转灰度图
        Imgproc.warpAffine(grayMat, dstGray, m,size);
        //传入到Opencv识别引擎
        List<String> results = weChatQRCode.detectAndDecode(dstGray, points);//灰度图帧率更高
//        List<String> results = weChatQRCode.detectAndDecode(dstRgb, points);//原彩帧率低一些

        if (null != results && results.size() > 0) {
            Log.e(TAG, "识别的结果数量：" + results.size());
            for (int i = 0, isize = results.size(); i < isize; i++) {
                Rect rect = Imgproc.boundingRect(points.get(i));
                Imgproc.rectangle(dstRgb, rect, scalar, 5);
                Imgproc.putText(dstRgb, results.get(i), rect.tl(), 0, 1, scalar);
            }
        }
        //返回原彩图旋转后的图
        return dstRgb;
    }
}
