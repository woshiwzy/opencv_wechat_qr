//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;

import org.opencv.core.Mat;
import org.opencv.tracking.TrackerCSRT;
import org.opencv.tracking.TrackerCSRT_Params;
import org.opencv.video.Tracker;

// C++: class TrackerCSRT
/**
 * the CSRT tracker
 *
 * The implementation is based on CITE: Lukezic_IJCV2018 Discriminative Correlation Filter with Channel and Spatial Reliability
 */
public class TrackerCSRT extends Tracker {

    protected TrackerCSRT(long addr) { super(addr); }

    // internal usage only
    public static TrackerCSRT __fromPtr__(long addr) { return new TrackerCSRT(addr); }

    //
    // C++: static Ptr_TrackerCSRT cv::TrackerCSRT::create(TrackerCSRT_Params parameters = TrackerCSRT::Params())
    //

    /**
     * Create CSRT tracker instance
     *     @param parameters CSRT parameters TrackerCSRT::Params
     * @return automatically generated
     */
    public static TrackerCSRT create(TrackerCSRT_Params parameters) {
        return TrackerCSRT.__fromPtr__(create_0(parameters.nativeObj));
    }

    /**
     * Create CSRT tracker instance
     * @return automatically generated
     */
    public static TrackerCSRT create() {
        return TrackerCSRT.__fromPtr__(create_1());
    }


    //
    // C++:  void cv::TrackerCSRT::setInitialMask(Mat mask)
    //

    public void setInitialMask(Mat mask) {
        setInitialMask_0(nativeObj, mask.nativeObj);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_TrackerCSRT cv::TrackerCSRT::create(TrackerCSRT_Params parameters = TrackerCSRT::Params())
    private static native long create_0(long parameters_nativeObj);
    private static native long create_1();

    // C++:  void cv::TrackerCSRT::setInitialMask(Mat mask)
    private static native void setInitialMask_0(long nativeObj, long mask_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
