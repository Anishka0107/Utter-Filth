package com.example.myfirstapp;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

public class ThirdActivity extends Activity {
	CheckBox tea,coffee,juice,milkshake;
	float totalamount=0.0f;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_third);
		tea=(CheckBox) findViewById (R.id.checkBox1);
		coffee=(CheckBox)findViewById(R.id.checkBox2);
		juice=(CheckBox)findViewById(R.id.checkBox3);
		milkshake=(CheckBox)findViewById(R.id.checkBox4);
		tea.setOnClickListener(new OnClickListener() {
			public void onClick(View v)
			{
				if(tea.isChecked())
				{totalamount+=1.0;}
			}
			});
		coffee.setOnClickListener(new OnClickListener() {
			public void onClick(View v)
			{
				if(coffee.isChecked())
				{totalamount+=1.5;}
			}
			});
		juice.setOnClickListener(new OnClickListener() {
			public void onClick(View v)
			{
				if(juice.isChecked())
				{totalamount+=1.75;}
			}
			});
		milkshake.setOnClickListener(new OnClickListener() {
			public void onClick(View v)
			{
				if(milkshake.isChecked())
				{totalamount+=2.0;}
			}
			});
		
	}

public void onClickButton(View v)
{
	SharedPreferences pref=getApplicationContext().getSharedPreferences("MyPref",0);
	Editor editor=pref.edit();
	editor.putFloat("tot",totalamount);
	editor.commit();
	Intent i=new Intent(this,FourthActivity.class);
	startActivity(i);
}
}


