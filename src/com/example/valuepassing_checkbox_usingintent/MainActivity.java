package com.example.valuepassing_checkbox_usingintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainActivity extends Activity
{
	CheckBox c1,c2;
	Button bt;
	String passvalue,c1value,c2value;
	String a,b,s1="";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		c1=(CheckBox)findViewById(R.id.checkBox1);
		c2=(CheckBox)findViewById(R.id.checkBox2);
		bt=(Button)findViewById(R.id.button1);
		
		bt.setOnClickListener(new OnClickListener() 
		{
			
			@Override
			public void onClick(View arg0)
			{
				// TODO Auto-generated method stub
				Intent i=new Intent(MainActivity.this,SecondActivity.class);
				
				i.putExtra("Key",s1);
				
				startActivity(i);
				
			}
		});
		
		c1.setOnCheckedChangeListener(new OnCheckedChangeListener() 
		{
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1) 
			{
				// TODO Auto-generated method stub
				
				if(arg1==true)
				{
					a=c1.getText().toString();
					s1=s1.concat(a);				
				}
				else
				{
					s1=s1.replace(a,"");
				}
				
			}
		});
		
		c2.setOnCheckedChangeListener(new OnCheckedChangeListener()
		{
			
			@Override
			public void onCheckedChanged(CompoundButton arg0, boolean arg1)
			{
				
				if(arg1==true)
				{
					b=c2.getText().toString();
					s1=s1.concat(b);
				}
				else
				{
					s1=s1.replace(b,"");
				}
			
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
