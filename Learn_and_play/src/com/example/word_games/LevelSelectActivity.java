package com.example.word_games;

import com.example.learn_and_play.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.MenuItem;
import android.view.View;
import android.support.v4.app.NavUtils;
import android.annotation.SuppressLint;
import android.content.Intent;

public class LevelSelectActivity extends Activity {

	@SuppressLint("NewApi")
	@Override
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    // Set the text view as the activity layout
	    setContentView(R.layout.activity_level_select);
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void easyStart(View view) {   
	       Intent intent = new Intent(this, PlayActivity.class);
	       intent.putExtra("level", 0);
	       startActivity(intent);
	}
	
	
	public void hardStart(View view) {   
	       Intent intent = new Intent(this, PlayActivity.class);
	       intent.putExtra("level", 1);
	       startActivity(intent);
	}
	
	
	public void expertStart(View view) {   
	       Intent intent = new Intent(this, PlayActivity.class);
	       intent.putExtra("level", 2);
	       startActivity(intent);
	}
	
	@Override
	public void onBackPressed() {
		Intent intent = new Intent(this, MainActivity2.class);
	      // EditText editText = (EditText) findViewById(R.id.edit_message);
	       //String message = editText.getText().toString();
	       //intent.putExtra(EXTRA_MESSAGE, message);
	       startActivity(intent);
	}

}
