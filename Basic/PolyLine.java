package Basic;
import javax.swing.JFrame;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLJPanel;  
  
public class PolyLine implements GLEventListener {  
  
    @Override  
public void init(GLAutoDrawable arg0)   
  {  
          
  }  
  
   @Override  
   public void display(GLAutoDrawable drawable) {  
	   final GL2 gl = drawable.getGL().getGL2();  
  
      // Base edge  
	   gl.glBegin (GL2.GL_LINES);  
	   gl.glVertex2d(0.22, 0.09);  
	   gl.glVertex2d(-0.1, 0.1);  
	   gl.glEnd();  
  
      //Right edge  
	   gl.glBegin (GL2.GL_LINES);  
	   gl.glVertex2d(-0.1, 0.1); 
	   gl.glVertex2d(-0.3, 0.5);  
	   gl.glEnd();  
  
      //Left edge  
	   gl.glBegin (GL2.GL_LINES);  
	   gl.glVertex2d(-0.3, 0.5);
	   gl.glVertex2d(-0.333, 0.6); 
	   gl.glEnd(); 
	   
	   
	   
	 //Left edge  
	   gl.glBegin (GL2.GL_LINES);  
	   gl.glVertex2d(-0.333, 0.6); 
	   gl.glVertex2d(-0.2, 0.9); 
	   gl.glEnd(); 
	   
	   gl.glBegin (GL2.GL_LINES);  
	   gl.glVertex2d(-0.2, 0.9); 
	   gl.glVertex2d(-0.1, 0.8); 
	   gl.glEnd(); 
	   
	   gl.glBegin (GL2.GL_LINES);  
	   gl.glVertex2d(-0.3, 0.5); 
	   gl.glVertex2d(-0.1, 0.7); 
	   gl.glEnd();
	   
	   gl.glBegin (GL2.GL_LINES); 
	   gl.glVertex2d(-0.1, 0.7);  
	   gl.glVertex2d(0, 0.5); 
	   gl.glEnd();
	   
	   gl.glBegin (GL2.GL_LINES); 
	   gl.glVertex2d(0, 0.5);  
	   gl.glVertex2d(-0.009, 0.7); 
	   gl.glEnd();
	   
	   gl.glBegin (GL2.GL_LINES); 
	   gl.glVertex2d(-0.009, 0.7);
	   gl.glVertex2d(0.2, 0.5);   
	   gl.glEnd();
	   
	   gl.glBegin (GL2.GL_LINES); 
	   gl.glVertex2d(0.2, 0.5); 
	   gl.glVertex2d(0.4, 0.7);  
	   gl.glEnd();
	   
	   gl.glBegin (GL2.GL_LINES); 
	   gl.glVertex2d(0.4, 0.7);  
	   gl.glVertex2d(0.4, 0.2); 
	   gl.glEnd();
	   
	   gl.glBegin (GL2.GL_LINES); 
	   gl.glVertex2d(0.4, 0.2);
	   gl.glVertex2d(0.1, 0.2); 
	   gl.glEnd();
	   
	   gl.glBegin (GL2.GL_LINES); 
	   gl.glVertex2d(0.1, 0.2);
	   gl.glVertex2d(0.3, 0.3); 
	   gl.glEnd();
	   
	   gl.glFlush();  
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
	   PolyLine tr= new PolyLine();  
       gc.addGLEventListener(tr);  
       gc.setSize(500, 500);  
  
       final JFrame frame = new JFrame("JOGL PolyLine");  
       frame.add(gc);  
       frame.setSize(900,900);  
       frame.setVisible(true);
   }


    
}  