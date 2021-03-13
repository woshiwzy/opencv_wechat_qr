//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Algorithm;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect2d;
import org.opencv.core.Rect2d;
import org.opencv.tracking.legacy_Tracker;
import org.opencv.utils.Converters;

// C++: class MultiTracker
/**
 * This class is used to track multiple objects using the specified tracker algorithm.
 *
 * The %MultiTracker is naive implementation of multiple object tracking.
 * It process the tracked objects independently without any optimization accross the tracked objects.
 */
public class legacy_MultiTracker extends Algorithm {

    protected legacy_MultiTracker(long addr) { super(addr); }

    // internal usage only
    public static legacy_MultiTracker __fromPtr__(long addr) { return new legacy_MultiTracker(addr); }

    //
    // C++:   cv::legacy::MultiTracker::MultiTracker()
    //

    /**
     * Constructor.
     */
    public legacy_MultiTracker() {
        super(legacy_MultiTracker_0());
    }


    //
    // C++:  bool cv::legacy::MultiTracker::add(Ptr_legacy_Tracker newTracker, Mat image, Rect2d boundingBox)
    //

    /**
     * Add a new object to be tracked.
     *
     * @param newTracker tracking algorithm to be used
     * @param image input image
     * @param boundingBox a rectangle represents ROI of the tracked object
     * @return automatically generated
     */
    public boolean add(legacy_Tracker newTracker, Mat image, Rect2d boundingBox) {
        return add_0(nativeObj, newTracker.getNativeObjAddr(), image.nativeObj, boundingBox.x, boundingBox.y, boundingBox.width, boundingBox.height);
    }


    //
    // C++:  bool cv::legacy::MultiTracker::update(Mat image, vector_Rect2d& boundingBox)
    //

    /**
     * Update the current tracking status.
     * @param image input image
     * @param boundingBox the tracking result, represent a list of ROIs of the tracked objects.
     * @return automatically generated
     */
    public boolean update(Mat image, MatOfRect2d boundingBox) {
        Mat boundingBox_mat = boundingBox;
        return update_0(nativeObj, image.nativeObj, boundingBox_mat.nativeObj);
    }


    //
    // C++:  vector_Rect2d cv::legacy::MultiTracker::getObjects()
    //

    /**
     * Returns a reference to a storage for the tracked objects, each object corresponds to one tracker algorithm
     * @return automatically generated
     */
    public MatOfRect2d getObjects() {
        return MatOfRect2d.fromNativeAddr(getObjects_0(nativeObj));
    }


    //
    // C++: static Ptr_MultiTracker cv::legacy::MultiTracker::create()
    //

    // Return type 'Ptr_MultiTracker' is not supported, skipping the function


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   cv::legacy::MultiTracker::MultiTracker()
    private static native long legacy_MultiTracker_0();

    // C++:  bool cv::legacy::MultiTracker::add(Ptr_legacy_Tracker newTracker, Mat image, Rect2d boundingBox)
    private static native boolean add_0(long nativeObj, long newTracker_nativeObj, long image_nativeObj, double boundingBox_x, double boundingBox_y, double boundingBox_width, double boundingBox_height);

    // C++:  bool cv::legacy::MultiTracker::update(Mat image, vector_Rect2d& boundingBox)
    private static native boolean update_0(long nativeObj, long image_nativeObj, long boundingBox_mat_nativeObj);

    // C++:  vector_Rect2d cv::legacy::MultiTracker::getObjects()
    private static native long getObjects_0(long nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
