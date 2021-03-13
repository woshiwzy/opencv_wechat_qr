//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.xfeatures2d.AffineFeature2D;
import org.opencv.xfeatures2d.TBMR;

// C++: class TBMR
/**
 * Class implementing the Tree Based Morse Regions (TBMR) as described in
 * CITE: Najman2014 extended with scaled extraction ability.
 *
 * min_area prune areas smaller than minArea
 * max_area_relative prune areas bigger than maxArea = max_area_relative *
 * input_image_size
 * scale_factor scale factor for scaled extraction.
 * n_scales number of applications of the scale factor (octaves).
 *
 * <b>Note:</b> This algorithm is based on Component Tree (Min/Max) as well as MSER but
 * uses a Morse-theory approach to extract features.
 *
 * Features are ellipses (similar to MSER, however a MSER feature can never be a
 * TBMR feature and vice versa).
 */
public class TBMR extends AffineFeature2D {

    protected TBMR(long addr) { super(addr); }

    // internal usage only
    public static TBMR __fromPtr__(long addr) { return new TBMR(addr); }

    //
    // C++: static Ptr_TBMR cv::xfeatures2d::TBMR::create(int min_area = 60, float max_area_relative = 0.01f, float scale_factor = 1.25f, int n_scales = -1)
    //

    public static TBMR create(int min_area, float max_area_relative, float scale_factor, int n_scales) {
        return TBMR.__fromPtr__(create_0(min_area, max_area_relative, scale_factor, n_scales));
    }

    public static TBMR create(int min_area, float max_area_relative, float scale_factor) {
        return TBMR.__fromPtr__(create_1(min_area, max_area_relative, scale_factor));
    }

    public static TBMR create(int min_area, float max_area_relative) {
        return TBMR.__fromPtr__(create_2(min_area, max_area_relative));
    }

    public static TBMR create(int min_area) {
        return TBMR.__fromPtr__(create_3(min_area));
    }

    public static TBMR create() {
        return TBMR.__fromPtr__(create_4());
    }


    //
    // C++:  void cv::xfeatures2d::TBMR::setMinArea(int minArea)
    //

    public void setMinArea(int minArea) {
        setMinArea_0(nativeObj, minArea);
    }


    //
    // C++:  int cv::xfeatures2d::TBMR::getMinArea()
    //

    public int getMinArea() {
        return getMinArea_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::TBMR::setMaxAreaRelative(float maxArea)
    //

    public void setMaxAreaRelative(float maxArea) {
        setMaxAreaRelative_0(nativeObj, maxArea);
    }


    //
    // C++:  float cv::xfeatures2d::TBMR::getMaxAreaRelative()
    //

    public float getMaxAreaRelative() {
        return getMaxAreaRelative_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::TBMR::setScaleFactor(float scale_factor)
    //

    public void setScaleFactor(float scale_factor) {
        setScaleFactor_0(nativeObj, scale_factor);
    }


    //
    // C++:  float cv::xfeatures2d::TBMR::getScaleFactor()
    //

    public float getScaleFactor() {
        return getScaleFactor_0(nativeObj);
    }


    //
    // C++:  void cv::xfeatures2d::TBMR::setNScales(int n_scales)
    //

    public void setNScales(int n_scales) {
        setNScales_0(nativeObj, n_scales);
    }


    //
    // C++:  int cv::xfeatures2d::TBMR::getNScales()
    //

    public int getNScales() {
        return getNScales_0(nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_TBMR cv::xfeatures2d::TBMR::create(int min_area = 60, float max_area_relative = 0.01f, float scale_factor = 1.25f, int n_scales = -1)
    private static native long create_0(int min_area, float max_area_relative, float scale_factor, int n_scales);
    private static native long create_1(int min_area, float max_area_relative, float scale_factor);
    private static native long create_2(int min_area, float max_area_relative);
    private static native long create_3(int min_area);
    private static native long create_4();

    // C++:  void cv::xfeatures2d::TBMR::setMinArea(int minArea)
    private static native void setMinArea_0(long nativeObj, int minArea);

    // C++:  int cv::xfeatures2d::TBMR::getMinArea()
    private static native int getMinArea_0(long nativeObj);

    // C++:  void cv::xfeatures2d::TBMR::setMaxAreaRelative(float maxArea)
    private static native void setMaxAreaRelative_0(long nativeObj, float maxArea);

    // C++:  float cv::xfeatures2d::TBMR::getMaxAreaRelative()
    private static native float getMaxAreaRelative_0(long nativeObj);

    // C++:  void cv::xfeatures2d::TBMR::setScaleFactor(float scale_factor)
    private static native void setScaleFactor_0(long nativeObj, float scale_factor);

    // C++:  float cv::xfeatures2d::TBMR::getScaleFactor()
    private static native float getScaleFactor_0(long nativeObj);

    // C++:  void cv::xfeatures2d::TBMR::setNScales(int n_scales)
    private static native void setNScales_0(long nativeObj, int n_scales);

    // C++:  int cv::xfeatures2d::TBMR::getNScales()
    private static native int getNScales_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
