package com.example.learn_and_play;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class Math extends Activity implements OnClickListener{
	ImageButton bask,bimg,bsound,bvideo;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.math);
		bask=(ImageButton)findViewById(R.id.badd);
		bimg=(ImageButton)findViewById(R.id.bsub);
		bsound=(ImageButton)findViewById(R.id.bmul);
		bvideo=(ImageButton)findViewById(R.id.bdiv);
		
		
		bask.setOnClickListener(this);
		bimg.setOnClickListener(this);
		bsound.setOnClickListener(this);
		bvideo.setOnClickListener(this);
		
		
	}
	
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.badd:
			Intent k = new Intent(this,English.class);
			startActivity(k);
			break;
		case R.id.bsub:
			Intent j = new Intent(this,Bangla.class);
			startActivity(j);
			break;
		case R.id.bmul:
			Intent a = new Intent(this,Math.class);
			startActivity(a);
			break;
		case R.id.bdiv:
			Intent i = new Intent(this,Games.class);
			startActivity(i);
			break;
		}
	}
}
