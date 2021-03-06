package com.zhoujg77.library.internal;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.AttrRes;
import android.support.annotation.ColorInt;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * Created by zhoujiangang on 16/1/5.
 */
public class ViewUtils {


    private static final int [] TEMP_ARRAY = new int [1];


    public static void showSoftKeyboardDelayed(final EditText editText,long delay){

        editText.postDelayed(new Runnable() {
            @Override
            public void run() {
                InputMethodManager inputMethodManager = (InputMethodManager) editText.getContext().getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.showSoftInput(editText,InputMethodManager.SHOW_IMPLICIT);
            }
        },delay);
    }


    public static void closeSoftKeyboard(Activity activity){
        View currentFocusView = activity.getCurrentFocus();
        if(currentFocusView != null){
            InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(currentFocusView.getWindowToken(),0);
        }

    }


    public static int dpToPx(int dp){
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        return (int)(dp*metrics.density);
    }

    public static int pxToDp(int px){
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        return (int) (px /metrics.density);
    }


    public static int getThemAttrColor(Context context, @AttrRes int attr){

        TEMP_ARRAY[0] = attr;
        TypedArray a = context.obtainStyledAttributes(null,TEMP_ARRAY);
        try {
            return a.getColor(0,0);
        }finally {
            a.recycle();
        }


    }


    public static Drawable getTinted(Drawable icon, @ColorInt int color){
        if(icon==null){
            return null;
        }
        icon = DrawableCompat.wrap(icon);
        DrawableCompat.setTint(icon,color);
        return icon;

    }






}
