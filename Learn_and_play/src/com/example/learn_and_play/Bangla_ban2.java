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

public class Bangla_ban2 extends Fragment  implements OnClickListener{
	private static final String TAG_PID = "Bletter";
	Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	
	}
	
	 @Override
	    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
	        View v = inflater.inflate(R.layout.bangla_ban2, container,false);
	        a=(Button)v.findViewById(R.id.bt_21);
			b=(Button)v.findViewById(R.id.bt_22);
			c=(Button)v.findViewById(R.id.bt_23);
			d=(Button)v.findViewById(R.id.bt_24);
			e=(Button)v.findViewById(R.id.bt_25);
			f=(Button)v.findViewById(R.id.bt_26);
			g=(Button)v.findViewById(R.id.bt_27);
			h=(Button)v.findViewById(R.id.bt_28);
			i=(Button)v.findViewById(R.id.bt_29);
			j=(Button)v.findViewById(R.id.bt_30);
			k=(Button)v.findViewById(R.id.bt_31);
			l=(Button)v.findViewById(R.id.bt_32);
			m=(Button)v.findViewById(R.id.bt_33);
			n=(Button)v.findViewById(R.id.bt_34);
			o=(Button)v.findViewById(R.id.bt_35);
			p=(Button)v.findViewById(R.id.bt_36);
			q=(Button)v.findViewById(R.id.bt_37);
			r=(Button)v.findViewById(R.id.bt_38);
			s=(Button)v.findViewById(R.id.bt_39);
			t=(Button)v.findViewById(R.id.bt_40);
			
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
		case R.id.bt_21:
			Intent a = new Intent(getActivity(),Show_bangla_letters.class);
			a.putExtra(TAG_PID, "21");
			startActivity(a);
			break;
		case R.id.bt_22:
			Intent b = new Intent(getActivity(),Show_bangla_letters.class);
			b.putExtra(TAG_PID, "22");
			startActivity(b);
			break;
		case R.id.bt_23:
			Intent c = new Intent(getActivity(),Show_bangla_letters.class);
			c.putExtra(TAG_PID, "23");
			startActivity(c);
			break;
		case R.id.bt_24:
			Intent d = new Intent(getActivity(),Show_bangla_letters.class);
			d.putExtra(TAG_PID, "24");
			startActivity(d);
			break;
		case R.id.bt_25:
			Intent e = new Intent(getActivity(),Show_bangla_letters.class);
			e.putExtra(TAG_PID, "25");
			startActivity(e);
			break;
		case R.id.bt_26:
			Intent f = new Intent(getActivity(),Show_bangla_letters.class);
			f.putExtra(TAG_PID, "26");
			startActivity(f);
			break;
		case R.id.bt_27:
			Intent g = new Intent(getActivity(),Show_bangla_letters.class);
			g.putExtra(TAG_PID, "27");
			startActivity(g);
			break;
		case R.id.bt_28:
			Intent h = new Intent(getActivity(),Show_bangla_letters.class);
			h.putExtra(TAG_PID, "28");
			startActivity(h);
			break;
		case R.id.bt_29:
			Intent i = new Intent(getActivity(),Show_bangla_letters.class);
			i.putExtra(TAG_PID, "29");
			startActivity(i);
			break;
		case R.id.bt_30:
			Intent j = new Intent(getActivity(),Show_bangla_letters.class);
			j.putExtra(TAG_PID, "30");
			startActivity(j);
			break;
		case R.id.bt_31:
			Intent k = new Intent(getActivity(),Show_bangla_letters.class);
			k.putExtra(TAG_PID, "31");
			startActivity(k);
			break;
		case R.id.bt_32:
			Intent l = new Intent(getActivity(),Show_bangla_letters.class);
			l.putExtra(TAG_PID, "32");
			startActivity(l);
			break;
		case R.id.bt_33:
			Intent m = new Intent(getActivity(),Show_bangla_letters.class);
			m.putExtra(TAG_PID, "33");
			startActivity(m);
			break;
		case R.id.bt_34:
			Intent n = new Intent(getActivity(),Show_bangla_letters.class);
			n.putExtra(TAG_PID, "34");
			startActivity(n);
			break;
		case R.id.bt_35:
			Intent o = new Intent(getActivity(),Show_bangla_letters.class);
			o.putExtra(TAG_PID, "35");
			startActivity(o);
			break;
		case R.id.bt_36:
			Intent p = new Intent(getActivity(),Show_bangla_letters.class);
			p.putExtra(TAG_PID, "36");
			startActivity(p);
			break;
		case R.id.bt_37:
			Intent q = new Intent(getActivity(),Show_bangla_letters.class);
			q.putExtra(TAG_PID, "37");
			startActivity(q);
			break;
		case R.id.bt_38:
			Intent r = new Intent(getActivity(),Show_bangla_letters.class);
			r.putExtra(TAG_PID, "38");
			startActivity(r);
			break;
		case R.id.bt_39:
			Intent s = new Intent(getActivity(),Show_bangla_letters.class);
			s.putExtra(TAG_PID, "39");
			startActivity(s);
			break;
		case R.id.bt_40:
			Intent t = new Intent(getActivity(),Show_bangla_letters.class);
			t.putExtra(TAG_PID, "40");
			startActivity(t);
			break;
		
		}
	}
}
