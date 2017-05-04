package com.example.kelvin.example.base;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by kelvin on 2017/5/3.
 */

public class BaseFragmentPagerAdapter extends FragmentPagerAdapter {

    protected List<Fragment> mFragments;
    protected List<String> mFragmentTitles;

    public BaseFragmentPagerAdapter(FragmentManager fm
            ,List<Fragment> mFragments,List<String> mFragmentTitles) {
        super(fm);
        this.mFragments = mFragments;
        this.mFragmentTitles = mFragmentTitles;
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String titleName = mFragmentTitles.get(position);
        return titleName;
    }

    @Override
    public boolean isViewFromObject(View view, Object object)
    {
        return view == object;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }
}
