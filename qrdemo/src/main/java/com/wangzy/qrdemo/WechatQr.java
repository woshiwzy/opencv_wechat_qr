package com.wangzy.qrdemo;

import org.opencv.wechat_qrcode.WeChatQRCode;

/**
 * Created by wangzy on 3/13/21
 * description:
 */
class WechatQr {

    public static WeChatQRCode init(){
        String rootPath = "/sdcard/";
        WeChatQRCode weChatQRCode = new WeChatQRCode(rootPath + "detect_prototxt",
            rootPath + "detect_caffemodel",
            rootPath + "sr_prototxt",
            rootPath + "sr_caffemodel");
        return weChatQRCode;
    }
}
