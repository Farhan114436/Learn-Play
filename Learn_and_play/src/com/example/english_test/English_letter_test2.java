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
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class English_letter_test2 extends Activity implements OnClickListener{
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
		oursong = MediaPlayer.create(English_letter_test2.this, R.raw.correct); 
		oursong2 = MediaPlayer.create(English_letter_test2.this, R.raw.wrong); 
		final StringBuilder sb2=new StringBuilder();
		// Create custom dialog object
        final Dialog dialog = new Dialog(English_letter_test2.this);
        // Include dialog.xml file
        dialog.setContentView(R.layout.dialog);
        // Set dialog title
        dialog.setTitle("Test Two");

        Random rnd = new Random();
        int numLetters = 1;

        String randomLetters = "abcdefghijklmnopqrstuvwxyz";
        String candidateChars="abcdefghijklmnopqrstuvwxyz";
        String str;

        for (int n=0; n<numLetters; n++){
           // Log.d("Random letters",randomLetters.charAt(rnd.nextInt(randomLetters.length())));
        	sb2.append(randomLetters.charAt(rnd.nextInt(randomLetters.length())));
        }
        trs=sb2.toString();
        // set values for custom dialog components - text, image and button
        TextView text = (TextView) dialog.findViewById(R.id.textDialog);
        text.setText("Find "+ trs + " ??");
        ImageView image = (ImageView) dialog.findViewById(R.id.imageDialog);
        if(trs=="a"){
        	image.setImageResource(R.drawable.a_lw);
        }
        else if(trs=="b"){
        	image.setImageResource(R.drawable.b_lw);
        }
        else if(trs=="c"){
        	image.setImageResource(R.drawable.c_lw);
        }
        else if(trs=="d"){
        	image.setImageResource(R.drawable.d_lw);
        }
        else if(trs=="e"){
        	image.setImageResource(R.drawable.e_lw);
        }
        else if(trs=="f"){
        	image.setImageResource(R.drawable.f_lw);
        }
        else if(trs=="g"){
        	image.setImageResource(R.drawable.g_lw);
        }
        else if(trs=="h"){
        	image.setImageResource(R.drawable.h_lw);
        }
        else if(trs=="i"){
        	image.setImageResource(R.drawable.i_lw);
        }
        else if(trs=="j"){
        	image.setImageResource(R.drawable.j_lw);
        }
        else if(trs=="k"){
        	image.setImageResource(R.drawable.k_lw);
        }
        else if(trs=="l"){
        	image.setImageResource(R.drawable.l_lw);
        }
        else if(trs=="m"){
        	image.setImageResource(R.drawable.m_lw);
        }
        else if(trs=="n"){
        	image.setImageResource(R.drawable.n_lw);
        }
        else if(trs=="o"){
        	image.setImageResource(R.drawable.o_lw);
        }
        else if(trs=="p"){
        	image.setImageResource(R.drawable.p_lw);
        }
        else if(trs=="q"){
        	image.setImageResource(R.drawable.q_lw);
        }
        else if(trs=="r"){
        	image.setImageResource(R.drawable.r_lw);
        }
        else if(trs=="s"){
        	image.setImageResource(R.drawable.s_lw);
        }
        else if(trs=="t"){
        	image.setImageResource(R.drawable.t_lw);
        }
        else if(trs=="u"){
        	image.setImageResource(R.drawable.u_lw);
        }
        else if(trs=="v"){
        	image.setImageResource(R.drawable.v_lw);
        }
        else if(trs=="w"){
        	image.setImageResource(R.drawable.w_lw);
        }
        else if(trs=="x"){
        	image.setImageResource(R.drawable.x_lw);
        }
        else if(trs=="y"){
        	image.setImageResource(R.drawable.y_lw);
        }
        else if(trs=="z"){
        	image.setImageResource(R.drawable.z_lw);
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
        setContentView(R.layout.eng_letter_test1);
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
        a.setText(str.charAt(0));
        b.setText(str.charAt(1));
        c.setText(str.charAt(2));
        d.setText(str.charAt(3));
        e.setText(str.charAt(4));
        f.setText(str.charAt(5));
        g.setText(ch);
        h.setText(str.charAt(7));
        i.setText(str.charAt(8));
        j.setText(str.charAt(9));
        k.setText(str.charAt(10));
        l.setText(str.charAt(11));
        m.setText(str.charAt(12));
        n.setText(str.charAt(13));
        o.setText(str.charAt(14));
        p.setText(ch);
        q.setText(str.charAt(16));
        r.setText(str.charAt(17));
        s.setText(str.charAt(18));
        t.setText(str.charAt(19));
        
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

	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bt_a:
			ch3=a.getText().toString();
			ch4=ch3.charAt(0);
			if(ch4==ch){
				a.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
			ch4=ch3.charAt(0);
			if(ch4==ch){
				b.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
			ch4=ch3.charAt(0);
			if(ch4==ch){
				c.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
			ch4=ch3.charAt(0);
			if(ch4==ch){
				d.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
			ch4=ch3.charAt(0);
			if(ch4==ch){
				e.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
			ch4=ch3.charAt(0);
			if(ch4==ch){
				f.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
			ch4=ch3.charAt(0);
			if(ch4==ch){
				g.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
			ch4=ch3.charAt(0);
			if(ch4==ch){
				h.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
			ch4=ch3.charAt(0);
			if(ch4==ch){
				i.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
			ch4=ch3.charAt(0);
			if(ch4==ch){
				j.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
			ch4=ch3.charAt(0);
			if(ch4==ch){
				k.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
			ch4=ch3.charAt(0);
			if(ch4==ch){
				l.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
			ch4=ch3.charAt(0);
			if(ch4==ch){
				m.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
			ch4=ch3.charAt(0);
			if(ch4==ch){
				n.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
			ch4=ch3.charAt(0);
			if(ch4==ch){
				o.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
			ch4=ch3.charAt(0);
			if(ch4==ch){
				p.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
			ch4=ch3.charAt(0);
			if(ch4==ch){
				q.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
			ch4=ch3.charAt(0);
			if(ch4==ch){
				r.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
			ch4=ch3.charAt(0);
			if(ch4==ch){
				s.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
			ch4=ch3.charAt(0);
			if(ch4==ch){
				t.setBackgroundColor(Color.CYAN);
				++count2;
				oursong.start();
				Thread timer = new Thread(){
					public void run(){
						try{
							sleep(1000);					
						} catch (InterruptedException e){
							e.printStackTrace();
						}finally{
							showCustomAlert();
						}
					}
				};
				timer.start();
				if(count2==count1){
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
		    Context context = getApplicationContext();
	        // Create layout inflator object to inflate toast.xml file
	        LayoutInflater inflater = getLayoutInflater();
	          
	        // Call toast.xml file for toast layout 
	        View toastRoot = inflater.inflate(R.layout.toast, null);
	        TextView tv=(TextView)findViewById(R.id.tv);  
	        ImageView im=(ImageView)findViewById(R.id.imv);
	        Toast toast = new Toast(context);
	        tv.setText("Test 2 Successfully Passed!!"); 
	        im.setImageResource(R.drawable.pass);
	        // Set layout to toast 
	        toast.setView(toastRoot);
	        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,
	                0, 0);
	        toast.setDuration(Toast.LENGTH_LONG);
	        toast.show(); 
	        
	    	Intent intent = new Intent(this,English_letter_test2.class);
			startActivity(intent);
	    }
	 @Override
		protected void onPause() {
			// TODO Auto-generated method stub
			super.onPause();
			oursong.release();
			oursong2.release();
			
		}
}
