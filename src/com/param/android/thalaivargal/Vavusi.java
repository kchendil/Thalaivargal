package com.param.android.thalaivargal;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;


public class Vavusi extends Activity {

	

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_vavusi);
		
		
		
	}
	
	public void vavusi_back(View view)
	{
		
		 startActivity(new Intent("com.param.android.thalaivargal.Kamarajar"));
	}
	
	public void vavusi_next(View view)
	{
		
		 startActivity(new Intent("com.param.android.thalaivargal.Anna"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}

