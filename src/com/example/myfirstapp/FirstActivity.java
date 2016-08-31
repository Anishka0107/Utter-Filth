package com.example.myfirstapp;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;

public class FirstActivity extends Activity {
	MediaPlayer mps;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		mps=MediaPlayer.create(this, R.raw.songs);
		mps.start();
		Thread th=new Thread()
		{
			public void run()
			{
				try
				{
					sleep(6000);
				}
				catch(Exception e)
				{
				}
				finally
				{
				Intent i=new Intent(FirstActivity.this,SecondActivity.class);
				startActivity(i);
				finish();
				}
				}
			};
			th.start();
	}
			protected void onPause()
			{
				super.onPause();
				mps.release();
				finish();
			}
	}




