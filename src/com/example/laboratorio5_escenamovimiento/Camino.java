package com.example.laboratorio5_escenamovimiento;

import javax.microedition.khronos.opengles.GL10;

public class Camino {

	Piso piso;
	
	public Camino (){
		piso = new Piso();
	}
	public void dibuja(GL10 gl){
		gl.glPushMatrix();
		gl.glScalef(3, 1, 50);
		gl.glColor4f(40/255f, 40/255f, 40/255f, 1);
		piso.dibuja(gl);
		gl.glPopMatrix();
		
		gl.glPushMatrix();
		gl.glColor4f(1, 1, 0, 1);
		gl.glTranslatef(0,0.1f, 0);
		gl.glTranslatef(0.2f, 0, 0);
		gl.glScalef(0.1f, 1, 50);
		piso.dibuja(gl);
		gl.glTranslatef(-4, 0, 0);
		piso.dibuja(gl);
		gl.glPopMatrix();
	}
}
