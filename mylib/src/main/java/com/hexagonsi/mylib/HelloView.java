package com.hexagonsi.mylib;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;

/**
 * Created by jmalek on 16.11.2017.
 */

public class HelloView extends AppCompatTextView {
    public HelloView(Context context) {
        super(context);
        setText("Hello");
    }
}
