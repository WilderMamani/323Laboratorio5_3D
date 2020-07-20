package com.example.laboratorio5_escenamovimiento;

import javax.microedition.khronos.opengles.GL10;

public class Montaña {

	Piramide piramide;
	public Montaña(){
		piramide = new Piramide();
	}
	
	public void dibuja(GL10 gl){
		gl.glPushMatrix();
		gl.glScalef(1.7f, 3, 1.7f);
		gl.glColor4f(77/255f, 24/255f, 17/255f, 1);
		piramide.dibuja(gl);
		gl.glColor4f(1, 1, 1, 1);
		gl.glTranslatef(0, 1, 0);
		gl.glScalef(0.2f, 0.3f, 0.2f);
		piramide.dibuja(gl);
		gl.glPopMatrix();
	}
}