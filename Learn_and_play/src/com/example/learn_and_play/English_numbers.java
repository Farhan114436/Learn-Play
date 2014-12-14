package com.example.learn_and_play;

import com.example.learn_and_play.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class English_numbers extends Fragment  implements OnClickListener{
	
	private static final String TAG_PID = "pid";
	Button one,two,three,four,five,six,seven,eight,nine,ten;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	
	}
	
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	        View v = inflater.inflate(R.layout.english_numbers, container,false);
	        one=(Button)v.findViewById(R.id.bt_one);
			two=(Button)v.findViewById(R.id.bt_two);
			three=(Button)v.findViewById(R.id.bt_three);
			four=(Button)v.findViewById(R.id.bt_four);
			five=(Button)v.findViewById(R.id.bt_five);
			six=(Button)v.findViewById(R.id.bt_six);
			seven=(Button)v.findViewById(R.id.bt_seven);
			eight=(Button)v.findViewById(R.id.bt_eight);
			nine=(Button)v.findViewById(R.id.bt_nine);
			ten=(Button)v.findViewById(R.id.bt_ten);
			
			one.setOnClickListener(this);
			two.setOnClickListener(this);
			three.setOnClickListener(this);
			four.setOnClickListener(this);
			five.setOnClickListener(this);
			six.setOnClickListener(this);
			
			seven.setOnClickListener(this);
			eight.setOnClickListener(this);
			nine.setOnClickListener(this);
			ten.setOnClickListener(this);
			return v;
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bt_one:
			Intent a = new Intent(getActivity(),Show_english_numbers.class);
			a.putExtra(TAG_PID, "1");
			startActivity(a);
			break;
		case R.id.bt_two:
			Intent b = new Intent(getActivity(),Show_english_numbers.class);
			b.putExtra(TAG_PID, "2");
			startActivity(b);
			break;
		case R.id.bt_three:
			Intent c = new Intent(getActivity(),Show_english_numbers.class);
			c.putExtra(TAG_PID, "3");
			startActivity(c);
			break;
		case R.id.bt_four:
			Intent d = new Intent(getActivity(),Show_english_numbers.class);
			d.putExtra(TAG_PID, "4");
			startActivity(d);
			break;
		case R.id.bt_five:
			Intent e=new Intent(getActivity(),Show_english_numbers.class);
			e.putExtra(TAG_PID, "5");
			startActivity(e);
			break; 
		case R.id.bt_six:
			Intent f=new Intent(getActivity(),Show_english_numbers.class);
			f.putExtra(TAG_PID, "6");
			startActivity(f);
			break; 
		case R.id.bt_seven:
			Intent g=new Intent(getActivity(),Show_english_numbers.class);
			g.putExtra(TAG_PID, "7");
			startActivity(g);
			break; 
		case R.id.bt_eight:
			Intent h=new Intent(getActivity(),Show_english_numbers.class);
			h.putExtra(TAG_PID, "8");
			startActivity(h);
			break; 
		case R.id.bt_nine:
			Intent i=new Intent(getActivity(),Show_english_numbers.class);
			i.putExtra(TAG_PID, "9");
			startActivity(i);
			break; 
		case R.id.bt_ten:
			Intent j=new Intent(getActivity(),Show_english_numbers.class);
			j.putExtra(TAG_PID, "10");
			startActivity(j);
			break; 
		
		}
	}
}
