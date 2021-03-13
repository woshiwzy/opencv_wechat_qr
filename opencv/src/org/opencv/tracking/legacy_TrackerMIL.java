//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;

import org.opencv.tracking.legacy_Tracker;
import org.opencv.tracking.legacy_TrackerMIL;

// C++: class TrackerMIL
/**
 * The MIL algorithm trains a classifier in an online manner to separate the object from the
 * background.
 *
 * Multiple Instance Learning avoids the drift problem for a robust tracking. The implementation is
 * based on CITE: MIL .
 *
 * Original code can be found here &lt;http://vision.ucsd.edu/~bbabenko/project_miltrack.shtml&gt;
 */
public class legacy_TrackerMIL extends legacy_Tracker {

    protected legacy_TrackerMIL(long addr) { super(addr); }

    // internal usage only
    public static legacy_TrackerMIL __fromPtr__(long addr) { return new legacy_TrackerMIL(addr); }

    //
    // C++: static Ptr_legacy_TrackerMIL cv::legacy::TrackerMIL::create()
    //

    /**
     * Constructor
     * @return automatically generated
     */
    public static legacy_TrackerMIL create() {
        return legacy_TrackerMIL.__fromPtr__(create_0());
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_legacy_TrackerMIL cv::legacy::TrackerMIL::create()
    private static native long create_0();

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
