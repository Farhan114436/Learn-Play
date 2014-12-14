package com.example.learn_and_play;

import com.example.learn_and_play.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class English_test extends Activity implements OnClickListener{
	ImageButton bletter,bnumber;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.english_test);
		bletter=(ImageButton)findViewById(R.id.bletter);
		bnumber=(ImageButton)findViewById(R.id.bnumber);
		
		
		bletter.setOnClickListener(this);
		bnumber.setOnClickListener(this);		
		
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bletter:
			Intent k = new Intent(this,Letter_eng_test.class);
			startActivity(k);
			break;
		case R.id.bnumber:
			Intent j = new Intent(this,Number_eng_test.class);
			startActivity(j);
			break;
		}
	}
}
