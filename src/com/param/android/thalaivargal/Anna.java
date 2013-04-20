package com.param.android.thalaivargal;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Anna extends Activity {

	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_anna);
		
		
		
	}
	
	public void anna_back(View view)
	{
		
		 startActivity(new Intent("com.example.thalaivargal.Vavusi"));
	}
	
	public void anna_restart(View view)
	{
		
		startActivity(new Intent("com.example.thalaivargal.Periyar"));
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}

