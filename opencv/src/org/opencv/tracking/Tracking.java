//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;

import org.opencv.tracking.legacy_Tracker;
import org.opencv.video.Tracker;

// C++: class Tracking

public class Tracking {

    // C++: enum <unnamed>
    public static final int
            TrackerContribSamplerCSC_MODE_INIT_POS = 1,
            TrackerContribSamplerCSC_MODE_INIT_NEG = 2,
            TrackerContribSamplerCSC_MODE_TRACK_POS = 3,
            TrackerContribSamplerCSC_MODE_TRACK_NEG = 4,
            TrackerContribSamplerCSC_MODE_DETECT = 5,
            TrackerSamplerCS_MODE_POSITIVE = 1,
            TrackerSamplerCS_MODE_NEGATIVE = 2,
            TrackerSamplerCS_MODE_CLASSIFY = 3;


    // C++: enum FeatureType (cv.detail.CvFeatureParams.FeatureType)
    public static final int
            CvFeatureParams_HAAR = 0,
            CvFeatureParams_LBP = 1,
            CvFeatureParams_HOG = 2;


    //
    // C++:  Ptr_Tracker cv::legacy::upgradeTrackingAPI(Ptr_legacy_Tracker legacy_tracker)
    //

    public static Tracker legacy_upgradeTrackingAPI(legacy_Tracker legacy_tracker) {
        return Tracker.__fromPtr__(legacy_upgradeTrackingAPI_0(legacy_tracker.getNativeObjAddr()));
    }




    // C++:  Ptr_Tracker cv::legacy::upgradeTrackingAPI(Ptr_legacy_Tracker legacy_tracker)
    private static native long legacy_upgradeTrackingAPI_0(long legacy_tracker_nativeObj);

}
