package strategy;
//
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class RectShape implements TwoEndsShape{

	@Override
	public void drawShape(int a, int b, int c, int d, Graphics onscreen, Graphics offscreen) {
		// TODO Auto-generated method stub
		offscreen.drawRect(a, b, c, d);
	}

	@Override
	public void drawOutline(int a, int b, int c, int d, Graphics onscreen, Graphics offscreen) {
		// TODO Auto-generated method stub
		onscreen.drawRect(a, b, c, d);
	}

	@Override
	public List<Integer> getMousePressedCoord(Point p, ScribbleCanvas canvas, int xStart, int yStart) {
		// TODO Auto-generated method stub
		List<Integer> myList= new ArrayList<Integer>();
		myList.add(xStart);
		myList.add(yStart);
		myList.add(1);
		myList.add(1);
		
		return myList;
	}

	@Override
	public List<Integer> getMouseReleasedCoord(Point p, ScribbleCanvas canvas, int xStart, int yStart) {
		List<Integer> myList= new ArrayList<Integer>();
		myList.add(xStart);
		myList.add(yStart);
		myList.add( p.x-xStart+1);
		myList.add(p.y-yStart+1);
		
		return myList;
	}

	@Override
	public List<Integer> getMouseDragCoord(Point p, ScribbleCanvas canvas, int xStart, int yStart) {
		List<Integer> myList= new ArrayList<Integer>();
		myList.add(xStart);
		myList.add(yStart);
		myList.add(canvas.x - xStart + 1);
		myList.add(canvas.y - yStart + 1);
		myList.add(xStart);
		myList.add(yStart);
		myList.add(p.x - xStart + 1);
		myList.add(p.y - yStart + 1);
	
		return myList;
	}

	

}
