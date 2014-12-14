package com.example.learn_and_play;


import com.example.learn_and_play.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Main_menu extends Activity implements OnClickListener{
	ImageButton bask,bimg,bsound,bvideo;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);
		bask=(ImageButton)findViewById(R.id.beng);
		bimg=(ImageButton)findViewById(R.id.bbangla);
		bsound=(ImageButton)findViewById(R.id.bmath);
		bvideo=(ImageButton)findViewById(R.id.bgames);
		
		
		bask.setOnClickListener(this);
		bimg.setOnClickListener(this);
		bsound.setOnClickListener(this);
		bvideo.setOnClickListener(this);
		
		
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.beng:
			Intent k = new Intent(this,English.class);
			startActivity(k);
			break;
		case R.id.bbangla:
			Intent j = new Intent(this,Bangla.class);
			startActivity(j);
			break;
		case R.id.bmath:
			Intent a = new Intent(this,Math.class);
			startActivity(a);
			break;
		case R.id.bgames:
			Intent i = new Intent(this,Games.class);
			startActivity(i);
			break;
		}
	}
}
