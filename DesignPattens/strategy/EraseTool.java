package strategy;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;

public class EraseTool implements Tool {
	 protected Lab1 drawframe;
	  protected ScribbleCanvas canvas; 
	  protected int xStart, yStart; 
	  protected Graphics onscreen, offscreen;

	@Override
	public void mousePressed(Point p) {
		// TODO Auto-generated method stub
		canvas.mouseButtonDown = true;
		canvas.x = p.x;
		canvas.y = p.y;
		offscreen = canvas.getOffScreenGraphics();
		offscreen.setColor(Color.white);
	}

	@Override
	public void mouseReleased(Point p) {
		// TODO Auto-generated method stub
		canvas.mouseButtonDown = false; 
        canvas.setPenColor(canvas.penColor); 
	}

	@Override
	public void mouseDragged(Point p) {
		// TODO Auto-generated method stub
		if (canvas.mouseButtonDown) {
            int xs, ys, dx, dy; 
            xs = Math.min(canvas.x, p.x) - 2;
            ys = Math.min(canvas.y, p.y) - 2;
            dx = Math.abs(p.x - canvas.x) +  6;
            dy = Math.abs(p.y - canvas.y) +  6;
            offscreen = canvas.getOffScreenGraphics();
            offscreen.fillRect(xs, ys, dx, dy); 
            canvas.repaint(xs, ys, dx, dy); 
            canvas.x = p.x; 
            canvas.y = p.y; 
        }
		
	}

}
