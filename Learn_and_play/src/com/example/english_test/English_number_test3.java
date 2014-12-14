package com.example.english_test;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.learn_and_play.R;

public class English_number_test3 extends Activity implements OnClickListener{
	ImageView im;
	int randomstring,id,key,check;
	EditText et1,et2;
	String pid,type,thing,input;
	Button bt;
	MediaPlayer oursong,oursong2;
	ArrayList<Integer> strings1;
	int count,in,len,n1,n2;
	Boolean doubles;
	int t1,t2;
	private static int[] stra ={R.drawable.onep,R.drawable.onep2,R.drawable.twop,R.drawable.twop2,
								R.drawable.threep,R.drawable.threep2,R.drawable.fourp,R.drawable.fourp2,
								R.drawable.fivep,R.drawable.fivep2,R.drawable.sixp,R.drawable.sixp2,
								R.drawable.sevenp,R.drawable.sevenp2,R.drawable.eightp,R.drawable.eightp2,
								R.drawable.ninep,R.drawable.ninep2,R.drawable.tenp,R.drawable.tenp2,
								R.drawable.elevenp,R.drawable.elevenp2,R.drawable.twelvep,R.drawable.twelvep2,
								R.drawable.thirteenp,R.drawable.thirteenp2,R.drawable.fourteenp,R.drawable.fourteenp2,
								R.drawable.fifteenp,R.drawable.fifteenp2,R.drawable.sixteenp,R.drawable.sixteenp2,
								R.drawable.seventeenp,R.drawable.seventeenp2,R.drawable.eighteenp,R.drawable.eighteenp2,
								R.drawable.nineteenp,R.drawable.nineteenp2,R.drawable.twentyp,R.drawable.twentyp2 };
	
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.eng_number_test2);
		im=(ImageView)findViewById(R.id.imv);
		et1=(EditText)findViewById(R.id.et_1);
		et2=(EditText)findViewById(R.id.et_2);
		bt=(Button)findViewById(R.id.hint);
		
		oursong = MediaPlayer.create(English_number_test3.this, R.raw.correct); 
		oursong2 = MediaPlayer.create(English_number_test3.this, R.raw.wrong); 
		count=0;
		doubles=false;
		// Create custom dialog object
        final Dialog dialog = new Dialog(English_number_test3.this);
        // Include dialog.xml file
        dialog.setContentView(R.layout.dialog);
        // Set dialog title
        dialog.setTitle("Test Three");

        // set values for custom dialog components - text, image and button
        TextView text = (TextView) dialog.findViewById(R.id.textDialog);
        text.setText("Count The Objects..");
        ImageView image = (ImageView) dialog.findViewById(R.id.imageDialog);
        image.setImageResource(R.drawable.image0);
        dialog.show();
         
        Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
        // if decline button is clicked, close the custom dialog
        declineButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close dialog
                dialog.dismiss();
            }
        });
        
        randomstring = stra[new Random().nextInt(stra.length)];
        im.setImageResource(randomstring);
		id=randomstring;
		if(id==R.drawable.onep || id==R.drawable.onep2){
			key=1;
			et2.setVisibility(View.GONE);
		}
		else if(id==R.drawable.twop || id==R.drawable.twop2){
			key=2;
			et2.setVisibility(View.GONE);
		}
		else if(id==R.drawable.threep || id==R.drawable.threep2){
			key=3;
			et2.setVisibility(View.GONE);
		}
		else if(id==R.drawable.fourp || id==R.drawable.fourp2){
			key=4;
			et2.setVisibility(View.GONE);
		}
		else if(id==R.drawable.fivep || id==R.drawable.fivep2){
			key=5;
			et2.setVisibility(View.GONE);
		}
		else if(id==R.drawable.sixp || id==R.drawable.sixp2){
			key=6;
			et2.setVisibility(View.GONE);
		}
		else if(id==R.drawable.sevenp || id==R.drawable.sevenp2){
			key=7;
			et2.setVisibility(View.GONE);
		}
		else if(id==R.drawable.eightp || id==R.drawable.eightp2){
			key=8;
			et2.setVisibility(View.GONE);
		}
		else if(id==R.drawable.ninep || id==R.drawable.ninep2){
			key=9;
			et2.setVisibility(View.GONE);
		}
		else if(id==R.drawable.tenp || id==R.drawable.tenp2){
			key=10;
		}
		else if(id==R.drawable.elevenp || id==R.drawable.elevenp2){
			key=11;
		}
		else if(id==R.drawable.twelvep || id==R.drawable.twelvep2){
			key=12;
		}
		else if(id==R.drawable.thirteenp || id==R.drawable.thirteenp2){
			key=13;
		}
		else if(id==R.drawable.fourteenp || id==R.drawable.fourteenp2){
			key=14;
		}
		else if(id==R.drawable.fifteenp || id==R.drawable.fifteenp2){
			key=15;
		}
		else if(id==R.drawable.sixteenp || id==R.drawable.sixteenp2){
			key=16;
		}
		else if(id==R.drawable.seventeenp || id==R.drawable.seventeenp2){
			key=17;
		}
		else if(id==R.drawable.eighteenp || id==R.drawable.eighteenp2){
			key=18;
		}
		else if(id==R.drawable.nineteenp || id==R.drawable.nineteenp2){
			key=19;
		}
		else if(id==R.drawable.twentyp || id==R.drawable.twentyp2){
			key=20;
		}
		strings1 = new ArrayList<Integer>();
		check=0;
		if(key/10 >=1){
			doubles=true;
			n1=key/10;
			n2=key%10;
			len=2;
		}
		else{
			doubles=false;
			len=1;
		}
		et1.setOnClickListener(this);
		et2.setOnClickListener(this);
		bt.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.et_1:
			if(et1.getVisibility()==View.VISIBLE){
				et1.setBackgroundColor(Color.CYAN);
				in=Integer.parseInt(et1.getText().toString());
				if(in==key && !doubles){
					++t1;
					et1.setBackgroundColor(Color.BLUE);
					if(t1==1) ++count;
					oursong.start();
					Thread timer = new Thread(){
						public void run(){
							try{
								sleep(1000);					
							} catch (InterruptedException e){
								e.printStackTrace();
							}
						}
					};
					timer.start();
					if(count==len){
						runOnUiThread(new Runnable() 
						{
						   public void run() 
						   {
						     Checkcondition(); 
						   }
						}); 
					}
				}
				else if(doubles && in==n1){
					et1.setBackgroundColor(Color.BLUE);
					if(t1==1) ++count;
					check=1;
					oursong.start();
					Thread timer = new Thread(){
						public void run(){
							try{
								sleep(1000);					
							} catch (InterruptedException e){
								e.printStackTrace();
							}
						}
					};
					timer.start();
					if(count==len){
						runOnUiThread(new Runnable() 
						{
						   public void run() 
						   {
						     Checkcondition(); 
						   }
						}); 
					}
				}
				else{
					et1.setBackgroundColor(Color.RED);
					oursong2.start();
					Thread timer = new Thread(){
						public void run(){
							try{
								sleep(1000);					
							} catch (InterruptedException e){
								e.printStackTrace();
							}
						}
					};
					timer.start();
				}
			}
			break;
		case R.id.et_2:
			if(et2.getVisibility()==View.VISIBLE){
				et2.setBackgroundColor(Color.CYAN);
				in=Integer.parseInt(et2.getText().toString());
				if(in==key && !doubles){
					++t2;
					et2.setBackgroundColor(Color.BLUE);
					if(t2==1) ++count;
					oursong.start();
					Thread timer = new Thread(){
						public void run(){
							try{
								sleep(1000);					
							} catch (InterruptedException e){
								e.printStackTrace();
							}
						}
					};
					timer.start();
					if(count==len){
						runOnUiThread(new Runnable() 
						{
						   public void run() 
						   {
						     Checkcondition(); 
						   }
						}); 
					}
				}
				else if(doubles && in==n2){
					et1.setBackgroundColor(Color.BLUE);
					if(t2==1) ++count;
					oursong.start();
					Thread timer = new Thread(){
						public void run(){
							try{
								sleep(1000);					
							} catch (InterruptedException e){
								e.printStackTrace();
							}
						}
					};
					timer.start();
					if(count==len && check==1){
						runOnUiThread(new Runnable() 
						{
						   public void run() 
						   {
						     Checkcondition(); 
						   }
						}); 
					}
				}
				else{
					et2.setBackgroundColor(Color.RED);
					oursong2.start();
					Thread timer = new Thread(){
						public void run(){
							try{
								sleep(1000);					
							} catch (InterruptedException e){
								e.printStackTrace();
							}
						}
					};
					timer.start();
				}
			}
			break;
		case R.id.hint:
			showCustomAlert();
			break;
		}
	}
	
	public void Checkcondition()
    {
		final Dialog dialog = new Dialog(English_number_test3.this);
        // Include dialog.xml file
        dialog.setContentView(R.layout.dialog);
        // Set dialog title
        dialog.setTitle("Test 3");

        // set values for custom dialog components - text, image and button
        TextView text = (TextView) dialog.findViewById(R.id.textDialog);
        text.setText("Test 3 successfully passed");
        ImageView image = (ImageView) dialog.findViewById(R.id.imageDialog);
        image.setImageResource(R.drawable.pass);

        dialog.show();
         
        Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
        // if decline button is clicked, close the custom dialog
        declineButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                // Close dialog
                dialog.dismiss();
                finish();
                Intent intent = new Intent(getApplicationContext(),English_number_test3.class);
        		startActivity(intent);
            }
        });
        
    	
    }
	
	 public void showCustomAlert()
	    {
	         
	        Context context = getApplicationContext();
	        // Create layout inflator object to inflate toast.xml file
	        LayoutInflater inflater = getLayoutInflater();
	          
	        // Call toast.xml file for toast layout 
	        View toastRoot = inflater.inflate(R.layout.toast, null);
	        Toast toast = new Toast(context);
	        TextView tv=(TextView)findViewById(R.id.tv);
	         
	        // Set layout to toast 
	        toast.setView(toastRoot);
	        tv.setText(key);
	        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,
	                0, 0);
	        toast.setDuration(Toast.LENGTH_SHORT);
	        toast.show();
	         
	    }
	 @Override
		protected void onPause() {
			// TODO Auto-generated method stub
			super.onPause();
			oursong.release();
			oursong2.release();
			
		}
}
