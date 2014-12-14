package com.example.english_test;

import java.util.ArrayList;
import java.util.Random;
import com.example.learn_and_play.R;
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

public class English_number_test1  extends Activity implements OnClickListener{
	EditText et1,et2,et3,et4,et5,et6,et7,et8,et9,et10,et11,et12,et13,et14,et15,et16,et17,et18,et19,et20;	
	String str1,str2,str3,str4,str5;
	int next1,next2,next3,next4,next5,num;
	MediaPlayer oursong,oursong2;
	ArrayList<Integer> strings1;
	String input;
	int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12,n13,n14,n15,n16,n17,n18,n19,n20;
	int count=0;
	int in,t1,t2,t3,t4,t5;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.eng_number_test1);
		oursong = MediaPlayer.create(English_number_test1.this, R.raw.correct); 
		oursong2 = MediaPlayer.create(English_number_test1.this, R.raw.wrong); 
		Random rnd = new Random();
		str1=str2="";
		num=0;
		t1=t2=t3=t4=t5=0;
		et1=(EditText)findViewById(R.id.et_a);
		et2=(EditText)findViewById(R.id.et_b);
		et3=(EditText)findViewById(R.id.et_c);
		et4=(EditText)findViewById(R.id.et_d);
		et5=(EditText)findViewById(R.id.et_e);
		et6=(EditText)findViewById(R.id.et_f);
		et7=(EditText)findViewById(R.id.et_g);
		et8=(EditText)findViewById(R.id.et_h);
		et9=(EditText)findViewById(R.id.et_i);
		et10=(EditText)findViewById(R.id.et_j);
		et11=(EditText)findViewById(R.id.et_k);
		et12=(EditText)findViewById(R.id.et_l);
		et13=(EditText)findViewById(R.id.et_m);
		et14=(EditText)findViewById(R.id.et_n);
		et15=(EditText)findViewById(R.id.et_o);
		et16=(EditText)findViewById(R.id.et_p);
		et17=(EditText)findViewById(R.id.et_q);
		et18=(EditText)findViewById(R.id.et_r);
		et19=(EditText)findViewById(R.id.et_s);
		et20=(EditText)findViewById(R.id.et_t);
		
		
		et3.setText("");
		et7.setText("");
		et10.setText("");
		et14.setText("");
		et20.setText("");
		et1.setKeyListener(null);
		et2.setKeyListener(null);
		et4.setKeyListener(null);
		et5.setKeyListener(null);
		et6.setKeyListener(null);
		et8.setKeyListener(null);
		et9.setKeyListener(null);
		et11.setKeyListener(null);
		et12.setKeyListener(null);
		et13.setKeyListener(null);
		et15.setKeyListener(null);
		et16.setKeyListener(null);
		et17.setKeyListener(null);
		et18.setKeyListener(null);
		et19.setKeyListener(null);
		
		strings1 = new ArrayList<Integer>();
		
		
		while(num<5){
			next1 = rnd.nextInt(21 - 1) + 1;
			while(next1==18 || next1==19 || next1==20){
				next1 = rnd.nextInt(21 - 1) + 1;
			}
			int i1=next1+1;
			if (!( (strings1.contains(next1)) && (strings1.contains(i1)) ) )
	        {
	            // Done for this iteration
	            strings1.add(next1);
	            ++num;
	        }
			
		}
	    
		n1=strings1.get(0);
		et1.setText(String.valueOf(n1));
		n2=++n1; n3=++n1; n4=++n1; n5=++n1;
		
		n6=strings1.get(1);
		et6.setText(String.valueOf(n6));
		n7=++n6; n8=++n6; n9=++n6; n10=++n6;
		
		n11=strings1.get(2);
		et11.setText(String.valueOf(n11));
		n12=++n11; n13=++n11; n14=++n11; n15=++n11;
		
		n16=strings1.get(3);
		et16.setText(String.valueOf(n16));
		n17=++n16; n18=++n16; n19=++n16; n20=++n16;
		
		
		et2.setText(String.valueOf(n2));
		et4.setText(String.valueOf(n4));
		et5.setText(String.valueOf(n5));
		et8.setText(String.valueOf(n8));
		et9.setText(String.valueOf(n9));
		et12.setText(String.valueOf(n12));
		et13.setText(String.valueOf(n13));
		et15.setText(String.valueOf(n15));
		et17.setText(String.valueOf(n17));
		et18.setText(String.valueOf(n18));
		et19.setText(String.valueOf(n19));
		
		et3.setOnClickListener(this);
		et7.setOnClickListener(this);
		et10.setOnClickListener(this);
		et14.setOnClickListener(this);
		et20.setOnClickListener(this);
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.et_c:
			
			in=Integer.parseInt(et3.getText().toString());
			if(in==n3){
				++t1;
				et1.setBackgroundColor(Color.BLUE);
				et2.setBackgroundColor(Color.BLUE);
				et3.setBackgroundColor(Color.BLUE);
				et4.setBackgroundColor(Color.BLUE);
				et5.setBackgroundColor(Color.BLUE);
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
				if(count==5){
					runOnUiThread(new Runnable() 
					{
					   public void run() 
					   {
					     Checkcondition(); 
					   }
					}); 
				}
				else{
					runOnUiThread(new Runnable() 
					{
					   public void run() 
					   {
					     showCustomAlert(); 
					   }
					}); 
				}
			}
			else{
				et3.setBackgroundColor(Color.RED);
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
			break;
		case R.id.et_g:
			
			in=Integer.parseInt(et7.getText().toString());
			if(in==n7){
				++t2;
				et6.setBackgroundColor(Color.BLUE);
				et7.setBackgroundColor(Color.BLUE);
				//et8.setBackgroundColor(Color.BLUE);
				//et9.setBackgroundColor(Color.BLUE);
				//et10.setBackgroundColor(Color.BLUE);
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
				if(count==5){
					runOnUiThread(new Runnable() 
					{
					   public void run() 
					   {
					     Checkcondition(); 
					   }
					}); 
				}
				else{
					runOnUiThread(new Runnable() 
					{
					   public void run() 
					   {
					     showCustomAlert(); 
					   }
					}); 
				}
			}
			else{
				et7.setBackgroundColor(Color.RED);
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
			break;
		case R.id.et_j:
			
			in=Integer.parseInt(et10.getText().toString());
			if(in==n10){
				++t3;
				et6.setBackgroundColor(Color.BLUE);
				et7.setBackgroundColor(Color.BLUE);
				et8.setBackgroundColor(Color.BLUE);
				et9.setBackgroundColor(Color.BLUE);
				et10.setBackgroundColor(Color.BLUE);
				if(t3==1) ++count;
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
				if(count==5){
					runOnUiThread(new Runnable() 
					{
					   public void run() 
					   {
					     Checkcondition(); 
					   }
					}); 
				}
				else{
					runOnUiThread(new Runnable() 
					{
					   public void run() 
					   {
					     showCustomAlert(); 
					   }
					}); 
				}
			}
			else{
				et10.setBackgroundColor(Color.RED);
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
			break;
		case R.id.et_n:
			
			in=Integer.parseInt(et14.getText().toString());
			if(in==n14){
				++t4;
				et11.setBackgroundColor(Color.BLUE);
				et12.setBackgroundColor(Color.BLUE);
				et13.setBackgroundColor(Color.BLUE);
				et14.setBackgroundColor(Color.BLUE);
				et15.setBackgroundColor(Color.BLUE);
				if(t4==1) ++count;
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
				if(count==5){
					runOnUiThread(new Runnable() 
					{
					   public void run() 
					   {
					     Checkcondition(); 
					   }
					}); 
				}
				else{
					runOnUiThread(new Runnable() 
					{
					   public void run() 
					   {
					     showCustomAlert(); 
					   }
					}); 
				}
			}
			else{
				et14.setBackgroundColor(Color.RED);
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
			break;
		case R.id.et_t:
			
			in=Integer.parseInt(et20.getText().toString());
			if(in==n20){
				++t5;
				et16.setBackgroundColor(Color.BLUE);
				et17.setBackgroundColor(Color.BLUE);
				et18.setBackgroundColor(Color.BLUE);
				et19.setBackgroundColor(Color.BLUE);
				et20.setBackgroundColor(Color.BLUE);
				if(t5==1) ++count;
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
				if(count==5){
					runOnUiThread(new Runnable() 
					{
					   public void run() 
					   {
					     Checkcondition(); 
					   }
					}); 
				}
				else{
					runOnUiThread(new Runnable() 
					{
					   public void run() 
					   {
					     showCustomAlert(); 
					   }
					}); 
				}
			}
			else{
				et20.setBackgroundColor(Color.RED);
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
			break;
		
		}
	}
	
	 public void showCustomAlert()
	    {
	         
	        Context context = getApplicationContext();
	        // Create layout inflator object to inflate toast.xml file
	        LayoutInflater inflater = getLayoutInflater();
	          
	        // Call toast.xml file for toast layout 
	        View toastRoot = inflater.inflate(R.layout.toast, null);
	          
	        Toast toast = new Toast(context);
	         
	        // Set layout to toast 
	        toast.setView(toastRoot);
	        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,
	                0, 0);
	        toast.setDuration(Toast.LENGTH_LONG);
	        toast.show();
	         
	    }
	 public void Checkcondition()
	    {
		 final Dialog dialog = new Dialog(English_number_test1.this);
	        // Include dialog.xml file
	        dialog.setContentView(R.layout.dialog);
	        // Set dialog title
	        dialog.setTitle("Test 1");

	        // set values for custom dialog components - text, image and button
	        TextView text = (TextView) dialog.findViewById(R.id.textDialog);
	        text.setText("Test 1 successfully passed!!");
	        ImageView image = (ImageView) dialog.findViewById(R.id.imageDialog);
	        image.setImageResource(R.drawable.pass);

	        dialog.show();
	         
	        Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
	        declineButton.setText("Congratulations");
	        // if decline button is clicked, close the custom dialog
	        declineButton.setOnClickListener(new OnClickListener() {
	            @Override
	            public void onClick(View v) {
	                // Close dialog
	                dialog.dismiss();
	                finish();
	                Intent intent = new Intent(getApplicationContext(),English_number_test1.class);
	    			startActivity(intent);
	            }
	        });
	        
	    	
	    }
	 @Override
		protected void onPause() {
			// TODO Auto-generated method stub
			super.onPause();
			oursong.release();
			oursong2.release();
			
		}
}
