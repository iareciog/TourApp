package com.example.android.tourapp;

public class Zone {

    /** Zone name */
    private int mName;

    /** Zone text */
    private int mText;

    /** Image resource ID for the zone */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param name is the name of the zone
     * @param text is the info text
     */
    public Zone(int name, int text) {
        mName = name;
        mText = text;
    }

    /**
     * Create a new Word object.
     *
     * @param name is the name of the zone
     * @param text is the info text
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     */
    public Zone(int name, int text, int imageResourceId ) {
        mName = name;
        mText = text;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the Zone Name;
     */
    public int getName() { return mName;  }

    /**
     * Get the text for the Zone.
     */
    public int getText() {
        return mText;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

}
