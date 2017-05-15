package com.example.kelvin.example.movies;


import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.kelvin.example.R;
import com.example.kelvin.example.widget.SuperSwipeRefreshLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment{

    private SuperSwipeRefreshLayout refreshLayout; //刷新控件
    private RecyclerView recyclerView; //控件



    private View view; //第一次进入的时候加载视图

    public MovieFragment() {}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (view == null) {
            view = inflater.inflate(R.layout.fragment_movie, container, false);
        }
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    /**
     * 初始化视图
     * @param view 根布局
     */
    private void initView(View view){
        refreshLayout = (SuperSwipeRefreshLayout) view.findViewById(R.id.refresh_layout);
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

        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        Movie movie = new Movie(R.layout.moview_item_recycle_view,setData());
        recyclerView.setAdapter(movie);

    }

    private List<String> setData(){
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            list.add("热门电影"+i);
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

}
