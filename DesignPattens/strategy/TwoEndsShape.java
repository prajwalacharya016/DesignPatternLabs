package strategy;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.util.List;

public interface TwoEndsShape {
	void drawShape(int a, int b, int c, int d, Graphics onscreen, Graphics offscreen);
	void drawOutline(int a, int b, int c, int d, Graphics onscreen, Graphics offscreen);
	List<Integer> getMousePressedCoord(Point p, ScribbleCanvas canvas, int xStart, int yStart);
	List<Integer> getMouseReleasedCoord(Point p, ScribbleCanvas canvas, int xStart, int yStart);
	List<Integer> getMouseDragCoord(Point p, ScribbleCanvas canvas, int xStart, int yStart);
}
