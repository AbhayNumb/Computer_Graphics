package Basic;
import javax.swing.JFrame;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLJPanel;  
  
public class Hash implements GLEventListener {  
  
    @Override  
public void init(GLAutoDrawable arg0)   
  {  
          
  }  
  
   @Override  
   public void display(GLAutoDrawable drawable) {  
	   final GL2 gl = drawable.getGL().getGL2();  
  
      //Right edge  
	   gl.glBegin (GL2.GL_LINES);  
	   gl.glVertex2d(0, 0.65);  
	   gl.glVertex2d(0, -0.65);  
	   gl.glEnd();  
	   
	   gl.glBegin (GL2.GL_LINES);  
	   gl.glVertex2d(0.5, 0.65);  
	   gl.glVertex2d(0.5, -0.65);  
	   gl.glEnd();  
	   
	   gl.glBegin (GL2.GL_LINES);  
	   gl.glVertex2d(-0.2, 0.25);  
	   gl.glVertex2d(0.7, 0.25);  
	   gl.glEnd();
	   
	   gl.glBegin (GL2.GL_LINES);  
	   gl.glVertex2d(-0.2, -0.25);  
	   gl.glVertex2d(0.7, -0.25);  
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
       Hash tr= new Hash();  
       gc.addGLEventListener(tr);  
       gc.setSize(400, 400);  
  
       final JFrame frame = new JFrame("JOGL Hash");  
       frame.add(gc);  
       frame.setSize(500,400);  
       frame.setVisible(true);
   }


    
}  