package com.example.learn_and_play;

import com.example.learn_and_play.R;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.VideoView;

public class Show_english_numbers  extends Activity implements OnClickListener{
	private static final String TAG_PID = "pid";
	private static final String TAG_LETTER = "letter";
	ImageView letter ,iv,ip;
	VideoView vid;
	String link;
	Context thiscontext;
	Uri uri;
	ImageButton sound,example;
	MediaPlayer oursong;
	String pid,type;
	Uri video1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show_english_numbers);
		letter=(ImageView)findViewById(R.id.img);
		sound=(ImageButton)findViewById(R.id.bt_sound);
		vid=(VideoView)findViewById(R.id.svid);
        iv=(ImageView)findViewById(R.id.simg);
        ip=(ImageView)findViewById(R.id.playimg);
        example=(ImageButton)findViewById(R.id.bt_example);
        
        Intent i = getIntent();
		// getting product id (pid) from intent
		pid = i.getStringExtra(TAG_PID);
        if(pid.equals("1")){
        	letter.setImageResource(R.drawable.one);
        	type="1";
        }
        else if(pid.equals("2")){
        	letter.setImageResource(R.drawable.two);
        	type="2";
        }
        else if(pid.equals("3")){
        	letter.setImageResource(R.drawable.three);
        	type="3";
        }
        else if(pid.equals("4")){
        	letter.setImageResource(R.drawable.four);
        	type="4";
        }
        else if(pid.equals("5")){
        	letter.setImageResource(R.drawable.five);
        	type="5";
        }
        else if(pid.equals("6")){
        	letter.setImageResource(R.drawable.six);
        	type="6";
        }
        else if(pid.equals("7")){
        	letter.setImageResource(R.drawable.seveen);
        	type="7";
        }
        else if(pid.equals("8")){
        	letter.setImageResource(R.drawable.eight);
        	type="8";
        }
        else if(pid.equals("9")){
        	letter.setImageResource(R.drawable.nine);
        	type="9";
        }
        else if(pid.equals("10")){
        	letter.setImageResource(R.drawable.ten);
        	type="10";
        }
        else if(pid.equals("11")){
        	letter.setImageResource(R.drawable.eleven);
        	type="11";
        }
        else if(pid.equals("12")){
        	letter.setImageResource(R.drawable.twelve);
        	type="12";
        }
        else if(pid.equals("13")){
        	letter.setImageResource(R.drawable.thirteen);
        	type="13";
        }
        else if(pid.equals("14")){
        	letter.setImageResource(R.drawable.fourteen);
        	type="14";
        }
        else if(pid.equals("15")){
        	letter.setImageResource(R.drawable.fifteen);
        	type="15";
        }
        else if(pid.equals("16")){
        	letter.setImageResource(R.drawable.sixteen);
        	type="16";
        }
        else if(pid.equals("17")){
        	letter.setImageResource(R.drawable.seventeen);
        	type="17";
        }
        else if(pid.equals("18")){
        	letter.setImageResource(R.drawable.eighteen);
        	type="18";
        }
        else if(pid.equals("19")){
        	letter.setImageResource(R.drawable.nineteen);
        	type="19";
        }
        else if(pid.equals("20")){
        	letter.setImageResource(R.drawable.twenty);
        	type="20";
        }
        sound.setOnClickListener(this);
		example.setOnClickListener(this);
		
		if(type.equals("1")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.one);
		}
		else if(type.equals("2")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.two);
		}
		else if(type.equals("3")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.three);
		}
		else if(type.equals("4")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.four);
		}
		else if(type.equals("5")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.five);
		}
		else if(type.equals("6")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.six);
		}
		else if(type.equals("7")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.seven);
		}
		else if(type.equals("8")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.eight);
		}
		else if(type.equals("9")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.nine);
		}
		else if(type.equals("10")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ten);
		}
		else{
			vid.setVisibility(8);
		}
		
		vid.setVideoURI(video1);
        vid.requestFocus();

           //loadImage(thumb);

           ip.setClickable(true);
           ip.setImageResource(R.drawable.play);
           // ip.setVisibility(ImageView.INVISIBLE);
       
           ip.setOnClickListener(new OnClickListener() {

               @Override
               public void onClick(View v) {
                   // TODO Auto-generated method stub

            	   vid.start();
          
                       if(vid.isPlaying()){
                            iv.setVisibility(ImageView.INVISIBLE);
                            ip.setVisibility(ImageView.INVISIBLE);
                        }else{
                            iv.setVisibility(ImageView.VISIBLE);
                            ip.setVisibility(ImageView.VISIBLE);
                        }

               }
           });
        
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bt_sound:
			if(type.equals("1")){
			oursong = MediaPlayer.create(Show_english_numbers.this, R.raw.ones);
			}
			else if(type.equals("2")){
				oursong = MediaPlayer.create(Show_english_numbers.this, R.raw.twos);
			}
			else  if(type.equals("3")){
				oursong = MediaPlayer.create(Show_english_numbers.this, R.raw.threes);
			}
			else  if(type.equals("4")){
				oursong = MediaPlayer.create(Show_english_numbers.this, R.raw.fours);
			}
			else  if(type.equals("5")){
				oursong = MediaPlayer.create(Show_english_numbers.this, R.raw.fives);
			}
			else  if(type.equals("6")){
				oursong = MediaPlayer.create(Show_english_numbers.this, R.raw.sixs);
			}
			else  if(type.equals("7")){
				oursong = MediaPlayer.create(Show_english_numbers.this, R.raw.sevens);
			}
			else  if(type.equals("8")){
				oursong = MediaPlayer.create(Show_english_numbers.this, R.raw.eights);
			}
			else  if(type.equals("9")){
				oursong = MediaPlayer.create(Show_english_numbers.this, R.raw.nines);
			}
			else  if(type.equals("10")){
				oursong = MediaPlayer.create(Show_english_numbers.this, R.raw.tens);
			}
			
			oursong.start();
			
			Thread timer = new Thread(){
				public void run(){
					try{
						sleep(3000);					
					} catch (InterruptedException e){
						e.printStackTrace();
					}
				}
			};
			timer.start();
			break;
		case R.id.bt_example:
			Intent k = new Intent(this,Number_example.class);
			k.putExtra(TAG_LETTER, type);
			startActivity(k);
			break;
		}
	}
}
