//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;

import org.opencv.core.Mat;
import org.opencv.tracking.legacy_Tracker;
import org.opencv.tracking.legacy_TrackerCSRT;

// C++: class TrackerCSRT
/**
 * the CSRT tracker
 *
 * The implementation is based on CITE: Lukezic_IJCV2018 Discriminative Correlation Filter with Channel and Spatial Reliability
 */
public class legacy_TrackerCSRT extends legacy_Tracker {

    protected legacy_TrackerCSRT(long addr) { super(addr); }

    // internal usage only
    public static legacy_TrackerCSRT __fromPtr__(long addr) { return new legacy_TrackerCSRT(addr); }

    //
    // C++: static Ptr_legacy_TrackerCSRT cv::legacy::TrackerCSRT::create()
    //

    /**
     * Constructor
     * @return automatically generated
     */
    public static legacy_TrackerCSRT create() {
        return legacy_TrackerCSRT.__fromPtr__(create_0());
    }


    //
    // C++:  void cv::legacy::TrackerCSRT::setInitialMask(Mat mask)
    //

    public void setInitialMask(Mat mask) {
        setInitialMask_0(nativeObj, mask.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_legacy_TrackerCSRT cv::legacy::TrackerCSRT::create()
    private static native long create_0();

    // C++:  void cv::legacy::TrackerCSRT::setInitialMask(Mat mask)
    private static native void setInitialMask_0(long nativeObj, long mask_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
