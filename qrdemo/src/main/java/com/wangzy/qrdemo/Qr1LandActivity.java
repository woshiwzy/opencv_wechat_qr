package com.wangzy.qrdemo;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.CheckBox;

import org.opencv.android.BaseLoaderCallback;
import org.opencv.android.CameraActivity;
import org.opencv.android.CameraBridgeViewBase;
import org.opencv.android.CameraBridgeViewBase.CvCameraViewFrame;
import org.opencv.android.CameraBridgeViewBase.CvCameraViewListener2;
import org.opencv.android.LoaderCallbackInterface;
import org.opencv.android.OpenCVLoader;
import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;
import org.opencv.wechat_qrcode.WeChatQRCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Qr1LandActivity extends CameraActivity implements CvCameraViewListener2 {

    private static final String TAG = "opencv";
    private CameraBridgeViewBase mOpenCvCameraView;
    private boolean mIsJavaCamera = true;
    private MenuItem mItemSwitchCamera = null;
    private CheckBox checkboxCrop;

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

    public Qr1LandActivity() {
        Log.i(TAG, "Instantiated new " + this.getClass());
    }

    WeChatQRCode weChatQRCode = null;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.qr1_land);
        mOpenCvCameraView = findViewById(R.id.tutorial1_activity_java_surface_view);
        mOpenCvCameraView.setVisibility(SurfaceView.VISIBLE);
        mOpenCvCameraView.setCvCameraViewListener(this);
        checkboxCrop = findViewById(R.id.checkboxCrop);

        Log.e(TAG, "是否缩放:" + (mOpenCvCameraView.mScale == 0 ? "不缩放" : "缩放"));

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


    public Mat onCameraFrame(CvCameraViewFrame inputFrame) {

        points.clear();
        Mat rgba = inputFrame.rgba();

        //如果不需要绘制方框，可以调用这个重载函数
        //weChatQRCode.detectAndDecode(mat)
        if (checkboxCrop.isChecked()) {

            int finalWidth=400;
            int squreWidth = finalWidth>rgba.width()?rgba.width():finalWidth;//这个值不要设置得太大，否则出边界了
            Mat centerMat = SqureTool.centerRectDraw2Cop(rgba, squreWidth);
            List<String> results = weChatQRCode.detectAndDecode(centerMat, points);//灰度图帧率更高
            SqureTool.centerRectDraw2(rgba, squreWidth);
            centerMat.release();
//        List<String> results = weChatQRCode.detectAndDecode(dstRgb, points);//原彩帧率低一些
            if (null != results && results.size() > 0) {
                //裁剪后位置要加上偏移
                int delTaX = (rgba.width() - squreWidth) / 2;
                int delTaY = (rgba.height() - squreWidth) / 2;
                Log.e(TAG, "识别的结果数量：" + results.size());
                for (int i = 0, isize = results.size(); i < isize; i++) {
                    Rect rect = Imgproc.boundingRect(points.get(i));
                    rect.x = rect.x + delTaX;
                    rect.y = rect.y + delTaY;
                    Imgproc.rectangle(rgba, rect, scalar, 5);
                    Imgproc.putText(rgba, results.get(i), rect.tl(), 0, 1, scalar);
                }
            }

        } else {
            List<String> results = weChatQRCode.detectAndDecode(inputFrame.gray(), points);
            if (null != results && results.size() > 0) {
                Log.e(TAG, "识别的结果数量：" + results.size());
                for (int i = 0, isize = results.size(); i < isize; i++) {
                    Rect rect = Imgproc.boundingRect(points.get(i));
                    Imgproc.rectangle(rgba, rect, scalar, 5);
                    Imgproc.putText(rgba, results.get(i), rect.tl(), 0, 1, scalar);
                }
            }

        }

        return rgba;
    }
}
