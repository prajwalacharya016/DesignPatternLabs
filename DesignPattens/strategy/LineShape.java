package strategy;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class LineShape implements TwoEndsShape  {

	@Override
	public void drawShape(int a, int b, int c, int d, Graphics onscreen, Graphics offscreen) {
		// TODO Auto-generated method stub
		offscreen.drawLine(a, b, c, d);
	}

	@Override
	public void drawOutline(int a, int b, int c, int d, Graphics onscreen, Graphics offscreen) {
		// TODO Auto-generated method stub
		onscreen.drawLine(a, b, c, d);
	}

	@Override
	public List<Integer> getMousePressedCoord(Point p, ScribbleCanvas canvas, int xStart, int yStart) {
		// TODO Auto-generated method stub
		List<Integer> myList= new ArrayList<Integer>();
		myList.add(xStart);
		myList.add(yStart);
		myList.add(xStart);
		myList.add(yStart);
		
		return myList;
	}

	@Override
	public List<Integer> getMouseReleasedCoord(Point p, ScribbleCanvas canvas, int xStart, int yStart) {
//		Point p = e.getPoint();
		List<Integer> myList= new ArrayList<Integer>();
		myList.add(xStart);
		myList.add(yStart);
		myList.add(p.x);
		myList.add(p.y);
		
		return myList;
	}

	@Override
	public List<Integer> getMouseDragCoord(Point p, ScribbleCanvas canvas, int xStart, int yStart) {
		// TODO Auto-generated method stub
//		Point p = e.getPoint();
		List<Integer> myList= new ArrayList<Integer>();
		myList.add(xStart);
		myList.add(yStart);
		myList.add(canvas.x);
		myList.add(canvas.y);
		myList.add(xStart);
		myList.add(yStart);
		myList.add(p.x);
		myList.add(p.y);
		
		return myList;
	}

	
	
	

}
