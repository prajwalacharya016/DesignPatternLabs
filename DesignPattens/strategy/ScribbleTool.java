package strategy;

import java.awt.*;

import java.awt.event.MouseEvent;

public class ScribbleTool implements Tool {
	
	protected Lab1 drawframe;
	protected ScribbleCanvas canvas;
	protected int xStart, yStart;
	protected Graphics onscreen, offscreen;

	public void mousePressed(Point p) {
		// TODO Auto-generated method stub

		canvas.mouseButtonDown = true;
		canvas.x = p.x;
		canvas.y = p.y;
	}

	@Override
	public void mouseReleased(Point p) {
		// TODO Auto-generated method stub
		canvas.mouseButtonDown = false;
	}

	@Override
	public void mouseDragged(Point p) {
		// TODO Auto-generated method stub
		// Point p = e.getPoint();
		if (canvas.mouseButtonDown) {
			canvas.getOffScreenGraphics().drawLine(canvas.x, canvas.y, p.x, p.y);
			int xs = Math.min(canvas.x, p.x);
			int ys = Math.min(canvas.y, p.y);
			int dx = Math.abs(p.x - canvas.x) + 1;
			int dy = Math.abs(p.y - canvas.y) + 1;
			canvas.repaint(xs, ys, dx, dy);
			canvas.x = p.x;
			canvas.y = p.y;
		}
	}

}
