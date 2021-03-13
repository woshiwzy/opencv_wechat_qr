//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;



// C++: class Params

public class TrackerKCF_Params {

    protected final long nativeObj;
    protected TrackerKCF_Params(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static TrackerKCF_Params __fromPtr__(long addr) { return new TrackerKCF_Params(addr); }

    //
    // C++:   cv::TrackerKCF::Params::Params()
    //

    public TrackerKCF_Params() {
        nativeObj = TrackerKCF_Params_0();
    }


    //
    // C++: float TrackerKCF_Params::detect_thresh
    //

    public float get_detect_thresh() {
        return get_detect_thresh_0(nativeObj);
    }


    //
    // C++: void TrackerKCF_Params::detect_thresh
    //

    public void set_detect_thresh(float detect_thresh) {
        set_detect_thresh_0(nativeObj, detect_thresh);
    }


    //
    // C++: float TrackerKCF_Params::sigma
    //

    public float get_sigma() {
        return get_sigma_0(nativeObj);
    }


    //
    // C++: void TrackerKCF_Params::sigma
    //

    public void set_sigma(float sigma) {
        set_sigma_0(nativeObj, sigma);
    }


    //
    // C++: float TrackerKCF_Params::lambda
    //

    public float get_lambda() {
        return get_lambda_0(nativeObj);
    }


    //
    // C++: void TrackerKCF_Params::lambda
    //

    public void set_lambda(float lambda) {
        set_lambda_0(nativeObj, lambda);
    }


    //
    // C++: float TrackerKCF_Params::interp_factor
    //

    public float get_interp_factor() {
        return get_interp_factor_0(nativeObj);
    }


    //
    // C++: void TrackerKCF_Params::interp_factor
    //

    public void set_interp_factor(float interp_factor) {
        set_interp_factor_0(nativeObj, interp_factor);
    }


    //
    // C++: float TrackerKCF_Params::output_sigma_factor
    //

    public float get_output_sigma_factor() {
        return get_output_sigma_factor_0(nativeObj);
    }


    //
    // C++: void TrackerKCF_Params::output_sigma_factor
    //

    public void set_output_sigma_factor(float output_sigma_factor) {
        set_output_sigma_factor_0(nativeObj, output_sigma_factor);
    }


    //
    // C++: float TrackerKCF_Params::pca_learning_rate
    //

    public float get_pca_learning_rate() {
        return get_pca_learning_rate_0(nativeObj);
    }


    //
    // C++: void TrackerKCF_Params::pca_learning_rate
    //

    public void set_pca_learning_rate(float pca_learning_rate) {
        set_pca_learning_rate_0(nativeObj, pca_learning_rate);
    }


    //
    // C++: bool TrackerKCF_Params::resize
    //

    public boolean get_resize() {
        return get_resize_0(nativeObj);
    }


    //
    // C++: void TrackerKCF_Params::resize
    //

    public void set_resize(boolean resize) {
        set_resize_0(nativeObj, resize);
    }


    //
    // C++: bool TrackerKCF_Params::split_coeff
    //

    public boolean get_split_coeff() {
        return get_split_coeff_0(nativeObj);
    }


    //
    // C++: void TrackerKCF_Params::split_coeff
    //

    public void set_split_coeff(boolean split_coeff) {
        set_split_coeff_0(nativeObj, split_coeff);
    }


    //
    // C++: bool TrackerKCF_Params::wrap_kernel
    //

    public boolean get_wrap_kernel() {
        return get_wrap_kernel_0(nativeObj);
    }


    //
    // C++: void TrackerKCF_Params::wrap_kernel
    //

    public void set_wrap_kernel(boolean wrap_kernel) {
        set_wrap_kernel_0(nativeObj, wrap_kernel);
    }


    //
    // C++: bool TrackerKCF_Params::compress_feature
    //

    public boolean get_compress_feature() {
        return get_compress_feature_0(nativeObj);
    }


    //
    // C++: void TrackerKCF_Params::compress_feature
    //

    public void set_compress_feature(boolean compress_feature) {
        set_compress_feature_0(nativeObj, compress_feature);
    }


    //
    // C++: int TrackerKCF_Params::max_patch_size
    //

    public int get_max_patch_size() {
        return get_max_patch_size_0(nativeObj);
    }


    //
    // C++: void TrackerKCF_Params::max_patch_size
    //

    public void set_max_patch_size(int max_patch_size) {
        set_max_patch_size_0(nativeObj, max_patch_size);
    }


    //
    // C++: int TrackerKCF_Params::compressed_size
    //

    public int get_compressed_size() {
        return get_compressed_size_0(nativeObj);
    }


    //
    // C++: void TrackerKCF_Params::compressed_size
    //

    public void set_compressed_size(int compressed_size) {
        set_compressed_size_0(nativeObj, compressed_size);
    }


    //
    // C++: int TrackerKCF_Params::desc_pca
    //

    public int get_desc_pca() {
        return get_desc_pca_0(nativeObj);
    }


    //
    // C++: void TrackerKCF_Params::desc_pca
    //

    public void set_desc_pca(int desc_pca) {
        set_desc_pca_0(nativeObj, desc_pca);
    }


    //
    // C++: int TrackerKCF_Params::desc_npca
    //

    public int get_desc_npca() {
        return get_desc_npca_0(nativeObj);
    }


    //
    // C++: void TrackerKCF_Params::desc_npca
    //

    public void set_desc_npca(int desc_npca) {
        set_desc_npca_0(nativeObj, desc_npca);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   cv::TrackerKCF::Params::Params()
    private static native long TrackerKCF_Params_0();

    // C++: float TrackerKCF_Params::detect_thresh
    private static native float get_detect_thresh_0(long nativeObj);

    // C++: void TrackerKCF_Params::detect_thresh
    private static native void set_detect_thresh_0(long nativeObj, float detect_thresh);

    // C++: float TrackerKCF_Params::sigma
    private static native float get_sigma_0(long nativeObj);

    // C++: void TrackerKCF_Params::sigma
    private static native void set_sigma_0(long nativeObj, float sigma);

    // C++: float TrackerKCF_Params::lambda
    private static native float get_lambda_0(long nativeObj);

    // C++: void TrackerKCF_Params::lambda
    private static native void set_lambda_0(long nativeObj, float lambda);

    // C++: float TrackerKCF_Params::interp_factor
    private static native float get_interp_factor_0(long nativeObj);

    // C++: void TrackerKCF_Params::interp_factor
    private static native void set_interp_factor_0(long nativeObj, float interp_factor);

    // C++: float TrackerKCF_Params::output_sigma_factor
    private static native float get_output_sigma_factor_0(long nativeObj);

    // C++: void TrackerKCF_Params::output_sigma_factor
    private static native void set_output_sigma_factor_0(long nativeObj, float output_sigma_factor);

    // C++: float TrackerKCF_Params::pca_learning_rate
    private static native float get_pca_learning_rate_0(long nativeObj);

    // C++: void TrackerKCF_Params::pca_learning_rate
    private static native void set_pca_learning_rate_0(long nativeObj, float pca_learning_rate);

    // C++: bool TrackerKCF_Params::resize
    private static native boolean get_resize_0(long nativeObj);

    // C++: void TrackerKCF_Params::resize
    private static native void set_resize_0(long nativeObj, boolean resize);

    // C++: bool TrackerKCF_Params::split_coeff
    private static native boolean get_split_coeff_0(long nativeObj);

    // C++: void TrackerKCF_Params::split_coeff
    private static native void set_split_coeff_0(long nativeObj, boolean split_coeff);

    // C++: bool TrackerKCF_Params::wrap_kernel
    private static native boolean get_wrap_kernel_0(long nativeObj);

    // C++: void TrackerKCF_Params::wrap_kernel
    private static native void set_wrap_kernel_0(long nativeObj, boolean wrap_kernel);

    // C++: bool TrackerKCF_Params::compress_feature
    private static native boolean get_compress_feature_0(long nativeObj);

    // C++: void TrackerKCF_Params::compress_feature
    private static native void set_compress_feature_0(long nativeObj, boolean compress_feature);

    // C++: int TrackerKCF_Params::max_patch_size
    private static native int get_max_patch_size_0(long nativeObj);

    // C++: void TrackerKCF_Params::max_patch_size
    private static native void set_max_patch_size_0(long nativeObj, int max_patch_size);

    // C++: int TrackerKCF_Params::compressed_size
    private static native int get_compressed_size_0(long nativeObj);

    // C++: void TrackerKCF_Params::compressed_size
    private static native void set_compressed_size_0(long nativeObj, int compressed_size);

    // C++: int TrackerKCF_Params::desc_pca
    private static native int get_desc_pca_0(long nativeObj);

    // C++: void TrackerKCF_Params::desc_pca
    private static native void set_desc_pca_0(long nativeObj, int desc_pca);

    // C++: int TrackerKCF_Params::desc_npca
    private static native int get_desc_npca_0(long nativeObj);

    // C++: void TrackerKCF_Params::desc_npca
    private static native void set_desc_npca_0(long nativeObj, int desc_npca);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
