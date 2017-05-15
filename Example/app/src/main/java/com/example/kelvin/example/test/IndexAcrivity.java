package com.example.kelvin.example.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.kelvin.example.R;
import com.example.kelvin.example.widget.CustomDrawableRadioButton;

/**
 * Created by kelvin on 2017/5/5.
 */

public class IndexAcrivity extends AppCompatActivity implements View.OnClickListener{

    private TextView newsTv,meTv;
    private CustomDrawableRadioButton homeTv;
    private ImageView noteTv;
    private Fragment tempFragment,indexFragment,newsFragment,meFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        initView();
        initFragment();
    }

    /**
     * 初始化控件
     */
    private void initView(){
        homeTv = (CustomDrawableRadioButton) findViewById(R.id.home);
        newsTv = (TextView) findViewById(R.id.news);
        meTv = (TextView) findViewById(R.id.me);
        noteTv = (ImageView) findViewById(R.id.note);

        homeTv.setOnClickListener(this);
        newsTv.setOnClickListener(this);
        meTv.setOnClickListener(this);
    }

    private void initFragment(){
        tempFragment = new Fragment();
        indexFragment = new IndexFragment();
        newsFragment = new NewsFragment();
        meFragment = new MeFragment();
        switchFragment(indexFragment);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.home: //首页
                switchFragment(indexFragment);
                break;
            case R.id.news: //消息
                switchFragment(newsFragment);
                break;
            case R.id.me: //我的
                switchFragment(meFragment);
                break;
        }
    }

    /**
     * 切换Fragment
     */
    private void switchFragment(Fragment toFragment){

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        if (toFragment != tempFragment){
            if (!toFragment.isAdded()) {
                transaction.hide(tempFragment).add(R.id.frame_layout, toFragment).commit();
            } else {
                transaction.hide(tempFragment).show(toFragment).commit();
            }
            tempFragment = toFragment;
        }
    }


}
