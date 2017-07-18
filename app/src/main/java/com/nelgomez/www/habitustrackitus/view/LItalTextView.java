package com.nelgomez.www.habitustrackitus.view;

import android.content.Context;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;

import com.nelgomez.www.habitustrackitus.FontCache;

/**
 * Created by Nelson Gomez on 7/12/2017.
 */

public class LItalTextView extends android.support.v7.widget.AppCompatTextView {
    public LItalTextView(Context context) {
        super(context);
    }

    public LItalTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LItalTextView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("LatoItalic.ttf", context);
        setTypeface(customFont);
    }


}
