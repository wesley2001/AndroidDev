package com.libary;

import android.opengl.Matrix;

public class MyProjection {
	public float[] mProjMatrix = new float[16];
	public int offset = 0;
	public float left = 0;
	public float right = 0;
	private float bottom = -1;
	private float top = 1;
	private float near = 3;
	private float far = 7;
	
	public MyProjection() {
	}
	
	public void calculateRatio(int width, int height) {
		float ratio = (float) width / height;
		
		this.left = -ratio;
		this.right = ratio;
		
		this.calculateMatrix();
	}
	
	private void calculateMatrix(){
		Matrix.frustumM(this.mProjMatrix, this.offset, this.left, this.right, this.bottom, this.top, this.near, this.far);	
	}
}
