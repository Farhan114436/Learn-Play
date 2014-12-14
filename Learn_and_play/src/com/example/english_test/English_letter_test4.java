package com.example.english_test;

import java.util.Random;

import com.example.learn_and_play.R;

import android.R.color;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class English_letter_test4 extends Activity implements OnClickListener {
	ImageButton a, b, c, d, e, f;
	char ch, ch4, first_char, in1, in2, in3, in4, in5;
	String ch3, s1;
	int count1 = 0, count2 = 0;
	Random r;
	int i1, level = 0;
	int randomstring, numLetters = 5;
	Random rnd = new Random();
	int[] number;
	MediaPlayer oursong, oursong2;
	private static int[] stra = { R.drawable.airplane, R.drawable.aligator,
			R.drawable.alien, R.drawable.ankle, R.drawable.ant,
			R.drawable.apple, R.drawable.ax };
	private static int[] strb = { R.drawable.ball, R.drawable.bat,
			R.drawable.bird, R.drawable.boat, R.drawable.book, R.drawable.box,
			R.drawable.bus };
	private static int[] strc = { R.drawable.car, R.drawable.carrot,
			R.drawable.cat, R.drawable.caw };
	private static int[] strd = { R.drawable.deer, R.drawable.dinosor,
			R.drawable.dog, R.drawable.doll };
	private static int[] stre = { R.drawable.eagle, R.drawable.eat,
			R.drawable.egg, R.drawable.elephant };
	private static int[] strf = { R.drawable.father, R.drawable.feet,
			R.drawable.finger, R.drawable.fish, R.drawable.food, R.drawable.fox };
	private static int[] strg = { R.drawable.ghost, R.drawable.goat,
			R.drawable.gold, R.drawable.goose };
	private static int[] strh = { R.drawable.hat, R.drawable.hawk,
			R.drawable.head, R.drawable.horse, R.drawable.house };
	private static int[] stri = { R.drawable.ice, R.drawable.ink,
			R.drawable.insect, R.drawable.ivy };
	private static int[] strj = { R.drawable.jacket, R.drawable.jar,
			R.drawable.jeep, R.drawable.jet };
	private static int[] strk = { R.drawable.kangaroo, R.drawable.key,
			R.drawable.kid, R.drawable.king, R.drawable.kite };
	private static int[] strl = { R.drawable.laugh, R.drawable.leaf,
			R.drawable.leg, R.drawable.light };
	private static int[] strm = { R.drawable.mask, R.drawable.milk,
			R.drawable.moon, R.drawable.mouse };
	private static int[] strn = { R.drawable.nap, R.drawable.net,
			R.drawable.night, R.drawable.nose };
	private static int[] stro = { R.drawable.ocean, R.drawable.octopus,
			R.drawable.ostrich, R.drawable.ox };
	private static int[] strp = { R.drawable.paint, R.drawable.paper,
			R.drawable.pie, R.drawable.pig };
	private static int[] strq = { R.drawable.quail, R.drawable.quarrel,
			R.drawable.queen, R.drawable.quiet };
	private static int[] strr = { R.drawable.rabbit, R.drawable.rain,
			R.drawable.rhino, R.drawable.river, R.drawable.rose };
	private static int[] strs = { R.drawable.sad, R.drawable.sing,
			R.drawable.sock, R.drawable.sun };
	private static int[] strt = { R.drawable.tall, R.drawable.tea,
			R.drawable.town, R.drawable.tulip };
	private static int[] stru = { R.drawable.ugly, R.drawable.umbrella,
			R.drawable.uncle, R.drawable.unicorn };
	private static int[] strv = { R.drawable.van, R.drawable.violin,
			R.drawable.volcano, R.drawable.vulture };
	private static int[] strw = { R.drawable.wall, R.drawable.wallet,
			R.drawable.web, R.drawable.wind };
	private static int[] strx = { R.drawable.xenops, R.drawable.xylophone };
	private static int[] stry = { R.drawable.yacht, R.drawable.yak,
			R.drawable.yard, R.drawable.year };
	private static int[] strz = { R.drawable.zebra, R.drawable.zigzag,
			R.drawable.zinia, R.drawable.zoo };
	private static int[][] whole = { stra, strb, strc, strd, stre, strf, strg,
			strh, stri, strj, strk, strl, strm, strn, stro, strp, strq, strr,
			strs, strt, stru, strv, strw, strx, stry, strz };

	int one, two, three, four, five, six;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		// Create custom dialog object
		final Dialog dialog = new Dialog(English_letter_test4.this);
		// Include dialog.xml file
		dialog.setContentView(R.layout.dialog);
		// Set dialog title
		dialog.setTitle("Test Four");
		Random rnd = new Random();
		int numLetters = 1;
		number = new int[2];
		number[0] = number[1] = 0;
		String randomLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		for (int n = 0; n < numLetters; n++) {
			// Log.d("Random letters",randomLetters.charAt(rnd.nextInt(randomLetters.length())));
			ch = randomLetters.charAt(rnd.nextInt(randomLetters.length()));
		}
		// set values for custom dialog components - text, image and button
		TextView text = (TextView) dialog.findViewById(R.id.textDialog);
		text.setText("Find " + ch + " With Correct Image" + " !!");
		ImageView image = (ImageView) dialog.findViewById(R.id.imageDialog);
		if (ch == 'A') {
			image.setImageResource(R.drawable.up_a);
		} else if (ch == 'B') {
			image.setImageResource(R.drawable.up_b);
		} else if (ch == 'C') {
			image.setImageResource(R.drawable.up_c);
		} else if (ch == 'D') {
			image.setImageResource(R.drawable.up_d);
		} else if (ch == 'E') {
			image.setImageResource(R.drawable.up_e);
		} else if (ch == 'F') {
			image.setImageResource(R.drawable.up_f);
		} else if (ch == 'G') {
			image.setImageResource(R.drawable.up_g);
		} else if (ch == 'H') {
			image.setImageResource(R.drawable.up_h);
		} else if (ch == 'I') {
			image.setImageResource(R.drawable.up_i);
		} else if (ch == 'J') {
			image.setImageResource(R.drawable.up_j);
		} else if (ch == 'K') {
			image.setImageResource(R.drawable.up_k);
		} else if (ch == 'L') {
			image.setImageResource(R.drawable.up_l);
		} else if (ch == 'M') {
			image.setImageResource(R.drawable.up_m);
		} else if (ch == 'N') {
			image.setImageResource(R.drawable.up_n);
		} else if (ch == 'O') {
			image.setImageResource(R.drawable.up_o);
		} else if (ch == 'P') {
			image.setImageResource(R.drawable.up_p);
		} else if (ch == 'Q') {
			image.setImageResource(R.drawable.up_q);
		} else if (ch == 'R') {
			image.setImageResource(R.drawable.up_r);
		} else if (ch == 'S') {
			image.setImageResource(R.drawable.up_s);
		} else if (ch == 'T') {
			image.setImageResource(R.drawable.up_t);
		} else if (ch == 'U') {
			image.setImageResource(R.drawable.up_u);
		} else if (ch == 'V') {
			image.setImageResource(R.drawable.up_v);
		} else if (ch == 'W') {
			image.setImageResource(R.drawable.up_w);
		} else if (ch == 'X') {
			image.setImageResource(R.drawable.up_x);
		} else if (ch == 'Y') {
			image.setImageResource(R.drawable.up_y);
		} else if (ch == 'Z') {
			image.setImageResource(R.drawable.up_z);
		}
		dialog.show();

		Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
		// if decline button is clicked, close the custom dialog
		declineButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Close dialog
				dialog.dismiss();
			}
		});
		setContentView(R.layout.eng_letter_test3);
		oursong = MediaPlayer.create(English_letter_test4.this,
				R.raw.correct_new);
		oursong2 = MediaPlayer.create(English_letter_test4.this,
				R.raw.wrong_new);

		a = (ImageButton) findViewById(R.id.bt_1);
		b = (ImageButton) findViewById(R.id.bt_2);
		c = (ImageButton) findViewById(R.id.bt_3);
		d = (ImageButton) findViewById(R.id.bt_4);
		e = (ImageButton) findViewById(R.id.bt_5);
		f = (ImageButton) findViewById(R.id.bt_6);

		r = new Random();
		i1 = r.nextInt(7 - 1) + 1;
		if (ch == 'A') {
			randomstring = stra[new Random().nextInt(stra.length)];
		} else if (ch == 'B') {
			randomstring = strb[new Random().nextInt(strb.length)];
		} else if (ch == 'C') {
			randomstring = strc[new Random().nextInt(strc.length)];
		} else if (ch == 'D') {
			randomstring = strd[new Random().nextInt(strd.length)];
		} else if (ch == 'E') {
			randomstring = stre[new Random().nextInt(stre.length)];
		} else if (ch == 'F') {
			randomstring = strf[new Random().nextInt(strf.length)];
		} else if (ch == 'G') {
			randomstring = strg[new Random().nextInt(strg.length)];
		} else if (ch == 'H') {
			randomstring = strh[new Random().nextInt(strh.length)];
		} else if (ch == 'I') {
			randomstring = stri[new Random().nextInt(stri.length)];
		} else if (ch == 'J') {
			randomstring = strj[new Random().nextInt(strj.length)];
		} else if (ch == 'K') {
			randomstring = strk[new Random().nextInt(strk.length)];
		} else if (ch == 'L') {
			randomstring = strl[new Random().nextInt(strl.length)];
		} else if (ch == 'M') {
			randomstring = strm[new Random().nextInt(strm.length)];
		} else if (ch == 'N') {
			randomstring = strn[new Random().nextInt(strn.length)];
		} else if (ch == 'O') {
			randomstring = stro[new Random().nextInt(stro.length)];
		} else if (ch == 'P') {
			randomstring = strp[new Random().nextInt(strp.length)];
		} else if (ch == 'Q') {
			randomstring = strq[new Random().nextInt(strq.length)];
		} else if (ch == 'R') {
			randomstring = strr[new Random().nextInt(strr.length)];
		} else if (ch == 'S') {
			randomstring = strs[new Random().nextInt(strs.length)];
		} else if (ch == 'T') {
			randomstring = strt[new Random().nextInt(strt.length)];
		} else if (ch == 'U') {
			randomstring = stru[new Random().nextInt(stru.length)];
		} else if (ch == 'V') {
			randomstring = strv[new Random().nextInt(strv.length)];
		} else if (ch == 'W') {
			randomstring = strw[new Random().nextInt(strw.length)];
		} else if (ch == 'X') {
			randomstring = strx[new Random().nextInt(strx.length)];
		} else if (ch == 'Y') {
			randomstring = stry[new Random().nextInt(stry.length)];
		} else if (ch == 'Z') {
			randomstring = strz[new Random().nextInt(strz.length)];
		}

		if (i1 == 1) {
			a.setImageResource(randomstring);
			one = randomstring;
			level = 1;
		} else if (i1 == 2) {
			b.setImageResource(randomstring);
			two = randomstring;
			level = 2;
		} else if (i1 == 3) {
			c.setImageResource(randomstring);
			three = randomstring;
			level = 3;
		} else if (i1 == 4) {
			d.setImageResource(randomstring);
			four = randomstring;
			level = 4;
		} else if (i1 == 5) {
			e.setImageResource(randomstring);
			five = randomstring;
			level = 5;
		} else if (i1 == 6) {
			f.setImageResource(randomstring);
			six = randomstring;
			level = 6;
		}

		Find_random_image();

		a.setOnClickListener(this);
		b.setOnClickListener(this);
		c.setOnClickListener(this);
		d.setOnClickListener(this);
		e.setOnClickListener(this);
		f.setOnClickListener(this);

	}

	public void Find_random_image() {
		int five = 0;
		if (ch == 'A') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 0) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				} else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				} else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				} else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				}

				else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}

			}
		} else if (ch == 'B') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 1) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				} else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				}

				else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				} else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				}

				else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'C') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 2) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				} else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				}

				else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				} else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				}

				else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'D') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 3) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				} else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				}

				else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				} else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				}

				else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'E') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 4) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				} else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				}

				else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				} else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				}

				else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'F') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 5) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				} else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				}

				else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				} else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				}

				else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'G') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 6) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				} else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				}

				else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				} else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				}

				else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'H') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 7) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				} else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				}

				else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				} else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				}

				else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'I') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 8) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				} else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				}

				else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				} else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				}

				else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'J') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 9) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				} else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				}

				else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				} else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				}

				else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'K') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 10) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				}

				else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				} else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				}

				else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'L') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 11) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				}

				else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				} else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				}

				else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'M') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 12) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				}

				else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				} else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				}

				else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'N') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 13) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				}

				else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				} else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				} else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				}

				else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}
				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'O') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 14) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				}

				else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				} else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				}

				else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'P') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 15) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				}

				else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				} else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				}

				else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'Q') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 16) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				}

				else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				} else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				}

				else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'R') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 17) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				}

				else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				} else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				}

				else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				} else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'S') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 18) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				}

				else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				} else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				}

				else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				} else if (number[0] == 16) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 17) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'T') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 19) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				}

				else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				} else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				}

				else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				} else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'U') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 20) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				}

				else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				} else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				}

				else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				} else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				}

				else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'V') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 21) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				}

				else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				} else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				}

				else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				} else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				}

				else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'W') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 22) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				}

				else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				} else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				}

				else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				} else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				}

				else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				} else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'X') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 23) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				}

				else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				} else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				}

				else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				} else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				}

				else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				} else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'Y') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 24) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				}

				else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				} else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				}

				else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				} else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				}

				else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				} else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 25) {
					randomstring = strz[new Random().nextInt(strz.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		} else if (ch == 'Z') {
			while (five <= 6) {
				number = whole[new Random().nextInt(whole.length)];
				while (number[0] == 25) {
					number = whole[new Random().nextInt(whole.length)];
					s1 = Integer.toString(number[0]);
					Log.d("1", s1);
				}
				++five;
				if (number[0] == 0) {
					randomstring = stra[new Random().nextInt(stra.length)];
				} else if (number[0] == 1) {
					randomstring = strb[new Random().nextInt(strb.length)];
				} else if (number[0] == 2) {
					randomstring = strc[new Random().nextInt(strc.length)];
				} else if (number[0] == 3) {
					randomstring = strd[new Random().nextInt(strd.length)];
				} else if (number[0] == 4) {
					randomstring = stre[new Random().nextInt(stre.length)];
				} else if (number[0] == 5) {
					randomstring = strf[new Random().nextInt(strf.length)];
				} else if (number[0] == 6) {
					randomstring = strg[new Random().nextInt(strg.length)];
				} else if (number[0] == 7) {
					randomstring = strh[new Random().nextInt(strh.length)];
				} else if (number[0] == 8) {
					randomstring = stri[new Random().nextInt(stri.length)];
				} else if (number[0] == 9) {
					randomstring = strj[new Random().nextInt(strj.length)];
				} else if (number[0] == 10) {
					randomstring = strk[new Random().nextInt(strk.length)];
				}

				else if (number[0] == 11) {
					randomstring = strl[new Random().nextInt(strl.length)];
				} else if (number[0] == 12) {
					randomstring = strm[new Random().nextInt(strm.length)];
				} else if (number[0] == 13) {
					randomstring = strn[new Random().nextInt(strn.length)];
				} else if (number[0] == 14) {
					randomstring = stro[new Random().nextInt(stro.length)];
				}

				else if (number[0] == 15) {
					randomstring = strp[new Random().nextInt(strp.length)];
				} else if (number[0] == 16) {
					randomstring = strq[new Random().nextInt(strq.length)];
				} else if (number[0] == 17) {
					randomstring = strr[new Random().nextInt(strr.length)];
				} else if (number[0] == 18) {
					randomstring = strs[new Random().nextInt(strs.length)];
				} else if (number[0] == 19) {
					randomstring = strt[new Random().nextInt(strt.length)];
				}

				else if (number[0] == 20) {
					randomstring = stru[new Random().nextInt(stru.length)];
				} else if (number[0] == 21) {
					randomstring = strv[new Random().nextInt(strv.length)];
				} else if (number[0] == 22) {
					randomstring = strw[new Random().nextInt(strw.length)];
				} else if (number[0] == 23) {
					randomstring = strx[new Random().nextInt(strx.length)];
				} else if (number[0] == 24) {
					randomstring = stry[new Random().nextInt(stry.length)];
				}

				if (five == 1 && level != 1) {
					a.setImageResource(randomstring);
				} else if (five == 2 && level != 2) {
					b.setImageResource(randomstring);
				} else if (five == 3 && level != 3) {
					c.setImageResource(randomstring);
				} else if (five == 4 && level != 4) {
					d.setImageResource(randomstring);
				} else if (five == 5 && level != 5) {
					e.setImageResource(randomstring);
				} else if (five == 6 && level != 6) {
					f.setImageResource(randomstring);
				}
			}
		}
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bt_1:
			if (level == 1) {
				oursong.start();
				Thread timer = new Thread() {
					public void run() {
						try {
							sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				};
				timer.start();
				runOnUiThread(new Runnable() {
					public void run() {
						custom_dialog();
					}
				});

			} else {
				a.setBackgroundColor(color.transparent);
				oursong2.start();
				Thread timer = new Thread() {
					public void run() {
						try {
							sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				};
				timer.start();
			}
			break;
		case R.id.bt_2:
			if (level == 2) {
				oursong.start();
				Thread timer = new Thread() {
					public void run() {
						try {
							sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				};
				timer.start();
				runOnUiThread(new Runnable() {
					public void run() {
						custom_dialog();
					}
				});
			} else {
				b.setBackgroundColor(color.transparent);
				oursong2.start();
				Thread timer = new Thread() {
					public void run() {
						try {
							sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				};
				timer.start();
			}
			break;
		case R.id.bt_3:
			if (level == 3) {
				oursong.start();
				Thread timer = new Thread() {
					public void run() {
						try {
							sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				};
				timer.start();
				runOnUiThread(new Runnable() {
					public void run() {
						custom_dialog();
					}
				});
			} else {
				c.setBackgroundColor(color.transparent);
				oursong2.start();
				Thread timer = new Thread() {
					public void run() {
						try {
							sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				};
				timer.start();
			}
			break;
		case R.id.bt_4:
			if (level == 4) {
				oursong.start();
				Thread timer = new Thread() {
					public void run() {
						try {
							sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				};
				timer.start();
				runOnUiThread(new Runnable() {
					public void run() {
						custom_dialog();
					}
				});
			} else {
				d.setBackgroundColor(color.transparent);
				oursong2.start();
				Thread timer = new Thread() {
					public void run() {
						try {
							sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				};
				timer.start();
			}
			break;
		case R.id.bt_5:
			if (level == 5) {
				oursong.start();
				Thread timer = new Thread() {
					public void run() {
						try {
							sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				};
				timer.start();
				runOnUiThread(new Runnable() {
					public void run() {
						custom_dialog();
					}
				});
			} else {
				e.setBackgroundColor(color.transparent);
				oursong2.start();
				Thread timer = new Thread() {
					public void run() {
						try {
							sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				};
				timer.start();
			}
			break;
		case R.id.bt_6:
			if (level == 6) {
				oursong.start();
				Thread timer = new Thread() {
					public void run() {
						try {
							sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				};
				timer.start();
				runOnUiThread(new Runnable() {
					public void run() {
						custom_dialog();
					}
				});
			} else {
				f.setBackgroundColor(color.transparent);
				oursong2.start();
				Thread timer = new Thread() {
					public void run() {
						try {
							sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				};
				timer.start();
			}
			break;
		}
	}

	public void custom_dialog() {

		final Dialog dialog = new Dialog(English_letter_test4.this);
		// Include dialog.xml file
		dialog.setContentView(R.layout.dialog);
		// Set dialog title
		dialog.setTitle("Test 4");

		// set values for custom dialog components - text, image and button
		TextView text = (TextView) dialog.findViewById(R.id.textDialog);
		text.setText("Test 4 successfully passed!!");
		ImageView image = (ImageView) dialog.findViewById(R.id.imageDialog);
		image.setImageResource(R.drawable.pass);

		dialog.show();

		Button declineButton = (Button) dialog.findViewById(R.id.declineButton);
		declineButton.setText("Congratulations");
		// if decline button is clicked, close the custom dialog
		declineButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// Close dialog
				dialog.dismiss();
				finish();
				Intent intent = new Intent(getApplicationContext(),
						English_letter_test4.class);
				startActivity(intent);
			}
		});
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		oursong.release();
		oursong2.release();

	}
}
