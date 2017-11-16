package com.hexagonsi.mylib;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by jmalek on 16.11.2017.
 */

public class HelloView extends AppCompatTextView {
    public HelloView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setText("Hello");
    }
}
