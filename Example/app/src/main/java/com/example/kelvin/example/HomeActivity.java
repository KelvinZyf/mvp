package com.example.kelvin.example;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.kelvin.example.base.BaseActivity;
import com.example.kelvin.example.base.BaseFragmentPagerAdapter;
import com.example.kelvin.example.books.BookFragment;
import com.example.kelvin.example.movies.MovieFragment;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends BaseActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    protected void initVariables() {

    }

    @Override
    protected void initViews(Bundle savedInstanceState) {
        setContentView(R.layout.activity_home);

        initView();
    }

    /**
     * 初始化控件
     */
    private void initView() {

        toolbar = (Toolbar)findViewById(R.id.tool_bar);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.view_pager);
        floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);

        toolbar.setTitle("电影");
        setSupportActionBar(toolbar);
        //设置显示返回箭头
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v,getString(R.string.app_name),Snackbar.LENGTH_SHORT).show();
            }
        });

        setData();
    }


    /**
     * 初始化数据
     */
    private void setData(){
        List<Fragment> fragmentList = new ArrayList<>();
        fragmentList.add(new MovieFragment());
        fragmentList.add(new BookFragment());
        final List<String> titleList = new ArrayList<>();
        titleList.add(getString(R.string.movie_title));
        titleList.add(getString(R.string.book_title));
        IDouBanAdapter adapter = new IDouBanAdapter(getSupportFragmentManager(),fragmentList,titleList);
        viewPager.setAdapter(adapter);

        if (tabLayout != null){

            tabLayout.setupWithViewPager(viewPager,true);
            tabLayout.setTabsFromPagerAdapter(adapter);
        }

//        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
//            @Override
//            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//
//            }
//
//            @Override
//            public void onPageSelected(int position) {
//                toolbar.setTitle(titleList.get(position));
//            }
//
//            @Override
//            public void onPageScrollStateChanged(int state) {
//
//            }
//        });

    }

    /**
     * PagerAdapter
     */
    class IDouBanAdapter extends BaseFragmentPagerAdapter{

        public IDouBanAdapter(FragmentManager fm
                , List<Fragment> mFragments, List<String> mFragmentTitles) {
            super(fm, mFragments, mFragmentTitles);
        }
    }
}
