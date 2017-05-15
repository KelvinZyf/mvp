package com.example.kelvin.example;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.kelvin.example.books.BookFragment;
import com.example.kelvin.example.movies.MovieFragment;
import com.example.kelvin.example.widget.SuperSwipeRefreshLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    private SuperSwipeRefreshLayout refreshLayout; //刷新控件
    private RecyclerView recyclerView; //控件

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_movie);

//        initViews();

        initView();
    }

    /**
     * 初始化视图
     * @param
     */
    private void initView(){
        refreshLayout = (SuperSwipeRefreshLayout)findViewById(R.id.refresh_layout);
        refreshLayout.setHeaderViewBackgroundColor(0xff888888);
        refreshLayout.setTargetScrollWithLayout(true);
        refreshLayout.setOnPullRefreshListener(
                new SuperSwipeRefreshLayout.OnPullRefreshListenerAdapter(){
                    @Override
                    public void onRefresh() {
                        super.onRefresh();

                        Log.e("log","刷新刷新");
                    }
                });

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Movie movie = new Movie(R.layout.moview_item_recycle_view,getData());
        recyclerView.setAdapter(movie);

    }

    private List<String> getData(){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add("热门电影"+i);
        }
        for (int i = 0; i < list.size(); i++) {
            Log.e("log",list.get(i));
        }
        return list;
    }

    class Movie extends BaseQuickAdapter<String,BaseViewHolder> {

        public Movie(@LayoutRes int layoutResId, @Nullable List<String> data) {
            super(layoutResId, data);
        }

        @Override
        protected void convert(BaseViewHolder helper, String item) {
            helper.setText(R.id.name,item);
        }
    }


    /**
     * 初始化控件
     */
    private void initViews() {

        toolbar = (Toolbar)findViewById(R.id.tool_bar);
        tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        viewPager = (ViewPager) findViewById(R.id.view_pager);

        toolbar.setTitle("电影");
        setSupportActionBar(toolbar);
        //设置显示返回箭头
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setData();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                Toast.makeText(MainActivity.this,"点击了返回按钮",Toast.LENGTH_SHORT).show();
                break;
        }
        return true;

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

        DouBanAdapter adapter = new DouBanAdapter(getSupportFragmentManager()
                ,fragmentList,titleList);
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                toolbar.setTitle(titleList.get(position));
            }

            @Override
            public void onPageScrollStateChanged(int state) {


            }
        });

        if (tabLayout != null){
            tabLayout.addTab(tabLayout.newTab());
            tabLayout.addTab(tabLayout.newTab());
            tabLayout.setupWithViewPager(viewPager);
        }



    }

    /**
     * pagerAdapter
     */
    class DouBanAdapter extends FragmentPagerAdapter {

        private List<Fragment> fragmentList;
        private List<String> titleList;


        public DouBanAdapter(FragmentManager fm
                ,List<Fragment> fragmentList,List<String> titleList) {
            super(fm);
            this.fragmentList = fragmentList;
            this.titleList = titleList;
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            String titleName = titleList.get(position);
            return titleName;
        }



    }
}

