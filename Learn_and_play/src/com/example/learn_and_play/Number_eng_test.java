package com.example.learn_and_play;

import com.example.english_test.English_number_test1;
import com.example.english_test.English_number_test2;
import com.example.english_test.English_number_test3;
import com.example.learn_and_play.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Number_eng_test extends Activity implements OnClickListener{
	ImageButton b1,b2,b3;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.number_english_test);
		b1=(ImageButton)findViewById(R.id.bt_1);
		b2=(ImageButton)findViewById(R.id.bt_2);
		b3=(ImageButton)findViewById(R.id.bt_3);
		
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3.setOnClickListener(this);
		
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bt_1:
			Intent k = new Intent(this,English_number_test1.class);
			startActivity(k);
			break;
		case R.id.bt_2:
			Intent j = new Intent(this,English_number_test2.class);
			startActivity(j);
			break;
		case R.id.bt_3:
			Intent a = new Intent(this,English_number_test3.class);
			startActivity(a);
			break;
		}
	}
}
