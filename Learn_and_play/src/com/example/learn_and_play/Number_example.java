package com.example.learn_and_play;

import com.example.learn_and_play.R;

import android.R.color;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Number_example extends Activity implements AnimationListener{
	
	private static final String TAG_LETTER = "letter";
	ImageButton im1,im2,im3;
	String pid,type;
	// Animation
	Animation animMove,animMove2,animMove3;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.example_numbers);
		im1=(ImageButton)findViewById(R.id.bt_1);
		im2=(ImageButton)findViewById(R.id.bt_2);
		im3=(ImageButton)findViewById(R.id.bt_3);
		
		
		animMove = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
		animMove.setAnimationListener(this);
		animMove2 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move2);
		animMove2.setAnimationListener(this);
		animMove3 = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move3);
		animMove3.setAnimationListener(this);
		
	    Intent i = getIntent();
			// getting product id (pid) from intent
		 pid = i.getStringExtra(TAG_LETTER);
		 if(pid.equals("1")){
			 type="1";
			 im1.setImageResource(R.drawable.onep);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.onew);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.onep2);
			 im3.startAnimation(animMove3);
	        }
		 else if(pid.equals("2")){
			 type="2";
			 im1.setImageResource(R.drawable.twop);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.twow);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.twop2);
			 im3.startAnimation(animMove3);
	        }
		 else if(pid.equals("3")){
			 type="3";
			 im1.setImageResource(R.drawable.threep);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.threew);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.threep2);
			 im3.startAnimation(animMove3);
	        }
		 else if(pid.equals("4")){
			 type="4";
			 im1.setImageResource(R.drawable.fourp);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.fourw);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.fourp2);
			 im3.startAnimation(animMove3);
	        }
		 else if(pid.equals("5")){
			 type="5";
			 im1.setImageResource(R.drawable.fivep);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.fivew);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.fivep2);
			 im3.startAnimation(animMove3);
	        }
		 else if(pid.equals("6")){
			 type="6";
			 im1.setImageResource(R.drawable.sixp);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.sixw);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.sixp2);
			 im3.startAnimation(animMove3);
	        }
		 else if(pid.equals("7")){
			 type="7";
			 im1.setImageResource(R.drawable.sevenp);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.sevenw);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.sevenp2);
			 im3.startAnimation(animMove3);
	        }
		 else if(pid.equals("8")){
			 type="8";
			 im1.setImageResource(R.drawable.eightp);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.eightw);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.eightp2);
			 im3.startAnimation(animMove3);
	        }
		 else if(pid.equals("9")){
			 type="9";
			 im1.setImageResource(R.drawable.ninep);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.ninew);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.ninep2);
			 im3.startAnimation(animMove3);
	        }
		 else if(pid.equals("10")){
			 type="10";
			 im1.setImageResource(R.drawable.tenp);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.tenw);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.tenp2);
			 im3.startAnimation(animMove3);
	        }
		 else if(pid.equals("11")){
			 type="11";
			 im1.setImageResource(R.drawable.elevenp);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.elevenw);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.elevenp2);
			 im3.startAnimation(animMove3);
	        }
		 else if(pid.equals("12")){
			 type="12";
			 im1.setImageResource(R.drawable.twelvep);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.twelvew);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.twelvep2);
			 im3.startAnimation(animMove3);
	        }
		 else if(pid.equals("13")){
			 type="13";
			 im1.setImageResource(R.drawable.thirteenp);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.thirteenw);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.thirteenp2);
			 im3.startAnimation(animMove3);
	        }
		 else if(pid.equals("14")){
			 type="14";
			 im1.setImageResource(R.drawable.fourteenp);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.fourteenw);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.fourteenp2);
			 im3.startAnimation(animMove3);
	        }
		 else if(pid.equals("15")){
			 type="15";
			 im1.setImageResource(R.drawable.fifteenp);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.fifteenw);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.fifteenp2);
			 im3.startAnimation(animMove3);
	        }
		 else if(pid.equals("16")){
			 type="16";
			 im1.setImageResource(R.drawable.sixteenp);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.sixteenw);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.sixteenp2);
			 im3.startAnimation(animMove3);
	        }
		 else if(pid.equals("17")){
			 type="17";
			 im1.setImageResource(R.drawable.seventeenp);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.seventeenw);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.seventeenp2);
			 im3.startAnimation(animMove3);
	        }
		 else if(pid.equals("18")){
			 type="18";
			 im1.setImageResource(R.drawable.eighteenp);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.eighteenw);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.eighteenp2);
			 im3.startAnimation(animMove3);
	        }
		 else if(pid.equals("19")){
			 type="19";
			 im1.setImageResource(R.drawable.nineteenp);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.nineteenw);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.nineteenp2);
			 im3.startAnimation(animMove3);
	        }
		 else if(pid.equals("20")){
			 type="10";
			 im1.setImageResource(R.drawable.twentyp);
			 im1.startAnimation(animMove);
			 im2.setImageResource(R.drawable.twentyw);
			 im2.startAnimation(animMove2);
			 im3.setImageResource(R.drawable.twentyp2);
			 im3.startAnimation(animMove3);
	        }
		 
		 im1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					  // Create custom dialog object
	                final Dialog dialog = new Dialog(Number_example.this);
	                // Include dialog.xml file
	                dialog.setContentView(R.layout.dialog);
	                // Set dialog title
	                dialog.setTitle("Numbers");
	 
	                // set values for custom dialog components - text, image and button
	                TextView text = (TextView) dialog.findViewById(R.id.textDialog);
	                if(type.equals("1")){
	                	text.setText("One (1) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                else if(type.equals("2")){
	                	text.setText("two (2) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                else if(type.equals("3")){
	                	text.setText("three (3) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                else if(type.equals("4")){
	                	text.setText("four (4) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                else if(type.equals("5")){
	                	text.setText("five (5) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                else if(type.equals("6")){
	                	text.setText("six (6) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                else if(type.equals("7")){
	                	text.setText("seven (7) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                else if(type.equals("8")){
	                	text.setText("eight (8) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                else if(type.equals("9")){
	                	text.setText("nine (9) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                else if(type.equals("10")){
	                	text.setText("ten (10) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                else if(type.equals("11")){
	                	text.setText("eleven (11) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                else if(type.equals("12")){
	                	text.setText("twelve (12) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                else if(type.equals("13")){
	                	text.setText("thirteen (13) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                else if(type.equals("14")){
	                	text.setText("fourteen (14) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                else if(type.equals("15")){
	                	text.setText("fifteen (15) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                else if(type.equals("16")){
	                	text.setText("sixteen (16) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                else if(type.equals("17")){
	                	text.setText("seventeen (17) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                else if(type.equals("18")){
	                	text.setText("eighteen (18) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                else if(type.equals("19")){
	                	text.setText("nineteen (19) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                else if(type.equals("20")){
	                	text.setText("twenty (20) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_purple);
	                }
	                
	                ImageView image = (ImageView) dialog.findViewById(R.id.imageDialog);
	                image.setImageResource(R.drawable.sun);
	 
	                dialog.show();
	                 
	                Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
	                // if decline button is clicked, close the custom dialog
	                declineButton.setOnClickListener(new View.OnClickListener() {
	                    @Override
	                    public void onClick(View v) {
	                        // Close dialog
	                        dialog.dismiss();
	                    }
	                });
	 
	                 
	            }
	 
	        });

		 im3.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					  // Create custom dialog object
	                final Dialog dialog = new Dialog(Number_example.this);
	                // Include dialog.xml file
	                dialog.setContentView(R.layout.dialog);
	                // Set dialog title
	                dialog.setTitle("Numbers");
	 
	                // set values for custom dialog components - text, image and button
	                TextView text = (TextView) dialog.findViewById(R.id.textDialog);
	                if(type.equals("1")){
	                	text.setText("One (1) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                else if(type.equals("2")){
	                	text.setText("two (2) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                else if(type.equals("3")){
	                	text.setText("three (3) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                else if(type.equals("4")){
	                	text.setText("four (4) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                else if(type.equals("5")){
	                	text.setText("five (5) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                else if(type.equals("6")){
	                	text.setText("six (6) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                else if(type.equals("7")){
	                	text.setText("seven (7) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                else if(type.equals("8")){
	                	text.setText("eight (8) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                else if(type.equals("9")){
	                	text.setText("nine (9) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                else if(type.equals("10")){
	                	text.setText("ten (10) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                else if(type.equals("11")){
	                	text.setText("eleven (11) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                else if(type.equals("12")){
	                	text.setText("twelve (12) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                else if(type.equals("13")){
	                	text.setText("thirteen (13) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                else if(type.equals("14")){
	                	text.setText("fourteen (14) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                else if(type.equals("15")){
	                	text.setText("fifteen (15) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                else if(type.equals("16")){
	                	text.setText("sixteen (16) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                else if(type.equals("17")){
	                	text.setText("seventeen (17) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                else if(type.equals("18")){
	                	text.setText("eighteen (18) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                else if(type.equals("19")){
	                	text.setText("nineteen (19) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                else if(type.equals("20")){
	                	text.setText("twenty (20) Items");
	                	text.setGravity(Gravity.CENTER);
	                	text.setBackgroundColor(color.holo_green_light);
	                }
	                ImageView image = (ImageView) dialog.findViewById(R.id.imageDialog);
	                image.setImageResource(R.drawable.sun);
	 
	                dialog.show();
	                 
	                Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
	                // if decline button is clicked, close the custom dialog
	                declineButton.setOnClickListener(new View.OnClickListener() {
	                    @Override
	                    public void onClick(View v) {
	                        // Close dialog
	                        dialog.dismiss();
	                    }
	                });
	 
	                 
	            }
	 
	        });
	}

	@Override
	public void onAnimationEnd(Animation animation) {
		// Take any action after completing the animation

		// check for zoom in animation
		if (animation == animMove) {
		}

	}

	@Override
	public void onAnimationRepeat(Animation animation) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onAnimationStart(Animation animation) {
		// TODO Auto-generated method stub

	}

	
}
