package com.example.learn_and_play;

import com.example.word_games.MainActivity2;
import com.example.word_games.StartScreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Games extends Activity implements OnClickListener {

	Button hng,wow;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.act_main);
		setup();
		
		hng.setOnClickListener(this);
		wow.setOnClickListener(this);
	}

	private void setup() {
		// TODO Auto-generated method stub
		hng=(Button) findViewById(R.id.bHangman);
		wow=(Button) findViewById(R.id.bWow);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.bHangman:
			Intent intent=new Intent(Games.this,MainActivity2.class);	
			startActivity(intent);
			break;
			
		case R.id.bWow:
			Intent i=new Intent(Games.this,StartScreen.class);	
			startActivity(i);
			break;
		}
	}
}
