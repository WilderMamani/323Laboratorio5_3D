package com.example.laboratorio5_escenamovimiento;

import javax.microedition.khronos.opengles.GL10;

public class ArbolPiramide {
	
	private Piramide piramide;
	private Cubo cubo;
	public ArbolPiramide() {
		piramide = new Piramide();
		cubo = new Cubo();
	}
	public void dibuja(GL10 gl){
		gl.glPushMatrix();
		gl.glTranslatef(0, -1.5f, 0);
		gl.glScalef(0.3f, 2, 0.3f);
		gl.glColor4f(100/255f, 60/255f, 40/255f, 1);
		cubo.dibuja(gl);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		gl.glScalef(1, 2, 1);
		gl.glTranslatef(0, 0.5f, 0);
		gl.glColor4f(34/255f, 177/255f, 76/255f, 1);
		piramide.dibuja(gl);
		gl.glPopMatrix();
	}
}
