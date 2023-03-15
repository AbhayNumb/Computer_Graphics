package Basic;
import javax.swing.JFrame;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLJPanel;  
  
public class LineStripple implements GLEventListener {  
  
    @Override  
public void init(GLAutoDrawable arg0)   
  {  
          
  }  
  
   @Override  
   public void display(GLAutoDrawable drawable) {  
	   final GL2 gl = drawable.getGL().getGL2();  
  
	   gl.glLineStipple(1, (short) 0x00FF); // set the line stipple pattern to 0x00FF (dashed)
	   gl.glEnable(GL2.GL_LINE_STIPPLE); // enable line stippling
	   gl.glLineWidth(2.0f); // set the line width to 2.0
	   gl.glBegin(GL2.GL_LINES); // start drawing lines
	   gl.glVertex2f(-0.4f, -0.2f); // define the start point
	   gl.glVertex2f(0.5f, -0.2f); // define the end point
	   gl.glEnd(); // end drawing lines
	   gl.glDisable(GL2.GL_LINE_STIPPLE); // disable line stippling
	   
	   gl.glLineStipple(1, (short) 0x0101); // set the line stipple pattern to 0x00FF (dashed)
	   gl.glEnable(GL2.GL_LINE_STIPPLE); // enable line stippling
	   gl.glLineWidth(2.0f); // set the line width to 2.0
	   gl.glBegin(GL2.GL_LINES); // start drawing lines
	   gl.glVertex2f(-0.4f, -0.1f); // define the start point
	   gl.glVertex2f(0.5f, -0.1f); // define the end point
	   gl.glEnd(); // end drawing lines
	   gl.glDisable(GL2.GL_LINE_STIPPLE); // disable line stippling
	   
	   gl.glLineStipple(1, (short) 0x00F0); // set the line stipple pattern to 0x00FF (dashed)
	   gl.glEnable(GL2.GL_LINE_STIPPLE); // enable line stippling
	   gl.glLineWidth(2.0f); // set the line width to 2.0
	   gl.glBegin(GL2.GL_LINES); // start drawing lines
	   gl.glVertex2f(-0.4f, 0.0f); // define the start point
	   gl.glVertex2f(0.5f, 0.0f); // define the end point
	   gl.glEnd(); // end drawing lines
	   gl.glDisable(GL2.GL_LINE_STIPPLE); // disable line stippling

	   gl.glLineStipple(1, (short) 0x5555); // set the line stipple pattern to 0x00FF (dashed)
	   gl.glEnable(GL2.GL_LINE_STIPPLE); // enable line stippling
	   gl.glLineWidth(2.0f); // set the line width to 2.0
	   gl.glBegin(GL2.GL_LINES); // start drawing lines
	   gl.glVertex2f(-0.4f, 0.1f); // define the start point
	   gl.glVertex2f(0.5f, 0.1f); // define the end point
	   gl.glEnd(); // end drawing lines
	   gl.glDisable(GL2.GL_LINE_STIPPLE); // disable line stippling
	   
	   gl.glLineStipple(1, (short) 0x3333); // set the line stipple pattern to 0x00FF (dashed)
	   gl.glEnable(GL2.GL_LINE_STIPPLE); // enable line stippling
	   gl.glLineWidth(2.0f); // set the line width to 2.0
	   gl.glBegin(GL2.GL_LINES); // start drawing lines
	   gl.glVertex2f(-0.4f, 0.2f); // define the start point
	   gl.glVertex2f(0.5f, 0.2f); // define the end point
	   gl.glEnd(); // end drawing lines
	   gl.glDisable(GL2.GL_LINE_STIPPLE); // disable line stippling
	   
	   
   }        
   @Override  
   public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4)   {      
  
   }  
   @Override  
   public void dispose(GLAutoDrawable arg0){  
  
   }  
  
   public static void main(String[] args) {  
  
	   final GLProfile gp = GLProfile.get(GLProfile.GL2);  
	   GLCapabilities cap = new GLCapabilities(gp);  
  
	   final GLJPanel gc = new GLJPanel(cap);  
       LineStripple tr= new LineStripple();  
       gc.addGLEventListener(tr);  
       gc.setSize(400, 400);  
  
       final JFrame frame = new JFrame("JOGL LineStripple");  
       frame.add(gc);  
       frame.setSize(500,400);  
       frame.setVisible(true);
   }


    
}  