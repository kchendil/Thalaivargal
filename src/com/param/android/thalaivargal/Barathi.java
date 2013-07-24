package com.param.android.thalaivargal;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Barathi extends Activity {

	
	Button barathi_next,barathi_back ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_barathi);
		
		
		
	}
	
	public void barathi_back(View view)
	{
		
		 startActivity(new Intent("com.param.android.thalaivargal.Periyar"));
	}
	
	public void barathi_next(View view)
	{
		
		 startActivity(new Intent("com.param.android.thalaivargal.Kamarajar"));
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
        	Barathi.this.finish();
        return true;
        default:
            return super.onOptionsItemSelected(item);
    }
	}
}

