//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;
import org.opencv.xfeatures2d.BEBLID;

// C++: class BEBLID
/**
 * Class implementing BEBLID (Boosted Efficient Binary Local Image Descriptor),
 * described in CITE: Suarez2020BEBLID .
 *
 * BEBLID \cite Suarez2020BEBLID is a efficient binary descriptor learned with boosting.
 * It is able to describe keypoints from any detector just by changing the scale_factor parameter.
 * In several benchmarks it has proved to largely improve other binary descriptors like ORB or
 * BRISK with the same efficiency. BEBLID describes using the difference of mean gray values in
 * different regions of the image around the KeyPoint, the descriptor is specifically optimized for
 * image matching and patch retrieval addressing the asymmetries of these problems.
 *
 * If you find this code useful, please add a reference to the following paper:
 * &lt;BLOCKQUOTE&gt; Iago Suárez, Ghesn Sfeir, José M. Buenaposada, and Luis Baumela.
 * BEBLID: Boosted efficient binary local image descriptor.
 * Pattern Recognition Letters, 133:366–372, 2020. &lt;/BLOCKQUOTE&gt;
 *
 * The descriptor was trained using 1 million of randomly sampled pairs of patches
 * (20% positives and 80% negatives) from the Liberty split of the UBC datasets
 * \cite winder2007learning as described in the paper CITE: Suarez2020BEBLID.
 * You can check in the [AKAZE example](https://raw.githubusercontent.com/opencv/opencv/master/samples/cpp/tutorial_code/features2D/AKAZE_match.cpp)
 * how well BEBLID works. Detecting 10000 keypoints with ORB and describing with BEBLID obtains
 * 561 inliers (75%) whereas describing with ORB obtains only 493 inliers (63%).
 */
public class BEBLID extends Feature2D {

    protected BEBLID(long addr) { super(addr); }

    // internal usage only
    public static BEBLID __fromPtr__(long addr) { return new BEBLID(addr); }

    // C++: enum BeblidSize (cv.xfeatures2d.BEBLID.BeblidSize)
    public static final int
            SIZE_512_BITS = 100,
            SIZE_256_BITS = 101;


    //
    // C++: static Ptr_BEBLID cv::xfeatures2d::BEBLID::create(float scale_factor, int n_bits = BEBLID::SIZE_512_BITS)
    //

    /**
     * Creates the BEBLID descriptor.
     *     @param scale_factor Adjust the sampling window around detected keypoints:
     * <ul>
     *   <li>
     *      &lt;b&gt; 1.00f &lt;/b&gt; should be the scale for ORB keypoints
     *   </li>
     *   <li>
     *      &lt;b&gt; 6.75f &lt;/b&gt; should be the scale for SIFT detected keypoints
     *   </li>
     *   <li>
     *      &lt;b&gt; 6.25f &lt;/b&gt; is default and fits for KAZE, SURF detected keypoints
     *   </li>
     *   <li>
     *      &lt;b&gt; 5.00f &lt;/b&gt; should be the scale for AKAZE, MSD, AGAST, FAST, BRISK keypoints
     *     @param n_bits Determine the number of bits in the descriptor. Should be either
     *      BEBLID::SIZE_512_BITS or BEBLID::SIZE_256_BITS.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static BEBLID create(float scale_factor, int n_bits) {
        return BEBLID.__fromPtr__(create_0(scale_factor, n_bits));
    }

    /**
     * Creates the BEBLID descriptor.
     *     @param scale_factor Adjust the sampling window around detected keypoints:
     * <ul>
     *   <li>
     *      &lt;b&gt; 1.00f &lt;/b&gt; should be the scale for ORB keypoints
     *   </li>
     *   <li>
     *      &lt;b&gt; 6.75f &lt;/b&gt; should be the scale for SIFT detected keypoints
     *   </li>
     *   <li>
     *      &lt;b&gt; 6.25f &lt;/b&gt; is default and fits for KAZE, SURF detected keypoints
     *   </li>
     *   <li>
     *      &lt;b&gt; 5.00f &lt;/b&gt; should be the scale for AKAZE, MSD, AGAST, FAST, BRISK keypoints
     *      BEBLID::SIZE_512_BITS or BEBLID::SIZE_256_BITS.
     *   </li>
     * </ul>
     * @return automatically generated
     */
    public static BEBLID create(float scale_factor) {
        return BEBLID.__fromPtr__(create_1(scale_factor));
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++: static Ptr_BEBLID cv::xfeatures2d::BEBLID::create(float scale_factor, int n_bits = BEBLID::SIZE_512_BITS)
    private static native long create_0(float scale_factor, int n_bits);
    private static native long create_1(float scale_factor);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
