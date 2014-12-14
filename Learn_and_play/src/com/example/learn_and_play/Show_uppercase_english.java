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

public class Show_uppercase_english extends Activity implements OnClickListener{
	
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
		setContentView(R.layout.show_uppercse_eng);
		letter=(ImageView)findViewById(R.id.img);
		sound=(ImageButton)findViewById(R.id.bt_sound);
		vid=(VideoView)findViewById(R.id.svid);
        iv=(ImageView)findViewById(R.id.simg);
        ip=(ImageView)findViewById(R.id.playimg);
        example=(ImageButton)findViewById(R.id.bt_example);
        
        Intent i = getIntent();
		// getting product id (pid) from intent
		pid = i.getStringExtra(TAG_PID);
        if(pid.equals("A")){
        	letter.setImageResource(R.drawable.up_a);
        	type="A";
        }
        else if(pid.equals("B")){
        	letter.setImageResource(R.drawable.up_b);
        	type="B";
        }
        else if(pid.equals("C")){
        	letter.setImageResource(R.drawable.up_c);
        	type="C";
        }
        else if(pid.equals("D")){
        	letter.setImageResource(R.drawable.up_d);
        	type="D";
        }
        else if(pid.equals("E")){
        	letter.setImageResource(R.drawable.up_e);
        	type="E";
        }
        else if(pid.equals("F")){
        	letter.setImageResource(R.drawable.up_f);
        	type="F";
        }
        else if(pid.equals("G")){
        	letter.setImageResource(R.drawable.up_g);
        	type="G";
        }
        else if(pid.equals("H")){
        	letter.setImageResource(R.drawable.up_h);
        	type="H";
        }
        else if(pid.equals("I")){
        	letter.setImageResource(R.drawable.up_i);
        	type="I";
        }
        else if(pid.equals("J")){
        	letter.setImageResource(R.drawable.up_j);
        	type="J";
        }
        else if(pid.equals("K")){
        	letter.setImageResource(R.drawable.up_k);
        	type="K";
        }
        else if(pid.equals("L")){
        	letter.setImageResource(R.drawable.up_l);
        	type="L";
        }
        else if(pid.equals("M")){
        	letter.setImageResource(R.drawable.up_m);
        	type="M";
        }
        else if(pid.equals("N")){
        	letter.setImageResource(R.drawable.up_n);
        	type="N";
        }
        else if(pid.equals("O")){
        	letter.setImageResource(R.drawable.up_o);
        	type="O";
        }
        else if(pid.equals("P")){
        	letter.setImageResource(R.drawable.up_p);
        	type="P";
        }
        else if(pid.equals("Q")){
        	letter.setImageResource(R.drawable.up_q);
        	type="Q";
        }
        else if(pid.equals("R")){
        	letter.setImageResource(R.drawable.up_r);
        	type="R";
        }
        else if(pid.equals("S")){
        	letter.setImageResource(R.drawable.up_s);
        	type="S";
        }
        else if(pid.equals("T")){
        	letter.setImageResource(R.drawable.up_t);
        	type="T";
        }
        else if(pid.equals("U")){
        	letter.setImageResource(R.drawable.up_u);
        	type="U";
        }
        else if(pid.equals("V")){
        	letter.setImageResource(R.drawable.up_v);
        	type="V";
        }
        else if(pid.equals("W")){
        	letter.setImageResource(R.drawable.up_w);
        	type="W";
        }
        else if(pid.equals("X")){
        	letter.setImageResource(R.drawable.up_x);
        	type="X";
        }
        else if(pid.equals("Y")){
        	letter.setImageResource(R.drawable.up_y);
        	type="Y";
        }
        else if(pid.equals("Z")){
        	letter.setImageResource(R.drawable.up_z);
        	type="Z";
        }
        sound.setOnClickListener(this);
		example.setOnClickListener(this);
		
		if(type.equals("A")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.av);
		}
		else if(type.equals("B")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bv);
		}
		else if(type.equals("C")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.cv);
		}
		else if(type.equals("D")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.dv);
		}
		else if(type.equals("E")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ev);
		}
		else if(type.equals("F")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.fv);
		}
		else if(type.equals("G")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.gv);
		}
		else if(type.equals("H")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.hv);
		}
		else if(type.equals("I")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.iv);
		}
		else if(type.equals("J")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.jv);
		}
		else if(type.equals("K")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.kv);
		}
		else if(type.equals("L")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lv);
		}
		else if(type.equals("M")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.mv);
		}
		else if(type.equals("N")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.nv);
		}
		else if(type.equals("O")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ov);
		}
		else if(type.equals("P")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.pv);
		}
		else if(type.equals("Q")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.qv);
		}
		else if(type.equals("R")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.rv);
		}
		else if(type.equals("S")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.sv);
		}
		else if(type.equals("T")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.tv);
		}
		else if(type.equals("U")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.uv);
		}
		else if(type.equals("V")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.vv);
		}
		else if(type.equals("W")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.wv);
		}
		else if(type.equals("X")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.xv);
		}
		else if(type.equals("Y")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.yv);
		}
		else if(type.equals("Z")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.zv);
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
			if(type.equals("A")){
			oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.a);
			}
			else if(type.equals("B")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.b);
			}
			else  if(type.equals("C")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.c);
			}
			else  if(type.equals("D")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.d);
			}
			else  if(type.equals("E")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.e);
			}
			else  if(type.equals("F")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.f);
			}
			else  if(type.equals("G")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.g);
			}
			else  if(type.equals("H")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.h);
			}
			else  if(type.equals("I")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.i);
			}
			else  if(type.equals("J")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.j);
			}
			else  if(type.equals("K")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.k);
			}
			else  if(type.equals("L")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.l);
			}
			else  if(type.equals("M")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.m);
			}
			else  if(type.equals("N")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.n);
			}
			else  if(type.equals("O")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.o);
			}
			else  if(type.equals("P")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.p);
			}
			else  if(type.equals("Q")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.q);
			}
			else  if(type.equals("R")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.r);
			}
			else  if(type.equals("S")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.s);
			}
			else  if(type.equals("T")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.t);
			}
			else  if(type.equals("U")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.u);
			}
			else  if(type.equals("V")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.v);
			}
			else  if(type.equals("W")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.w);
			}
			else  if(type.equals("X")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.x);
			}
			else  if(type.equals("Y")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.y);
			}
			else  if(type.equals("Z")){
				oursong = MediaPlayer.create(Show_uppercase_english.this, R.raw.z);
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
			Intent k = new Intent(this,English_example.class);
			k.putExtra(TAG_LETTER, type);
			startActivity(k);
			break;
		}
	}
}

