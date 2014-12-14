package com.example.learn_and_play;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyFragmentPagerAdapter3 extends FragmentPagerAdapter{
 
    final int PAGE_COUNT = 2;
 
    /** Constructor of the class */
    public MyFragmentPagerAdapter3(FragmentManager fm) {
        super(fm);
    }
 
    /** This method will be invoked when a page is requested to create */
    @Override
    public Fragment getItem(int arg0) {
    	
    	Fragment myFragment=null;
    	    	
    	if(arg0==0){
    		 myFragment = new English_numbers();
     
        }
    	else if(arg0==1){
    		 myFragment = new English_numbers2();
    	}
    	 return myFragment;
       
    }
 
    /** Returns the number of pages */
    @Override
    public int getCount() {
        return PAGE_COUNT;
    }


}
