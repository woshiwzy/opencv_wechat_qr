//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.tracking;



// C++: class Params

public class TrackerCSRT_Params {

    protected final long nativeObj;
    protected TrackerCSRT_Params(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static TrackerCSRT_Params __fromPtr__(long addr) { return new TrackerCSRT_Params(addr); }

    //
    // C++:   cv::TrackerCSRT::Params::Params()
    //

    public TrackerCSRT_Params() {
        nativeObj = TrackerCSRT_Params_0();
    }


    //
    // C++: bool TrackerCSRT_Params::use_hog
    //

    public boolean get_use_hog() {
        return get_use_hog_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::use_hog
    //

    public void set_use_hog(boolean use_hog) {
        set_use_hog_0(nativeObj, use_hog);
    }


    //
    // C++: bool TrackerCSRT_Params::use_color_names
    //

    public boolean get_use_color_names() {
        return get_use_color_names_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::use_color_names
    //

    public void set_use_color_names(boolean use_color_names) {
        set_use_color_names_0(nativeObj, use_color_names);
    }


    //
    // C++: bool TrackerCSRT_Params::use_gray
    //

    public boolean get_use_gray() {
        return get_use_gray_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::use_gray
    //

    public void set_use_gray(boolean use_gray) {
        set_use_gray_0(nativeObj, use_gray);
    }


    //
    // C++: bool TrackerCSRT_Params::use_rgb
    //

    public boolean get_use_rgb() {
        return get_use_rgb_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::use_rgb
    //

    public void set_use_rgb(boolean use_rgb) {
        set_use_rgb_0(nativeObj, use_rgb);
    }


    //
    // C++: bool TrackerCSRT_Params::use_channel_weights
    //

    public boolean get_use_channel_weights() {
        return get_use_channel_weights_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::use_channel_weights
    //

    public void set_use_channel_weights(boolean use_channel_weights) {
        set_use_channel_weights_0(nativeObj, use_channel_weights);
    }


    //
    // C++: bool TrackerCSRT_Params::use_segmentation
    //

    public boolean get_use_segmentation() {
        return get_use_segmentation_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::use_segmentation
    //

    public void set_use_segmentation(boolean use_segmentation) {
        set_use_segmentation_0(nativeObj, use_segmentation);
    }


    //
    // C++: string TrackerCSRT_Params::window_function
    //

    public String get_window_function() {
        return get_window_function_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::window_function
    //

    public void set_window_function(String window_function) {
        set_window_function_0(nativeObj, window_function);
    }


    //
    // C++: float TrackerCSRT_Params::kaiser_alpha
    //

    public float get_kaiser_alpha() {
        return get_kaiser_alpha_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::kaiser_alpha
    //

    public void set_kaiser_alpha(float kaiser_alpha) {
        set_kaiser_alpha_0(nativeObj, kaiser_alpha);
    }


    //
    // C++: float TrackerCSRT_Params::cheb_attenuation
    //

    public float get_cheb_attenuation() {
        return get_cheb_attenuation_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::cheb_attenuation
    //

    public void set_cheb_attenuation(float cheb_attenuation) {
        set_cheb_attenuation_0(nativeObj, cheb_attenuation);
    }


    //
    // C++: float TrackerCSRT_Params::template_size
    //

    public float get_template_size() {
        return get_template_size_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::template_size
    //

    public void set_template_size(float template_size) {
        set_template_size_0(nativeObj, template_size);
    }


    //
    // C++: float TrackerCSRT_Params::gsl_sigma
    //

    public float get_gsl_sigma() {
        return get_gsl_sigma_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::gsl_sigma
    //

    public void set_gsl_sigma(float gsl_sigma) {
        set_gsl_sigma_0(nativeObj, gsl_sigma);
    }


    //
    // C++: float TrackerCSRT_Params::hog_orientations
    //

    public float get_hog_orientations() {
        return get_hog_orientations_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::hog_orientations
    //

    public void set_hog_orientations(float hog_orientations) {
        set_hog_orientations_0(nativeObj, hog_orientations);
    }


    //
    // C++: float TrackerCSRT_Params::hog_clip
    //

    public float get_hog_clip() {
        return get_hog_clip_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::hog_clip
    //

    public void set_hog_clip(float hog_clip) {
        set_hog_clip_0(nativeObj, hog_clip);
    }


    //
    // C++: float TrackerCSRT_Params::padding
    //

    public float get_padding() {
        return get_padding_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::padding
    //

    public void set_padding(float padding) {
        set_padding_0(nativeObj, padding);
    }


    //
    // C++: float TrackerCSRT_Params::filter_lr
    //

    public float get_filter_lr() {
        return get_filter_lr_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::filter_lr
    //

    public void set_filter_lr(float filter_lr) {
        set_filter_lr_0(nativeObj, filter_lr);
    }


    //
    // C++: float TrackerCSRT_Params::weights_lr
    //

    public float get_weights_lr() {
        return get_weights_lr_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::weights_lr
    //

    public void set_weights_lr(float weights_lr) {
        set_weights_lr_0(nativeObj, weights_lr);
    }


    //
    // C++: int TrackerCSRT_Params::num_hog_channels_used
    //

    public int get_num_hog_channels_used() {
        return get_num_hog_channels_used_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::num_hog_channels_used
    //

    public void set_num_hog_channels_used(int num_hog_channels_used) {
        set_num_hog_channels_used_0(nativeObj, num_hog_channels_used);
    }


    //
    // C++: int TrackerCSRT_Params::admm_iterations
    //

    public int get_admm_iterations() {
        return get_admm_iterations_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::admm_iterations
    //

    public void set_admm_iterations(int admm_iterations) {
        set_admm_iterations_0(nativeObj, admm_iterations);
    }


    //
    // C++: int TrackerCSRT_Params::histogram_bins
    //

    public int get_histogram_bins() {
        return get_histogram_bins_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::histogram_bins
    //

    public void set_histogram_bins(int histogram_bins) {
        set_histogram_bins_0(nativeObj, histogram_bins);
    }


    //
    // C++: float TrackerCSRT_Params::histogram_lr
    //

    public float get_histogram_lr() {
        return get_histogram_lr_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::histogram_lr
    //

    public void set_histogram_lr(float histogram_lr) {
        set_histogram_lr_0(nativeObj, histogram_lr);
    }


    //
    // C++: int TrackerCSRT_Params::background_ratio
    //

    public int get_background_ratio() {
        return get_background_ratio_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::background_ratio
    //

    public void set_background_ratio(int background_ratio) {
        set_background_ratio_0(nativeObj, background_ratio);
    }


    //
    // C++: int TrackerCSRT_Params::number_of_scales
    //

    public int get_number_of_scales() {
        return get_number_of_scales_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::number_of_scales
    //

    public void set_number_of_scales(int number_of_scales) {
        set_number_of_scales_0(nativeObj, number_of_scales);
    }


    //
    // C++: float TrackerCSRT_Params::scale_sigma_factor
    //

    public float get_scale_sigma_factor() {
        return get_scale_sigma_factor_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::scale_sigma_factor
    //

    public void set_scale_sigma_factor(float scale_sigma_factor) {
        set_scale_sigma_factor_0(nativeObj, scale_sigma_factor);
    }


    //
    // C++: float TrackerCSRT_Params::scale_model_max_area
    //

    public float get_scale_model_max_area() {
        return get_scale_model_max_area_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::scale_model_max_area
    //

    public void set_scale_model_max_area(float scale_model_max_area) {
        set_scale_model_max_area_0(nativeObj, scale_model_max_area);
    }


    //
    // C++: float TrackerCSRT_Params::scale_lr
    //

    public float get_scale_lr() {
        return get_scale_lr_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::scale_lr
    //

    public void set_scale_lr(float scale_lr) {
        set_scale_lr_0(nativeObj, scale_lr);
    }


    //
    // C++: float TrackerCSRT_Params::scale_step
    //

    public float get_scale_step() {
        return get_scale_step_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::scale_step
    //

    public void set_scale_step(float scale_step) {
        set_scale_step_0(nativeObj, scale_step);
    }


    //
    // C++: float TrackerCSRT_Params::psr_threshold
    //

    public float get_psr_threshold() {
        return get_psr_threshold_0(nativeObj);
    }


    //
    // C++: void TrackerCSRT_Params::psr_threshold
    //

    public void set_psr_threshold(float psr_threshold) {
        set_psr_threshold_0(nativeObj, psr_threshold);
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:   cv::TrackerCSRT::Params::Params()
    private static native long TrackerCSRT_Params_0();

    // C++: bool TrackerCSRT_Params::use_hog
    private static native boolean get_use_hog_0(long nativeObj);

    // C++: void TrackerCSRT_Params::use_hog
    private static native void set_use_hog_0(long nativeObj, boolean use_hog);

    // C++: bool TrackerCSRT_Params::use_color_names
    private static native boolean get_use_color_names_0(long nativeObj);

    // C++: void TrackerCSRT_Params::use_color_names
    private static native void set_use_color_names_0(long nativeObj, boolean use_color_names);

    // C++: bool TrackerCSRT_Params::use_gray
    private static native boolean get_use_gray_0(long nativeObj);

    // C++: void TrackerCSRT_Params::use_gray
    private static native void set_use_gray_0(long nativeObj, boolean use_gray);

    // C++: bool TrackerCSRT_Params::use_rgb
    private static native boolean get_use_rgb_0(long nativeObj);

    // C++: void TrackerCSRT_Params::use_rgb
    private static native void set_use_rgb_0(long nativeObj, boolean use_rgb);

    // C++: bool TrackerCSRT_Params::use_channel_weights
    private static native boolean get_use_channel_weights_0(long nativeObj);

    // C++: void TrackerCSRT_Params::use_channel_weights
    private static native void set_use_channel_weights_0(long nativeObj, boolean use_channel_weights);

    // C++: bool TrackerCSRT_Params::use_segmentation
    private static native boolean get_use_segmentation_0(long nativeObj);

    // C++: void TrackerCSRT_Params::use_segmentation
    private static native void set_use_segmentation_0(long nativeObj, boolean use_segmentation);

    // C++: string TrackerCSRT_Params::window_function
    private static native String get_window_function_0(long nativeObj);

    // C++: void TrackerCSRT_Params::window_function
    private static native void set_window_function_0(long nativeObj, String window_function);

    // C++: float TrackerCSRT_Params::kaiser_alpha
    private static native float get_kaiser_alpha_0(long nativeObj);

    // C++: void TrackerCSRT_Params::kaiser_alpha
    private static native void set_kaiser_alpha_0(long nativeObj, float kaiser_alpha);

    // C++: float TrackerCSRT_Params::cheb_attenuation
    private static native float get_cheb_attenuation_0(long nativeObj);

    // C++: void TrackerCSRT_Params::cheb_attenuation
    private static native void set_cheb_attenuation_0(long nativeObj, float cheb_attenuation);

    // C++: float TrackerCSRT_Params::template_size
    private static native float get_template_size_0(long nativeObj);

    // C++: void TrackerCSRT_Params::template_size
    private static native void set_template_size_0(long nativeObj, float template_size);

    // C++: float TrackerCSRT_Params::gsl_sigma
    private static native float get_gsl_sigma_0(long nativeObj);

    // C++: void TrackerCSRT_Params::gsl_sigma
    private static native void set_gsl_sigma_0(long nativeObj, float gsl_sigma);

    // C++: float TrackerCSRT_Params::hog_orientations
    private static native float get_hog_orientations_0(long nativeObj);

    // C++: void TrackerCSRT_Params::hog_orientations
    private static native void set_hog_orientations_0(long nativeObj, float hog_orientations);

    // C++: float TrackerCSRT_Params::hog_clip
    private static native float get_hog_clip_0(long nativeObj);

    // C++: void TrackerCSRT_Params::hog_clip
    private static native void set_hog_clip_0(long nativeObj, float hog_clip);

    // C++: float TrackerCSRT_Params::padding
    private static native float get_padding_0(long nativeObj);

    // C++: void TrackerCSRT_Params::padding
    private static native void set_padding_0(long nativeObj, float padding);

    // C++: float TrackerCSRT_Params::filter_lr
    private static native float get_filter_lr_0(long nativeObj);

    // C++: void TrackerCSRT_Params::filter_lr
    private static native void set_filter_lr_0(long nativeObj, float filter_lr);

    // C++: float TrackerCSRT_Params::weights_lr
    private static native float get_weights_lr_0(long nativeObj);

    // C++: void TrackerCSRT_Params::weights_lr
    private static native void set_weights_lr_0(long nativeObj, float weights_lr);

    // C++: int TrackerCSRT_Params::num_hog_channels_used
    private static native int get_num_hog_channels_used_0(long nativeObj);

    // C++: void TrackerCSRT_Params::num_hog_channels_used
    private static native void set_num_hog_channels_used_0(long nativeObj, int num_hog_channels_used);

    // C++: int TrackerCSRT_Params::admm_iterations
    private static native int get_admm_iterations_0(long nativeObj);

    // C++: void TrackerCSRT_Params::admm_iterations
    private static native void set_admm_iterations_0(long nativeObj, int admm_iterations);

    // C++: int TrackerCSRT_Params::histogram_bins
    private static native int get_histogram_bins_0(long nativeObj);

    // C++: void TrackerCSRT_Params::histogram_bins
    private static native void set_histogram_bins_0(long nativeObj, int histogram_bins);

    // C++: float TrackerCSRT_Params::histogram_lr
    private static native float get_histogram_lr_0(long nativeObj);

    // C++: void TrackerCSRT_Params::histogram_lr
    private static native void set_histogram_lr_0(long nativeObj, float histogram_lr);

    // C++: int TrackerCSRT_Params::background_ratio
    private static native int get_background_ratio_0(long nativeObj);

    // C++: void TrackerCSRT_Params::background_ratio
    private static native void set_background_ratio_0(long nativeObj, int background_ratio);

    // C++: int TrackerCSRT_Params::number_of_scales
    private static native int get_number_of_scales_0(long nativeObj);

    // C++: void TrackerCSRT_Params::number_of_scales
    private static native void set_number_of_scales_0(long nativeObj, int number_of_scales);

    // C++: float TrackerCSRT_Params::scale_sigma_factor
    private static native float get_scale_sigma_factor_0(long nativeObj);

    // C++: void TrackerCSRT_Params::scale_sigma_factor
    private static native void set_scale_sigma_factor_0(long nativeObj, float scale_sigma_factor);

    // C++: float TrackerCSRT_Params::scale_model_max_area
    private static native float get_scale_model_max_area_0(long nativeObj);

    // C++: void TrackerCSRT_Params::scale_model_max_area
    private static native void set_scale_model_max_area_0(long nativeObj, float scale_model_max_area);

    // C++: float TrackerCSRT_Params::scale_lr
    private static native float get_scale_lr_0(long nativeObj);

    // C++: void TrackerCSRT_Params::scale_lr
    private static native void set_scale_lr_0(long nativeObj, float scale_lr);

    // C++: float TrackerCSRT_Params::scale_step
    private static native float get_scale_step_0(long nativeObj);

    // C++: void TrackerCSRT_Params::scale_step
    private static native void set_scale_step_0(long nativeObj, float scale_step);

    // C++: float TrackerCSRT_Params::psr_threshold
    private static native float get_psr_threshold_0(long nativeObj);

    // C++: void TrackerCSRT_Params::psr_threshold
    private static native void set_psr_threshold_0(long nativeObj, float psr_threshold);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
