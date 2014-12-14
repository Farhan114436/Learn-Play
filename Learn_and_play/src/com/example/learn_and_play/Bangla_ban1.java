package com.example.learn_and_play;

import com.example.learn_and_play.R;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Bangla_ban1 extends Fragment  implements OnClickListener{
	private static final String TAG_PID = "Bletter";
	Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	
	}
	
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	        View v = inflater.inflate(R.layout.bangla_ban1, container,false);
	        a=(Button)v.findViewById(R.id.bt_1);
			b=(Button)v.findViewById(R.id.bt_2);
			c=(Button)v.findViewById(R.id.bt_3);
			d=(Button)v.findViewById(R.id.bt_4);
			e=(Button)v.findViewById(R.id.bt_5);
			f=(Button)v.findViewById(R.id.bt_6);
			g=(Button)v.findViewById(R.id.bt_7);
			h=(Button)v.findViewById(R.id.bt_8);
			i=(Button)v.findViewById(R.id.bt_9);
			j=(Button)v.findViewById(R.id.bt_10);
			k=(Button)v.findViewById(R.id.bt_11);
			l=(Button)v.findViewById(R.id.bt_12);
			m=(Button)v.findViewById(R.id.bt_13);
			n=(Button)v.findViewById(R.id.bt_14);
			o=(Button)v.findViewById(R.id.bt_15);
			p=(Button)v.findViewById(R.id.bt_16);
			q=(Button)v.findViewById(R.id.bt_17);
			r=(Button)v.findViewById(R.id.bt_18);
			s=(Button)v.findViewById(R.id.bt_19);
			t=(Button)v.findViewById(R.id.bt_20);
			
			Typeface tf = Typeface.createFromAsset(getActivity().getAssets(), "font/Siyamrupali_1_01.ttf");
			a.setTypeface(tf);
			b.setTypeface(tf);
			c.setTypeface(tf);
			d.setTypeface(tf);
			e.setTypeface(tf);
			f.setTypeface(tf);
			g.setTypeface(tf);
			h.setTypeface(tf);
			i.setTypeface(tf);
			j.setTypeface(tf);
			k.setTypeface(tf);
			l.setTypeface(tf);
			m.setTypeface(tf);
			n.setTypeface(tf);
			o.setTypeface(tf);
			p.setTypeface(tf);
			q.setTypeface(tf);
			r.setTypeface(tf);
			s.setTypeface(tf);
			t.setTypeface(tf);
			
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
			n.setOnClickListener(this);
			o.setOnClickListener(this);
			p.setOnClickListener(this);
			q.setOnClickListener(this);
			r.setOnClickListener(this);
			s.setOnClickListener(this);
			t.setOnClickListener(this);
			
	        return v;
	    }
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bt_1:
			Intent a = new Intent(getActivity(),Show_bangla_letters.class);
			a.putExtra(TAG_PID, "1");
			startActivity(a);
			break;
		case R.id.bt_2:
			Intent b = new Intent(getActivity(),Show_bangla_letters.class);
			b.putExtra(TAG_PID, "2");
			startActivity(b);
			break;
		case R.id.bt_3:
			Intent c = new Intent(getActivity(),Show_bangla_letters.class);
			c.putExtra(TAG_PID, "3");
			startActivity(c);
			break;
		case R.id.bt_4:
			Intent d = new Intent(getActivity(),Show_bangla_letters.class);
			d.putExtra(TAG_PID, "4");
			startActivity(d);
			break;
		case R.id.bt_5:
			Intent e = new Intent(getActivity(),Show_bangla_letters.class);
			e.putExtra(TAG_PID, "5");
			startActivity(e);
			break;
		case R.id.bt_6:
			Intent f = new Intent(getActivity(),Show_bangla_letters.class);
			f.putExtra(TAG_PID, "6");
			startActivity(f);
			break;
		case R.id.bt_7:
			Intent g = new Intent(getActivity(),Show_bangla_letters.class);
			g.putExtra(TAG_PID, "7");
			startActivity(g);
			break;
		case R.id.bt_8:
			Intent h = new Intent(getActivity(),Show_bangla_letters.class);
			h.putExtra(TAG_PID, "8");
			startActivity(h);
			break;
		case R.id.bt_9:
			Intent i = new Intent(getActivity(),Show_bangla_letters.class);
			i.putExtra(TAG_PID, "9");
			startActivity(i);
			break;
		case R.id.bt_10:
			Intent j = new Intent(getActivity(),Show_bangla_letters.class);
			j.putExtra(TAG_PID, "10");
			startActivity(j);
			break;
		case R.id.bt_11:
			Intent k = new Intent(getActivity(),Show_bangla_letters.class);
			k.putExtra(TAG_PID, "11");
			startActivity(k);
			break;
		case R.id.bt_12:
			Intent l = new Intent(getActivity(),Show_bangla_letters.class);
			l.putExtra(TAG_PID, "12");
			startActivity(l);
			break;
		case R.id.bt_13:
			Intent m = new Intent(getActivity(),Show_bangla_letters.class);
			m.putExtra(TAG_PID, "13");
			startActivity(m);
			break;
		case R.id.bt_14:
			Intent n = new Intent(getActivity(),Show_bangla_letters.class);
			n.putExtra(TAG_PID, "14");
			startActivity(n);
			break;
		case R.id.bt_15:
			Intent o = new Intent(getActivity(),Show_bangla_letters.class);
			o.putExtra(TAG_PID, "15");
			startActivity(o);
			break;
		case R.id.bt_16:
			Intent p = new Intent(getActivity(),Show_bangla_letters.class);
			p.putExtra(TAG_PID, "16");
			startActivity(p);
			break;
		case R.id.bt_17:
			Intent q = new Intent(getActivity(),Show_bangla_letters.class);
			q.putExtra(TAG_PID, "17");
			startActivity(q);
			break;
		case R.id.bt_18:
			Intent r = new Intent(getActivity(),Show_bangla_letters.class);
			r.putExtra(TAG_PID, "18");
			startActivity(r);
			break;
		case R.id.bt_19:
			Intent s = new Intent(getActivity(),Show_bangla_letters.class);
			s.putExtra(TAG_PID, "19");
			startActivity(s);
			break;
		case R.id.bt_20:
			Intent t = new Intent(getActivity(),Show_bangla_letters.class);
			t.putExtra(TAG_PID, "20");
			startActivity(t);
			break;
		
		}
	}
}
