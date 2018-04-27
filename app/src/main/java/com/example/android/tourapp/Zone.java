package com.example.android.tourapp;

public class Zone {

    /** Zone name */
    private int mName;

    /** Image resource ID for the zone */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param name is the word in a language that the user is already familiar with
     *                           (such as English)
     */
    public Zone(int name) {
        mName = name;
    }

    /**
     * Create a new Word object.
     *
     * @param name is the word in a language that the user is already familiar with
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     *
     */
    public Zone(int name, int imageResourceId ) {
        mName = name;
        mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public int getName() {
        return mName;
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
