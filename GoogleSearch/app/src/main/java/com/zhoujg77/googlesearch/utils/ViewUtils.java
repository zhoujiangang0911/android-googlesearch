package com.zhoujg77.googlesearch.utils;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.annotation.AttrRes;
import android.util.DisplayMetrics;

/**
 * Created by zhoujiangang on 16/1/7.
 */
public class ViewUtils {



    public static  int dpToPx(int dp){
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        return (int) (dp*metrics.density);

    }

    public static int getThemeAttrColor(Context context, @AttrRes int attr){
        final int[] TEMP_ARRAY = new int[1];
        TEMP_ARRAY[0] = attr;
        TypedArray a = context.obtainStyledAttributes(null,TEMP_ARRAY);
        try {
            return a.getColor(0,0);
        }finally {
            a.recycle();
        }

    }


}
