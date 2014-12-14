package com.example.english_test;


import com.example.learn_and_play.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class English_letter_test5 extends Activity implements OnClickListener{
	private static final String TAG_PID = "pid";
	ImageButton a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_letters);
		a=(ImageButton)findViewById(R.id.bt_a);
		b=(ImageButton)findViewById(R.id.bt_b);
		c=(ImageButton)findViewById(R.id.bt_c);
		d=(ImageButton)findViewById(R.id.bt_d);
		e=(ImageButton)findViewById(R.id.bt_e);
		f=(ImageButton)findViewById(R.id.bt_f);
		g=(ImageButton)findViewById(R.id.bt_g);
		h=(ImageButton)findViewById(R.id.bt_h);
		i=(ImageButton)findViewById(R.id.bt_i);
		j=(ImageButton)findViewById(R.id.bt_j);
		k=(ImageButton)findViewById(R.id.bt_k);
		l=(ImageButton)findViewById(R.id.bt_l);
		m=(ImageButton)findViewById(R.id.bt_m);
		n=(ImageButton)findViewById(R.id.bt_n);
		o=(ImageButton)findViewById(R.id.bt_o);
		p=(ImageButton)findViewById(R.id.bt_p);
		q=(ImageButton)findViewById(R.id.bt_q);
		r=(ImageButton)findViewById(R.id.bt_r);
		s=(ImageButton)findViewById(R.id.bt_s);
		t=(ImageButton)findViewById(R.id.bt_t);
		u=(ImageButton)findViewById(R.id.bt_u);
		v=(ImageButton)findViewById(R.id.bt_v);
		w=(ImageButton)findViewById(R.id.bt_w);
		x=(ImageButton)findViewById(R.id.bt_x);
		y=(ImageButton)findViewById(R.id.bt_y);
		z=(ImageButton)findViewById(R.id.bt_z);
		
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
		u.setOnClickListener(this);
		v.setOnClickListener(this);
		w.setOnClickListener(this);
		x.setOnClickListener(this);
		y.setOnClickListener(this);
		z.setOnClickListener(this);
		
	
	}

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.bt_a:
			Intent a = new Intent(this,English_letter_test6.class);
			a.putExtra(TAG_PID, "A");
			startActivity(a);
			break;
		case R.id.bt_b:
			Intent b = new Intent(this,English_letter_test6.class);
			b.putExtra(TAG_PID, "B");
			startActivity(b);
			break;
		case R.id.bt_c:
			Intent c = new Intent(this,English_letter_test6.class);
			c.putExtra(TAG_PID, "C");
			startActivity(c);
			break;
		case R.id.bt_d:
			Intent d = new Intent(this,English_letter_test6.class);
			d.putExtra(TAG_PID, "D");
			startActivity(d);
			break;
		case R.id.bt_e:
			Intent e=new Intent(this,English_letter_test6.class);
			e.putExtra(TAG_PID, "E");
			startActivity(e);
			break; 
		case R.id.bt_f:
			Intent f=new Intent(this,English_letter_test6.class);
			f.putExtra(TAG_PID, "F");
			startActivity(f);
			break; 
		case R.id.bt_g:
			Intent g=new Intent(this,English_letter_test6.class);
			g.putExtra(TAG_PID, "G");
			startActivity(g);
			break; 
		case R.id.bt_h:
			Intent h=new Intent(this,English_letter_test6.class);
			h.putExtra(TAG_PID, "H");
			startActivity(h);
			break; 
		case R.id.bt_i:
			Intent i=new Intent(this,English_letter_test6.class);
			i.putExtra(TAG_PID, "I");
			startActivity(i);
			break; 
		case R.id.bt_j:
			Intent j=new Intent(this,English_letter_test6.class);
			j.putExtra(TAG_PID, "J");
			startActivity(j);
			break; 
		case R.id.bt_k:
			Intent k = new Intent(this,English_letter_test6.class);
			k.putExtra(TAG_PID, "K");
			startActivity(k);
			break;
		case R.id.bt_l:
			Intent l = new Intent(this,English_letter_test6.class);
			l.putExtra(TAG_PID, "L");
			startActivity(l);
			break;
		case R.id.bt_m:
			Intent m = new Intent(this,English_letter_test6.class);
			m.putExtra(TAG_PID, "M");
			startActivity(m);
			break;
		case R.id.bt_n:
			Intent n = new Intent(this,English_letter_test6.class);
			n.putExtra(TAG_PID, "N");
			startActivity(n);
			break;
		case R.id.bt_o:
			Intent o = new Intent(this,English_letter_test6.class);
			o.putExtra(TAG_PID, "O");
			startActivity(o);
			break;
		case R.id.bt_p:
			Intent p = new Intent(this,English_letter_test6.class);
			p.putExtra(TAG_PID, "P");
			startActivity(p);
			break;
		case R.id.bt_q:
			Intent q = new Intent(this,English_letter_test6.class);
			q.putExtra(TAG_PID, "Q");
			startActivity(q);
			break;
		case R.id.bt_r:
			Intent r=new Intent(this,English_letter_test6.class);
			r.putExtra(TAG_PID, "R");
			startActivity(r);
			break; 
		case R.id.bt_s:
			Intent s=new Intent(this,English_letter_test6.class);
			s.putExtra(TAG_PID, "S");
			startActivity(s);
			break; 
		case R.id.bt_t:
			Intent t=new Intent(this,English_letter_test6.class);
			t.putExtra(TAG_PID, "T");
			startActivity(t);
			break; 
		case R.id.bt_u:
			Intent u=new Intent(this,English_letter_test6.class);
			u.putExtra(TAG_PID, "U");
			startActivity(u);
			break; 
		case R.id.bt_v:
			Intent v1=new Intent(this,English_letter_test6.class);
			v1.putExtra(TAG_PID, "V");
			startActivity(v1);
			break; 
		case R.id.bt_w:
			Intent w=new Intent(this,English_letter_test6.class);
			w.putExtra(TAG_PID, "W");
			startActivity(w);
			break; 
		case R.id.bt_x:
			Intent x = new Intent(this,English_letter_test6.class);
			x.putExtra(TAG_PID, "X");
			startActivity(x);
			break;
		case R.id.bt_y:
			Intent y = new Intent(this,English_letter_test6.class);
			y.putExtra(TAG_PID, "Y");
			startActivity(y);
			break;
		case R.id.bt_z:
			Intent z = new Intent(this,English_letter_test6.class);
			z.putExtra(TAG_PID, "Z");
			startActivity(z);
			break;
		
		}
	}
}
