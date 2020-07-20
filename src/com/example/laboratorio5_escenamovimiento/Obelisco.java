package com.example.laboratorio5_escenamovimiento;

import javax.microedition.khronos.opengles.GL10;

public class Obelisco {

	Piramide piramide;
	Cubo cubo;
	public Obelisco(){
		piramide = new Piramide();
		cubo = new Cubo();
	}
	public void dibuja(GL10 gl){
		gl.glColor4f(197/255f, 157/255f, 122/255f, 1);
		piramide.dibuja(gl);
		gl.glColor4f(1, 1, 1, 1);
		gl.glTranslatef(0, 2.8f, 0);
		gl.glScalef(0.5f, 3, 0.5f);
		cubo.dibuja(gl);
	}
}
