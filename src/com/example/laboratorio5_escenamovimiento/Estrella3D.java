package com.example.laboratorio5_escenamovimiento;

import javax.microedition.khronos.opengles.GL10;

public class Estrella3D {

	public Piramide piramide;
	
	public Estrella3D(){
		piramide = new Piramide();
	}
	public void dibuja(GL10 gl){
		piramide.dibuja(gl);
		gl.glTranslatef(0, -1, 0);
		gl.glRotatef(180, 1, 0, 0);
		gl.glColor4f(140/255f, 140/255f, 140/255f, 1);
		piramide.dibuja(gl);
	}
}
