package com.example.myfirstapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class FifthActivity extends Activity {
	public final String default_val=null;
	float default_vals;
	
	EditText name,amt;
	@Override
	protected void onCreate(Bundle abcde) {
		super.onCreate(abcde);
		setContentView(R.layout.activity_fifth);
		name=(EditText)findViewById(R.id.editText2);
		amt=(EditText)findViewById(R.id.editText1);
		
	}
	public void load(View v)
	{
		float sum=0.0f;
		SharedPreferences sh=getSharedPreferences("mydata",Context.MODE_PRIVATE);
		SharedPreferences pref=getApplicationContext().getSharedPreferences("MyPref", 0);
		String names=sh.getString("namez", default_val);
		float a=(float)pref.getFloat("tot",default_vals);
		float b=(float)pref.getFloat("tots", default_vals);
		sum=(float)(a+b);
		String amts=Float.toString(sum);
		if(names.equals(default_val))
		{
			Toast.makeText(getApplicationContext(), "No Data", Toast.LENGTH_LONG).show();
		}
		else
		{
			name.setText(names);
			amt.setText(amts);
			
			Toast.makeText(getApplicationContext(),"Data Loaded Successfully!",Toast.LENGTH_LONG).show();
		}
		
	}
	public void rate(View v)
	{
		Intent i=new Intent(this,RateActivity.class);
		startActivity(i);
	}


}
