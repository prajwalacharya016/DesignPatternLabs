package strategy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.List;

public class TwoEndsTool implements Tool {
	  protected Lab1 drawframe;
	  protected ScribbleCanvas canvas; 
	  protected int xStart, yStart; 
	  protected Graphics onscreen, offscreen;
	  protected HashMap hm= new HashMap();
	  protected TwoEndsShape ts;
	public TwoEndsTool(TwoEndsShape myshape, ScribbleCanvas mycanvas){
		canvas=mycanvas;
		ts=myshape;
	}
	
	@Override
	public void mousePressed(Point p) {
//		Point p = e.getPoint();
		canvas.mouseButtonDown = true;
        xStart = canvas.x = p.x; 
        yStart = canvas.y = p.y; 
        onscreen = canvas.getGraphics();
        onscreen.setXORMode(Color.darkGray); 
        onscreen.setColor(Color.lightGray);
        List <Integer>myList=ts.getMousePressedCoord( p,  canvas, xStart, yStart);
        ts.drawOutline(myList.get(0), myList.get(1),myList.get(2), myList.get(3),onscreen, offscreen);
         
		
	}

	@Override
	public void mouseReleased(Point p) {
 
		canvas.mouseButtonDown = false; 
        
        onscreen.setPaintMode();
        offscreen = canvas.getOffScreenGraphics();
        List <Integer>myList=ts.getMouseReleasedCoord( p,  canvas, xStart, yStart);
        ts.drawShape(myList.get(0), myList.get(1),myList.get(2), myList.get(3), onscreen, offscreen);
        canvas.repaint();
        
		
	}

	@Override
	public void mouseDragged(Point p) {

		if (canvas.mouseButtonDown) {
			List <Integer>myList=ts.getMouseDragCoord( p,  canvas, xStart, yStart);
			ts.drawOutline(myList.get(0), myList.get(1),myList.get(2), myList.get(3),  onscreen, offscreen);  
			ts.drawOutline(myList.get(4), myList.get(5),myList.get(6), myList.get(7), onscreen, offscreen); 
        }
    canvas.x = p.x; 
    canvas.y = p.y;
	}

}
