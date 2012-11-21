package com.libary;

import android.opengl.Matrix;

public class MyCamera {
    // Position the eye behind the origin.
	public static float eyeX = 0.0f;
	public static float eyeY = 0.0f;
    public static float eyeZ = -5.5f;
 
    // We are looking toward the distance
    public static float lookX = 0.0f;
    public static float lookY = 0.0f;
    public static float lookZ = -5.0f;
 
    // Set our up vector. This is where our head would be pointing were we holding the camera.
    public static float upX = 0.0f;
    public static float upY = 1.0f;
    public static float upZ = 0.0f;
    
	public float[] mVMatrix = new float[16];
    
    public MyCamera(){
    	 Matrix.setLookAtM(mVMatrix, 0, eyeX, eyeY, eyeZ, lookX, lookY, lookZ, upX, upY, upZ);
    }
    
}
