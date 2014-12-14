package com.example.learn_and_play;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.example.learn_and_play.R;


public class English extends Activity implements OnClickListener{
	ImageButton bask,bimg,bsound,bvideo;
	private static final String TAG_LETTER = "letter";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.english_menu);
		bask=(ImageButton)findViewById(R.id.bupper);
		bimg=(ImageButton)findViewById(R.id.blower);
		bsound=(ImageButton)findViewById(R.id.bnumber);
		bvideo=(ImageButton)findViewById(R.id.btest);
		
		
		bask.setOnClickListener(this);
		bimg.setOnClickListener(this);
		bsound.setOnClickListener(this);
		bvideo.setOnClickListener(this);
		
		
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bupper:
			Intent k = new Intent(this,Fragment_english.class);
			k.putExtra(TAG_LETTER, "up");
			startActivity(k);
			break;
		case R.id.blower:
			Intent j = new Intent(this,Fragment_english.class);
			j.putExtra(TAG_LETTER, "low");
			startActivity(j);
			break;
		case R.id.bnumber:
			Intent a = new Intent(this,Fragment_english.class);
			a.putExtra(TAG_LETTER, "num");
			startActivity(a);
			break;
		case R.id.btest:
			Intent i = new Intent(this,English_test.class);
			startActivity(i);
			break;
		}
	}
}
