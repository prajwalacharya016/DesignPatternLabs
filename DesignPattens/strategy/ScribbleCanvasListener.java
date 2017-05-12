package strategy;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class ScribbleCanvasListener 
    implements MouseListener, MouseMotionListener {
        

  protected Lab1 drawframe;
  protected ScribbleCanvas canvas; 
  protected int xStart, yStart; 
  protected Graphics onscreen, offscreen;
  protected Tool th;
  protected Lab1 mylab;
  

  public ScribbleCanvasListener(ScribbleCanvas canvas, Lab1 drawframe) {
    this.canvas = canvas;
    this.drawframe=drawframe;
  }
 
  public void mousePressed(MouseEvent e) {
	  Point p = e.getPoint();
	  drawframe.getMyClass().mousePressed(p);
  } 

  public void mouseReleased(MouseEvent e) {
	  Point p = e.getPoint();
	  drawframe.getMyClass().mouseReleased(p);
    
  }    

  public void mouseDragged(MouseEvent e) {
	  Point p = e.getPoint();
	  drawframe.getMyClass().mouseDragged(p);
    
  }

  public void mouseClicked(MouseEvent e) {}
  public void mouseEntered(MouseEvent e) {}  
  public void mouseExited(MouseEvent e) {}
  public void mouseMoved(MouseEvent e) {}     

  
}

