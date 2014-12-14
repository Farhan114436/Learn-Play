package com.example.learn_and_play;

import com.example.learn_and_play.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Bangla  extends Activity implements OnClickListener{
ImageButton bsor,bban;
private static final String TAG_LETTER = "letter";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bangla);
		bsor=(ImageButton)findViewById(R.id.bsor);
		bban=(ImageButton)findViewById(R.id.bban);	
		
		bsor.setOnClickListener(this);
		bban.setOnClickListener(this);
		
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bsor:
			Intent k = new Intent(this,Bangla_sor1.class);
			startActivity(k);
			break;
		case R.id.bban:
			Intent j = new Intent(this,Fragment_english.class);
			j.putExtra(TAG_LETTER, "ban");
			startActivity(j);
			break;
		}
	}
}
