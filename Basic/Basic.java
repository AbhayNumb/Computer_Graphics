package Basic;
import javax.swing.JFrame;

import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLJPanel;
import com.jogamp.opengl.util.CustomGLEventListener;

public class Basic implements CustomGLEventListener {

	public static void main(String[] args) {
		   
	      //getting the capabilities object of GL2 profile
	      final GLProfile profile = GLProfile.get(GLProfile.GL2);
	      GLCapabilities capabilities = new GLCapabilities(profile);
	      
	      // The GLJpanel class
	      GLJPanel gljpanel = new GLJPanel( capabilities ); 
	      Basic b = new Basic();
	      gljpanel.addGLEventListener(b);
	      gljpanel.setSize(400, 400);
	      
	      //creating frame
	      final JFrame frame = new JFrame (" Basic Frame");
	      
	      //adding canvas to it
	      frame.getContentPane().add( gljpanel);
	      frame.setSize(frame.getContentPane().getPreferredSize());
	      frame.setVisible(true);
	      
	   }//end of main

	@Override
	public void display(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(GLAutoDrawable arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}
	
}//end of classimport