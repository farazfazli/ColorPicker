package com.farazfazli.colorchanger;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mColorOne;
    private TextView mColorTwo;
    private CheckBox mFirstCheckBox;
    private CheckBox mSecondCheckBox;
    private CheckBox mCustomCheckBox;
    private Spinner mInputColor;
    private Button mSetForeground;
    private Button mSetBackground;
    private SeekBar mRedSeek;
    private SeekBar mGreenSeek;
    private SeekBar mBlueSeek;
    private int mRed;
    private int mGreen;
    private int mBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mColorOne = (TextView) findViewById(R.id.firstColor);
        mColorTwo = (TextView) findViewById(R.id.secondColor);
        mFirstCheckBox = (CheckBox) findViewById(R.id.changeFirst);
        mSecondCheckBox = (CheckBox) findViewById(R.id.changeSecond);
        mCustomCheckBox = (CheckBox) findViewById(R.id.custom);
        mInputColor = (Spinner) findViewById(R.id.inputColor);
        mSetForeground = (Button) findViewById(R.id.setForeground);
        mSetBackground = (Button) findViewById(R.id.setBackground);
        mRedSeek = (SeekBar) findViewById(R.id.red);
        mGreenSeek = (SeekBar) findViewById(R.id.green);
        mBlueSeek = (SeekBar) findViewById(R.id.blue);
        mSetForeground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mFirstCheckBox.isChecked()) {
                    if (mCustomCheckBox.isChecked()) {
                        mRed = mRedSeek.getProgress();
                        mGreen = mGreenSeek.getProgress();
                        mBlue = mBlueSeek.getProgress();
                        mColorOne.setTextColor(Color.rgb(mRed, mGreen, mBlue));

                    } else {
                        setIt(0);
                    }
                }
                if (mSecondCheckBox.isChecked()) {
                    if (mCustomCheckBox.isChecked()) {
                        mRed = mRedSeek.getProgress();
                        mGreen = mGreenSeek.getProgress();
                        mBlue = mBlueSeek.getProgress();
                        mColorTwo.setTextColor(Color.rgb(mRed, mGreen, mBlue));
                    } else {
                        setIt(1);
                    }
                }
            }
        });
        mSetBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mFirstCheckBox.isChecked()) {
                    if (mCustomCheckBox.isChecked()) {
                        mRed = mRedSeek.getProgress();
                        mGreen = mGreenSeek.getProgress();
                        mBlue = mBlueSeek.getProgress();
                        mColorOne.setBackgroundColor(Color.rgb(mRed, mGreen, mBlue));
                    } else {
                        setItBackground(0);
                    }
                }
                if (mSecondCheckBox.isChecked()) {
                    if (mCustomCheckBox.isChecked()) {
                        mRed = mRedSeek.getProgress();
                        mGreen = mGreenSeek.getProgress();
                        mBlue = mBlueSeek.getProgress();
                        mColorTwo.setBackgroundColor(Color.rgb(mRed, mGreen, mBlue));
                    } else {
                        setItBackground(1);
                    }
                }
            }
        });
    }

    private void setItBackground(int textField) {
        if (textField == 0) {
            switch (mInputColor.getSelectedItemPosition()) {
                case 0:
                    mColorOne.setBackgroundColor(Color.RED);
                    break;
                case 1:
                    mColorOne.setBackgroundColor(Color.GREEN);
                    break;
                case 2:
                    mColorOne.setBackgroundColor(Color.BLUE);
                    break;
            }
        } else if (textField == 1) {
            switch (mInputColor.getSelectedItemPosition()) {
                case 0:
                    mColorTwo.setBackgroundColor(Color.RED);
                    break;
                case 1:
                    mColorTwo.setBackgroundColor(Color.GREEN);
                    break;
                case 2:
                    mColorTwo.setBackgroundColor(Color.BLUE);
                    break;
            }
        }
    }

    private void setIt(int textField) {
        if (textField == 0) {
            switch (mInputColor.getSelectedItemPosition()) {
                case 0:
                    mColorOne.setTextColor(Color.RED);
                    break;
                case 1:
                    mColorOne.setTextColor(Color.GREEN);
                    break;
                case 2:
                    mColorOne.setTextColor(Color.BLUE);
                    break;
            }
        } else if (textField == 1) {
            switch (mInputColor.getSelectedItemPosition()) {
                case 0:
                    mColorTwo.setTextColor(Color.RED);
                    break;
                case 1:
                    mColorTwo.setTextColor(Color.GREEN);
                    break;
                case 2:
                    mColorTwo.setTextColor(Color.BLUE);
                    break;
            }
        }
    }
}
