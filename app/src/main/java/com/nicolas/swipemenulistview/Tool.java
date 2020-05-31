package com.nicolas.swipemenulistview;

import android.content.Context;
import android.util.TypedValue;

public class Tool {
    public static int dp2px(Context context, int dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp,
                context.getResources().getDisplayMetrics());
    }
}
