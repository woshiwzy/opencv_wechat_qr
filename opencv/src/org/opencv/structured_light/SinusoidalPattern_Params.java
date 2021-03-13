//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.structured_light;



// C++: class Params
/**
 * Parameters of SinusoidalPattern constructor
 * width Projector's width.
 * height Projector's height.
 * nbrOfPeriods Number of period along the patterns direction.
 * shiftValue Phase shift between two consecutive patterns.
 * methodId Allow to choose between FTP, PSP and FAPS.
 * nbrOfPixelsBetweenMarkers Number of pixels between two consecutive markers on the same row.
 * setMarkers Allow to set markers on the patterns.
 * markersLocation vector used to store markers location on the patterns.
 */
public class SinusoidalPattern_Params {

    protected final long nativeObj;
    protected SinusoidalPattern_Params(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static SinusoidalPattern_Params __fromPtr__(long addr) { return new SinusoidalPattern_Params(addr); }

    //
    // C++:   cv::structured_light::SinusoidalPattern::Params::Params()
    //

    public SinusoidalPattern_Params() {
        nativeObj = SinusoidalPattern_Params_0();
    }


    //
    // C++: int SinusoidalPattern_Params::width
    //

    public int get_width() {
        return get_width_0(nativeObj);
    }


    //
    // C++: void SinusoidalPattern_Params::width
    //

    public void set_width(int width) {
        set_width_0(nativeObj, width);
    }


    //
    // C++: int SinusoidalPattern_Params::height
    //

    public int get_height() {
        return get_height_0(nativeObj);
    }


    //
    // C++: void SinusoidalPattern_Params::height
    //

    public void set_height(int height) {
        set_height_0(nativeObj, height);
    }


    //
    // C++: int SinusoidalPattern_Params::nbrOfPeriods
    //

    public int get_nbrOfPeriods() {
        return get_nbrOfPeriods_0(nativeObj);
    }


    //
    // C++: void SinusoidalPattern_Params::nbrOfPeriods
    //

    public void set_nbrOfPeriods(int nbrOfPeriods) {
        set_nbrOfPeriods_0(nativeObj, nbrOfPeriods);
    }


    //
    // C++: float SinusoidalPattern_Params::shiftValue
    //

    public float get_shiftValue() {
        return get_shiftValue_0(nativeObj);
    }


    //
    // C++: void SinusoidalPattern_Params::shiftValue
    //

    public void set_shiftValue(float shiftValue) {
        set_shiftValue_0(nativeObj, shiftValue);
    }


    //
    // C++: int SinusoidalPattern_Params::methodId
    //

    public int get_methodId() {
        return get_methodId_0(nativeObj);
    }


    //
    // C++: void SinusoidalPattern_Params::methodId
    //

    public void set_methodId(int methodId) {
        set_methodId_0(nativeObj, methodId);
    }


    //
    // C++: int SinusoidalPattern_Params::nbrOfPixelsBetweenMarkers
    //

    public int get_nbrOfPixelsBetweenMarkers() {
        return get_nbrOfPixelsBetweenMarkers_0(nativeObj);
    }


    //
    // C++: void SinusoidalPattern_Params::nbrOfPixelsBetweenMarkers
    //

    public void set_nbrOfPixelsBetweenMarkers(int nbrOfPixelsBetweenMarkers) {
        set_nbrOfPixelsBetweenMarkers_0(nativeObj, nbrOfPixelsBetweenMarkers);
    }


    //
    // C++: bool SinusoidalPattern_Params::horizontal
    //

    public boolean get_horizontal() {
        return get_horizontal_0(nativeObj);
    }


    //
    // C++: void SinusoidalPattern_Params::horizontal
    //

    public void set_horizontal(boolean horizontal) {
        set_horizontal_0(nativeObj, horizontal);
    }


    //
    // C++: bool SinusoidalPattern_Params::setMarkers
    //

    public boolean get_setMarkers() {
        return get_setMarkers_0(nativeObj);
    }


    //
    // C++: void SinusoidalPattern_Params::setMarkers
    //

    public void set_setMarkers(boolean setMarkers) {
        set_setMarkers_0(nativeObj, setMarkers);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   cv::structured_light::SinusoidalPattern::Params::Params()
    private static native long SinusoidalPattern_Params_0();

    // C++: int SinusoidalPattern_Params::width
    private static native int get_width_0(long nativeObj);

    // C++: void SinusoidalPattern_Params::width
    private static native void set_width_0(long nativeObj, int width);

    // C++: int SinusoidalPattern_Params::height
    private static native int get_height_0(long nativeObj);

    // C++: void SinusoidalPattern_Params::height
    private static native void set_height_0(long nativeObj, int height);

    // C++: int SinusoidalPattern_Params::nbrOfPeriods
    private static native int get_nbrOfPeriods_0(long nativeObj);

    // C++: void SinusoidalPattern_Params::nbrOfPeriods
    private static native void set_nbrOfPeriods_0(long nativeObj, int nbrOfPeriods);

    // C++: float SinusoidalPattern_Params::shiftValue
    private static native float get_shiftValue_0(long nativeObj);

    // C++: void SinusoidalPattern_Params::shiftValue
    private static native void set_shiftValue_0(long nativeObj, float shiftValue);

    // C++: int SinusoidalPattern_Params::methodId
    private static native int get_methodId_0(long nativeObj);

    // C++: void SinusoidalPattern_Params::methodId
    private static native void set_methodId_0(long nativeObj, int methodId);

    // C++: int SinusoidalPattern_Params::nbrOfPixelsBetweenMarkers
    private static native int get_nbrOfPixelsBetweenMarkers_0(long nativeObj);

    // C++: void SinusoidalPattern_Params::nbrOfPixelsBetweenMarkers
    private static native void set_nbrOfPixelsBetweenMarkers_0(long nativeObj, int nbrOfPixelsBetweenMarkers);

    // C++: bool SinusoidalPattern_Params::horizontal
    private static native boolean get_horizontal_0(long nativeObj);

    // C++: void SinusoidalPattern_Params::horizontal
    private static native void set_horizontal_0(long nativeObj, boolean horizontal);

    // C++: bool SinusoidalPattern_Params::setMarkers
    private static native boolean get_setMarkers_0(long nativeObj);

    // C++: void SinusoidalPattern_Params::setMarkers
    private static native void set_setMarkers_0(long nativeObj, boolean setMarkers);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
