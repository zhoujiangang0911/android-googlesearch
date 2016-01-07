package com.zhoujg77.googlesearch.view;

import android.content.Context;
import android.widget.ProgressBar;

import com.zhoujg77.googlesearch.utils.ViewUtils;

/**
 * Created by zhoujiangang on 16/1/7.
 */
public class MenuProgressBar extends ProgressBar {


    public MenuProgressBar(Context context) {
        super(context);
    }


    @Override
    protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(ViewUtils.dpToPx(48), ViewUtils.dpToPx(24));
    }
}
