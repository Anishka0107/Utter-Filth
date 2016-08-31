package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class FourthActivity extends Activity {
	CheckBox burger,noodles,muffin,sandwich;
	float totalamounts=0.0f;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth);
		burger=(CheckBox)findViewById(R.id.checkBox1);
		noodles=(CheckBox)findViewById(R.id.checkBox2);
		muffin=(CheckBox)findViewById(R.id.checkBox3);
		sandwich=(CheckBox)findViewById(R.id.checkBox4);
		burger.setOnClickListener(new OnClickListener() {
			public void onClick(View v)
			{
				if(burger.isChecked())
				{totalamounts+=2.0;}
			}
			});
		noodles.setOnClickListener(new OnClickListener() {
			public void onClick(View v)
			{
				if(noodles.isChecked())
				{totalamounts+=2.5;}
			}
			});
		muffin.setOnClickListener(new OnClickListener() {
			public void onClick(View v)
			{
				if(muffin.isChecked())
				{totalamounts+=1.25;}
			}
			});
		sandwich.setOnClickListener(new OnClickListener() {
			public void onClick(View v)
			{
				if(sandwich.isChecked())
				{totalamounts+=2.5;}
			}
			});
	}
	public void onClickButton(View v)
	{
		SharedPreferences pref=getApplicationContext().getSharedPreferences("MyPref",0);
		Editor editor=pref.edit();
		editor.putFloat("tots",totalamounts);
		editor.commit();
		Intent i=new Intent(this,FifthActivity.class);
		startActivity(i);
	}
	
}
