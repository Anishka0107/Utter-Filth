package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.app.Activity;

public class RateActivity extends Activity {
	RatingBar r1;
	Button b1;
	TextView t1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rate);
		b1=(Button)findViewById(R.id.button1);
		r1=(RatingBar)findViewById(R.id.ratingBar1);
		t1=(TextView)findViewById(R.id.textView1);
	}
	public void get(View v)
	{
		String rating=String.valueOf(r1.getRating());
		t1.setText(rating);
	}


}
