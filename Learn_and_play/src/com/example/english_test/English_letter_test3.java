package com.example.english_test;

import java.util.Random;
import com.example.learn_and_play.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class English_letter_test3 extends Activity implements OnClickListener{
	EditText et1,et2,et3,et4,et5,et6,et7,et8,et9,et10,et11,et12;
	
	private static String[] sarray1={"ABCD","BCDE","CDEF","DEFG","EFGH","FGHI","GHIJ","HIJK","IJKL","JKLM","KLMN","LMNO","MNOP","NOPQ","OPQR",
									"PQRS","QRST","RSTU","STUV","TUVW","UVWX","VWXY","WXYZ"};
	private static String[] sarray2={"abcd","bcde","cdef","defg","efgh","fghi","ghij","hijk","ijkl","jklm","klmn","lmno","mnop","nopq","opqr",
									"pqrs","qrst","rstu","stuv","tuvw","uvwx","vwxy","wxyz"};
	String str1,str2,str3;
	int num;
	MediaPlayer oursong,oursong2;
	char ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8,ch9,ch10,ch11,ch12,in;
	String input,s1,s2,s3;
	int count,t1,t2,t3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.eng_letter_test2);
		oursong = MediaPlayer.create(English_letter_test3.this, R.raw.correct); 
		oursong2 = MediaPlayer.create(English_letter_test3.this, R.raw.wrong); 
		
		str1=str2=str3="";
		t1=t2=t3=0;
		count=0;
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
		
		et3.setText("");
		et5.setText("");
		et12.setText("");
		et1.setKeyListener(null);
		et2.setKeyListener(null);
		et4.setKeyListener(null);
		et6.setKeyListener(null);
		et7.setKeyListener(null);
		et8.setKeyListener(null);
		et9.setKeyListener(null);
		et10.setKeyListener(null);
		et11.setKeyListener(null);
		
		num=1;
		str1 = sarray1[new Random().nextInt(sarray1.length)];
		str2 = sarray2[new Random().nextInt(sarray2.length)];
		str3 = sarray1[new Random().nextInt(sarray1.length)];
	    
		ch1=str1.charAt(0);
		ch2=str1.charAt(1);
		ch3=str1.charAt(2);
		ch4=str1.charAt(3);
		Log.d("1", str1);
		Log.d("2", str2);
		Log.d("3", str3);
		
		et1.setText(String.valueOf(ch1));
		et2.setText(String.valueOf(ch2));
		et4.setText(String.valueOf(ch4));
		
		ch5=str2.charAt(0);
		ch6=str2.charAt(1);
		ch7=str2.charAt(2);
		ch8=str2.charAt(3);
		
		et6.setText(String.valueOf(ch6));
		et7.setText(String.valueOf(ch7));
		et8.setText(String.valueOf(ch8));
		
		ch9=str3.charAt(0);
		ch10=str3.charAt(1);
		ch11=str3.charAt(2);
		ch12=str3.charAt(3);
		
		et9.setText(String.valueOf(ch9));
		et10.setText(String.valueOf(ch10));
		et11.setText(String.valueOf(ch11));

		s1=String.valueOf(ch3);
		s2=String.valueOf(ch5);
		s3=String.valueOf(ch12);
		
		et3.setOnClickListener(this);
		et5.setOnClickListener(this);
		et12.setOnClickListener(this);
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.et_c:
			++t1;
			input=et3.getText().toString();
			if(input.equals(s1)){
				et1.setBackgroundColor(Color.BLUE);
				et2.setBackgroundColor(Color.BLUE);
				et3.setBackgroundColor(Color.BLUE);
				et4.setBackgroundColor(Color.BLUE);
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
				if(count==3){
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
		case R.id.et_e:
			++t2;
			input=et5.getText().toString();
			if(input.equals(s2)){
				et5.setBackgroundColor(Color.BLUE);
				et6.setBackgroundColor(Color.BLUE);
				et7.setBackgroundColor(Color.BLUE);
				et8.setBackgroundColor(Color.BLUE);
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
				if(count==3){
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
				et5.setBackgroundColor(Color.RED);
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
		case R.id.et_l:
			++t3;
			input=et12.getText().toString();
			if(input.equals(s3)){
				et9.setBackgroundColor(Color.BLUE);
				et10.setBackgroundColor(Color.BLUE);
				et11.setBackgroundColor(Color.BLUE);
				et12.setBackgroundColor(Color.BLUE);
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
				if(count==3){
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
				et12.setBackgroundColor(Color.RED);
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
	
	public void Checkcondition()
    {
		final Dialog dialog = new Dialog(English_letter_test3.this);
        // Include dialog.xml file
        dialog.setContentView(R.layout.dialog);
        // Set dialog title
        dialog.setTitle("Test 3");

        // set values for custom dialog components - text, image and button
        TextView text = (TextView) dialog.findViewById(R.id.textDialog);
        text.setText("Test 3 successfully passed!!");
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
                Intent intent = new Intent(getApplicationContext(),English_letter_test3.class);
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
	         
	        // Set layout to toast 
	        toast.setView(toastRoot);
	        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,
	                0, 0);
	        toast.setDuration(Toast.LENGTH_LONG);
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
