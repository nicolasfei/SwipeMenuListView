package com.nicolas.swipemenulistview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;

import com.nicolas.library.SwipeMenu;
import com.nicolas.library.SwipeMenuCreator;
import com.nicolas.library.SwipeMenuItem;
import com.nicolas.library.SwipeMenuListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SwipeMenuListView listView = findViewById(R.id.swipeMenuListView);
        List<String> date = new ArrayList<>();
        date.add("test1");
        date.add("test11");
        date.add("test111");
        date.add("test1111");
        StringAdapter adapter = new StringAdapter(this, date);
        listView.setAdapter(adapter);
        SwipeMenuCreator creator = new SwipeMenuCreator() {

            @Override
            public void create(SwipeMenu menu) {
                // create "look" item
                SwipeMenuItem detailsItem = new SwipeMenuItem(
                        getApplicationContext());
                // set item background
                detailsItem.setBackground(new ColorDrawable(Color.rgb(0xC9, 0xC9,
                        0xCE)));
                // set item width
                detailsItem.setWidth(Tool.dp2px(MainActivity.this, 90));
                // set item title
                detailsItem.setTitle(getString(R.string.details));
                // set item title fontsize
                detailsItem.setTitleSize(18);
                // set item title font color
                detailsItem.setTitleColor(Color.WHITE);
                // add to menu
//                menu.addMenuItem(detailsItem);

                // create "delete" item
                SwipeMenuItem deleteItem = new SwipeMenuItem(
                        getApplicationContext());
                // set item background
                deleteItem.setBackground(new ColorDrawable(Color.rgb(0xC9, 0xC9,
                        0xCE)));
                // set item width
                deleteItem.setWidth(Tool.dp2px(MainActivity.this, 90));
                // set item title
                deleteItem.setTitle(getString(R.string.delete));
                // set item title fontsize
                deleteItem.setTitleSize(18);
                // set item title font color
                deleteItem.setTitleColor(Color.WHITE);
                // add to menu
                menu.addMenuItem(deleteItem);
            }
        };
        //添加左滑菜单
        listView.setMenuCreator(creator);
        listView.setOnMenuItemClickListener(new SwipeMenuListView.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(int position, SwipeMenu menu, int index) {
                Log.d(TAG, "onMenuItemClick: position is " + position);
                switch (index) {
                    case 0:
                        Log.d(TAG, "onMenuItemClick: click showGoodsDetails");
//                        showGoodsDetails(position);
//                        deleteGoods(position);
                        break;
                    case 1:
                        Log.d(TAG, "onMenuItemClick: click deleteGoods!");
//                        deleteGoods(position);
                        break;
                }
                return true;
            }
        });
    }
}
