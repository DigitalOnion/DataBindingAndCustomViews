package com.outspace.databindingandcustomviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class BigNumber extends View {
    int fontSize;
    float value;

    public BigNumber(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.BigNumber,
                0, 0);

        try {
            fontSize    = a.getInteger(R.styleable.BigNumber_fontSize, -1);
            value       = a.getFloat(R.styleable.BigNumber_value, 0.0f);
        } finally {
            a.recycle();
        }
    }

    

}
