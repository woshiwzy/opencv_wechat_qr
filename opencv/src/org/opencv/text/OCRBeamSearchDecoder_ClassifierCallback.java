//
// This file is auto-generated. Please don't modify it!
//
package org.opencv.text;



// C++: class ClassifierCallback
/**
 * Callback with the character classifier is made a class.
 *
 *     This way it hides the feature extractor and the classifier itself, so developers can write
 *     their own OCR code.
 *
 *     The default character classifier and feature extractor can be loaded using the utility function
 *     loadOCRBeamSearchClassifierCNN with all its parameters provided in
 *     &lt;https://github.com/opencv/opencv_contrib/blob/master/modules/text/samples/OCRBeamSearch_CNN_model_data.xml.gz&gt;.
 */
public class OCRBeamSearchDecoder_ClassifierCallback {

    protected final long nativeObj;
    protected OCRBeamSearchDecoder_ClassifierCallback(long addr) { nativeObj = addr; }

    public long getNativeObjAddr() { return nativeObj; }

    // internal usage only
    public static OCRBeamSearchDecoder_ClassifierCallback __fromPtr__(long addr) { return new OCRBeamSearchDecoder_ClassifierCallback(addr); }

    @Override
    protected void finalize() throws Throwable {
        delete(nativeObj);
    }



    // native support for java finalize()
    private static native void delete(long nativeObj);

}
