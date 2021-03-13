//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;

import org.opencv.tracking.legacy_Tracker;
import org.opencv.tracking.legacy_TrackerBoosting;

// C++: class TrackerBoosting
/**
 * the Boosting tracker
 *
 * This is a real-time object tracking based on a novel on-line version of the AdaBoost algorithm.
 * The classifier uses the surrounding background as negative examples in update step to avoid the
 * drifting problem. The implementation is based on CITE: OLB .
 */
public class legacy_TrackerBoosting extends legacy_Tracker {

    protected legacy_TrackerBoosting(long addr) { super(addr); }

    // internal usage only
    public static legacy_TrackerBoosting __fromPtr__(long addr) { return new legacy_TrackerBoosting(addr); }

    //
    // C++: static Ptr_legacy_TrackerBoosting cv::legacy::TrackerBoosting::create()
    //

    /**
     * Constructor
     * @return automatically generated
     */
    public static legacy_TrackerBoosting create() {
        return legacy_TrackerBoosting.__fromPtr__(create_0());
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_legacy_TrackerBoosting cv::legacy::TrackerBoosting::create()
    private static native long create_0();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
