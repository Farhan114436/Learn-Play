package com.example.english_test;

import java.util.Random;
import com.example.learn_and_play.R;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class English_letter_test1 extends Activity implements OnClickListener{

	Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t;
	char ch,ch4;
	String ch3;
	int count1=0,count2=0;
	MediaPlayer oursong,oursong2;
	String trs;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		oursong = MediaPlayer.create(English_letter_test1.this, R.raw.correct); 
		oursong2 = MediaPlayer.create(English_letter_test1.this, R.raw.wrong); 
		 setContentView(R.layout.eng_letter_test1);
		 final StringBuilder sb2=new StringBuilder();
		// Create custom dialog object
        final Dialog dialog = new Dialog(English_letter_test1.this);
        // Include dialog.xml file
        dialog.setContentView(R.layout.dialog);
        // Set dialog title
        dialog.setTitle("Test One");

        Random rnd = new Random();
        int numLetters = 1;

        String randomLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String candidateChars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      
        String str;

        for (int n=0; n<numLetters; n++){
         // Log.d("Random letters",randomLetters.charAt(rnd.nextInt(randomLetters.length())));
        	ch=randomLetters.charAt(rnd.nextInt(randomLetters.length()));
        	sb2.append(randomLetters.charAt(rnd.nextInt(randomLetters.length())));
        }
        trs=sb2.toString();
        // set values for custom dialog components - text, image and button
        TextView text = (TextView) dialog.findViewById(R.id.textDialog);
        text.setText("Find " + trs + " ??");
        ImageView image = (ImageView) dialog.findViewById(R.id.imageDialog);
        if(trs.equals("A")){
        	image.setImageResource(R.drawable.up_a);
        }
        else if(trs.equals("B")){
        	image.setImageResource(R.drawable.up_b);
        }
        else if(trs.equals("C")){
        	image.setImageResource(R.drawable.up_c);
        }
        else if(trs.equals("D")){
        	image.setImageResource(R.drawable.up_d);
        }
        else if(trs.equals("E")){
        	image.setImageResource(R.drawable.up_e);
        }
        else if(trs.equals("F")){
        	image.setImageResource(R.drawable.up_f);
        }
        else if(trs.equals("G")){
        	image.setImageResource(R.drawable.up_g);
        }
        else if(trs.equals("H")){
        	image.setImageResource(R.drawable.up_h);
        }
        else if(trs.equals("I")){
        	image.setImageResource(R.drawable.up_i);
        }
        else if(trs.equals("J")){
        	image.setImageResource(R.drawable.up_j);
        }
        else if(trs.equals("K")){
        	image.setImageResource(R.drawable.up_k);
        }
        else if(trs.equals("L")){
        	image.setImageResource(R.drawable.up_l);
        }
        else if(trs.equals("M")){
        	image.setImageResource(R.drawable.up_m);
        }
        else if(trs.equals("N")){
        	image.setImageResource(R.drawable.up_n);
        }
        else if(trs.equals("O")){
        	image.setImageResource(R.drawable.up_o);
        }
        else if(trs.equals("P")){
        	image.setImageResource(R.drawable.up_p);
        }
        else if(trs.equals("Q")){
        	image.setImageResource(R.drawable.up_q);
        }
        else if(trs.equals("R")){
        	image.setImageResource(R.drawable.up_r);
        }
        else if(trs.equals("S")){
        	image.setImageResource(R.drawable.up_s);
        }
        else if(trs.equals("T")){
        	image.setImageResource(R.drawable.up_t);
        }
        else if(trs.equals("U")){
        	image.setImageResource(R.drawable.up_u);
        }
        else if(trs.equals("V")){
        	image.setImageResource(R.drawable.up_v);
        }
        else if(trs.equals("W")){
        	image.setImageResource(R.drawable.up_w);
        }
        else if(trs.equals("X")){
        	image.setImageResource(R.drawable.up_x);
        }
        else if(trs.equals("Y")){
        	image.setImageResource(R.drawable.up_y);
        }
        else if(trs.equals("Z")){
        	image.setImageResource(R.drawable.up_z);
        }
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
       
        a=(Button)findViewById(R.id.bt_a);
        b=(Button)findViewById(R.id.bt_b);
        c=(Button)findViewById(R.id.bt_c);
        d=(Button)findViewById(R.id.bt_d);
        e=(Button)findViewById(R.id.bt_e);
        f=(Button)findViewById(R.id.bt_f);
        g=(Button)findViewById(R.id.bt_g);
        h=(Button)findViewById(R.id.bt_h);
        i=(Button)findViewById(R.id.bt_i);
        j=(Button)findViewById(R.id.bt_j);
        k=(Button)findViewById(R.id.bt_k);
        l=(Button)findViewById(R.id.bt_l);
        m=(Button)findViewById(R.id.bt_m);
        n=(Button)findViewById(R.id.bt_n);
        o=(Button)findViewById(R.id.bt_o);
        p=(Button)findViewById(R.id.bt_p);
        q=(Button)findViewById(R.id.bt_q);
        r=(Button)findViewById(R.id.bt_r);
        s=(Button)findViewById(R.id.bt_s);
        t=(Button)findViewById(R.id.bt_t);
        
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            sb.append(candidateChars.charAt(random.nextInt(candidateChars
                    .length())));
        }
        
        str=sb.toString();
        a.setText(String.valueOf(str.charAt(0)));
        b.setText(String.valueOf(str.charAt(1)));
        c.setText(String.valueOf(str.charAt(2)));
        d.setText(String.valueOf(str.charAt(3)));
        e.setText(String.valueOf(str.charAt(4)));
        f.setText(String.valueOf(str.charAt(5)));
        g.setText(String.valueOf(trs));
        h.setText(String.valueOf(str.charAt(7)));
        i.setText(String.valueOf(str.charAt(8)));
        j.setText(String.valueOf(str.charAt(9)));
        k.setText(String.valueOf(str.charAt(10)));
        l.setText(String.valueOf(str.charAt(11)));
        m.setText(String.valueOf(str.charAt(12)));
        n.setText(String.valueOf(str.charAt(13)));
        o.setText(String.valueOf(str.charAt(14)));
        p.setText(String.valueOf(trs));
        q.setText(String.valueOf(str.charAt(16)));
        r.setText(String.valueOf(str.charAt(17)));
        s.setText(String.valueOf(str.charAt(18)));
        t.setText(String.valueOf(str.charAt(19)));
        
        a.setOnClickListener(this);
        b.setOnClickListener(this);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        e.setOnClickListener(this);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        h.setOnClickListener(this);
        i.setOnClickListener(this);
        j.setOnClickListener(this);
        k.setOnClickListener(this);
        l.setOnClickListener(this);
        m.setOnClickListener(this);
        n.setOnClickListener(this);
        o.setOnClickListener(this);
        p.setOnClickListener(this);
        q.setOnClickListener(this);
        r.setOnClickListener(this);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        
        for(int k=0;k<str.length();k++){
        	char ch1=str.charAt(k);
        	if(ch==ch1){
        		++count1;
        	}
        }
        count2=0;
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bt_a:
			ch3=a.getText().toString();
			if(ch3.equals(trs)){
				a.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				a.setBackgroundColor(Color.RED);
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
		case R.id.bt_b:
			ch3=b.getText().toString();
			if(ch3.equals(trs)){
				b.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				b.setBackgroundColor(Color.RED);
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
		case R.id.bt_c:
			ch3=c.getText().toString();
			if(ch3.equals(trs)){
				c.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				c.setBackgroundColor(Color.RED);
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
		case R.id.bt_d:
			ch3=d.getText().toString();
			if(ch3.equals(trs)){
				d.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				d.setBackgroundColor(Color.RED);
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
		case R.id.bt_e:
			ch3=e.getText().toString();
			if(ch3.equals(trs)){
				e.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				e.setBackgroundColor(Color.RED);
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
		case R.id.bt_f:
			ch3=f.getText().toString();
			if(ch3.equals(trs)){
				f.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				f.setBackgroundColor(Color.RED);
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
		case R.id.bt_g:
			ch3=g.getText().toString();
			if(ch3.equals(trs)){
				g.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				g.setBackgroundColor(Color.RED);
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
		case R.id.bt_h:
			ch3=h.getText().toString();
			if(ch3.equals(trs)){
				h.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				h.setBackgroundColor(Color.RED);
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
		case R.id.bt_i:
			ch3=i.getText().toString();
			if(ch3.equals(trs)){
				i.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				i.setBackgroundColor(Color.RED);
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
		case R.id.bt_j:
			ch3=j.getText().toString();
			if(ch3.equals(trs)){
				j.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				j.setBackgroundColor(Color.RED);
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
		case R.id.bt_k:
			ch3=k.getText().toString();
			if(ch3.equals(trs)){
				k.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				k.setBackgroundColor(Color.RED);
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
		case R.id.bt_l:
			ch3=l.getText().toString();
			if(ch3.equals(trs)){
				l.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				l.setBackgroundColor(Color.RED);
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
		case R.id.bt_m:
			ch3=m.getText().toString();
			if(ch3.equals(trs)){
				m.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				m.setBackgroundColor(Color.RED);
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
		case R.id.bt_n:
			ch3=n.getText().toString();
			if(ch3.equals(trs)){
				n.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				n.setBackgroundColor(Color.RED);
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
		case R.id.bt_o:
			ch3=o.getText().toString();
			if(ch3.equals(trs)){
				o.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				o.setBackgroundColor(Color.RED);
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
		case R.id.bt_p:
			ch3=p.getText().toString();
			if(ch3.equals(trs)){
				p.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				p.setBackgroundColor(Color.RED);
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
		case R.id.bt_q:
			ch3=q.getText().toString();
			if(ch3.equals(trs)){
				q.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				q.setBackgroundColor(Color.RED);
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
		case R.id.bt_r:
			ch3=r.getText().toString();
			if(ch3.equals(trs)){
				r.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				r.setBackgroundColor(Color.RED);
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
		case R.id.bt_s:
			ch3=s.getText().toString();
			if(ch3.equals(trs)){
				s.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				s.setBackgroundColor(Color.RED);
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
		case R.id.bt_t:
			ch3=t.getText().toString();
			if(ch3.equals(trs)){
				t.setBackgroundColor(Color.CYAN);
				++count2;
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
				runOnUiThread(new Runnable() 
				{
				   public void run() 
				   {
				     showCustomAlert(); 
				   }
				}); 
				if(count2==count1+1){
					CheckCondition();
				}
			}
			else{
				t.setBackgroundColor(Color.RED);
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
	 public void CheckCondition()
	    {
		 final Dialog dialog = new Dialog(English_letter_test1.this);
	        // Include dialog.xml file
	        dialog.setContentView(R.layout.dialog);
	        // Set dialog title
	        dialog.setTitle("Test 1");

	        // set values for custom dialog components - text, image and button
	        TextView text = (TextView) dialog.findViewById(R.id.textDialog);
	        text.setText("Test 1 successfully passed");
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
	            }
	        });
	        
	    	//Intent intent = new Intent(this,English_letter_test1.class);
			//startActivity(intent);
	    }
	 @Override
		protected void onPause() {
			// TODO Auto-generated method stub
			super.onPause();
			oursong.release();
			oursong2.release();
			
		}
		
}
