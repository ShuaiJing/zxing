package com.jian.zxingdemo;

public class ZXingSettingManager {

    private boolean needBeep =true;
    private boolean needLight = true;
    private boolean needAutoFocus = true;
    private boolean needShowResult = false;
    private boolean needDecode1DProduct =true;
    private boolean needDecode1DIndustrial =true;
    private boolean needDecodeDecodeQR = true;
    private boolean needDecodeMatrixFormats = true;
    private boolean needDecodeAztecFormats = true;
    private boolean needPdf417Formats=true;

    public boolean isNeedDecode1DIndustrial() {
        return needDecode1DIndustrial;
    }

    public void setNeedDecode1DIndustrial(boolean needDecode1DIndustrial) {
        this.needDecode1DIndustrial = needDecode1DIndustrial;
    }

    public boolean isNeedBeep() {
        return needBeep;
    }

    public void setNeedBeep(boolean needBeep) {
        this.needBeep = needBeep;
    }

    public boolean isNeedLight() {
        return needLight;
    }

    public void setNeedLight(boolean needLight) {
        this.needLight = needLight;
    }

    public boolean isNeedAutoFocus() {
        return needAutoFocus;
    }

    public void setNeedAutoFocus(boolean needAutoFocus) {
        this.needAutoFocus = needAutoFocus;
    }

    public boolean isNeedShowResult() {
        return needShowResult;
    }

    public void setNeedShowResult(boolean needShowResult) {
        this.needShowResult = needShowResult;
    }

    public boolean isNeedDecode1DProduct() {
        return needDecode1DProduct;
    }

    public void setNeedDecode1DProduct(boolean needDecode1DProduct) {
        this.needDecode1DProduct = needDecode1DProduct;
    }

    public boolean isNeedDecodeDecodeQR() {
        return needDecodeDecodeQR;
    }

    public void setNeedDecodeDecodeQR(boolean needDecodeDecodeQR) {
        this.needDecodeDecodeQR = needDecodeDecodeQR;
    }

    public boolean isNeedDecodeMatrixFormats() {
        return needDecodeMatrixFormats;
    }

    public void setNeedDecodeMatrixFormats(boolean needDecodeMatrixFormats) {
        this.needDecodeMatrixFormats = needDecodeMatrixFormats;
    }

    public boolean isNeedDecodeAztecFormats() {
        return needDecodeAztecFormats;
    }

    public void setNeedDecodeAztecFormats(boolean needDecodeAztecFormats) {
        this.needDecodeAztecFormats = needDecodeAztecFormats;
    }

    public boolean isNeedPdf417Formats() {
        return needPdf417Formats;
    }

    public void setNeedPdf417Formats(boolean needPdf417Formats) {
        this.needPdf417Formats = needPdf417Formats;
    }

    static volatile ZXingSettingManager instance;

    public static ZXingSettingManager getInstance() {
        if (instance==null){
            synchronized (ZXingSettingManager.class){
                instance = new ZXingSettingManager();
            }
        }
        return instance;
    }
    private ZXingSettingManager(){

    }

}
