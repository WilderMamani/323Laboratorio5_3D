package com.example.laboratorio5_escenamovimiento;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;

/**
 * Clase Casa (OpenGL 1.x)
 *  
 * @author Jhonny Felipez
 * @version 1.0 21/08/2016
 *
 */
public class Casa {
	
	/**
	 *              9  
	 *             / \ 
	 *       3  7/     \ 2
	 *         / \     /|   
	 *       /     \ /  |
	 *    8   |      6  |
	 *     |  |      |  |
	 *     | 0 ------|-- 1 
	 *     | /       | /
	 *     |/        |/
	 *    4 --------- 5  
	 */
	private float vertices[] = new float[] {
		// Frente
		-1, -1.0f,  1, // 4   0
		 1, -1.0f,  1, // 5   1
		 1,  1.2f,  1, // 6   2
		 0,  2.2f,  1, // 7   3
		-1,  1.2f,  1, // 8   4
		
		// Atrás
		-1,  1.2f, -1.6f, // 3   5
		 0,  2.2f, -1.6f, // 9   6		
		 1,  1.2f, -1.6f, // 2   7
		 1, -1.0f, -1.6f, // 1   8
		-1, -1.0f, -1.6f, // 0   9
		
		// Izquierda
		-1, -1.0f, -1.6f, // 0  10
		-1, -1.0f,  1.0f, // 4  11
		-1,  1.2f,  1.0f, // 8  12 
		-1,  1.2f, -1.6f, // 3  13
		
		// Derecha
		 1, -1.0f,  1.0f, // 5  14 
		 1, -1.0f, -1.6f, // 1  15
		 1,  1.2f, -1.6f, // 2  16
		 1,  1.2f,  1.0f, // 6  17
		 
		 // Abajo
		-1, -1, -1.6f, // 0  18
		 1, -1, -1.6f, // 1  19
		 1, -1,  1.0f, // 5  20
		-1, -1,  1.0f, // 4  21
		
		 // Arriba
		-1,  1.2f,  1.0f, // 8  22
		 0,  2.2f,  1.0f, // 7  23
		 0,  2.2f, -1.6f, // 9  24
		-1,  1.2f, -1.6f, // 3  25
		
		 0,  2.2f,  1.0f, // 7  26
		 1,  1.2f,  1.0f, // 6  27
		 1,  1.2f, -1.6f, // 2  28
		 0,  2.2f, -1.6f, // 9  29
		 
		// Puerta
		-0.4f, -1.0f,  1.01f, //   30
		 0.4f, -1.0f,  1.01f, //   31
		 0.4f,  0.2f,  1.01f, //   32
		-0.4f,  0.2f,  1.01f, //   33
		
		// Ventana Derecha
		 1.02f,  0.0f,  0.1f, //   34 
		 1.02f,  0.0f, -0.7f, //   35
		 1.02f,  0.4f, -0.7f, //   36
		 1.02f,  0.4f,  0.1f, //   37
		 
		// Ventana Izquierda
		-1.01f,  0.0f, -0.7f, //   38
		-1.01f,  0.0f,  0.1f, //   39
		-1.01f,  0.4f,  0.1f, //   40
		-1.01f,  0.4f, -0.7f, //   41
	};
	
	FloatBuffer bufVertices;

	public Casa() {
		/* Lee los vértices */
		ByteBuffer bufByte = ByteBuffer.allocateDirect(vertices.length * 4);
		bufByte.order(ByteOrder.nativeOrder());
		bufVertices = bufByte.asFloatBuffer();
		bufVertices.put(vertices).rewind();
	}
	
	public void dibuja(GL10 gl) {

		gl.glEnableClientState(GL10.GL_VERTEX_ARRAY);
		gl.glVertexPointer(3, GL10.GL_FLOAT, 0, bufVertices);

		/* Frente */
		gl.glColor4f(0, 0, 1, 1);
		gl.glDrawArrays(GL10.GL_TRIANGLE_FAN,0,5);

		/* Atrás */
		gl.glDrawArrays(GL10.GL_TRIANGLE_FAN,5,5);
		
		/* Izquierda */
		gl.glColor4f(1, 1, 0, 1);
		gl.glDrawArrays(GL10.GL_TRIANGLE_FAN,10,4);
		
		/* Derecha */
		gl.glDrawArrays(GL10.GL_TRIANGLE_FAN,14,4);
		
		/* Abajo */
		gl.glColor4f(1,165/255f, 0, 1);
		gl.glDrawArrays(GL10.GL_TRIANGLE_FAN,18,4);
		
		/* Arriba */
		gl.glDrawArrays(GL10.GL_TRIANGLE_FAN,22,4);
		gl.glDrawArrays(GL10.GL_TRIANGLE_FAN,26,4);
		
		/* Puerta */
		gl.glColor4f(0, 1, 1, 1);
		gl.glDrawArrays(GL10.GL_TRIANGLE_FAN,30,4);
		
		/* Ventana Derecha */
		gl.glColor4f(165/255f, 42/255f, 42/255f, 1);
		gl.glDrawArrays(GL10.GL_TRIANGLE_FAN,34,4);
		
		/* Ventana Izquierda */
		gl.glColor4f(165/255f, 42/255f, 42/255f, 1);
		gl.glDrawArrays(GL10.GL_TRIANGLE_FAN,38,4);
		
		gl.glDisableClientState(GL10.GL_VERTEX_ARRAY);
		
	}
}
