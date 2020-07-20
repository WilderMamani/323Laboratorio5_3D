package com.example.laboratorio5_escenamovimiento;

import javax.microedition.khronos.opengles.GL10;

public class ArbolEsfera {
	
	private Esfera esfera;
	private Cubo cubo;
	public ArbolEsfera() {
		esfera = new Esfera(1, 10, 10);
		cubo = new Cubo();
	}
	public void dibuja(GL10 gl){
		gl.glPushMatrix();
		gl.glScalef(0.3f, 2, 0.3f);
		gl.glColor4f(100/255f, 60/255f, 40/255f, 1);
		cubo.dibuja(gl);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		gl.glScalef(2, 2, 2);
		gl.glTranslatef(0, 1.7f, 0);
		gl.glColor4f(34/255f, 177/255f, 76/255f, 1);
		esfera.dibuja(gl);
		gl.glPopMatrix();
	}
}
