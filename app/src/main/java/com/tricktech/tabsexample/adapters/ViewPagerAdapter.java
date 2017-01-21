package com.tricktech.tabsexample.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by am on 1/21/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public List<Fragment> mFragmentList = new ArrayList<>();
    public List<String> mTabsTitle = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public void addFragment(Fragment fragment,String title){
        mFragmentList.add(fragment);
        mTabsTitle.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return mTabsTitle.get(position);
        //return null;
    }
}
