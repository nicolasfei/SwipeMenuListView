package com.nicolas.library;

import android.widget.BaseAdapter;

public abstract class BaseSwipeListAdapter extends BaseAdapter {

    public boolean getSwipeEnableByPosition(int position) {
        return true;
    }
}
