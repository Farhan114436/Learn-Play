package com.example.english_test;

import com.example.learn_and_play.R;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.DragEvent;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class English_number_test2 extends Activity {
	ImageButton im1, im5, im7, im8, im10, im12, im14, im16, im19, im20;
	EditText et1, et5, et7, et8, et10, et12, et14, et16, et19, et20;
	int count;
	MediaPlayer oursong, oursong2;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.eng_number_test3);
		im1 = (ImageButton) findViewById(R.id.bt_1);
		im5 = (ImageButton) findViewById(R.id.bt_5);
		im7 = (ImageButton) findViewById(R.id.bt_7);
		im8 = (ImageButton) findViewById(R.id.bt_8);
		im10 = (ImageButton) findViewById(R.id.bt_10);
		im12 = (ImageButton) findViewById(R.id.bt_12);
		im14 = (ImageButton) findViewById(R.id.bt_14);
		im16 = (ImageButton) findViewById(R.id.bt_16);
		im19 = (ImageButton) findViewById(R.id.bt_19);
		im20 = (ImageButton) findViewById(R.id.bt_20);

		count = 0;
		et1 = (EditText) findViewById(R.id.et_1);
		et5 = (EditText) findViewById(R.id.et_5);
		et7 = (EditText) findViewById(R.id.et_7);
		et8 = (EditText) findViewById(R.id.et_8);
		et10 = (EditText) findViewById(R.id.et_10);
		et12 = (EditText) findViewById(R.id.et_12);
		et14 = (EditText) findViewById(R.id.et_14);
		et16 = (EditText) findViewById(R.id.et_16);
		et19 = (EditText) findViewById(R.id.et_19);
		et20 = (EditText) findViewById(R.id.et_20);
		oursong = MediaPlayer.create(English_number_test2.this, R.raw.correct);
		oursong2 = MediaPlayer.create(English_number_test2.this, R.raw.wrong);

		// Create custom dialog object
		final Dialog dialog = new Dialog(English_number_test2.this);
		// Include dialog.xml file
		dialog.setContentView(R.layout.dialog);
		// Set dialog title
		dialog.setTitle("Test Two");

		// set values for custom dialog components - text, image and button
		TextView text = (TextView) dialog.findViewById(R.id.textDialog);
		text.setText("Drag and Drop the Number..");
		ImageView image = (ImageView) dialog.findViewById(R.id.imageDialog);
		image.setImageResource(R.drawable.image0);
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

		im1.setOnDragListener(new View.OnDragListener() {

			public boolean onDrag(View v, DragEvent event) {
				// TODO Auto-generated method stub
				final int action = event.getAction();
				switch (action) {
				case DragEvent.ACTION_DRAG_STARTED:
					break;
				case DragEvent.ACTION_DRAG_EXITED:
					break;
				case DragEvent.ACTION_DRAG_ENTERED:
					break;
				case DragEvent.ACTION_DROP: {
					if (v == findViewById(R.id.et_1)) {
						View view = (View) event.getLocalState();
						ViewGroup viewgroup = (ViewGroup) view.getParent();
						viewgroup.removeView(view);

						// change the text
						EditText text = (EditText) v.findViewById(R.id.et_1);
						text.setText("1 = ONE");
						text.setBackgroundColor(Color.GREEN);
						LinearLayout containView = (LinearLayout) v;
						containView.addView(view);
						view.setVisibility(View.VISIBLE);
						++count;
						oursong.start();
						Thread timer = new Thread() {
							public void run() {
								try {
									sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								} finally {
									showCustomAlert();
								}
							}
						};
						timer.start();
						if (count == 10) {
							Checkcondition();
						}
					} else {
						View view = (View) event.getLocalState();
						view.setVisibility(View.VISIBLE);
						et1.setBackgroundColor(Color.RED);
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
						break;
					}
					break;
				}
				case DragEvent.ACTION_DRAG_ENDED: {

					break;
				}
				default:
					break;
				}
				return true;
			}
		});
		im1.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent arg1) {
				// TODO Auto-generated method stub
				ClipData data = ClipData.newPlainText("", "");
				View.DragShadowBuilder shadow = new View.DragShadowBuilder(im1);
				v.startDrag(data, shadow, null, 0);
				return false;
			}
		});

		im5.setOnDragListener(new View.OnDragListener() {

			public boolean onDrag(View v, DragEvent event) {
				// TODO Auto-generated method stub
				final int action = event.getAction();
				switch (action) {
				case DragEvent.ACTION_DRAG_STARTED:
					break;
				case DragEvent.ACTION_DRAG_EXITED:
					break;
				case DragEvent.ACTION_DRAG_ENTERED:
					break;
				case DragEvent.ACTION_DROP: {
					if (v == findViewById(R.id.et_5)) {
						View view = (View) event.getLocalState();
						ViewGroup viewgroup = (ViewGroup) view.getParent();
						viewgroup.removeView(view);

						// change the text
						EditText text = (EditText) v.findViewById(R.id.et_5);
						text.setText("5 = FIVE");
						text.setBackgroundColor(Color.GREEN);
						LinearLayout containView = (LinearLayout) v;
						containView.addView(view);
						view.setVisibility(View.VISIBLE);
						++count;
						oursong.start();
						Thread timer = new Thread() {
							public void run() {
								try {
									sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								} finally {
									showCustomAlert();
								}
							}
						};
						timer.start();
						if (count == 10) {
							Checkcondition();
						}
					} else {
						View view = (View) event.getLocalState();
						view.setVisibility(View.VISIBLE);
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
						break;
					}
					break;
				}
				case DragEvent.ACTION_DRAG_ENDED: {
					
					return (true);
				}
				default:
					break;
				}
				return true;
			}
		});
		im5.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent arg1) {
				// TODO Auto-generated method stub
				ClipData data = ClipData.newPlainText("", "");
				View.DragShadowBuilder shadow = new View.DragShadowBuilder(im5);
				v.startDrag(data, shadow, null, 0);
				return false;
			}
		});

		im7.setOnDragListener(new View.OnDragListener() {

			public boolean onDrag(View v, DragEvent event) {
				// TODO Auto-generated method stub
				final int action = event.getAction();
				switch (action) {
				case DragEvent.ACTION_DRAG_STARTED:
					break;
				case DragEvent.ACTION_DRAG_EXITED:
					break;
				case DragEvent.ACTION_DRAG_ENTERED:
					break;
				case DragEvent.ACTION_DROP: {
					if (v == findViewById(R.id.et_7)) {
						View view = (View) event.getLocalState();
						ViewGroup viewgroup = (ViewGroup) view.getParent();
						viewgroup.removeView(view);

						// change the text
						EditText text = (EditText) v.findViewById(R.id.et_7);
						text.setText("7 = SEVEN");
						text.setBackgroundColor(Color.GREEN);
						LinearLayout containView = (LinearLayout) v;
						containView.addView(view);
						view.setVisibility(View.VISIBLE);
						++count;
						oursong.start();
						Thread timer = new Thread() {
							public void run() {
								try {
									sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								} finally {
									showCustomAlert();
								}
							}
						};
						timer.start();
						if (count == 10) {
							Checkcondition();
						}
					} else {
						View view = (View) event.getLocalState();
						view.setVisibility(View.VISIBLE);
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
						break;
					}
					break;
				}
				case DragEvent.ACTION_DRAG_ENDED: {

					return (true);
				}
				default:
					break;
				}
				return true;
			}
		});
		im7.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent arg1) {
				// TODO Auto-generated method stub
				ClipData data = ClipData.newPlainText("", "");
				View.DragShadowBuilder shadow = new View.DragShadowBuilder(im7);
				v.startDrag(data, shadow, null, 0);
				return false;
			}
		});

		im8.setOnDragListener(new View.OnDragListener() {

			public boolean onDrag(View v, DragEvent event) {
				// TODO Auto-generated method stub
				final int action = event.getAction();
				switch (action) {
				case DragEvent.ACTION_DRAG_STARTED:
					break;
				case DragEvent.ACTION_DRAG_EXITED:
					break;
				case DragEvent.ACTION_DRAG_ENTERED:
					break;
				case DragEvent.ACTION_DROP: {
					if (v == findViewById(R.id.et_8)) {
						View view = (View) event.getLocalState();
						ViewGroup viewgroup = (ViewGroup) view.getParent();
						viewgroup.removeView(view);

						// change the text
						EditText text = (EditText) v.findViewById(R.id.et_8);
						text.setText("8 = EIGHT");
						text.setBackgroundColor(Color.GREEN);
						LinearLayout containView = (LinearLayout) v;
						containView.addView(view);
						view.setVisibility(View.VISIBLE);
						++count;
						oursong.start();
						Thread timer = new Thread() {
							public void run() {
								try {
									sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								} finally {
									showCustomAlert();
								}
							}
						};
						timer.start();
						if (count == 10) {
							Checkcondition();
						}
					} else {
						View view = (View) event.getLocalState();
						view.setVisibility(View.VISIBLE);
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
						break;
					}
					break;
				}
				case DragEvent.ACTION_DRAG_ENDED: {

					return (true);
				}
				default:
					break;
				}
				return true;
			}
		});
		im8.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent arg1) {
				// TODO Auto-generated method stub
				ClipData data = ClipData.newPlainText("", "");
				View.DragShadowBuilder shadow = new View.DragShadowBuilder(im8);
				v.startDrag(data, shadow, null, 0);
				return false;
			}
		});

		im10.setOnDragListener(new View.OnDragListener() {

			public boolean onDrag(View v, DragEvent event) {
				// TODO Auto-generated method stub
				final int action = event.getAction();
				switch (action) {
				case DragEvent.ACTION_DRAG_STARTED:
					break;
				case DragEvent.ACTION_DRAG_EXITED:
					break;
				case DragEvent.ACTION_DRAG_ENTERED:
					break;
				case DragEvent.ACTION_DROP: {
					if (v == findViewById(R.id.et_10)) {
						View view = (View) event.getLocalState();
						ViewGroup viewgroup = (ViewGroup) view.getParent();
						viewgroup.removeView(view);

						// change the text
						EditText text = (EditText) v.findViewById(R.id.et_10);
						text.setText("10 = TEN");
						text.setBackgroundColor(Color.GREEN);
						LinearLayout containView = (LinearLayout) v;
						containView.addView(view);
						view.setVisibility(View.VISIBLE);
						++count;
						oursong.start();
						Thread timer = new Thread() {
							public void run() {
								try {
									sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								} finally {
									showCustomAlert();
								}
							}
						};
						timer.start();
						if (count == 10) {
							Checkcondition();
						}
					} else {
						View view = (View) event.getLocalState();
						view.setVisibility(View.VISIBLE);
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
						break;
					}
					break;
				}
				case DragEvent.ACTION_DRAG_ENDED: {

					return (true);
				}
				default:
					break;
				}
				return true;
			}
		});
		im10.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent arg1) {
				// TODO Auto-generated method stub
				ClipData data = ClipData.newPlainText("", "");
				View.DragShadowBuilder shadow = new View.DragShadowBuilder(im10);
				v.startDrag(data, shadow, null, 0);
				return false;
			}
		});

		im12.setOnDragListener(new View.OnDragListener() {

			public boolean onDrag(View v, DragEvent event) {
				// TODO Auto-generated method stub
				final int action = event.getAction();
				switch (action) {
				case DragEvent.ACTION_DRAG_STARTED:
					break;
				case DragEvent.ACTION_DRAG_EXITED:
					break;
				case DragEvent.ACTION_DRAG_ENTERED:
					break;
				case DragEvent.ACTION_DROP: {
					if (v == findViewById(R.id.et_12)) {
						View view = (View) event.getLocalState();
						ViewGroup viewgroup = (ViewGroup) view.getParent();
						viewgroup.removeView(view);

						// change the text
						EditText text = (EditText) v.findViewById(R.id.et_12);
						text.setText("12 = TWELVE");
						text.setBackgroundColor(Color.GREEN);
						LinearLayout containView = (LinearLayout) v;
						containView.addView(view);
						view.setVisibility(View.VISIBLE);
						++count;
						oursong.start();
						Thread timer = new Thread() {
							public void run() {
								try {
									sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								} finally {
									showCustomAlert();
								}
							}
						};
						timer.start();
						if (count == 10) {
							Checkcondition();
						}
					} else {
						View view = (View) event.getLocalState();
						view.setVisibility(View.VISIBLE);
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
						break;
					}
					break;
				}
				case DragEvent.ACTION_DRAG_ENDED: {

					return (true);
				}
				default:
					break;
				}
				return true;
			}
		});
		im12.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent arg1) {
				// TODO Auto-generated method stub
				ClipData data = ClipData.newPlainText("", "");
				View.DragShadowBuilder shadow = new View.DragShadowBuilder(im12);
				v.startDrag(data, shadow, null, 0);
				return false;
			}
		});

		im14.setOnDragListener(new View.OnDragListener() {

			public boolean onDrag(View v, DragEvent event) {
				// TODO Auto-generated method stub
				final int action = event.getAction();
				switch (action) {
				case DragEvent.ACTION_DRAG_STARTED:
					break;
				case DragEvent.ACTION_DRAG_EXITED:
					break;
				case DragEvent.ACTION_DRAG_ENTERED:
					break;
				case DragEvent.ACTION_DROP: {
					if (v == findViewById(R.id.et_14)) {
						View view = (View) event.getLocalState();
						ViewGroup viewgroup = (ViewGroup) view.getParent();
						viewgroup.removeView(view);

						// change the text
						EditText text = (EditText) v.findViewById(R.id.et_14);
						text.setText("14 = Fourteen");
						text.setBackgroundColor(Color.GREEN);
						LinearLayout containView = (LinearLayout) v;
						containView.addView(view);
						view.setVisibility(View.VISIBLE);
						++count;
						oursong.start();
						Thread timer = new Thread() {
							public void run() {
								try {
									sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								} finally {
									showCustomAlert();
								}
							}
						};
						timer.start();
						if (count == 10) {
							Checkcondition();
						}
					} else {
						View view = (View) event.getLocalState();
						view.setVisibility(View.VISIBLE);
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
						break;
					}
					break;
				}
				case DragEvent.ACTION_DRAG_ENDED: {

					return (true);
				}
				default:
					break;
				}
				return true;
			}
		});
		im14.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent arg1) {
				// TODO Auto-generated method stub
				ClipData data = ClipData.newPlainText("", "");
				View.DragShadowBuilder shadow = new View.DragShadowBuilder(im14);
				v.startDrag(data, shadow, null, 0);
				return false;
			}
		});

		im16.setOnDragListener(new View.OnDragListener() {

			public boolean onDrag(View v, DragEvent event) {
				// TODO Auto-generated method stub
				final int action = event.getAction();
				switch (action) {
				case DragEvent.ACTION_DRAG_STARTED:
					break;
				case DragEvent.ACTION_DRAG_EXITED:
					break;
				case DragEvent.ACTION_DRAG_ENTERED:
					break;
				case DragEvent.ACTION_DROP: {
					if (v == findViewById(R.id.et_16)) {
						View view = (View) event.getLocalState();
						ViewGroup viewgroup = (ViewGroup) view.getParent();
						viewgroup.removeView(view);

						// change the text
						EditText text = (EditText) v.findViewById(R.id.et_16);
						text.setText("16 = SIXTEEN");
						text.setBackgroundColor(Color.GREEN);
						LinearLayout containView = (LinearLayout) v;
						containView.addView(view);
						view.setVisibility(View.VISIBLE);
						++count;
						oursong.start();
						Thread timer = new Thread() {
							public void run() {
								try {
									sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								} finally {
									showCustomAlert();
								}
							}
						};
						timer.start();
						if (count == 10) {
							Checkcondition();
						}
					} else {
						View view = (View) event.getLocalState();
						view.setVisibility(View.VISIBLE);
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
						break;
					}
					break;
				}
				case DragEvent.ACTION_DRAG_ENDED: {

					return (true);
				}
				default:
					break;
				}
				return true;
			}
		});
		im16.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent arg1) {
				// TODO Auto-generated method stub
				ClipData data = ClipData.newPlainText("", "");
				View.DragShadowBuilder shadow = new View.DragShadowBuilder(im16);
				v.startDrag(data, shadow, null, 0);
				return false;
			}
		});

		im19.setOnDragListener(new View.OnDragListener() {

			public boolean onDrag(View v, DragEvent event) {
				// TODO Auto-generated method stub
				final int action = event.getAction();
				switch (action) {
				case DragEvent.ACTION_DRAG_STARTED:
					break;
				case DragEvent.ACTION_DRAG_EXITED:
					break;
				case DragEvent.ACTION_DRAG_ENTERED:
					break;
				case DragEvent.ACTION_DROP: {
					if (v == findViewById(R.id.et_19)) {
						View view = (View) event.getLocalState();
						ViewGroup viewgroup = (ViewGroup) view.getParent();
						viewgroup.removeView(view);

						// change the text
						EditText text = (EditText) v.findViewById(R.id.et_19);
						text.setText("19 = NINETEEN");
						text.setBackgroundColor(Color.GREEN);
						LinearLayout containView = (LinearLayout) v;
						containView.addView(view);
						view.setVisibility(View.VISIBLE);
						++count;
						oursong.start();
						Thread timer = new Thread() {
							public void run() {
								try {
									sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								} finally {
									showCustomAlert();
								}
							}
						};
						timer.start();
						if (count == 10) {
							Checkcondition();
						}
					} else {
						View view = (View) event.getLocalState();
						view.setVisibility(View.VISIBLE);
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
						break;
					}
					break;
				}
				case DragEvent.ACTION_DRAG_ENDED: {

					return (true);
				}
				default:
					break;
				}
				return true;
			}
		});
		im19.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent arg1) {
				// TODO Auto-generated method stub
				ClipData data = ClipData.newPlainText("", "");
				View.DragShadowBuilder shadow = new View.DragShadowBuilder(im19);
				v.startDrag(data, shadow, null, 0);
				return false;
			}
		});

		im20.setOnDragListener(new View.OnDragListener() {

			public boolean onDrag(View v, DragEvent event) {
				// TODO Auto-generated method stub
				final int action = event.getAction();
				switch (action) {
				case DragEvent.ACTION_DRAG_STARTED:
					break;
				case DragEvent.ACTION_DRAG_EXITED:
					break;
				case DragEvent.ACTION_DRAG_ENTERED:
					break;
				case DragEvent.ACTION_DROP: {
					if (v == findViewById(R.id.et_20)) {
						View view = (View) event.getLocalState();
						ViewGroup viewgroup = (ViewGroup) view.getParent();
						viewgroup.removeView(view);

						// change the text
						EditText text = (EditText) v.findViewById(R.id.et_20);
						text.setText("20 = TWENTY");
						text.setBackgroundColor(Color.GREEN);
						LinearLayout containView = (LinearLayout) v;
						containView.addView(view);
						view.setVisibility(View.VISIBLE);
						++count;
						oursong.start();
						Thread timer = new Thread() {
							public void run() {
								try {
									sleep(1000);
								} catch (InterruptedException e) {
									e.printStackTrace();
								} finally {
									showCustomAlert();
								}
							}
						};
						timer.start();
						if (count == 10) {
							Checkcondition();
						}
					} else {
						View view = (View) event.getLocalState();
						view.setVisibility(View.VISIBLE);
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
						break;
					}
					break;
				}
				case DragEvent.ACTION_DRAG_ENDED: {

					return (true);
				}
				default:
					break;
				}
				return true;
			}
		});
		im20.setOnTouchListener(new OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent arg1) {
				// TODO Auto-generated method stub
				ClipData data = ClipData.newPlainText("", "");
				View.DragShadowBuilder shadow = new View.DragShadowBuilder(im20);
				v.startDrag(data, shadow, null, 0);
				return false;
			}
		});
	}

	public void Checkcondition() {
		Context context = getApplicationContext();
		// Create layout inflator object to inflate toast.xml file
		LayoutInflater inflater = getLayoutInflater();

		// Call toast.xml file for toast layout
		View toastRoot = inflater.inflate(R.layout.toast, null);
		TextView tv = (TextView) findViewById(R.id.tv);
		ImageView im = (ImageView) findViewById(R.id.imv);
		Toast toast = new Toast(context);
		im.setImageResource(R.drawable.pass);
		tv.setText("Test 2 Successfully Passed!!");
		// Set layout to toast
		toast.setView(toastRoot);
		toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,
				0, 0);
		toast.setDuration(Toast.LENGTH_LONG);
		toast.show();

		Intent intent = new Intent(this, English_number_test2.class);
		startActivity(intent);
	}

	public void showCustomAlert() {

		Context context = getApplicationContext();
		// Create layout inflator object to inflate toast.xml file
		LayoutInflater inflater = getLayoutInflater();

		// Call toast.xml file for toast layout
		View toastRoot = inflater.inflate(R.layout.toast, null);

		Toast toast = new Toast(context);

		// Set layout to toast
		toast.setView(toastRoot);
		toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL,
				0, 0);
		toast.setDuration(Toast.LENGTH_LONG);
		toast.show();

	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		oursong.release();
		oursong2.release();
		
	}
}
