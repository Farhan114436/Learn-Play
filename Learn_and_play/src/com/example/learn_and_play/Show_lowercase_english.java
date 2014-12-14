package com.example.learn_and_play;

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

import com.example.learn_and_play.R;

public class Show_lowercase_english extends Activity implements OnClickListener{
	
	private static final String TAG_LETTER = "letter";
	private static final String TAG_PID = "pid";
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
		setContentView(R.layout.show_lowercase_eng);
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
        	letter.setImageResource(R.drawable.a_lw);
        	type="A";
        }
        else if(pid.equals("B")){
        	letter.setImageResource(R.drawable.b_lw);
        	type="B";
        }
        else if(pid.equals("C")){
        	letter.setImageResource(R.drawable.c_lw);
        	type="C";
        }
        else if(pid.equals("D")){
        	letter.setImageResource(R.drawable.d_lw);
        	type="D";
        }
        else if(pid.equals("E")){
        	letter.setImageResource(R.drawable.e_lw);
        	type="E";
        }
        else if(pid.equals("F")){
        	letter.setImageResource(R.drawable.f_lw);
        	type="F";
        }
        else if(pid.equals("G")){
        	letter.setImageResource(R.drawable.g_lw);
        	type="G";
        }
        else if(pid.equals("H")){
        	letter.setImageResource(R.drawable.h_lw);
        	type="H";
        }
        else if(pid.equals("I")){
        	letter.setImageResource(R.drawable.i_lw);
        	type="I";
        }
        else if(pid.equals("J")){
        	letter.setImageResource(R.drawable.j_lw);
        	type="J";
        }
        else if(pid.equals("K")){
        	letter.setImageResource(R.drawable.k_lw);
        	type="K";
        }
        else if(pid.equals("L")){
        	letter.setImageResource(R.drawable.l_lw);
        	type="L";
        }
        else if(pid.equals("M")){
        	letter.setImageResource(R.drawable.m_lw);
        	type="M";
        }
        else if(pid.equals("N")){
        	letter.setImageResource(R.drawable.n_lw);
        	type="N";
        }
        else if(pid.equals("O")){
        	letter.setImageResource(R.drawable.o_lw);
        	type="O";
        }
        else if(pid.equals("P")){
        	letter.setImageResource(R.drawable.p_lw);
        	type="P";
        }
        else if(pid.equals("Q")){
        	letter.setImageResource(R.drawable.q_lw);
        	type="Q";
        }
        else if(pid.equals("R")){
        	letter.setImageResource(R.drawable.r_lw);
        	type="R";
        }
        else if(pid.equals("S")){
        	letter.setImageResource(R.drawable.s_lw);
        	type="S";
        }
        else if(pid.equals("T")){
        	letter.setImageResource(R.drawable.t_lw);
        	type="T";
        }
        else if(pid.equals("U")){
        	letter.setImageResource(R.drawable.u_lw);
        	type="U";
        }
        else if(pid.equals("V")){
        	letter.setImageResource(R.drawable.v_lw);
        	type="V";
        }
        else if(pid.equals("W")){
        	letter.setImageResource(R.drawable.w_lw);
        	type="W";
        }
        else if(pid.equals("X")){
        	letter.setImageResource(R.drawable.x_lw);
        	type="X";
        }
        else if(pid.equals("Y")){
        	letter.setImageResource(R.drawable.y_lw);
        	type="Y";
        }
        else if(pid.equals("Z")){
        	letter.setImageResource(R.drawable.z_lw);
        	type="Z";
        }
        sound.setOnClickListener(this);
		example.setOnClickListener(this);
		
		if(type.equals("A")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lav);
		}
		else if(type.equals("B")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lbv);
		}
		else if(type.equals("C")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lcv);
		}
		else if(type.equals("D")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ldv);
		}
		else if(type.equals("E")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lev);
		}
		else if(type.equals("F")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lfv);
		}
		else if(type.equals("G")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lgv);
		}
		else if(type.equals("H")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lhv);
		}
		else if(type.equals("I")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.liv);
		}
		else if(type.equals("J")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ljv);
		}
		else if(type.equals("K")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lkv);
		}
		else if(type.equals("L")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.llv);
		}
		else if(type.equals("M")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lmv);
		}
		else if(type.equals("N")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lnv);
		}
		else if(type.equals("O")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lov);
		}
		else if(type.equals("P")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lpv);
		}
		else if(type.equals("Q")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lqv);
		}
		else if(type.equals("R")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lrv);
		}
		else if(type.equals("S")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lsv);
		}
		else if(type.equals("T")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.ltv);
		}
		else if(type.equals("U")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.luv);
		}
		else if(type.equals("V")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lvv);
		}
		else if(type.equals("W")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lwv);
		}
		else if(type.equals("X")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lxv);
		}
		else if(type.equals("Y")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lyv);
		}
		else if(type.equals("Z")){
			video1 = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.lzv);
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
			oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.a);
			}
			else if(type.equals("B")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.b);
			}
			else  if(type.equals("C")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.c);
			}
			else  if(type.equals("D")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.d);
			}
			else  if(type.equals("E")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.e);
			}
			else  if(type.equals("F")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.f);
			}
			else  if(type.equals("G")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.g);
			}
			else  if(type.equals("H")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.h);
			}
			else  if(type.equals("I")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.i);
			}
			else  if(type.equals("J")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.j);
			}
			else  if(type.equals("K")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.k);
			}
			else  if(type.equals("L")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.l);
			}
			else  if(type.equals("M")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.m);
			}
			else  if(type.equals("N")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.n);
			}
			else  if(type.equals("O")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.o);
			}
			else  if(type.equals("P")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.p);
			}
			else  if(type.equals("Q")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.q);
			}
			else  if(type.equals("R")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.r);
			}
			else  if(type.equals("S")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.s);
			}
			else  if(type.equals("T")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.t);
			}
			else  if(type.equals("U")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.u);
			}
			else  if(type.equals("V")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.v);
			}
			else  if(type.equals("W")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.w);
			}
			else  if(type.equals("X")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.x);
			}
			else  if(type.equals("Y")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.y);
			}
			else  if(type.equals("Z")){
				oursong = MediaPlayer.create(Show_lowercase_english.this, R.raw.z);
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
