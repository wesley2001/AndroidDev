package com.libary;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends Activity {
	private GLSurfaceView mGLView;
 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
        mGLView = new MyGLSurfaceView(this);
        setContentView(mGLView);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		android.os.Debug.stopMethodTracing();
	}
	
	@Override
	public void onPause() {
		super.onPause();
	}
	
	@Override
	public void onResume() {
		super.onResume();
	}
	
	@Override 
	protected void onStop() {
		super.onStop();
	}
	
	@Override 
	protected void onStart() {
		super.onStart();
	}
	
	@Override
	protected void onRestart() {
	    super.onRestart(); 
	}
}