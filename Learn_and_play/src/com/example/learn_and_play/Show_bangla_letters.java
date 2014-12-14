package com.example.learn_and_play;

import com.example.learn_and_play.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Show_bangla_letters extends Activity{
	ImageView im1;
	String pid;
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.imageview);
		
		im1=(ImageView)findViewById(R.id.imvs);
		
		
		Intent i = getIntent();
		
		// getting product id (pid) from intent
		pid = i.getStringExtra("Bletter");

		if(pid.equals("bs1")){
			im1.setImageResource(R.drawable.bs1);
			showCustomAlert();
		}
		else if(pid.equals("bs2")){
			im1.setImageResource(R.drawable.bs2);
			showCustomAlert();
		}
		else if(pid.equals("bs3")){
			im1.setImageResource(R.drawable.bs3);
			showCustomAlert();
		}
		else if(pid.equals("bs4")){
			im1.setImageResource(R.drawable.bs4);
			showCustomAlert();
		}
		else if(pid.equals("bs5")){
			im1.setImageResource(R.drawable.bs5);
			showCustomAlert();
		}
		else if(pid.equals("bs6")){
			im1.setImageResource(R.drawable.bs6);
			showCustomAlert();
		}
		else if(pid.equals("bs7")){
			im1.setImageResource(R.drawable.bs7);
			showCustomAlert();
		}
		else if(pid.equals("bs8")){
			im1.setImageResource(R.drawable.bs8);
			showCustomAlert();
		}
		else if(pid.equals("bs9")){
			im1.setImageResource(R.drawable.bs9);
			showCustomAlert();
		}
		else if(pid.equals("bs10")){
			im1.setImageResource(R.drawable.bs10);
			showCustomAlert();
		}
		else if(pid.equals("bs11")){
			im1.setImageResource(R.drawable.bs11);
			showCustomAlert();
		}
		else if(pid.equals("1")){
			im1.setImageResource(R.drawable.bb1);
			showCustomAlert();
		}
		else if(pid.equals("2")){
			im1.setImageResource(R.drawable.bb2);
			showCustomAlert();
		}
		else if(pid.equals("3")){
			im1.setImageResource(R.drawable.bb3);
			showCustomAlert();
		}
		else if(pid.equals("4")){
			im1.setImageResource(R.drawable.bb4);
			showCustomAlert();
		}
		else if(pid.equals("5")){
			im1.setImageResource(R.drawable.bb5);
			showCustomAlert();
		}
		else if(pid.equals("6")){
			im1.setImageResource(R.drawable.bb6);
			showCustomAlert();
		}
		else if(pid.equals("7")){
			im1.setImageResource(R.drawable.bb7);
			showCustomAlert();
		}
		else if(pid.equals("8")){
			im1.setImageResource(R.drawable.bb8);
			showCustomAlert();
		}
		else if(pid.equals("9")){
			im1.setImageResource(R.drawable.bb9);
		}
		else if(pid.equals("10")){
			im1.setImageResource(R.drawable.bb10);
		}
		else if(pid.equals("11")){
			im1.setImageResource(R.drawable.bb11);
		}
		else if(pid.equals("12")){
			im1.setImageResource(R.drawable.bb12);
		}
		else if(pid.equals("13")){
			im1.setImageResource(R.drawable.bb13);
		}
		else if(pid.equals("14")){
			im1.setImageResource(R.drawable.bb14);
		}
		else if(pid.equals("15")){
			im1.setImageResource(R.drawable.bb15);
		}
		else if(pid.equals("16")){
			im1.setImageResource(R.drawable.bb16);
		}
		else if(pid.equals("17")){
			im1.setImageResource(R.drawable.bb17);
		}
		else if(pid.equals("18")){
			im1.setImageResource(R.drawable.bb18);
			showCustomAlert();
		}
		else if(pid.equals("19")){
			im1.setImageResource(R.drawable.bb19);
		}
		else if(pid.equals("20")){
			im1.setImageResource(R.drawable.bb20);
			showCustomAlert();
		}
		else if(pid.equals("21")){
			im1.setImageResource(R.drawable.bb21);
			showCustomAlert();
		}
		else if(pid.equals("22")){
			im1.setImageResource(R.drawable.bb22);
			showCustomAlert();
		}
		else if(pid.equals("23")){
			im1.setImageResource(R.drawable.bb23);
			showCustomAlert();
		}
		else if(pid.equals("24")){
			im1.setImageResource(R.drawable.bb24);
		}
		else if(pid.equals("25")){
			im1.setImageResource(R.drawable.bb25);
		}
		else if(pid.equals("26")){
			im1.setImageResource(R.drawable.bb26);
		}
		else if(pid.equals("27")){
			im1.setImageResource(R.drawable.bb27);
		}
		else if(pid.equals("28")){
			im1.setImageResource(R.drawable.bb28);
		}
		else if(pid.equals("29")){
			im1.setImageResource(R.drawable.bb29);
		}
		else if(pid.equals("30")){
			im1.setImageResource(R.drawable.bb30);
		}
		else if(pid.equals("31")){
			im1.setImageResource(R.drawable.bb31);
		}
		else if(pid.equals("32")){
			im1.setImageResource(R.drawable.bb32);
		}
		else if(pid.equals("33")){
			im1.setImageResource(R.drawable.bb33);
		}
		else if(pid.equals("34")){
			im1.setImageResource(R.drawable.bb34);
		}
		else if(pid.equals("35")){
			im1.setImageResource(R.drawable.bb35);
		}
		else if(pid.equals("36")){
			im1.setImageResource(R.drawable.bb36);
		}
		else if(pid.equals("37")){
			im1.setImageResource(R.drawable.bb37);
		}
		else if(pid.equals("38")){
			im1.setImageResource(R.drawable.bb38);
		}
		else if(pid.equals("39")){
			im1.setImageResource(R.drawable.bb39);
		}
		else if(pid.equals("40")){
			im1.setImageResource(R.drawable.bb40);
		}
		

	}
	
	public void showCustomAlert()
    {
         
        Context context = getApplicationContext();
        // Create layout inflator object to inflate toast.xml file
        LayoutInflater inflater = getLayoutInflater();
          
        // Call toast.xml file for toast layout 
        View toastRoot = inflater.inflate(R.layout.toast, null);
        TextView tv=(TextView)findViewById(R.id.tv);
        tv.setText("Sound and video will be updated Soon");
        Toast toast = new Toast(context);
         
        // Set layout to toast 
        toast.setView(toastRoot);
        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,
                0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
         
    }
}
