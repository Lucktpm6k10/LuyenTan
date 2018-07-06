package com.example.vanluc.webview_listview_recyleview_gridview;

import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;

import java.util.ArrayList;


public class RecyclerView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        initView();
    }
    public void initView()
    {
        android.support.v7.widget.RecyclerView ryclerview = findViewById(R.id.rvTest);
        ryclerview.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,
                                                                    false);
        ryclerview.setLayoutManager(layoutManager);
        //DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,LinearLayoutManager.VERTICAL);
        //ryclerview.addItemDecoration(dividerItemDecoration);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(ryclerview.getContext(),
                                                                                DividerItemDecoration.VERTICAL
                                                                                );
        Drawable drawable = ContextCompat.getDrawable(getApplicationContext(),R.drawable.custom_divider);
        dividerItemDecoration.setDrawable(drawable);
        ryclerview.addItemDecoration(dividerItemDecoration);
        ryclerview.setItemAnimator(new DefaultItemAnimator());
        ArrayList<RyclerView> arrRycler = new ArrayList<>();
        arrRycler.add(new RyclerView(R.mipmap.ic_launcher,"Luc"));
        arrRycler.add(new RyclerView(R.mipmap.ic_launcher,"Luc1"));
        arrRycler.add(new RyclerView(R.mipmap.ic_launcher,"Luc2"));
        arrRycler.add(new RyclerView(R.mipmap.ic_launcher,"Luc3"));
        arrRycler.add(new RyclerView(R.mipmap.ic_launcher,"Luc4"));
        RyclerAdapter adapter = new RyclerAdapter(arrRycler,getApplicationContext());
        ryclerview.setAdapter(adapter);


    }
}
