package com.param.android.thalaivargal;





import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


public class Periyar extends Activity {

	
	Button periyar_next,periyar_back ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
		

		
	
		setContentView(R.layout.activity_main_periyar);
		
		
		
		/*// Get the message from the intent
	    Intent intent = getIntent();
	    String message = intent.getStringExtra("message");
	    

	    // Create the text view
	    TextView textView = new TextView(this);
	    textView.setTextSize(40);
	    textView.setText(message);

	    // Set the text view as the activity layout
	    setContentView(textView);*/

	}

	public void periyar_back(View view)
	{
		
		 startActivity(new Intent("com.example.thalaivargal.Periyar"));
	}
	
	public void periyar_next(View view)
	{
		 startActivity(new Intent("com.example.thalaivargal.Barathi"));
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}
