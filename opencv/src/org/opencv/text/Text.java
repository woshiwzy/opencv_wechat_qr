//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.text;

import java.util.ArrayList;
import java.util.List;
import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.MatOfRect;
import org.opencv.text.ERFilter;
import org.opencv.text.ERFilter_Callback;
import org.opencv.text.OCRBeamSearchDecoder_ClassifierCallback;
import org.opencv.text.OCRHMMDecoder_ClassifierCallback;
import org.opencv.utils.Converters;

// C++: class Text

public class Text {

    // C++: enum <unnamed>
    public static final int
            ERFILTER_NM_RGBLGrad = 0,
            ERFILTER_NM_IHSGrad = 1,
            OCR_LEVEL_WORD = 0,
            OCR_LEVEL_TEXTLINE = 1;


    // C++: enum classifier_type (cv.text.classifier_type)
    public static final int
            OCR_KNN_CLASSIFIER = 0,
            OCR_CNN_CLASSIFIER = 1;


    // C++: enum decoder_mode (cv.text.decoder_mode)
    public static final int
            OCR_DECODER_VITERBI = 0;


    // C++: enum erGrouping_Modes (cv.text.erGrouping_Modes)
    public static final int
            ERGROUPING_ORIENTATION_HORIZ = 0,
            ERGROUPING_ORIENTATION_ANY = 1;


    // C++: enum ocr_engine_mode (cv.text.ocr_engine_mode)
    public static final int
            OEM_TESSERACT_ONLY = 0,
            OEM_CUBE_ONLY = 1,
            OEM_TESSERACT_CUBE_COMBINED = 2,
            OEM_DEFAULT = 3;


    // C++: enum page_seg_mode (cv.text.page_seg_mode)
    public static final int
            PSM_OSD_ONLY = 0,
            PSM_AUTO_OSD = 1,
            PSM_AUTO_ONLY = 2,
            PSM_AUTO = 3,
            PSM_SINGLE_COLUMN = 4,
            PSM_SINGLE_BLOCK_VERT_TEXT = 5,
            PSM_SINGLE_BLOCK = 6,
            PSM_SINGLE_LINE = 7,
            PSM_SINGLE_WORD = 8,
            PSM_CIRCLE_WORD = 9,
            PSM_SINGLE_CHAR = 10;


    //
    // C++:  void cv::text::detectTextSWT(Mat input, vector_Rect& result, bool dark_on_light, Mat& draw = Mat(), Mat& chainBBs = Mat())
    //

    /**
     * Applies the Stroke Width Transform operator followed by filtering of connected components of similar Stroke Widths to return letter candidates. It also chain them by proximity and size, saving the result in chainBBs.
     *     @param input the input image with 3 channels.
     *     @param result a vector of resulting bounding boxes where probability of finding text is high
     *     @param dark_on_light a boolean value signifying whether the text is darker or lighter than the background, it is observed to reverse the gradient obtained from Scharr operator, and significantly affect the result.
     *     @param draw an optional Mat of type CV_8UC3 which visualises the detected letters using bounding boxes.
     *     @param chainBBs an optional parameter which chains the letter candidates according to heuristics in the paper and returns all possible regions where text is likely to occur.
     */
    public static void detectTextSWT(Mat input, MatOfRect result, boolean dark_on_light, Mat draw, Mat chainBBs) {
        Mat result_mat = result;
        detectTextSWT_0(input.nativeObj, result_mat.nativeObj, dark_on_light, draw.nativeObj, chainBBs.nativeObj);
    }

    /**
     * Applies the Stroke Width Transform operator followed by filtering of connected components of similar Stroke Widths to return letter candidates. It also chain them by proximity and size, saving the result in chainBBs.
     *     @param input the input image with 3 channels.
     *     @param result a vector of resulting bounding boxes where probability of finding text is high
     *     @param dark_on_light a boolean value signifying whether the text is darker or lighter than the background, it is observed to reverse the gradient obtained from Scharr operator, and significantly affect the result.
     *     @param draw an optional Mat of type CV_8UC3 which visualises the detected letters using bounding boxes.
     */
    public static void detectTextSWT(Mat input, MatOfRect result, boolean dark_on_light, Mat draw) {
        Mat result_mat = result;
        detectTextSWT_1(input.nativeObj, result_mat.nativeObj, dark_on_light, draw.nativeObj);
    }

    /**
     * Applies the Stroke Width Transform operator followed by filtering of connected components of similar Stroke Widths to return letter candidates. It also chain them by proximity and size, saving the result in chainBBs.
     *     @param input the input image with 3 channels.
     *     @param result a vector of resulting bounding boxes where probability of finding text is high
     *     @param dark_on_light a boolean value signifying whether the text is darker or lighter than the background, it is observed to reverse the gradient obtained from Scharr operator, and significantly affect the result.
     */
    public static void detectTextSWT(Mat input, MatOfRect result, boolean dark_on_light) {
        Mat result_mat = result;
        detectTextSWT_2(input.nativeObj, result_mat.nativeObj, dark_on_light);
    }


    //
    // C++:  Ptr_ERFilter cv::text::createERFilterNM1(Ptr_ERFilter_Callback cb, int thresholdDelta = 1, float minArea = (float)0.00025, float maxArea = (float)0.13, float minProbability = (float)0.4, bool nonMaxSuppression = true, float minProbabilityDiff = (float)0.1)
    //

    /**
     * Create an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm CITE: Neumann12.
     *
     * loadClassifierNM1, e.g. from file in samples/cpp/trained_classifierNM1.xml
     *
     * The component tree of the image is extracted by a threshold increased step by step from 0 to 255,
     * incrementally computable descriptors (aspect_ratio, compactness, number of holes, and number of
     * horizontal crossings) are computed for each ER and used as features for a classifier which estimates
     * the class-conditional probability P(er|character). The value of P(er|character) is tracked using the
     * inclusion relation of ER across all thresholds and only the ERs which correspond to local maximum of
     * the probability P(er|character) are selected (if the local maximum of the probability is above a
     * global limit pmin and the difference between local maximum and local minimum is greater than
     * minProbabilityDiff).
     * @param cb automatically generated
     * @param thresholdDelta automatically generated
     * @param minArea automatically generated
     * @param maxArea automatically generated
     * @param minProbability automatically generated
     * @param nonMaxSuppression automatically generated
     * @param minProbabilityDiff automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(ERFilter_Callback cb, int thresholdDelta, float minArea, float maxArea, float minProbability, boolean nonMaxSuppression, float minProbabilityDiff) {
        return ERFilter.__fromPtr__(createERFilterNM1_0(cb.getNativeObjAddr(), thresholdDelta, minArea, maxArea, minProbability, nonMaxSuppression, minProbabilityDiff));
    }

    /**
     * Create an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm CITE: Neumann12.
     *
     * loadClassifierNM1, e.g. from file in samples/cpp/trained_classifierNM1.xml
     *
     * The component tree of the image is extracted by a threshold increased step by step from 0 to 255,
     * incrementally computable descriptors (aspect_ratio, compactness, number of holes, and number of
     * horizontal crossings) are computed for each ER and used as features for a classifier which estimates
     * the class-conditional probability P(er|character). The value of P(er|character) is tracked using the
     * inclusion relation of ER across all thresholds and only the ERs which correspond to local maximum of
     * the probability P(er|character) are selected (if the local maximum of the probability is above a
     * global limit pmin and the difference between local maximum and local minimum is greater than
     * minProbabilityDiff).
     * @param cb automatically generated
     * @param thresholdDelta automatically generated
     * @param minArea automatically generated
     * @param maxArea automatically generated
     * @param minProbability automatically generated
     * @param nonMaxSuppression automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(ERFilter_Callback cb, int thresholdDelta, float minArea, float maxArea, float minProbability, boolean nonMaxSuppression) {
        return ERFilter.__fromPtr__(createERFilterNM1_1(cb.getNativeObjAddr(), thresholdDelta, minArea, maxArea, minProbability, nonMaxSuppression));
    }

    /**
     * Create an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm CITE: Neumann12.
     *
     * loadClassifierNM1, e.g. from file in samples/cpp/trained_classifierNM1.xml
     *
     * The component tree of the image is extracted by a threshold increased step by step from 0 to 255,
     * incrementally computable descriptors (aspect_ratio, compactness, number of holes, and number of
     * horizontal crossings) are computed for each ER and used as features for a classifier which estimates
     * the class-conditional probability P(er|character). The value of P(er|character) is tracked using the
     * inclusion relation of ER across all thresholds and only the ERs which correspond to local maximum of
     * the probability P(er|character) are selected (if the local maximum of the probability is above a
     * global limit pmin and the difference between local maximum and local minimum is greater than
     * minProbabilityDiff).
     * @param cb automatically generated
     * @param thresholdDelta automatically generated
     * @param minArea automatically generated
     * @param maxArea automatically generated
     * @param minProbability automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(ERFilter_Callback cb, int thresholdDelta, float minArea, float maxArea, float minProbability) {
        return ERFilter.__fromPtr__(createERFilterNM1_2(cb.getNativeObjAddr(), thresholdDelta, minArea, maxArea, minProbability));
    }

    /**
     * Create an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm CITE: Neumann12.
     *
     * loadClassifierNM1, e.g. from file in samples/cpp/trained_classifierNM1.xml
     *
     * The component tree of the image is extracted by a threshold increased step by step from 0 to 255,
     * incrementally computable descriptors (aspect_ratio, compactness, number of holes, and number of
     * horizontal crossings) are computed for each ER and used as features for a classifier which estimates
     * the class-conditional probability P(er|character). The value of P(er|character) is tracked using the
     * inclusion relation of ER across all thresholds and only the ERs which correspond to local maximum of
     * the probability P(er|character) are selected (if the local maximum of the probability is above a
     * global limit pmin and the difference between local maximum and local minimum is greater than
     * minProbabilityDiff).
     * @param cb automatically generated
     * @param thresholdDelta automatically generated
     * @param minArea automatically generated
     * @param maxArea automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(ERFilter_Callback cb, int thresholdDelta, float minArea, float maxArea) {
        return ERFilter.__fromPtr__(createERFilterNM1_3(cb.getNativeObjAddr(), thresholdDelta, minArea, maxArea));
    }

    /**
     * Create an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm CITE: Neumann12.
     *
     * loadClassifierNM1, e.g. from file in samples/cpp/trained_classifierNM1.xml
     *
     * The component tree of the image is extracted by a threshold increased step by step from 0 to 255,
     * incrementally computable descriptors (aspect_ratio, compactness, number of holes, and number of
     * horizontal crossings) are computed for each ER and used as features for a classifier which estimates
     * the class-conditional probability P(er|character). The value of P(er|character) is tracked using the
     * inclusion relation of ER across all thresholds and only the ERs which correspond to local maximum of
     * the probability P(er|character) are selected (if the local maximum of the probability is above a
     * global limit pmin and the difference between local maximum and local minimum is greater than
     * minProbabilityDiff).
     * @param cb automatically generated
     * @param thresholdDelta automatically generated
     * @param minArea automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(ERFilter_Callback cb, int thresholdDelta, float minArea) {
        return ERFilter.__fromPtr__(createERFilterNM1_4(cb.getNativeObjAddr(), thresholdDelta, minArea));
    }

    /**
     * Create an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm CITE: Neumann12.
     *
     * loadClassifierNM1, e.g. from file in samples/cpp/trained_classifierNM1.xml
     *
     * The component tree of the image is extracted by a threshold increased step by step from 0 to 255,
     * incrementally computable descriptors (aspect_ratio, compactness, number of holes, and number of
     * horizontal crossings) are computed for each ER and used as features for a classifier which estimates
     * the class-conditional probability P(er|character). The value of P(er|character) is tracked using the
     * inclusion relation of ER across all thresholds and only the ERs which correspond to local maximum of
     * the probability P(er|character) are selected (if the local maximum of the probability is above a
     * global limit pmin and the difference between local maximum and local minimum is greater than
     * minProbabilityDiff).
     * @param cb automatically generated
     * @param thresholdDelta automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(ERFilter_Callback cb, int thresholdDelta) {
        return ERFilter.__fromPtr__(createERFilterNM1_5(cb.getNativeObjAddr(), thresholdDelta));
    }

    /**
     * Create an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm CITE: Neumann12.
     *
     * loadClassifierNM1, e.g. from file in samples/cpp/trained_classifierNM1.xml
     *
     * The component tree of the image is extracted by a threshold increased step by step from 0 to 255,
     * incrementally computable descriptors (aspect_ratio, compactness, number of holes, and number of
     * horizontal crossings) are computed for each ER and used as features for a classifier which estimates
     * the class-conditional probability P(er|character). The value of P(er|character) is tracked using the
     * inclusion relation of ER across all thresholds and only the ERs which correspond to local maximum of
     * the probability P(er|character) are selected (if the local maximum of the probability is above a
     * global limit pmin and the difference between local maximum and local minimum is greater than
     * minProbabilityDiff).
     * @param cb automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(ERFilter_Callback cb) {
        return ERFilter.__fromPtr__(createERFilterNM1_6(cb.getNativeObjAddr()));
    }


    //
    // C++:  Ptr_ERFilter cv::text::createERFilterNM2(Ptr_ERFilter_Callback cb, float minProbability = (float)0.3)
    //

    /**
     * Create an Extremal Region Filter for the 2nd stage classifier of N&amp;M algorithm CITE: Neumann12.
     *
     * loadClassifierNM2, e.g. from file in samples/cpp/trained_classifierNM2.xml
     *
     * In the second stage, the ERs that passed the first stage are classified into character and
     * non-character classes using more informative but also more computationally expensive features. The
     * classifier uses all the features calculated in the first stage and the following additional
     * features: hole area ratio, convex hull ratio, and number of outer inflexion points.
     * @param cb automatically generated
     * @param minProbability automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM2(ERFilter_Callback cb, float minProbability) {
        return ERFilter.__fromPtr__(createERFilterNM2_0(cb.getNativeObjAddr(), minProbability));
    }

    /**
     * Create an Extremal Region Filter for the 2nd stage classifier of N&amp;M algorithm CITE: Neumann12.
     *
     * loadClassifierNM2, e.g. from file in samples/cpp/trained_classifierNM2.xml
     *
     * In the second stage, the ERs that passed the first stage are classified into character and
     * non-character classes using more informative but also more computationally expensive features. The
     * classifier uses all the features calculated in the first stage and the following additional
     * features: hole area ratio, convex hull ratio, and number of outer inflexion points.
     * @param cb automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM2(ERFilter_Callback cb) {
        return ERFilter.__fromPtr__(createERFilterNM2_1(cb.getNativeObjAddr()));
    }


    //
    // C++:  Ptr_ERFilter cv::text::createERFilterNM1(String filename, int thresholdDelta = 1, float minArea = (float)0.00025, float maxArea = (float)0.13, float minProbability = (float)0.4, bool nonMaxSuppression = true, float minProbabilityDiff = (float)0.1)
    //

    /**
     * Reads an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm
     *     from the provided path e.g. /path/to/cpp/trained_classifierNM1.xml
     *
     * @param filename automatically generated
     * @param thresholdDelta automatically generated
     * @param minArea automatically generated
     * @param maxArea automatically generated
     * @param minProbability automatically generated
     * @param nonMaxSuppression automatically generated
     * @param minProbabilityDiff automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(String filename, int thresholdDelta, float minArea, float maxArea, float minProbability, boolean nonMaxSuppression, float minProbabilityDiff) {
        return ERFilter.__fromPtr__(createERFilterNM1_7(filename, thresholdDelta, minArea, maxArea, minProbability, nonMaxSuppression, minProbabilityDiff));
    }

    /**
     * Reads an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm
     *     from the provided path e.g. /path/to/cpp/trained_classifierNM1.xml
     *
     * @param filename automatically generated
     * @param thresholdDelta automatically generated
     * @param minArea automatically generated
     * @param maxArea automatically generated
     * @param minProbability automatically generated
     * @param nonMaxSuppression automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(String filename, int thresholdDelta, float minArea, float maxArea, float minProbability, boolean nonMaxSuppression) {
        return ERFilter.__fromPtr__(createERFilterNM1_8(filename, thresholdDelta, minArea, maxArea, minProbability, nonMaxSuppression));
    }

    /**
     * Reads an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm
     *     from the provided path e.g. /path/to/cpp/trained_classifierNM1.xml
     *
     * @param filename automatically generated
     * @param thresholdDelta automatically generated
     * @param minArea automatically generated
     * @param maxArea automatically generated
     * @param minProbability automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(String filename, int thresholdDelta, float minArea, float maxArea, float minProbability) {
        return ERFilter.__fromPtr__(createERFilterNM1_9(filename, thresholdDelta, minArea, maxArea, minProbability));
    }

    /**
     * Reads an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm
     *     from the provided path e.g. /path/to/cpp/trained_classifierNM1.xml
     *
     * @param filename automatically generated
     * @param thresholdDelta automatically generated
     * @param minArea automatically generated
     * @param maxArea automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(String filename, int thresholdDelta, float minArea, float maxArea) {
        return ERFilter.__fromPtr__(createERFilterNM1_10(filename, thresholdDelta, minArea, maxArea));
    }

    /**
     * Reads an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm
     *     from the provided path e.g. /path/to/cpp/trained_classifierNM1.xml
     *
     * @param filename automatically generated
     * @param thresholdDelta automatically generated
     * @param minArea automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(String filename, int thresholdDelta, float minArea) {
        return ERFilter.__fromPtr__(createERFilterNM1_11(filename, thresholdDelta, minArea));
    }

    /**
     * Reads an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm
     *     from the provided path e.g. /path/to/cpp/trained_classifierNM1.xml
     *
     * @param filename automatically generated
     * @param thresholdDelta automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(String filename, int thresholdDelta) {
        return ERFilter.__fromPtr__(createERFilterNM1_12(filename, thresholdDelta));
    }

    /**
     * Reads an Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm
     *     from the provided path e.g. /path/to/cpp/trained_classifierNM1.xml
     *
     * @param filename automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM1(String filename) {
        return ERFilter.__fromPtr__(createERFilterNM1_13(filename));
    }


    //
    // C++:  Ptr_ERFilter cv::text::createERFilterNM2(String filename, float minProbability = (float)0.3)
    //

    /**
     * Reads an Extremal Region Filter for the 2nd stage classifier of N&amp;M algorithm
     *     from the provided path e.g. /path/to/cpp/trained_classifierNM2.xml
     *
     * @param filename automatically generated
     * @param minProbability automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM2(String filename, float minProbability) {
        return ERFilter.__fromPtr__(createERFilterNM2_2(filename, minProbability));
    }

    /**
     * Reads an Extremal Region Filter for the 2nd stage classifier of N&amp;M algorithm
     *     from the provided path e.g. /path/to/cpp/trained_classifierNM2.xml
     *
     * @param filename automatically generated
     * @return automatically generated
     */
    public static ERFilter createERFilterNM2(String filename) {
        return ERFilter.__fromPtr__(createERFilterNM2_3(filename));
    }


    //
    // C++:  Ptr_ERFilter_Callback cv::text::loadClassifierNM1(String filename)
    //

    /**
     * Allow to implicitly load the default classifier when creating an ERFilter object.
     *
     * @param filename The XML or YAML file with the classifier model (e.g. trained_classifierNM1.xml)
     *
     * returns a pointer to ERFilter::Callback.
     * @return automatically generated
     */
    public static ERFilter_Callback loadClassifierNM1(String filename) {
        return ERFilter_Callback.__fromPtr__(loadClassifierNM1_0(filename));
    }


    //
    // C++:  Ptr_ERFilter_Callback cv::text::loadClassifierNM2(String filename)
    //

    /**
     * Allow to implicitly load the default classifier when creating an ERFilter object.
     *
     * @param filename The XML or YAML file with the classifier model (e.g. trained_classifierNM2.xml)
     *
     * returns a pointer to ERFilter::Callback.
     * @return automatically generated
     */
    public static ERFilter_Callback loadClassifierNM2(String filename) {
        return ERFilter_Callback.__fromPtr__(loadClassifierNM2_0(filename));
    }


    //
    // C++:  void cv::text::computeNMChannels(Mat _src, vector_Mat& _channels, int _mode = ERFILTER_NM_RGBLGrad)
    //

    /**
     * Compute the different channels to be processed independently in the N&amp;M algorithm CITE: Neumann12.
     *
     * @param _src Source image. Must be RGB CV_8UC3.
     *
     * @param _channels Output vector&lt;Mat&gt; where computed channels are stored.
     *
     * @param _mode Mode of operation. Currently the only available options are:
     * <b>ERFILTER_NM_RGBLGrad</b> (used by default) and <b>ERFILTER_NM_IHSGrad</b>.
     *
     * In N&amp;M algorithm, the combination of intensity (I), hue (H), saturation (S), and gradient magnitude
     * channels (Grad) are used in order to obtain high localization recall. This implementation also
     * provides an alternative combination of red (R), green (G), blue (B), lightness (L), and gradient
     * magnitude (Grad).
     */
    public static void computeNMChannels(Mat _src, List<Mat> _channels, int _mode) {
        Mat _channels_mat = new Mat();
        computeNMChannels_0(_src.nativeObj, _channels_mat.nativeObj, _mode);
        Converters.Mat_to_vector_Mat(_channels_mat, _channels);
        _channels_mat.release();
    }

    /**
     * Compute the different channels to be processed independently in the N&amp;M algorithm CITE: Neumann12.
     *
     * @param _src Source image. Must be RGB CV_8UC3.
     *
     * @param _channels Output vector&lt;Mat&gt; where computed channels are stored.
     *
     * <b>ERFILTER_NM_RGBLGrad</b> (used by default) and <b>ERFILTER_NM_IHSGrad</b>.
     *
     * In N&amp;M algorithm, the combination of intensity (I), hue (H), saturation (S), and gradient magnitude
     * channels (Grad) are used in order to obtain high localization recall. This implementation also
     * provides an alternative combination of red (R), green (G), blue (B), lightness (L), and gradient
     * magnitude (Grad).
     */
    public static void computeNMChannels(Mat _src, List<Mat> _channels) {
        Mat _channels_mat = new Mat();
        computeNMChannels_1(_src.nativeObj, _channels_mat.nativeObj);
        Converters.Mat_to_vector_Mat(_channels_mat, _channels);
        _channels_mat.release();
    }


    //
    // C++:  void cv::text::erGrouping(Mat image, Mat channel, vector_vector_Point regions, vector_Rect& groups_rects, int method = ERGROUPING_ORIENTATION_HORIZ, String filename = String(), float minProbablity = (float)0.5)
    //

    /**
     * Find groups of Extremal Regions that are organized as text blocks.
     *
     *
     *
     * @param regions Vector of ER's retrieved from the ERFilter algorithm from each channel.
     *
     * provided regions.
     *
     * @param groups_rects The output of the algorithm are stored in this parameter as list of rectangles.
     *
     * @param method Grouping method (see text::erGrouping_Modes). Can be one of ERGROUPING_ORIENTATION_HORIZ,
     * ERGROUPING_ORIENTATION_ANY.
     *
     * @param filename The XML or YAML file with the classifier model (e.g.
     * samples/trained_classifier_erGrouping.xml). Only to use when grouping method is
     * ERGROUPING_ORIENTATION_ANY.
     *
     * @param minProbablity The minimum probability for accepting a group. Only to use when grouping
     * method is ERGROUPING_ORIENTATION_ANY.
     * @param image automatically generated
     * @param channel automatically generated
     */
    public static void erGrouping(Mat image, Mat channel, List<MatOfPoint> regions, MatOfRect groups_rects, int method, String filename, float minProbablity) {
        List<Mat> regions_tmplm = new ArrayList<Mat>((regions != null) ? regions.size() : 0);
        Mat regions_mat = Converters.vector_vector_Point_to_Mat(regions, regions_tmplm);
        Mat groups_rects_mat = groups_rects;
        erGrouping_0(image.nativeObj, channel.nativeObj, regions_mat.nativeObj, groups_rects_mat.nativeObj, method, filename, minProbablity);
    }

    /**
     * Find groups of Extremal Regions that are organized as text blocks.
     *
     *
     *
     * @param regions Vector of ER's retrieved from the ERFilter algorithm from each channel.
     *
     * provided regions.
     *
     * @param groups_rects The output of the algorithm are stored in this parameter as list of rectangles.
     *
     * @param method Grouping method (see text::erGrouping_Modes). Can be one of ERGROUPING_ORIENTATION_HORIZ,
     * ERGROUPING_ORIENTATION_ANY.
     *
     * @param filename The XML or YAML file with the classifier model (e.g.
     * samples/trained_classifier_erGrouping.xml). Only to use when grouping method is
     * ERGROUPING_ORIENTATION_ANY.
     *
     * method is ERGROUPING_ORIENTATION_ANY.
     * @param image automatically generated
     * @param channel automatically generated
     */
    public static void erGrouping(Mat image, Mat channel, List<MatOfPoint> regions, MatOfRect groups_rects, int method, String filename) {
        List<Mat> regions_tmplm = new ArrayList<Mat>((regions != null) ? regions.size() : 0);
        Mat regions_mat = Converters.vector_vector_Point_to_Mat(regions, regions_tmplm);
        Mat groups_rects_mat = groups_rects;
        erGrouping_1(image.nativeObj, channel.nativeObj, regions_mat.nativeObj, groups_rects_mat.nativeObj, method, filename);
    }

    /**
     * Find groups of Extremal Regions that are organized as text blocks.
     *
     *
     *
     * @param regions Vector of ER's retrieved from the ERFilter algorithm from each channel.
     *
     * provided regions.
     *
     * @param groups_rects The output of the algorithm are stored in this parameter as list of rectangles.
     *
     * @param method Grouping method (see text::erGrouping_Modes). Can be one of ERGROUPING_ORIENTATION_HORIZ,
     * ERGROUPING_ORIENTATION_ANY.
     *
     * samples/trained_classifier_erGrouping.xml). Only to use when grouping method is
     * ERGROUPING_ORIENTATION_ANY.
     *
     * method is ERGROUPING_ORIENTATION_ANY.
     * @param image automatically generated
     * @param channel automatically generated
     */
    public static void erGrouping(Mat image, Mat channel, List<MatOfPoint> regions, MatOfRect groups_rects, int method) {
        List<Mat> regions_tmplm = new ArrayList<Mat>((regions != null) ? regions.size() : 0);
        Mat regions_mat = Converters.vector_vector_Point_to_Mat(regions, regions_tmplm);
        Mat groups_rects_mat = groups_rects;
        erGrouping_2(image.nativeObj, channel.nativeObj, regions_mat.nativeObj, groups_rects_mat.nativeObj, method);
    }

    /**
     * Find groups of Extremal Regions that are organized as text blocks.
     *
     *
     *
     * @param regions Vector of ER's retrieved from the ERFilter algorithm from each channel.
     *
     * provided regions.
     *
     * @param groups_rects The output of the algorithm are stored in this parameter as list of rectangles.
     *
     * ERGROUPING_ORIENTATION_ANY.
     *
     * samples/trained_classifier_erGrouping.xml). Only to use when grouping method is
     * ERGROUPING_ORIENTATION_ANY.
     *
     * method is ERGROUPING_ORIENTATION_ANY.
     * @param image automatically generated
     * @param channel automatically generated
     */
    public static void erGrouping(Mat image, Mat channel, List<MatOfPoint> regions, MatOfRect groups_rects) {
        List<Mat> regions_tmplm = new ArrayList<Mat>((regions != null) ? regions.size() : 0);
        Mat regions_mat = Converters.vector_vector_Point_to_Mat(regions, regions_tmplm);
        Mat groups_rects_mat = groups_rects;
        erGrouping_3(image.nativeObj, channel.nativeObj, regions_mat.nativeObj, groups_rects_mat.nativeObj);
    }


    //
    // C++:  void cv::text::detectRegions(Mat image, Ptr_ERFilter er_filter1, Ptr_ERFilter er_filter2, vector_vector_Point& regions)
    //

    /**
     * Converts MSER contours (vector&lt;Point&gt;) to ERStat regions.
     *
     * @param image Source image CV_8UC1 from which the MSERs where extracted.
     *
     *
     * @param regions Output where the ERStat regions are stored.
     *
     * It takes as input the contours provided by the OpenCV MSER feature detector and returns as output
     * two vectors of ERStats. This is because MSER() output contains both MSER+ and MSER- regions in a
     * single vector&lt;Point&gt;, the function separates them in two different vectors (this is as if the
     * ERStats where extracted from two different channels).
     *
     * An example of MSERsToERStats in use can be found in the text detection webcam_demo:
     * &lt;https://github.com/opencv/opencv_contrib/blob/master/modules/text/samples/webcam_demo.cpp&gt;
     * @param er_filter1 automatically generated
     * @param er_filter2 automatically generated
     */
    public static void detectRegions(Mat image, ERFilter er_filter1, ERFilter er_filter2, List<MatOfPoint> regions) {
        Mat regions_mat = new Mat();
        detectRegions_0(image.nativeObj, er_filter1.getNativeObjAddr(), er_filter2.getNativeObjAddr(), regions_mat.nativeObj);
        Converters.Mat_to_vector_vector_Point(regions_mat, regions);
        regions_mat.release();
    }


    //
    // C++:  void cv::text::detectRegions(Mat image, Ptr_ERFilter er_filter1, Ptr_ERFilter er_filter2, vector_Rect& groups_rects, int method = ERGROUPING_ORIENTATION_HORIZ, String filename = String(), float minProbability = (float)0.5)
    //

    /**
     * Extracts text regions from image.
     *
     * @param image Source image where text blocks needs to be extracted from.  Should be CV_8UC3 (color).
     * @param er_filter1 Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm CITE: Neumann12
     * @param er_filter2 Extremal Region Filter for the 2nd stage classifier of N&amp;M algorithm CITE: Neumann12
     * @param groups_rects Output list of rectangle blocks with text
     * @param method Grouping method (see text::erGrouping_Modes). Can be one of ERGROUPING_ORIENTATION_HORIZ, ERGROUPING_ORIENTATION_ANY.
     * @param filename The XML or YAML file with the classifier model (e.g. samples/trained_classifier_erGrouping.xml). Only to use when grouping method is ERGROUPING_ORIENTATION_ANY.
     * @param minProbability The minimum probability for accepting a group. Only to use when grouping method is ERGROUPING_ORIENTATION_ANY.
     */
    public static void detectRegions(Mat image, ERFilter er_filter1, ERFilter er_filter2, MatOfRect groups_rects, int method, String filename, float minProbability) {
        Mat groups_rects_mat = groups_rects;
        detectRegions_1(image.nativeObj, er_filter1.getNativeObjAddr(), er_filter2.getNativeObjAddr(), groups_rects_mat.nativeObj, method, filename, minProbability);
    }

    /**
     * Extracts text regions from image.
     *
     * @param image Source image where text blocks needs to be extracted from.  Should be CV_8UC3 (color).
     * @param er_filter1 Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm CITE: Neumann12
     * @param er_filter2 Extremal Region Filter for the 2nd stage classifier of N&amp;M algorithm CITE: Neumann12
     * @param groups_rects Output list of rectangle blocks with text
     * @param method Grouping method (see text::erGrouping_Modes). Can be one of ERGROUPING_ORIENTATION_HORIZ, ERGROUPING_ORIENTATION_ANY.
     * @param filename The XML or YAML file with the classifier model (e.g. samples/trained_classifier_erGrouping.xml). Only to use when grouping method is ERGROUPING_ORIENTATION_ANY.
     */
    public static void detectRegions(Mat image, ERFilter er_filter1, ERFilter er_filter2, MatOfRect groups_rects, int method, String filename) {
        Mat groups_rects_mat = groups_rects;
        detectRegions_2(image.nativeObj, er_filter1.getNativeObjAddr(), er_filter2.getNativeObjAddr(), groups_rects_mat.nativeObj, method, filename);
    }

    /**
     * Extracts text regions from image.
     *
     * @param image Source image where text blocks needs to be extracted from.  Should be CV_8UC3 (color).
     * @param er_filter1 Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm CITE: Neumann12
     * @param er_filter2 Extremal Region Filter for the 2nd stage classifier of N&amp;M algorithm CITE: Neumann12
     * @param groups_rects Output list of rectangle blocks with text
     * @param method Grouping method (see text::erGrouping_Modes). Can be one of ERGROUPING_ORIENTATION_HORIZ, ERGROUPING_ORIENTATION_ANY.
     */
    public static void detectRegions(Mat image, ERFilter er_filter1, ERFilter er_filter2, MatOfRect groups_rects, int method) {
        Mat groups_rects_mat = groups_rects;
        detectRegions_3(image.nativeObj, er_filter1.getNativeObjAddr(), er_filter2.getNativeObjAddr(), groups_rects_mat.nativeObj, method);
    }

    /**
     * Extracts text regions from image.
     *
     * @param image Source image where text blocks needs to be extracted from.  Should be CV_8UC3 (color).
     * @param er_filter1 Extremal Region Filter for the 1st stage classifier of N&amp;M algorithm CITE: Neumann12
     * @param er_filter2 Extremal Region Filter for the 2nd stage classifier of N&amp;M algorithm CITE: Neumann12
     * @param groups_rects Output list of rectangle blocks with text
     */
    public static void detectRegions(Mat image, ERFilter er_filter1, ERFilter er_filter2, MatOfRect groups_rects) {
        Mat groups_rects_mat = groups_rects;
        detectRegions_4(image.nativeObj, er_filter1.getNativeObjAddr(), er_filter2.getNativeObjAddr(), groups_rects_mat.nativeObj);
    }


    //
    // C++:  Ptr_OCRHMMDecoder_ClassifierCallback cv::text::loadOCRHMMClassifierNM(String filename)
    //

    /**
     * Allow to implicitly load the default character classifier when creating an OCRHMMDecoder object.
     *
     * @param filename The XML or YAML file with the classifier model (e.g. OCRHMM_knn_model_data.xml)
     *
     * The KNN default classifier is based in the scene text recognition method proposed by Lukás Neumann &amp;
     * Jiri Matas in [Neumann11b]. Basically, the region (contour) in the input image is normalized to a
     * fixed size, while retaining the centroid and aspect ratio, in order to extract a feature vector
     * based on gradient orientations along the chain-code of its perimeter. Then, the region is classified
     * using a KNN model trained with synthetic data of rendered characters with different standard font
     * types.
     *
     * @deprecated loadOCRHMMClassifier instead
     * @return automatically generated
     */
    @Deprecated
    public static OCRHMMDecoder_ClassifierCallback loadOCRHMMClassifierNM(String filename) {
        return OCRHMMDecoder_ClassifierCallback.__fromPtr__(loadOCRHMMClassifierNM_0(filename));
    }


    //
    // C++:  Ptr_OCRHMMDecoder_ClassifierCallback cv::text::loadOCRHMMClassifierCNN(String filename)
    //

    /**
     * Allow to implicitly load the default character classifier when creating an OCRHMMDecoder object.
     *
     * @param filename The XML or YAML file with the classifier model (e.g. OCRBeamSearch_CNN_model_data.xml.gz)
     *
     * The CNN default classifier is based in the scene text recognition method proposed by Adam Coates &amp;
     * Andrew NG in [Coates11a]. The character classifier consists in a Single Layer Convolutional Neural Network and
     * a linear classifier. It is applied to the input image in a sliding window fashion, providing a set of recognitions
     * at each window location.
     *
     * @deprecated use loadOCRHMMClassifier instead
     * @return automatically generated
     */
    @Deprecated
    public static OCRHMMDecoder_ClassifierCallback loadOCRHMMClassifierCNN(String filename) {
        return OCRHMMDecoder_ClassifierCallback.__fromPtr__(loadOCRHMMClassifierCNN_0(filename));
    }


    //
    // C++:  Ptr_OCRHMMDecoder_ClassifierCallback cv::text::loadOCRHMMClassifier(String filename, int classifier)
    //

    /**
     * Allow to implicitly load the default character classifier when creating an OCRHMMDecoder object.
     *
     *  @param filename The XML or YAML file with the classifier model (e.g. OCRBeamSearch_CNN_model_data.xml.gz)
     *
     *  @param classifier Can be one of classifier_type enum values.
     * @return automatically generated
     */
    public static OCRHMMDecoder_ClassifierCallback loadOCRHMMClassifier(String filename, int classifier) {
        return OCRHMMDecoder_ClassifierCallback.__fromPtr__(loadOCRHMMClassifier_0(filename, classifier));
    }


    //
    // C++:  Mat cv::text::createOCRHMMTransitionsTable(String vocabulary, vector_String lexicon)
    //

    /**
     * Utility function to create a tailored language model transitions table from a given list of words (lexicon).
     *
     * @param vocabulary The language vocabulary (chars when ASCII English text).
     *
     * @param lexicon The list of words that are expected to be found in a particular image.
     *
     *
     * The function calculate frequency statistics of character pairs from the given lexicon and fills the output transition_probabilities_table with them. The transition_probabilities_table can be used as input in the OCRHMMDecoder::create() and OCRBeamSearchDecoder::create() methods.
     * <b>Note:</b>
     * -   (C++) An alternative would be to load the default generic language transition table provided in the text module samples folder (created from ispell 42869 english words list) :
     * &lt;https://github.com/opencv/opencv_contrib/blob/master/modules/text/samples/OCRHMM_transitions_table.xml&gt;
     *
     * @return automatically generated
     */
    public static Mat createOCRHMMTransitionsTable(String vocabulary, List<String> lexicon) {
        return new Mat(createOCRHMMTransitionsTable_0(vocabulary, lexicon));
    }


    //
    // C++:  Ptr_OCRBeamSearchDecoder_ClassifierCallback cv::text::loadOCRBeamSearchClassifierCNN(String filename)
    //

    /**
     * Allow to implicitly load the default character classifier when creating an OCRBeamSearchDecoder object.
     *
     * @param filename The XML or YAML file with the classifier model (e.g. OCRBeamSearch_CNN_model_data.xml.gz)
     *
     * The CNN default classifier is based in the scene text recognition method proposed by Adam Coates &amp;
     * Andrew NG in [Coates11a]. The character classifier consists in a Single Layer Convolutional Neural Network and
     * a linear classifier. It is applied to the input image in a sliding window fashion, providing a set of recognitions
     * at each window location.
     * @return automatically generated
     */
    public static OCRBeamSearchDecoder_ClassifierCallback loadOCRBeamSearchClassifierCNN(String filename) {
        return OCRBeamSearchDecoder_ClassifierCallback.__fromPtr__(loadOCRBeamSearchClassifierCNN_0(filename));
    }




    // C++:  void cv::text::detectTextSWT(Mat input, vector_Rect& result, bool dark_on_light, Mat& draw = Mat(), Mat& chainBBs = Mat())
    private static native void detectTextSWT_0(long input_nativeObj, long result_mat_nativeObj, boolean dark_on_light, long draw_nativeObj, long chainBBs_nativeObj);
    private static native void detectTextSWT_1(long input_nativeObj, long result_mat_nativeObj, boolean dark_on_light, long draw_nativeObj);
    private static native void detectTextSWT_2(long input_nativeObj, long result_mat_nativeObj, boolean dark_on_light);

    // C++:  Ptr_ERFilter cv::text::createERFilterNM1(Ptr_ERFilter_Callback cb, int thresholdDelta = 1, float minArea = (float)0.00025, float maxArea = (float)0.13, float minProbability = (float)0.4, bool nonMaxSuppression = true, float minProbabilityDiff = (float)0.1)
    private static native long createERFilterNM1_0(long cb_nativeObj, int thresholdDelta, float minArea, float maxArea, float minProbability, boolean nonMaxSuppression, float minProbabilityDiff);
    private static native long createERFilterNM1_1(long cb_nativeObj, int thresholdDelta, float minArea, float maxArea, float minProbability, boolean nonMaxSuppression);
    private static native long createERFilterNM1_2(long cb_nativeObj, int thresholdDelta, float minArea, float maxArea, float minProbability);
    private static native long createERFilterNM1_3(long cb_nativeObj, int thresholdDelta, float minArea, float maxArea);
    private static native long createERFilterNM1_4(long cb_nativeObj, int thresholdDelta, float minArea);
    private static native long createERFilterNM1_5(long cb_nativeObj, int thresholdDelta);
    private static native long createERFilterNM1_6(long cb_nativeObj);

    // C++:  Ptr_ERFilter cv::text::createERFilterNM2(Ptr_ERFilter_Callback cb, float minProbability = (float)0.3)
    private static native long createERFilterNM2_0(long cb_nativeObj, float minProbability);
    private static native long createERFilterNM2_1(long cb_nativeObj);

    // C++:  Ptr_ERFilter cv::text::createERFilterNM1(String filename, int thresholdDelta = 1, float minArea = (float)0.00025, float maxArea = (float)0.13, float minProbability = (float)0.4, bool nonMaxSuppression = true, float minProbabilityDiff = (float)0.1)
    private static native long createERFilterNM1_7(String filename, int thresholdDelta, float minArea, float maxArea, float minProbability, boolean nonMaxSuppression, float minProbabilityDiff);
    private static native long createERFilterNM1_8(String filename, int thresholdDelta, float minArea, float maxArea, float minProbability, boolean nonMaxSuppression);
    private static native long createERFilterNM1_9(String filename, int thresholdDelta, float minArea, float maxArea, float minProbability);
    private static native long createERFilterNM1_10(String filename, int thresholdDelta, float minArea, float maxArea);
    private static native long createERFilterNM1_11(String filename, int thresholdDelta, float minArea);
    private static native long createERFilterNM1_12(String filename, int thresholdDelta);
    private static native long createERFilterNM1_13(String filename);

    // C++:  Ptr_ERFilter cv::text::createERFilterNM2(String filename, float minProbability = (float)0.3)
    private static native long createERFilterNM2_2(String filename, float minProbability);
    private static native long createERFilterNM2_3(String filename);

    // C++:  Ptr_ERFilter_Callback cv::text::loadClassifierNM1(String filename)
    private static native long loadClassifierNM1_0(String filename);

    // C++:  Ptr_ERFilter_Callback cv::text::loadClassifierNM2(String filename)
    private static native long loadClassifierNM2_0(String filename);

    // C++:  void cv::text::computeNMChannels(Mat _src, vector_Mat& _channels, int _mode = ERFILTER_NM_RGBLGrad)
    private static native void computeNMChannels_0(long _src_nativeObj, long _channels_mat_nativeObj, int _mode);
    private static native void computeNMChannels_1(long _src_nativeObj, long _channels_mat_nativeObj);

    // C++:  void cv::text::erGrouping(Mat image, Mat channel, vector_vector_Point regions, vector_Rect& groups_rects, int method = ERGROUPING_ORIENTATION_HORIZ, String filename = String(), float minProbablity = (float)0.5)
    private static native void erGrouping_0(long image_nativeObj, long channel_nativeObj, long regions_mat_nativeObj, long groups_rects_mat_nativeObj, int method, String filename, float minProbablity);
    private static native void erGrouping_1(long image_nativeObj, long channel_nativeObj, long regions_mat_nativeObj, long groups_rects_mat_nativeObj, int method, String filename);
    private static native void erGrouping_2(long image_nativeObj, long channel_nativeObj, long regions_mat_nativeObj, long groups_rects_mat_nativeObj, int method);
    private static native void erGrouping_3(long image_nativeObj, long channel_nativeObj, long regions_mat_nativeObj, long groups_rects_mat_nativeObj);

    // C++:  void cv::text::detectRegions(Mat image, Ptr_ERFilter er_filter1, Ptr_ERFilter er_filter2, vector_vector_Point& regions)
    private static native void detectRegions_0(long image_nativeObj, long er_filter1_nativeObj, long er_filter2_nativeObj, long regions_mat_nativeObj);

    // C++:  void cv::text::detectRegions(Mat image, Ptr_ERFilter er_filter1, Ptr_ERFilter er_filter2, vector_Rect& groups_rects, int method = ERGROUPING_ORIENTATION_HORIZ, String filename = String(), float minProbability = (float)0.5)
    private static native void detectRegions_1(long image_nativeObj, long er_filter1_nativeObj, long er_filter2_nativeObj, long groups_rects_mat_nativeObj, int method, String filename, float minProbability);
    private static native void detectRegions_2(long image_nativeObj, long er_filter1_nativeObj, long er_filter2_nativeObj, long groups_rects_mat_nativeObj, int method, String filename);
    private static native void detectRegions_3(long image_nativeObj, long er_filter1_nativeObj, long er_filter2_nativeObj, long groups_rects_mat_nativeObj, int method);
    private static native void detectRegions_4(long image_nativeObj, long er_filter1_nativeObj, long er_filter2_nativeObj, long groups_rects_mat_nativeObj);

    // C++:  Ptr_OCRHMMDecoder_ClassifierCallback cv::text::loadOCRHMMClassifierNM(String filename)
    private static native long loadOCRHMMClassifierNM_0(String filename);

    // C++:  Ptr_OCRHMMDecoder_ClassifierCallback cv::text::loadOCRHMMClassifierCNN(String filename)
    private static native long loadOCRHMMClassifierCNN_0(String filename);

    // C++:  Ptr_OCRHMMDecoder_ClassifierCallback cv::text::loadOCRHMMClassifier(String filename, int classifier)
    private static native long loadOCRHMMClassifier_0(String filename, int classifier);

    // C++:  Mat cv::text::createOCRHMMTransitionsTable(String vocabulary, vector_String lexicon)
    private static native long createOCRHMMTransitionsTable_0(String vocabulary, List<String> lexicon);

    // C++:  Ptr_OCRBeamSearchDecoder_ClassifierCallback cv::text::loadOCRBeamSearchClassifierCNN(String filename)
    private static native long loadOCRBeamSearchClassifierCNN_0(String filename);

}
