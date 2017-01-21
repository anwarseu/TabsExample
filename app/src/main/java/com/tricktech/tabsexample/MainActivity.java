package com.tricktech.tabsexample;

import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.tricktech.tabsexample.adapters.ViewPagerAdapter;
import com.tricktech.tabsexample.fragments.OneFragment;
import com.tricktech.tabsexample.fragments.ThreeFragment;
import com.tricktech.tabsexample.fragments.TwoFragment;

public class MainActivity extends AppCompatActivity {

    public Toolbar mToolbar;
    public TabLayout mTabLayout;
    public ViewPager mViewPager;
    public ViewPagerAdapter adapter;
    public int[] tabIcons = {R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mViewPager = (ViewPager) findViewById(R.id.viewPager);
        setUpViewPager(mViewPager);

        mTabLayout = (TabLayout) findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mViewPager);

        //setUpIcon(mTabLayout);
        //mTabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(this, R.color.colorLightBlue));
        //mTabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(this, R.color.colorLightBlue));


    }
     public void setUpIcon(TabLayout tabLayout){
         tabLayout.getTabAt(0).setIcon(tabIcons[0]);
         tabLayout.getTabAt(1).setIcon(tabIcons[1]);
         tabLayout.getTabAt(2).setIcon(tabIcons[2]);

     }

    public void setUpViewPager(ViewPager viewPager){
        adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new OneFragment(), "ONE");
        adapter.addFragment(new TwoFragment(), "TWO");
        adapter.addFragment(new ThreeFragment(), "THREE");
        adapter.addFragment(new ThreeFragment(), "THREE");
        adapter.addFragment(new ThreeFragment(), "THREE");
        adapter.addFragment(new ThreeFragment(), "THREE");
        adapter.addFragment(new ThreeFragment(), "THREE");
        adapter.addFragment(new ThreeFragment(), "THREE");

        viewPager.setAdapter(adapter);
    }


}
