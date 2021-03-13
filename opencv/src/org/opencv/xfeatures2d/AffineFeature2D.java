//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.xfeatures2d;

import org.opencv.features2d.Feature2D;

// C++: class AffineFeature2D
/**
 * Class implementing affine adaptation for key points.
 *
 * A REF: FeatureDetector and a REF: DescriptorExtractor are wrapped to augment the
 * detected points with their affine invariant elliptic region and to compute
 * the feature descriptors on the regions after warping them into circles.
 *
 * The interface is equivalent to REF: Feature2D, adding operations for
 * REF: Elliptic_KeyPoint "Elliptic_KeyPoints" instead of REF: KeyPoint "KeyPoints".
 */
public class AffineFeature2D extends Feature2D {

    protected AffineFeature2D(long addr) { super(addr); }

    // internal usage only
    public static AffineFeature2D __fromPtr__(long addr) { return new AffineFeature2D(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
