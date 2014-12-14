package com.example.learn_and_play;

import com.example.learn_and_play.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;


public class Fragment_english extends FragmentActivity{
	private static final String TAG_LETTER = "letter";
	String pid;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pager);
        Intent i = getIntent();
		// getting product id (pid) from intent
		pid = i.getStringExtra(TAG_LETTER);
        /** Getting a reference to the ViewPager defined the layout file */
        ViewPager pager = (ViewPager) findViewById(R.id.pager);
 
        /** Getting fragment manager */
        FragmentManager fm = getSupportFragmentManager();
        if(pid.equals("up")){
        /** Instantiating FragmentPagerAdapter */
        MyFragmentPagerAdapter pagerAdapter = new MyFragmentPagerAdapter(fm);
        pager.setAdapter(pagerAdapter);
        }
        else if(pid.equals("low")){
            /** Instantiating FragmentPagerAdapter */
            MyFragmentPagerAdapter2 pagerAdapter = new MyFragmentPagerAdapter2(fm);
            pager.setAdapter(pagerAdapter);
         }
        else if(pid.equals("num")){
            /** Instantiating FragmentPagerAdapter */
            MyFragmentPagerAdapter3 pagerAdapter = new MyFragmentPagerAdapter3(fm);
            pager.setAdapter(pagerAdapter);
         }
        else if(pid.equals("ban")){
            /** Instantiating FragmentPagerAdapter */
            MyFragmentPagerAdapter4 pagerAdapter = new MyFragmentPagerAdapter4(fm);
            pager.setAdapter(pagerAdapter);
         }
        
 
    }
}
