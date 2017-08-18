package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;

    int mStoryIndex;

    private StoryNode[] mStoryBank = new StoryNode[] {
            new StoryNode(R.string.T1_Story,
                    R.string.T1_Ans1,
                    R.string.T1_Ans2,
                    2,
                    1),
            new StoryNode(R.string.T2_Story,
                    R.string.T2_Ans1,
                    R.string.T2_Ans2,
                    2,
                    3),
            new StoryNode(R.string.T3_Story,
                    R.string.T3_Ans1,
                    R.string.T3_Ans2,
                    5,
                    4),
            new StoryNode(R.string.T4_End,
                    -1,
                    -1,
                    -1,
                    -1),
            new StoryNode(R.string.T5_End,
                    -1,
                    -1,
                    -1,
                    -1),
            new StoryNode(R.string.T6_End,
                    -1,
                    -1,
                    -1,
                    -1)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);

        updateStory();

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStoryIndex = mStoryBank[mStoryIndex].getButtonTopLink();
                updateStory();
            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mStoryIndex = mStoryBank[mStoryIndex].getButtomBottomLink();
                updateStory();
            }
        });
    }

    private void updateStory() {
        mStoryTextView.setText(mStoryBank[mStoryIndex].getStoryTextID());

        if(mStoryBank[mStoryIndex].getButtonTopLink() == -1) {
            // End of story - no text to show
            mButtonTop.setVisibility(View.GONE);
            mButtonBottom.setVisibility(View.GONE);
        } else {
            mButtonTop.setText(mStoryBank[mStoryIndex].getButtonTopTextID());
            mButtonBottom.setText(mStoryBank[mStoryIndex].getButtonBottomTextID());
        }
    }
}

