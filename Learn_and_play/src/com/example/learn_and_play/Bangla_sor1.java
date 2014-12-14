package com.example.learn_and_play;

import com.example.learn_and_play.R;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Bangla_sor1 extends Activity implements OnClickListener{
	Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11;
	private static final String TAG_LETTER = "Bletter";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bangla_sor);
		bt1=(Button)findViewById(R.id.bt_a);
		bt2=(Button)findViewById(R.id.bt_b);
		bt3=(Button)findViewById(R.id.bt_c);
		bt4=(Button)findViewById(R.id.bt_d);
		bt5=(Button)findViewById(R.id.bt_e);
		bt6=(Button)findViewById(R.id.bt_f);
		bt7=(Button)findViewById(R.id.bt_g);
		bt8=(Button)findViewById(R.id.bt_h);
		bt9=(Button)findViewById(R.id.bt_i);
		bt10=(Button)findViewById(R.id.bt_j);
		bt11=(Button)findViewById(R.id.bt_k);
		
		Typeface tf = Typeface.createFromAsset(getAssets(), "font/Siyamrupali_1_01.ttf");
		bt1.setTypeface(tf);
		bt2.setTypeface(tf);
		bt3.setTypeface(tf);
		bt4.setTypeface(tf);
		bt5.setTypeface(tf);
		bt6.setTypeface(tf);
		bt7.setTypeface(tf);
		bt8.setTypeface(tf);
		bt9.setTypeface(tf);
		bt10.setTypeface(tf);
		bt11.setTypeface(tf);
		
		bt1.setOnClickListener(this);
		bt2.setOnClickListener(this);
		bt3.setOnClickListener(this);
		bt4.setOnClickListener(this);
		bt5.setOnClickListener(this);
		bt6.setOnClickListener(this);
		bt7.setOnClickListener(this);
		bt8.setOnClickListener(this);
		bt9.setOnClickListener(this);
		bt10.setOnClickListener(this);
		bt11.setOnClickListener(this);
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bt_a:
			Intent a = new Intent(this,Show_bangla_letters.class);
			a.putExtra(TAG_LETTER, "bs1");
			startActivity(a);
			break;
		case R.id.bt_b:
			Intent b = new Intent(this,Show_bangla_letters.class);
			b.putExtra(TAG_LETTER, "bs2");
			startActivity(b);
			break;
		case R.id.bt_c:
			Intent c = new Intent(this,Show_bangla_letters.class);
			c.putExtra(TAG_LETTER, "bs3");
			startActivity(c);
			break;
		case R.id.bt_d:
			Intent d = new Intent(this,Show_bangla_letters.class);
			d.putExtra(TAG_LETTER, "bs4");
			startActivity(d);
			break;
		case R.id.bt_e:
			Intent e = new Intent(this,Show_bangla_letters.class);
			e.putExtra(TAG_LETTER, "bs5");
			startActivity(e);
			break;
		case R.id.bt_f:
			Intent f = new Intent(this,Show_bangla_letters.class);
			f.putExtra(TAG_LETTER, "bs6");
			startActivity(f);
			break;
		case R.id.bt_g:
			Intent g = new Intent(this,Show_bangla_letters.class);
			g.putExtra(TAG_LETTER, "bs7");
			startActivity(g);
			break;
		case R.id.bt_h:
			Intent h = new Intent(this,Show_bangla_letters.class);
			h.putExtra(TAG_LETTER, "bs8");
			startActivity(h);
			break;
		case R.id.bt_i:
			Intent i = new Intent(this,Show_bangla_letters.class);
			i.putExtra(TAG_LETTER, "bs9");
			startActivity(i);
			break;
		case R.id.bt_j:
			Intent j = new Intent(this,Show_bangla_letters.class);
			j.putExtra(TAG_LETTER, "bs10");
			startActivity(j);
			break;
		case R.id.bt_k:
			Intent k = new Intent(this,Show_bangla_letters.class);
			k.putExtra(TAG_LETTER, "bs11");
			startActivity(k);
			break;
			
		}
	}
	
}
