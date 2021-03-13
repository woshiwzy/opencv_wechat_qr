//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.text;

import org.opencv.core.Mat;
import org.opencv.text.BaseOCR;
import org.opencv.text.OCRHMMDecoder;
import org.opencv.text.OCRHMMDecoder_ClassifierCallback;

// C++: class OCRHMMDecoder
/**
 * OCRHMMDecoder class provides an interface for OCR using Hidden Markov Models.
 *
 * <b>Note:</b>
 * <ul>
 *   <li>
 *       (C++) An example on using OCRHMMDecoder recognition combined with scene text detection can
 *         be found at the webcam_demo sample:
 *         &lt;https://github.com/opencv/opencv_contrib/blob/master/modules/text/samples/webcam_demo.cpp&gt;
 *   </li>
 * </ul>
 */
public class OCRHMMDecoder extends BaseOCR {

    protected OCRHMMDecoder(long addr) { super(addr); }

    // internal usage only
    public static OCRHMMDecoder __fromPtr__(long addr) { return new OCRHMMDecoder(addr); }

    //
    // C++:  String cv::text::OCRHMMDecoder::run(Mat image, int min_confidence, int component_level = 0)
    //

    /**
     * Recognize text using HMM.
     *
     *     Takes an image and a mask (where each connected component corresponds to a segmented character)
     *     on input and returns recognized text in the output_text parameter. Optionally
     *     provides also the Rects for individual text elements found (e.g. words), and the list of those
     *     text elements with their confidence values.
     *
     *     @param image Input image CV_8UC1 or CV_8UC3 with a single text line (or word).
     *
     *
     *     text elements found (e.g. words).
     *
     *     recognition of individual text elements found (e.g. words).
     *
     *     for the recognition of individual text elements found (e.g. words).
     *
     *     @param component_level Only OCR_LEVEL_WORD is supported.
     * @param min_confidence automatically generated
     * @return automatically generated
     */
    public String run(Mat image, int min_confidence, int component_level) {
        return run_0(nativeObj, image.nativeObj, min_confidence, component_level);
    }

    /**
     * Recognize text using HMM.
     *
     *     Takes an image and a mask (where each connected component corresponds to a segmented character)
     *     on input and returns recognized text in the output_text parameter. Optionally
     *     provides also the Rects for individual text elements found (e.g. words), and the list of those
     *     text elements with their confidence values.
     *
     *     @param image Input image CV_8UC1 or CV_8UC3 with a single text line (or word).
     *
     *
     *     text elements found (e.g. words).
     *
     *     recognition of individual text elements found (e.g. words).
     *
     *     for the recognition of individual text elements found (e.g. words).
     *
     * @param min_confidence automatically generated
     * @return automatically generated
     */
    public String run(Mat image, int min_confidence) {
        return run_1(nativeObj, image.nativeObj, min_confidence);
    }


    //
    // C++:  String cv::text::OCRHMMDecoder::run(Mat image, Mat mask, int min_confidence, int component_level = 0)
    //

    public String run(Mat image, Mat mask, int min_confidence, int component_level) {
        return run_2(nativeObj, image.nativeObj, mask.nativeObj, min_confidence, component_level);
    }

    public String run(Mat image, Mat mask, int min_confidence) {
        return run_3(nativeObj, image.nativeObj, mask.nativeObj, min_confidence);
    }


    //
    // C++: static Ptr_OCRHMMDecoder cv::text::OCRHMMDecoder::create(Ptr_OCRHMMDecoder_ClassifierCallback classifier, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table, int mode = OCR_DECODER_VITERBI)
    //

    /**
     * Creates an instance of the OCRHMMDecoder class. Initializes HMMDecoder.
     *
     *     @param classifier The character classifier with built in feature extractor.
     *
     *     @param vocabulary The language vocabulary (chars when ascii english text). vocabulary.size()
     *     must be equal to the number of classes of the classifier.
     *
     *     @param transition_probabilities_table Table with transition probabilities between character
     *     pairs. cols == rows == vocabulary.size().
     *
     *     @param emission_probabilities_table Table with observation emission probabilities. cols ==
     *     rows == vocabulary.size().
     *
     *     @param mode HMM Decoding algorithm. Only OCR_DECODER_VITERBI is available for the moment
     *     (&lt;http://en.wikipedia.org/wiki/Viterbi_algorithm&gt;).
     * @return automatically generated
     */
    public static OCRHMMDecoder create(OCRHMMDecoder_ClassifierCallback classifier, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table, int mode) {
        return OCRHMMDecoder.__fromPtr__(create_0(classifier.getNativeObjAddr(), vocabulary, transition_probabilities_table.nativeObj, emission_probabilities_table.nativeObj, mode));
    }

    /**
     * Creates an instance of the OCRHMMDecoder class. Initializes HMMDecoder.
     *
     *     @param classifier The character classifier with built in feature extractor.
     *
     *     @param vocabulary The language vocabulary (chars when ascii english text). vocabulary.size()
     *     must be equal to the number of classes of the classifier.
     *
     *     @param transition_probabilities_table Table with transition probabilities between character
     *     pairs. cols == rows == vocabulary.size().
     *
     *     @param emission_probabilities_table Table with observation emission probabilities. cols ==
     *     rows == vocabulary.size().
     *
     *     (&lt;http://en.wikipedia.org/wiki/Viterbi_algorithm&gt;).
     * @return automatically generated
     */
    public static OCRHMMDecoder create(OCRHMMDecoder_ClassifierCallback classifier, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table) {
        return OCRHMMDecoder.__fromPtr__(create_1(classifier.getNativeObjAddr(), vocabulary, transition_probabilities_table.nativeObj, emission_probabilities_table.nativeObj));
    }


    //
    // C++: static Ptr_OCRHMMDecoder cv::text::OCRHMMDecoder::create(String filename, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table, int mode = OCR_DECODER_VITERBI, int classifier = OCR_KNN_CLASSIFIER)
    //

    /**
     * Creates an instance of the OCRHMMDecoder class. Loads and initializes HMMDecoder from the specified path
     *
     *      
     * @param filename automatically generated
     * @param vocabulary automatically generated
     * @param transition_probabilities_table automatically generated
     * @param emission_probabilities_table automatically generated
     * @param mode automatically generated
     * @param classifier automatically generated
     * @return automatically generated
     */
    public static OCRHMMDecoder create(String filename, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table, int mode, int classifier) {
        return OCRHMMDecoder.__fromPtr__(create_2(filename, vocabulary, transition_probabilities_table.nativeObj, emission_probabilities_table.nativeObj, mode, classifier));
    }

    /**
     * Creates an instance of the OCRHMMDecoder class. Loads and initializes HMMDecoder from the specified path
     *
     *      
     * @param filename automatically generated
     * @param vocabulary automatically generated
     * @param transition_probabilities_table automatically generated
     * @param emission_probabilities_table automatically generated
     * @param mode automatically generated
     * @return automatically generated
     */
    public static OCRHMMDecoder create(String filename, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table, int mode) {
        return OCRHMMDecoder.__fromPtr__(create_3(filename, vocabulary, transition_probabilities_table.nativeObj, emission_probabilities_table.nativeObj, mode));
    }

    /**
     * Creates an instance of the OCRHMMDecoder class. Loads and initializes HMMDecoder from the specified path
     *
     *      
     * @param filename automatically generated
     * @param vocabulary automatically generated
     * @param transition_probabilities_table automatically generated
     * @param emission_probabilities_table automatically generated
     * @return automatically generated
     */
    public static OCRHMMDecoder create(String filename, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table) {
        return OCRHMMDecoder.__fromPtr__(create_4(filename, vocabulary, transition_probabilities_table.nativeObj, emission_probabilities_table.nativeObj));
    }


    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // C++:  String cv::text::OCRHMMDecoder::run(Mat image, int min_confidence, int component_level = 0)
    private static native String run_0(long nativeObj, long image_nativeObj, int min_confidence, int component_level);
    private static native String run_1(long nativeObj, long image_nativeObj, int min_confidence);

    // C++:  String cv::text::OCRHMMDecoder::run(Mat image, Mat mask, int min_confidence, int component_level = 0)
    private static native String run_2(long nativeObj, long image_nativeObj, long mask_nativeObj, int min_confidence, int component_level);
    private static native String run_3(long nativeObj, long image_nativeObj, long mask_nativeObj, int min_confidence);

    // C++: static Ptr_OCRHMMDecoder cv::text::OCRHMMDecoder::create(Ptr_OCRHMMDecoder_ClassifierCallback classifier, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table, int mode = OCR_DECODER_VITERBI)
    private static native long create_0(long classifier_nativeObj, String vocabulary, long transition_probabilities_table_nativeObj, long emission_probabilities_table_nativeObj, int mode);
    private static native long create_1(long classifier_nativeObj, String vocabulary, long transition_probabilities_table_nativeObj, long emission_probabilities_table_nativeObj);

    // C++: static Ptr_OCRHMMDecoder cv::text::OCRHMMDecoder::create(String filename, String vocabulary, Mat transition_probabilities_table, Mat emission_probabilities_table, int mode = OCR_DECODER_VITERBI, int classifier = OCR_KNN_CLASSIFIER)
    private static native long create_2(String filename, String vocabulary, long transition_probabilities_table_nativeObj, long emission_probabilities_table_nativeObj, int mode, int classifier);
    private static native long create_3(String filename, String vocabulary, long transition_probabilities_table_nativeObj, long emission_probabilities_table_nativeObj, int mode);
    private static native long create_4(String filename, String vocabulary, long transition_probabilities_table_nativeObj, long emission_probabilities_table_nativeObj);

    // native support for java finalize()
    private static native void delete(long nativeObj);

}
