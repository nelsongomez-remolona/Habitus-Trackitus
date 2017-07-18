package com.nelgomez.www.habitustrackitus.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import com.nelgomez.www.habitustrackitus.FontCache;

/**
 * Created by Nelson Gomez on 7/12/2017.
 */

public class LRegTextView extends android.support.v7.widget.AppCompatTextView {

    public LRegTextView(Context context){
        super(context);
        applyCustomFont(context);
    }
    public LRegTextView(Context context, AttributeSet attrs){
        super(context, attrs);
        applyCustomFont(context);
    }
    public LRegTextView(Context context, AttributeSet attrs, int defStyle){
    super(context, attrs, defStyle);
    applyCustomFont(context);
    }
    private void applyCustomFont(Context context) {
        Typeface customFont = FontCache.getTypeface("LatoRegular.ttf", context);
        setTypeface(customFont);
    }
}
