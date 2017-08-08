package com.outspace.databindingandcustomviews;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.support.v7.widget.AppCompatTextView;
import android.widget.Toast;

public class BigNumber extends AppCompatTextView {
    float fontSize;
    float value;

    public BigNumber(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.BigNumber,
                0, 0);

        try {
            fontSize    = a.getDimensionPixelSize(R.styleable.BigNumber_fontSize, -1);
            value       = a.getFloat(R.styleable.BigNumber_value, 0.0f);
        }
        catch(Exception e) {
            Toast.makeText(this.getContext(), e.getMessage(), Toast.LENGTH_LONG).show();
        }
        finally {
            a.recycle();
        }

        if(fontSize > -1) this.fontSize = fontSize;
        this.setText(Float.toString(value));
    }
}
