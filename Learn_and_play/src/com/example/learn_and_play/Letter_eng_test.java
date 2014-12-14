package com.example.learn_and_play;

import com.example.english_test.*;
import com.example.learn_and_play.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Letter_eng_test extends Activity implements OnClickListener{
	ImageButton b1,b2,b3,b4,b5;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.letter_eng_test);
		b1=(ImageButton)findViewById(R.id.bt_1);
		b2=(ImageButton)findViewById(R.id.bt_2);
		b3=(ImageButton)findViewById(R.id.bt_3);
		b4=(ImageButton)findViewById(R.id.bt_4);
		b5=(ImageButton)findViewById(R.id.bt_5);
		
		
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		b4.setOnClickListener(this);
		b5.setOnClickListener(this);
		
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bt_1:
			Intent k = new Intent(this,English_letter_test1.class);
			startActivity(k);
			break;
		case R.id.bt_2:
			Intent j = new Intent(this,English_letter_test2.class);
			startActivity(j);
			break;
		case R.id.bt_3:
			Intent a = new Intent(this,English_letter_test3.class);
			startActivity(a);
			break;
		case R.id.bt_4:
			Intent i = new Intent(this,English_letter_test4.class);
			startActivity(i);
			break;
		case R.id.bt_5:
			Intent h = new Intent(this,English_letter_test5.class);
			startActivity(h);
			break;
		}
	}
}
