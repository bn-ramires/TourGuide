package com.example.fujiwara.tourguide;

public class Content {

    private int mTextContentId;
    private int mImageResourceId;
    private int mAttractionTitleId;

    public Content(int textContentId, int attractionTitleId, int imageResourceId) {
        mTextContentId = textContentId;
        mImageResourceId = imageResourceId;
        mAttractionTitleId = attractionTitleId;
    }

    public int geTextContentId() {
        return mTextContentId;
    }

    public int getAttractionTitleId() {
        return mAttractionTitleId;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}