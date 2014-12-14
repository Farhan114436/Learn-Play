package com.example.learn_and_play;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter4  extends FragmentPagerAdapter{
 
    final int PAGE_COUNT = 2;
 
    /** Constructor of the class */
    public MyFragmentPagerAdapter4(FragmentManager fm) {
        super(fm);
    }
 
    /** This method will be invoked when a page is requested to create */
    @Override
    public Fragment getItem(int arg0) {
    	
    	Fragment myFragment=null;
    	    	
    	if(arg0==0){
    		 myFragment = new Bangla_ban1();
     
        }
    	else if(arg0==1){
    		 myFragment = new Bangla_ban2();
    	}
    	 return myFragment;
       
    }
 
    /** Returns the number of pages */
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }


}
