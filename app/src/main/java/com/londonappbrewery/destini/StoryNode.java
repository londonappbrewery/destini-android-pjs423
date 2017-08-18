package com.londonappbrewery.destini;

/**
 * Created by root on 18/08/17.
 */

public class StoryNode {
    private int mStoryTextID;
    private int mButtonTopTextID;
    private int mButtonBottomTextID;

    private int mButtonTopLink;
    private int mButtomBottomLink;

    public StoryNode(int StoryTextID,
                     int ButtonTopTextID,
                     int ButtonBottomTextID,
                     int ButtonTopLink,
                     int ButtonBottomLink) {
        mStoryTextID = StoryTextID;
        mButtonTopTextID = ButtonTopTextID;
        mButtonBottomTextID = ButtonBottomTextID;
        mButtonTopLink = ButtonTopLink;
        mButtomBottomLink = ButtonBottomLink;
    }

    public int getStoryTextID() {
        return mStoryTextID;
    }

    public int getButtonTopTextID() {
        return mButtonTopTextID;
    }

    public int getButtonBottomTextID() {
        return mButtonBottomTextID;
    }

    public int getButtonTopLink() {
        return mButtonTopLink;
    }

    public int getButtomBottomLink() {
        return mButtomBottomLink;
    }
}
