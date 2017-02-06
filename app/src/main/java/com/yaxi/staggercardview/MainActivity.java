package com.yaxi.staggercardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private RecyclerView mRecyclerView;
    private List<String> mDatas = null;
    private SimpleRecycleCardAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recycler);


        initDataAndView();
    }



    private void initDataAndView() {
        mDatas = new ArrayList<>();
        for (int i = 'A'; i < 'Z'; i++) {
            mDatas.add(String.valueOf((char) i));
        }

        mRecyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));
        adapter = new SimpleRecycleCardAdapter(this,mDatas);
        mRecyclerView.setAdapter(adapter);

        adapter.setOnItemActionListener(new SimpleRecycleCardAdapter.OnItemActionListener() {
            @Override
            public void onItemClickListener(View view, int position) {
                Log.i(TAG, "onItemClickListener: " + position);
            }

            @Override
            public boolean onItemLongClickListener(View view, int position) {
                Log.i(TAG, "onItemLongClickListener: "+position);
                return true;
            }
        });
    }
}
