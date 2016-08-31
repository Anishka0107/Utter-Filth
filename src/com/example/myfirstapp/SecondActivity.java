package com.example.myfirstapp;


import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends Activity {
	EditText name,contact;
	@Override
	protected void onCreate(Bundle abcd) {
		super.onCreate(abcd);
		setContentView(R.layout.activity_second);
		name=(EditText) findViewById (R.id.editText1);
		contact=(EditText) findViewById (R.id.editText2);
	}
		public void save(View v)
		{
			SharedPreferences sh=getSharedPreferences("mydata",Context.MODE_PRIVATE);
			Editor e=sh.edit();
			e.putString("namez",name.getText().toString());
			e.putString("contact", contact.getText().toString());
			e.commit();
			Toast.makeText(getApplicationContext(),"Data Loaded!",Toast.LENGTH_LONG).show();
			Intent i=new Intent(this,ThirdActivity.class);
			startActivity(i);
			
		}	
	
}
