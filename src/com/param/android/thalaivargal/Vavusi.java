package com.param.android.thalaivargal;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Vavusi extends Activity {

	

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_vavusi);
		
		
		
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
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		
		switch (item.getItemId()) {
        case R.id.credits:
        	 Intent intent = new Intent("com.param.android.thalaivargal.Credits");
  		   startActivity(intent);
            return true;      
        case R.id.exit:
        	moveTaskToBack(true);
        	Vavusi.this.finish();
        return true;
        default:
            return super.onOptionsItemSelected(item);
    }
	}

}

