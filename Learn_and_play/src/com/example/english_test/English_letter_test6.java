package com.example.english_test;

import java.util.HashMap;
import java.util.Map;
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

public class English_letter_test6 extends Activity implements OnClickListener{
	private static final String TAG_PID = "pid";
	ImageView im;
	int randomstring,id,key;
	EditText et1,et2,et3,et4,et5,et6;
	String pid,type,thing,input;
	Button bt;
	String s1,s2,s3,s4,s5,s6;
	MediaPlayer oursong,oursong2;
	int count,len;
	int t1,t2,t3,t4,t5,t6;
	private static int[] stra ={R.drawable.airplane,R.drawable.aligator,R.drawable.alien,R.drawable.ankle,R.drawable.ant,R.drawable.apple,R.drawable.ax};
	private static int[] strb ={R.drawable.ball,R.drawable.bat,R.drawable.bird,R.drawable.boat,R.drawable.book,R.drawable.box,R.drawable.bus};
	private static int[] strc ={R.drawable.car,R.drawable.carrot,R.drawable.cat,R.drawable.caw};
	private static int[] strd ={R.drawable.deer,R.drawable.dinosor,R.drawable.dog,R.drawable.doll};
	private static int[] stre ={R.drawable.eagle,R.drawable.eat,R.drawable.egg,R.drawable.elephant};
	private static int[] strf ={R.drawable.father,R.drawable.feet,R.drawable.finger,R.drawable.fish,R.drawable.food,R.drawable.fox};
	private static int[] strg ={R.drawable.ghost,R.drawable.goat,R.drawable.gold,R.drawable.goose};
	private static int[] strh ={R.drawable.hat,R.drawable.hawk,R.drawable.head,R.drawable.horse,R.drawable.house};
	private static int[] stri ={R.drawable.ice,R.drawable.ink,R.drawable.insect,R.drawable.ivy};
	private static int[] strj ={R.drawable.jacket,R.drawable.jar,R.drawable.jeep,R.drawable.jet};
	private static int[] strk ={R.drawable.kangaroo,R.drawable.key,R.drawable.kid,R.drawable.king,R.drawable.kite};
	private static int[] strl ={R.drawable.laugh,R.drawable.leaf,R.drawable.leg,R.drawable.light};
	private static int[] strm ={R.drawable.mask,R.drawable.milk,R.drawable.moon,R.drawable.mouse};
	private static int[] strn ={R.drawable.nap,R.drawable.net,R.drawable.night,R.drawable.nose};
	private static int[] stro ={R.drawable.ocean,R.drawable.octopus,R.drawable.ostrich,R.drawable.ox};
	private static int[] strp ={R.drawable.paint,R.drawable.paper,R.drawable.pie,R.drawable.pig};
	private static int[] strq ={R.drawable.quail,R.drawable.quarrel,R.drawable.queen,R.drawable.quiet};
	private static int[] strr ={R.drawable.rabbit,R.drawable.rain,R.drawable.rhino,R.drawable.river,R.drawable.rose};
	private static int[] strs ={R.drawable.sad,R.drawable.sing,R.drawable.sock,R.drawable.sun};
	private static int[] strt ={R.drawable.tall,R.drawable.tea,R.drawable.town,R.drawable.tulip};
	private static int[] stru ={R.drawable.ugly,R.drawable.umbrella,R.drawable.uncle,R.drawable.unicorn};
	private static int[] strv ={R.drawable.van,R.drawable.violin,R.drawable.volcano,R.drawable.vulture};
	private static int[] strw ={R.drawable.wall,R.drawable.wallet,R.drawable.web,R.drawable.wind};
	private static int[] strx ={R.drawable.xenops,R.drawable.xylophone};
	private static int[] stry ={R.drawable.yacht,R.drawable.yak,R.drawable.yard,R.drawable.year};
	private static int[] strz ={R.drawable.zebra,R.drawable.zigzag,R.drawable.zinia,R.drawable.zoo};
	
	Map<Integer,String> amap = new HashMap<Integer,String>();
	Map<Integer,String> bmap = new HashMap<Integer,String>();
	Map<Integer,String> cmap = new HashMap<Integer,String>();
	Map<Integer,String> dmap = new HashMap<Integer,String>();
	Map<Integer,String> emap = new HashMap<Integer,String>();
	Map<Integer,String> fmap = new HashMap<Integer,String>();
	Map<Integer,String> gmap = new HashMap<Integer,String>();
	Map<Integer,String> hmap = new HashMap<Integer,String>();
	Map<Integer,String> imap = new HashMap<Integer,String>();
	Map<Integer,String> jmap = new HashMap<Integer,String>();
	Map<Integer,String> kmap = new HashMap<Integer,String>();
	Map<Integer,String> lmap = new HashMap<Integer,String>();
	Map<Integer,String> mmap = new HashMap<Integer,String>();
	Map<Integer,String> nmap = new HashMap<Integer,String>();
	Map<Integer,String> omap = new HashMap<Integer,String>();
	Map<Integer,String> pmap = new HashMap<Integer,String>();
	Map<Integer,String> qmap = new HashMap<Integer,String>();
	Map<Integer,String> rmap = new HashMap<Integer,String>();
	Map<Integer,String> smap = new HashMap<Integer,String>();
	Map<Integer,String> tmap = new HashMap<Integer,String>();
	Map<Integer,String> umap = new HashMap<Integer,String>();
	Map<Integer,String> vmap = new HashMap<Integer,String>();
	Map<Integer,String> wmap = new HashMap<Integer,String>();
	Map<Integer,String> xmap = new HashMap<Integer,String>();
	Map<Integer,String> ymap = new HashMap<Integer,String>();
	Map<Integer,String> zmap = new HashMap<Integer,String>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.eng_letter_test_5);
		im=(ImageView)findViewById(R.id.imv);
		et1=(EditText)findViewById(R.id.et_1);
		et2=(EditText)findViewById(R.id.et_2);
		et3=(EditText)findViewById(R.id.et_3);
		et4=(EditText)findViewById(R.id.et_4);
		et5=(EditText)findViewById(R.id.et_5);
		et6=(EditText)findViewById(R.id.et_6);
		bt=(Button)findViewById(R.id.hint);
		t1=t2=t3=t4=t5=t6=0;
		oursong = MediaPlayer.create(English_letter_test6.this, R.raw.correct); 
		oursong2 = MediaPlayer.create(English_letter_test6.this, R.raw.wrong); 
		count=0;
		amap.put(R.drawable.alien, "Alien");
		amap.put(R.drawable.airplane, "Plane");
		amap.put(R.drawable.ankle, "Ankle");
		amap.put(R.drawable.ant, "Ant");
		amap.put(R.drawable.apple, "Apple");
		amap.put(R.drawable.ax, "Ax");
		
		bmap.put(R.drawable.ball, "Ball");
		bmap.put(R.drawable.bat, "Bat");
		bmap.put(R.drawable.bird, "Bird");
		bmap.put(R.drawable.boat, "Boat");
		bmap.put(R.drawable.book, "Book");
		bmap.put(R.drawable.box, "Box");
		bmap.put(R.drawable.bus, "Bus");
		
		cmap.put(R.drawable.car, "Car");
		cmap.put(R.drawable.carrot, "Carrot");
		cmap.put(R.drawable.cat, "Cat");
		cmap.put(R.drawable.caw, "Cow");
		
		dmap.put(R.drawable.deer, "Deer");
		dmap.put(R.drawable.dog, "Dog");
		dmap.put(R.drawable.doll, "Doll");
		
		emap.put(R.drawable.eagle, "Eagle");
		emap.put(R.drawable.eat, "Eat");
		emap.put(R.drawable.egg, "Egg");
		
		fmap.put(R.drawable.father, "Father");
		fmap.put(R.drawable.feet, "Feet");
		fmap.put(R.drawable.finger, "Finger");
		fmap.put(R.drawable.fish, "Fish");
		fmap.put(R.drawable.food, "Food");
		fmap.put(R.drawable.fox, "Fox");
		
		gmap.put(R.drawable.ghost, "Ghost");
		gmap.put(R.drawable.goat, "Goat");
		gmap.put(R.drawable.gold, "Gold");
		gmap.put(R.drawable.goose, "Goose");
		
		hmap.put(R.drawable.hat, "Hat");
		hmap.put(R.drawable.hawk, "Hawk");
		hmap.put(R.drawable.head, "Head");
		hmap.put(R.drawable.horse, "Horse");
		hmap.put(R.drawable.house, "House");
		
		imap.put(R.drawable.ice, "Ice");
		imap.put(R.drawable.ink, "Ink");
		imap.put(R.drawable.ivy, "Ivy");
		imap.put(R.drawable.insect, "Insect");
		
		jmap.put(R.drawable.jacket, "Jacket");
		jmap.put(R.drawable.jar, "Jar");
		jmap.put(R.drawable.jeep, "Jeep");
		jmap.put(R.drawable.jet, "Jet");
		
		kmap.put(R.drawable.key, "Key");
		kmap.put(R.drawable.kid, "Kid");
		kmap.put(R.drawable.king, "king");
		kmap.put(R.drawable.kite, "Kite");
		
		lmap.put(R.drawable.laugh, "Laugh");
		lmap.put(R.drawable.leaf, "Leaf");
		lmap.put(R.drawable.leg, "Leg");
		lmap.put(R.drawable.light, "Light");
		
		mmap.put(R.drawable.mask, "Mask");
		mmap.put(R.drawable.milk, "Milk");
		mmap.put(R.drawable.moon, "Moon");
		mmap.put(R.drawable.mouse, "Mouse");
		
		nmap.put(R.drawable.nap, "Nap");
		nmap.put(R.drawable.net, "Net");
		nmap.put(R.drawable.night, "Night");
		nmap.put(R.drawable.nose, "Nose");
		
		omap.put(R.drawable.ocean, "Ocean");
		omap.put(R.drawable.ox, "Ox");
		
		pmap.put(R.drawable.paint, "Paint");
		pmap.put(R.drawable.paper, "Paper");
		pmap.put(R.drawable.pie, "Pie");
		pmap.put(R.drawable.pig, "Pig");
		
		qmap.put(R.drawable.quail, "Quail");
		qmap.put(R.drawable.queen, "Queen");
		qmap.put(R.drawable.quiet, "Quiet");
		
		rmap.put(R.drawable.rabbit, "Rabbit");
		rmap.put(R.drawable.rain, "Rain");
		rmap.put(R.drawable.rhino, "Rhino");
		rmap.put(R.drawable.river, "River");
		rmap.put(R.drawable.rose, "Rose");
		
		smap.put(R.drawable.sad, "Sad");
		smap.put(R.drawable.sing, "Sing");
		smap.put(R.drawable.sock, "Sock");
		smap.put(R.drawable.sun, "Sun");
		
		tmap.put(R.drawable.tall, "Tall");
		tmap.put(R.drawable.tea, "Tea");
		tmap.put(R.drawable.town, "Town");
		tmap.put(R.drawable.tulip, "Tulip");
		
		umap.put(R.drawable.ugly, "Ugly");
		umap.put(R.drawable.uncle, "Uncle");
		
		vmap.put(R.drawable.van, "Van");
		vmap.put(R.drawable.violin, "Violin");
		
		wmap.put(R.drawable.wall, "Wall");
		wmap.put(R.drawable.wallet, "Wallet");
		wmap.put(R.drawable.web, "Web");
		wmap.put(R.drawable.wind, "Wind");
		
		xmap.put(R.drawable.xenops, "Xenops");
		
		ymap.put(R.drawable.yak, "Yak");
		ymap.put(R.drawable.yacht, "Yacht");
		ymap.put(R.drawable.year, "Year");
		ymap.put(R.drawable.yard, "Yard");
		
		zmap.put(R.drawable.zebra, "Zebra");
		zmap.put(R.drawable.zoo, "Zoo");
		zmap.put(R.drawable.zinia, "Zinia");
		zmap.put(R.drawable.zigzag, "Zigzag");
		
		Intent i = getIntent();
			// getting product id (pid) from intent
		pid = i.getStringExtra(TAG_PID);
		if(pid.equals("A")){
			type="1";
			randomstring = stra[new Random().nextInt(stra.length)];
		}
		else if(pid.equals("B")){
			type="2";
			randomstring = strb[new Random().nextInt(strb.length)];
		}
		else if(pid.equals("C")){
			type="3";
			randomstring = strc[new Random().nextInt(strc.length)];
		}
		else if(pid.equals("D")){
			type="4";
			randomstring = strd[new Random().nextInt(strd.length)];
		}
		else if(pid.equals("E")){
			type="5";
			randomstring = stre[new Random().nextInt(stre.length)];
		}
		else if(pid.equals("F")){
			type="6";
			randomstring = strf[new Random().nextInt(strf.length)];
		}
		else if(pid.equals("G")){
			type="7";
			randomstring = strg[new Random().nextInt(strg.length)];
		}
		else if(pid.equals("H")){
			type="8";
			randomstring = strh[new Random().nextInt(strh.length)];
		}
		else if(pid.equals("I")){
			type="9";
			randomstring = stri[new Random().nextInt(stri.length)];
		}
		else if(pid.equals("J")){
			type="10";
			randomstring = strj[new Random().nextInt(strj.length)];
		}
		else if(pid.equals("K")){
			type="11";
			randomstring = strk[new Random().nextInt(strk.length)];
		}
		else if(pid.equals("L")){
			type="12";
			randomstring = strl[new Random().nextInt(strl.length)];
		}
		else if(pid.equals("M")){
			type="13";
			randomstring = strm[new Random().nextInt(strm.length)];
		}
		else if(pid.equals("N")){
			type="14";
			randomstring = strn[new Random().nextInt(strn.length)];
		}
		else if(pid.equals("O")){
			type="15";
			randomstring = stro[new Random().nextInt(stro.length)];
		}
		else if(pid.equals("P")){
			type="16";
			randomstring = strp[new Random().nextInt(strp.length)];
		}
		else if(pid.equals("Q")){
			type="17";
			randomstring = strq[new Random().nextInt(strq.length)];
		}
		else if(pid.equals("R")){
			type="18";
			randomstring = strr[new Random().nextInt(strr.length)];
		}
		else if(pid.equals("S")){
			type="19";
			randomstring = strs[new Random().nextInt(strs.length)];
		}
		else if(pid.equals("T")){
			type="20";
			randomstring = strt[new Random().nextInt(strt.length)];
		}
		else if(pid.equals("U")){
			type="21";
			randomstring = stru[new Random().nextInt(stru.length)];
		}
		else if(pid.equals("V")){
			type="22";
			randomstring = strv[new Random().nextInt(strv.length)];
		}
		else if(pid.equals("W")){
			type="23";
			randomstring = strw[new Random().nextInt(strw.length)];
		}
		else if(pid.equals("X")){
			type="24";
			randomstring = strx[new Random().nextInt(strx.length)];
		}
		else if(pid.equals("Y")){
			type="25";
			randomstring = stry[new Random().nextInt(stry.length)];
		}
		else if(pid.equals("Z")){
			type="26";
			randomstring = strz[new Random().nextInt(strz.length)];
		}
		im.setImageResource(randomstring);
		id=randomstring;
		
		if(type.equals("1")){
			for (Map.Entry<Integer,String> entry : amap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("2")){
			for (Map.Entry<Integer,String> entry : bmap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("3")){
			for (Map.Entry<Integer,String> entry : cmap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("4")){
			for (Map.Entry<Integer,String> entry : dmap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("5")){
			for (Map.Entry<Integer,String> entry : emap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("6")){
			for (Map.Entry<Integer,String> entry : fmap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("7")){
			for (Map.Entry<Integer,String> entry : gmap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("8")){
			for (Map.Entry<Integer,String> entry : hmap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("9")){
			for (Map.Entry<Integer,String> entry : imap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("10")){
			for (Map.Entry<Integer,String> entry : jmap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("11")){
			for (Map.Entry<Integer,String> entry : kmap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("12")){
			for (Map.Entry<Integer,String> entry : lmap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("13")){
			for (Map.Entry<Integer,String> entry : mmap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("14")){
			for (Map.Entry<Integer,String> entry : nmap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("15")){
			for (Map.Entry<Integer,String> entry : omap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("16")){
			for (Map.Entry<Integer,String> entry : pmap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("17")){
			for (Map.Entry<Integer,String> entry : qmap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("18")){
			for (Map.Entry<Integer,String> entry : rmap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("19")){
			for (Map.Entry<Integer,String> entry : smap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("20")){
			for (Map.Entry<Integer,String> entry : tmap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("21")){
			for (Map.Entry<Integer,String> entry : umap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("22")){
			for (Map.Entry<Integer,String> entry : vmap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("23")){
			for (Map.Entry<Integer,String> entry : wmap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("24")){
			for (Map.Entry<Integer,String> entry : xmap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("25")){
			for (Map.Entry<Integer,String> entry : ymap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		else if(type.equals("26")){
			for (Map.Entry<Integer,String> entry : zmap.entrySet()) {
			    key = entry.getKey();
			    thing = entry.getValue();
			    if(key==id){
			    	break;
			    }
			}
		}
		Toast.makeText(getApplicationContext(), thing, Toast.LENGTH_LONG).show();
		et1.setOnClickListener(this);
		et2.setOnClickListener(this);
		et3.setOnClickListener(this);
		et4.setOnClickListener(this);
		et5.setOnClickListener(this);
		et6.setOnClickListener(this);
		bt.setOnClickListener(this);
	    len=thing.length();
		if(len==2){
			et1.setVisibility(View.GONE);
			et2.setVisibility(View.GONE);
			et5.setVisibility(View.GONE);
			et6.setVisibility(View.GONE);
			et3.setVisibility(View.VISIBLE);
			et4.setVisibility(View.VISIBLE);
			s3=String.valueOf(thing.charAt(0));
			s4=String.valueOf(thing.charAt(1));
		}
		else if(len==3){
			et1.setVisibility(View.GONE);
			et2.setVisibility(View.VISIBLE);
			et5.setVisibility(View.GONE);
			et6.setVisibility(View.GONE);
			et3.setVisibility(View.VISIBLE);
			et4.setVisibility(View.VISIBLE);
			s2=String.valueOf(thing.charAt(0));
			s3=String.valueOf(thing.charAt(1));
			s4=String.valueOf(thing.charAt(2));
		}
		else if(len==4){
			et1.setVisibility(View.GONE);
			et2.setVisibility(View.VISIBLE);
			et5.setVisibility(View.VISIBLE);
			et6.setVisibility(View.GONE);
			et3.setVisibility(View.VISIBLE);
			et4.setVisibility(View.VISIBLE);
			s2=String.valueOf(thing.charAt(0));
			s3=String.valueOf(thing.charAt(1));
			s4=String.valueOf(thing.charAt(2));
			s5=String.valueOf(thing.charAt(3));
		}
		else if(len==5){
			et1.setVisibility(View.VISIBLE);
			et2.setVisibility(View.VISIBLE);
			et5.setVisibility(View.VISIBLE);
			et6.setVisibility(View.GONE);
			et3.setVisibility(View.VISIBLE);
			et4.setVisibility(View.VISIBLE);
			s1=String.valueOf(thing.charAt(0));
			s2=String.valueOf(thing.charAt(1));
			s3=String.valueOf(thing.charAt(2));
			s4=String.valueOf(thing.charAt(3));
			s5=String.valueOf(thing.charAt(4));
		}
		else if(len==6){
			et1.setVisibility(View.VISIBLE);
			et2.setVisibility(View.VISIBLE);
			et5.setVisibility(View.VISIBLE);
			et6.setVisibility(View.VISIBLE);
			et3.setVisibility(View.VISIBLE);
			et4.setVisibility(View.VISIBLE);
			s1=String.valueOf(thing.charAt(0));
			s2=String.valueOf(thing.charAt(1));
			s3=String.valueOf(thing.charAt(2));
			s4=String.valueOf(thing.charAt(3));
			s5=String.valueOf(thing.charAt(4));
			s6=String.valueOf(thing.charAt(5));
			
		}
		
		
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.et_1:
			if(et1.getVisibility()==View.VISIBLE){
				
				input=et1.getText().toString();
				if(input.equals(s1)){
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
				
				input=et2.getText().toString();
				if(input.equals(s2)){
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
		case R.id.et_3:
			if(et3.getVisibility()==View.VISIBLE){
				
				input=et3.getText().toString();
				if(input.equals(s3)){
					++t3;
					et3.setBackgroundColor(Color.BLUE);
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
					if(count==len){
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
			}
			break;
		case R.id.et_4:
			if(et4.getVisibility()==View.VISIBLE){
				
				input=et4.getText().toString();
				if(input.equals(s4)){
					++t4;
					et4.setBackgroundColor(Color.BLUE);
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
					if(count==len){
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
					et4.setBackgroundColor(Color.RED);
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
		case R.id.et_5:
			if(et5.getVisibility()==View.VISIBLE){
				
				input=et5.getText().toString();
				if(input.equals(s5)){
					++t5;
					et5.setBackgroundColor(Color.BLUE);
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
					if(count==len){
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
			}
			break;
		case R.id.et_6:
			if(et6.getVisibility()==View.VISIBLE){
				
				input=et6.getText().toString();
				if(input.equals(s6)){
					++t6;
					et6.setBackgroundColor(Color.BLUE);
					if(t6==1) ++count;
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
					et6.setBackgroundColor(Color.RED);
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
			runOnUiThread(new Runnable() 
			{
			   public void run() 
			   {
				   showAlert(); 
			   }
			}); 
			break;
		}
	}
	
	public void showAlert(){
		 Context context = getApplicationContext();
	        // Create layout inflator object to inflate toast.xml file
	        LayoutInflater inflater = getLayoutInflater();
	          
	        // Call toast.xml file for toast layout 
	        View toastRoot = inflater.inflate(R.layout.toast, null);
	        TextView tv=(TextView)findViewById(R.id.tv);
	       
	        Toast toast = new Toast(context);
	        tv.setText(thing);
	        // Set layout to toast 
	        toast.setView(toastRoot);
	        toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,
	                0, 0);
	        toast.setDuration(Toast.LENGTH_SHORT);
	        toast.show();
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
	 final Dialog dialog = new Dialog(English_letter_test6.this);
        // Include dialog.xml file
        dialog.setContentView(R.layout.dialog);
        // Set dialog title
        dialog.setTitle("Test 5");

        // set values for custom dialog components - text, image and button
        TextView text = (TextView) dialog.findViewById(R.id.textDialog);
        text.setText("Test 5 successfully passed!!");
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
                Intent intent = new Intent(getApplicationContext(),English_letter_test5.class);
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
