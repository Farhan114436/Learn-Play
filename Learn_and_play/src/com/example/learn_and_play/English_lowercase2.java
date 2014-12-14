package com.example.learn_and_play;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.example.learn_and_play.R;

public class English_lowercase2 extends Fragment  implements OnClickListener{
	ImageButton n,o,p,q,r,s,t,u,vv,w,x,y,z;

	private static final String TAG_PID = "pid";
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	
	}
	
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	        View v = inflater.inflate(R.layout.lowercase_eng2, container,false);
	        n=(ImageButton)v.findViewById(R.id.bt_n);
			o=(ImageButton)v.findViewById(R.id.bt_o);
			p=(ImageButton)v.findViewById(R.id.bt_p);
			q=(ImageButton)v.findViewById(R.id.bt_q);
			r=(ImageButton)v.findViewById(R.id.bt_r);
			s=(ImageButton)v.findViewById(R.id.bt_s);
			t=(ImageButton)v.findViewById(R.id.bt_t);
			u=(ImageButton)v.findViewById(R.id.bt_u);
			vv=(ImageButton)v.findViewById(R.id.bt_v);
			w=(ImageButton)v.findViewById(R.id.bt_w);
			x=(ImageButton)v.findViewById(R.id.bt_x);
			y=(ImageButton)v.findViewById(R.id.bt_y);
			z=(ImageButton)v.findViewById(R.id.bt_z);
			
			n.setOnClickListener(this);
			o.setOnClickListener(this);
			p.setOnClickListener(this);
			q.setOnClickListener(this);
			r.setOnClickListener(this);
			s.setOnClickListener(this);
			
			t.setOnClickListener(this);
			u.setOnClickListener(this);
			vv.setOnClickListener(this);
			w.setOnClickListener(this);
			x.setOnClickListener(this);
			y.setOnClickListener(this);

			z.setOnClickListener(this);
			
	        return v;
	    }
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bt_n:
			Intent a = new Intent(getActivity(),Show_lowercase_english.class);
			a.putExtra(TAG_PID, "N");
			startActivity(a);
			break;
		case R.id.bt_o:
			Intent b = new Intent(getActivity(),Show_lowercase_english.class);
			b.putExtra(TAG_PID, "O");
			startActivity(b);
			break;
		case R.id.bt_p:
			Intent c = new Intent(getActivity(),Show_lowercase_english.class);
			c.putExtra(TAG_PID, "P");
			startActivity(c);
			break;
		case R.id.bt_q:
			Intent d = new Intent(getActivity(),Show_lowercase_english.class);
			d.putExtra(TAG_PID, "Q");
			startActivity(d);
			break;
		case R.id.bt_r:
			Intent e=new Intent(getActivity(),Show_lowercase_english.class);
			e.putExtra(TAG_PID, "R");
			startActivity(e);
			break; 
		case R.id.bt_s:
			Intent f=new Intent(getActivity(),Show_lowercase_english.class);
			f.putExtra(TAG_PID, "S");
			startActivity(f);
			break; 
		case R.id.bt_t:
			Intent g=new Intent(getActivity(),Show_lowercase_english.class);
			g.putExtra(TAG_PID, "T");
			startActivity(g);
			break; 
		case R.id.bt_u:
			Intent h=new Intent(getActivity(),Show_lowercase_english.class);
			h.putExtra(TAG_PID, "U");
			startActivity(h);
			break; 
		case R.id.bt_v:
			Intent i=new Intent(getActivity(),Show_lowercase_english.class);
			i.putExtra(TAG_PID, "V");
			startActivity(i);
			break; 
		case R.id.bt_w:
			Intent j=new Intent(getActivity(),Show_lowercase_english.class);
			j.putExtra(TAG_PID, "W");
			startActivity(j);
			break; 
		case R.id.bt_x:
			Intent k = new Intent(getActivity(),Show_lowercase_english.class);
			k.putExtra(TAG_PID, "X");
			startActivity(k);
			break;
		case R.id.bt_y:
			Intent l = new Intent(getActivity(),Show_lowercase_english.class);
			l.putExtra(TAG_PID, "Y");
			startActivity(l);
			break;
		case R.id.bt_z:
			Intent m = new Intent(getActivity(),Show_lowercase_english.class);
			m.putExtra(TAG_PID, "Z");
			startActivity(m);
			break;
		
		}
	}
}
