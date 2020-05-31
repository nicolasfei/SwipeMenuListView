package com.nicolas.swipemenulistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class StringAdapter extends BaseAdapter {

    private Context context;
    private List<String> date;

    public StringAdapter(Context context, List<String> date) {
        this.context = context;
        this.date = date;
    }

    @Override
    public int getCount() {
        return date.size();
    }

    @Override
    public Object getItem(int position) {
        return this.date.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final ViewHolder viewHolder;
        if (convertView == null) {
            convertView = LayoutInflater.from(this.context).inflate(android.R.layout.simple_list_item_1, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        String item = this.date.get(position);
        viewHolder.textView.setText(item);
        return convertView;
    }

    private class ViewHolder {
        private TextView textView;

        public ViewHolder(View root) {
            this.textView = root.findViewById(android.R.id.text1);
        }
    }
}
