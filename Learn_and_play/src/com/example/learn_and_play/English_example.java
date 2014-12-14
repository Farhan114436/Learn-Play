package com.example.learn_and_play;

import com.example.learn_and_play.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class English_example extends Activity implements AnimationListener {

	ImageButton im1, im2, im3, im4;
	ImageView imv1,imv2,imv3,imv4;
	TextView tv1, tv2, tv3, tv4;
	private static final String TAG_LETTER = "letter";
	String pid,type;
	LinearLayout l1;
	
	// Animation
		Animation animZoomIn;
		Animation animZoomOut;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.example_english);
		im1 = (ImageButton) findViewById(R.id.bt_ex1);
		im2 = (ImageButton) findViewById(R.id.bt_ex2);
		im3 = (ImageButton) findViewById(R.id.bt_ex3);
		im4 = (ImageButton) findViewById(R.id.bt_ex4);
		l1=(LinearLayout)findViewById(R.id.lin1);
		imv1 = (ImageView) findViewById(R.id.imv1);
		imv2 = (ImageView) findViewById(R.id.imv2);
		imv3 = (ImageView) findViewById(R.id.imv3);
		imv4 = (ImageView) findViewById(R.id.imv4);

		tv1 = (TextView) findViewById(R.id.tv1);
		tv2 = (TextView) findViewById(R.id.tv2);
		tv3 = (TextView) findViewById(R.id.tv3);
		tv4 = (TextView) findViewById(R.id.tv4);
		
		// load the animation
		animZoomIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);			
		// set animation listener
		animZoomIn.setAnimationListener(this);
		animZoomOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);
		// set animation listener
		animZoomOut.setAnimationListener(this);
		
		
		Intent i = getIntent();
		// getting product id (pid) from intent
		pid = i.getStringExtra(TAG_LETTER);
		if (pid.equals("A")) {
			type="A";
			im1.setImageResource(R.drawable.airplane);
			tv1.setText("Airplane");
			imv1.setImageResource(R.drawable.airplane);
			im2.setImageResource(R.drawable.alien);
			tv2.setText("Alien");
			imv2.setImageResource(R.drawable.alien);
			im3.setImageResource(R.drawable.apple);
			tv3.setText("Apple");
			imv3.setImageResource(R.drawable.apple);
			im4.setImageResource(R.drawable.ant);
			tv4.setText("Ant");
			imv4.setImageResource(R.drawable.ant);
		}
		else if (pid.equals("B")) {
			type="B";
			im1.setImageResource(R.drawable.ball);
			tv1.setText("Ball");
			im2.setImageResource(R.drawable.bat);
			tv2.setText("Bat");
			im3.setImageResource(R.drawable.bird);
			tv3.setText("Bird");
			im4.setImageResource(R.drawable.bus);
			tv4.setText("Bus");
		}
		else if (pid.equals("C")) {
			type="C";
			im1.setImageResource(R.drawable.car);
			tv1.setText("Car");
			im2.setImageResource(R.drawable.cat);
			tv2.setText("Cat");
			im3.setImageResource(R.drawable.caw);
			tv3.setText("Cow");
			im4.setImageResource(R.drawable.carrot);
			tv4.setText("Carrot");
		}
		else if (pid.equals("D")) {
			type="D";
			im1.setImageResource(R.drawable.deer);
			tv1.setText("Deer");
			im2.setImageResource(R.drawable.dinosor);
			tv2.setText("Dinusaur");
			im3.setImageResource(R.drawable.dog);
			tv3.setText("Dog");
			im4.setImageResource(R.drawable.doll);
			tv4.setText("Doll");
		}
		else if (pid.equals("E")) {
			type="E";
			im1.setImageResource(R.drawable.eat);
			tv1.setText("Eat");
			im2.setImageResource(R.drawable.egg);
			tv2.setText("Egg");
			im3.setImageResource(R.drawable.elephant);
			tv3.setText("Elephant");
			im4.setImageResource(R.drawable.eagle);
			tv4.setText("Eagle");
		}
		else if (pid.equals("F")) {
			type="F";
			im1.setImageResource(R.drawable.father);
			tv1.setText("Father");
			im2.setImageResource(R.drawable.feet);
			tv2.setText("Feet");
			im3.setImageResource(R.drawable.fish);
			tv3.setText("Fish");
			im4.setImageResource(R.drawable.fox);
			tv4.setText("Fox");
		}
		else if (pid.equals("G")) {
			type="G";
			im1.setImageResource(R.drawable.ghost);
			tv1.setText("Ghost");
			im2.setImageResource(R.drawable.goat);
			tv2.setText("Goat");
			im3.setImageResource(R.drawable.gold);
			tv3.setText("Gold");
			im4.setImageResource(R.drawable.goose);
			tv4.setText("Goose");
		}
		else if (pid.equals("H")) {
			type="H";
			im1.setImageResource(R.drawable.hat);
			tv1.setText("Hat");
			im2.setImageResource(R.drawable.horse);
			tv2.setText("Horse");
			im3.setImageResource(R.drawable.house);
			tv3.setText("House");
			im4.setImageResource(R.drawable.hawk);
			tv4.setText("Hawk");
		}
		else if (pid.equals("I")) {
			type="I";
			im1.setImageResource(R.drawable.insect);
			tv1.setText("Insect");
			im2.setImageResource(R.drawable.ice);
			tv2.setText("Ice");
			im3.setImageResource(R.drawable.ink);
			tv3.setText("Ink");
			im4.setImageResource(R.drawable.ivy);
			tv4.setText("Ivy");
		}
		else if (pid.equals("J")) {
			type="J";
			im1.setImageResource(R.drawable.jacket);
			tv1.setText("Jacket");
			im2.setImageResource(R.drawable.jar);
			tv2.setText("Jar");
			im3.setImageResource(R.drawable.jeep);
			tv3.setText("Jeep");
			im4.setImageResource(R.drawable.jet);
			tv4.setText("Jet");
		}
		else if (pid.equals("K")) {
			type="K";
			im1.setImageResource(R.drawable.kangaroo);
			tv1.setText("Kangaroo");
			im2.setImageResource(R.drawable.kite);
			tv2.setText("Kite");
			im3.setImageResource(R.drawable.kid);
			tv3.setText("Kid");
			im4.setImageResource(R.drawable.king);
			tv4.setText("King");
		}
		else if (pid.equals("L")) {
			type="L";
			im1.setImageResource(R.drawable.laugh);
			tv1.setText("Laugh");
			im2.setImageResource(R.drawable.leaf);
			tv2.setText("Leaf");
			im3.setImageResource(R.drawable.leg);
			tv3.setText("Leg");
			im4.setImageResource(R.drawable.light);
			tv4.setText("Light");
		}
		else if (pid.equals("M")) {
			type="M";
			im1.setImageResource(R.drawable.mask);
			tv1.setText("Mask");
			im2.setImageResource(R.drawable.milk);
			tv2.setText("Milk");
			im3.setImageResource(R.drawable.moon);
			tv3.setText("Moon");
			im4.setImageResource(R.drawable.mouse);
			tv4.setText("Mouse");
		}
		else if (pid.equals("N")) {
			type="N";
			im1.setImageResource(R.drawable.net);
			tv1.setText("Net");
			im2.setImageResource(R.drawable.night);
			tv2.setText("Night");
			im3.setImageResource(R.drawable.nose);
			tv3.setText("Nose");
			im4.setImageResource(R.drawable.nap);
			tv4.setText("Nap");
		}
		else if (pid.equals("O")) {
			type="O";
			im1.setImageResource(R.drawable.ocean);
			tv1.setText("Ocean");
			im2.setImageResource(R.drawable.octopus);
			tv2.setText("Octopus");
			im3.setImageResource(R.drawable.ostrich);
			tv3.setText("Ostrich");
			im4.setImageResource(R.drawable.ox);
			tv4.setText("Ox");
		}
		else if (pid.equals("P")) {
			type="P";
			im1.setImageResource(R.drawable.paint);
			tv1.setText("Paint");
			im2.setImageResource(R.drawable.paper);
			tv2.setText("Paper");
			im3.setImageResource(R.drawable.pie);
			tv3.setText("Pie");
			im4.setImageResource(R.drawable.pig);
			tv4.setText("Pig");
		}
		else if (pid.equals("Q")) {
			type="Q";
			im1.setImageResource(R.drawable.queen);
			tv1.setText("Queen");
			im2.setImageResource(R.drawable.quiet);
			tv2.setText("Quiet");
			im3.setImageResource(R.drawable.quarrel);
			tv3.setText("Quarrel");
			im4.setImageResource(R.drawable.quail);
			tv4.setText("Quail");
		}
		else if (pid.equals("R")) {
			type="R";
			im1.setImageResource(R.drawable.rabbit);
			tv1.setText("Rabbit");
			im2.setImageResource(R.drawable.river);
			tv2.setText("River");
			im3.setImageResource(R.drawable.rose);
			tv3.setText("Rose");
			im4.setImageResource(R.drawable.rhino);
			tv4.setText("Rhino");
		}
		else if (pid.equals("S")) {
			type="S";
			im1.setImageResource(R.drawable.sad);
			tv1.setText("Sad");
			im2.setImageResource(R.drawable.sing);
			tv2.setText("Sing");
			im3.setImageResource(R.drawable.sock);
			tv3.setText("Sock");
			im4.setImageResource(R.drawable.sun);
			tv4.setText("Sun");
		}
		else if (pid.equals("T")) {
			type="T";
			im1.setImageResource(R.drawable.tall);
			tv1.setText("Tall");
			im2.setImageResource(R.drawable.tea);
			tv2.setText("Tea");
			im3.setImageResource(R.drawable.town);
			tv3.setText("Town");
			im4.setImageResource(R.drawable.tulip);
			tv4.setText("Tulip");
		}
		else if (pid.equals("U")) {
			type="U";
			im1.setImageResource(R.drawable.ugly);
			tv1.setText("Ugly");
			im2.setImageResource(R.drawable.umbrella);
			tv2.setText("Umbrella");
			im3.setImageResource(R.drawable.uncle);
			tv3.setText("Uncle");
			im4.setImageResource(R.drawable.unicorn);
			tv4.setText("Unicorn");
		}
		else if (pid.equals("V")) {
			type="V";
			im1.setImageResource(R.drawable.van);
			tv1.setText("Van");
			im2.setImageResource(R.drawable.vulture);
			tv2.setText("Vulture");
			im3.setImageResource(R.drawable.violin);
			tv3.setText("Violin");
			im4.setImageResource(R.drawable.volcano);
			tv4.setText("Volcano");
		}
		else if (pid.equals("W")) {
			type="W";
			im1.setImageResource(R.drawable.wall);
			tv1.setText("Wall");
			im2.setImageResource(R.drawable.wallet);
			tv2.setText("Wallet");
			im3.setImageResource(R.drawable.web);
			tv3.setText("Web");
			im4.setImageResource(R.drawable.wind);
			tv4.setText("Wind");
		}
		else if (pid.equals("X")) {
			type="X";
			im1.setImageResource(R.drawable.xenops);
			tv1.setText("Xenops");
			im2.setImageResource(R.drawable.xylophone);
			tv2.setText("Xylophone");
			im3.setImageResource(R.drawable.ax);
			tv3.setText("Ax");
			im4.setImageResource(R.drawable.box);
			tv4.setText("Box");
		}
		else if (pid.equals("Y")) {
			type="Y";
			im1.setImageResource(R.drawable.yak);
			tv1.setText("Yak");
			im2.setImageResource(R.drawable.yard);
			tv2.setText("Yard");
			im3.setImageResource(R.drawable.year);
			tv3.setText("Year");
			im4.setImageResource(R.drawable.yacht);
			tv4.setText("Yacht");
		}
		else if (pid.equals("Z")) {
			type="Z";
			im1.setImageResource(R.drawable.zebra);
			tv1.setText("Zebra");
			im2.setImageResource(R.drawable.zigzag);
			tv2.setText("Zigzag");
			im3.setImageResource(R.drawable.zinia);
			tv3.setText("Zinia");
			im4.setImageResource(R.drawable.zoo);
			tv4.setText("Zoo");
		}
		
		// button click event
			im1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
			// start the animation
				l1.setVisibility(0);
				imv1.setVisibility(0);
				imv1.startAnimation(animZoomIn);
				}
			});
			
			im2.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
				// start the animation
					l1.setVisibility(0);
					imv2.setVisibility(0);
					imv2.startAnimation(animZoomIn);
					}
				});
			im3.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
				// start the animation
					l1.setVisibility(0);
					imv3.setVisibility(0);
					imv3.startAnimation(animZoomIn);
					}
				});
			
			im4.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
				// start the animation
					l1.setVisibility(0);
					imv4.setVisibility(0);
					imv4.startAnimation(animZoomIn);
					}
				});
			
	}
	
	@Override
	public void onAnimationEnd(Animation animation) {
		// Take any action after completing the animation

		// check for zoom in animation
		if (animation == animZoomIn) {
			// button click event
			imv1.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					// start animation
					imv1.startAnimation(animZoomOut);
				}
			});
			imv2.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					// start animation
					imv2.startAnimation(animZoomOut);
				}
			});
			imv3.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					// start animation
					imv3.startAnimation(animZoomOut);
				}
			});
			imv4.setOnClickListener(new View.OnClickListener() {

				@Override
				public void onClick(View v) {
					// start animation
					imv4.startAnimation(animZoomOut);
				}
			});		
		
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
