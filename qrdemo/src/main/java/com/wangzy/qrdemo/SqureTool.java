package com.wangzy.qrdemo;

import org.opencv.core.Mat;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgproc.Imgproc;

/**
 * Created by wangzy on 3/25/21
 * description:
 */
class SqureTool {

    static Scalar scalar = new Scalar(0xff,0x88, 0x88, 0x88);

    public static void centerRectDraw(Mat mat, float maxRectPercent) {

        int width = mat.width();
        int height = mat.height();
        int min = Math.min(width, height);
        min = (int) (min * maxRectPercent);

        Rect rect = new Rect();

        rect.x = width / 2 - min / 2;
        rect.y = height / 2 - min / 2;

        rect.width = min;
        rect.height = min;

        Imgproc.rectangle(mat, rect, scalar);

    }

    /**
     * 指定正常形大小
     * @param mat
     * @param min
     */
    public static void centerRectDraw2(Mat mat,  int min) {

        int width = mat.width();
        int height = mat.height();

        Rect rect = new Rect();

        rect.x = width / 2 - min / 2;
        rect.y = height / 2 - min / 2;

        rect.width = min;
        rect.height = min;

        Imgproc.rectangle(mat, rect, scalar);

    }

    /**
     * 指定正常形大小
     * @param mat
     * @param min
     */
    public static Mat centerRectDraw2Cop(Mat mat,  int min) {

        int width = mat.width();
        int height = mat.height();

        Rect rect = new Rect();

        rect.x = width / 2 - min / 2;
        rect.y = height / 2 - min / 2;

        rect.width = min;
        rect.height = min;


        Mat nMat=new Mat(mat,rect);

        return nMat;
    }

    public Mat centerSqure(Mat mat, float maxRectPercent) {

        int width = mat.width();
        int height = mat.height();
        int min = Math.min(width, height);
        min = (int) (min * maxRectPercent);

        Rect rect = new Rect();

        rect.x = width / 2 - min / 2;
        rect.y = height / 2 - min / 2;

        rect.width = min;
        rect.height = min;

        Mat squremat = new Mat(mat, rect);

        return squremat;
    }

}
