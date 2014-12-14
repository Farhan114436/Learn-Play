package com.example.learn_and_play;

import com.example.learn_and_play.R;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class English_uppercase extends Fragment  implements OnClickListener{

	
	private static final String TAG_PID = "pid";
	ImageButton a,b,c,d,e,f,g,h,i,j,k,l,m;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	
	}
	
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	        View v = inflater.inflate(R.layout.uppercase_eng, container,false);
	        a=(ImageButton)v.findViewById(R.id.bt_a);
			b=(ImageButton)v.findViewById(R.id.bt_b);
			c=(ImageButton)v.findViewById(R.id.bt_c);
			d=(ImageButton)v.findViewById(R.id.bt_d);
			e=(ImageButton)v.findViewById(R.id.bt_e);
			f=(ImageButton)v.findViewById(R.id.bt_f);
			g=(ImageButton)v.findViewById(R.id.bt_g);
			h=(ImageButton)v.findViewById(R.id.bt_h);
			i=(ImageButton)v.findViewById(R.id.bt_i);
			j=(ImageButton)v.findViewById(R.id.bt_j);
			k=(ImageButton)v.findViewById(R.id.bt_k);
			l=(ImageButton)v.findViewById(R.id.bt_l);
			m=(ImageButton)v.findViewById(R.id.bt_m);
			
			a.setOnClickListener(this);
			b.setOnClickListener(this);
			c.setOnClickListener(this);
			d.setOnClickListener(this);
			e.setOnClickListener(this);
			f.setOnClickListener(this);
			
			g.setOnClickListener(this);
			h.setOnClickListener(this);
			i.setOnClickListener(this);
			j.setOnClickListener(this);
			k.setOnClickListener(this);
			l.setOnClickListener(this);

			m.setOnClickListener(this);
			
	        return v;
	    }
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bt_a:
			Intent a = new Intent(getActivity(),Show_uppercase_english.class);
			a.putExtra(TAG_PID, "A");
			startActivity(a);
			break;
		case R.id.bt_b:
			Intent b = new Intent(getActivity(),Show_uppercase_english.class);
			b.putExtra(TAG_PID, "B");
			startActivity(b);
			break;
		case R.id.bt_c:
			Intent c = new Intent(getActivity(),Show_uppercase_english.class);
			c.putExtra(TAG_PID, "C");
			startActivity(c);
			break;
		case R.id.bt_d:
			Intent d = new Intent(getActivity(),Show_uppercase_english.class);
			d.putExtra(TAG_PID, "D");
			startActivity(d);
			break;
		case R.id.bt_e:
			Intent e=new Intent(getActivity(),Show_uppercase_english.class);
			e.putExtra(TAG_PID, "E");
			startActivity(e);
			break; 
		case R.id.bt_f:
			Intent f=new Intent(getActivity(),Show_uppercase_english.class);
			f.putExtra(TAG_PID, "F");
			startActivity(f);
			break; 
		case R.id.bt_g:
			Intent g=new Intent(getActivity(),Show_uppercase_english.class);
			g.putExtra(TAG_PID, "G");
			startActivity(g);
			break; 
		case R.id.bt_h:
			Intent h=new Intent(getActivity(),Show_uppercase_english.class);
			h.putExtra(TAG_PID, "H");
			startActivity(h);
			break; 
		case R.id.bt_i:
			Intent i=new Intent(getActivity(),Show_uppercase_english.class);
			i.putExtra(TAG_PID, "I");
			startActivity(i);
			break; 
		case R.id.bt_j:
			Intent j=new Intent(getActivity(),Show_uppercase_english.class);
			j.putExtra(TAG_PID, "J");
			startActivity(j);
			break; 
		case R.id.bt_k:
			Intent k = new Intent(getActivity(),Show_uppercase_english.class);
			k.putExtra(TAG_PID, "K");
			startActivity(k);
			break;
		case R.id.bt_l:
			Intent l = new Intent(getActivity(),Show_uppercase_english.class);
			l.putExtra(TAG_PID, "L");
			startActivity(l);
			break;
		case R.id.bt_m:
			Intent m = new Intent(getActivity(),Show_uppercase_english.class);
			m.putExtra(TAG_PID, "M");
			startActivity(m);
			break;
		
		}
	}
	
	
}
