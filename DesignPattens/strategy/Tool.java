package strategy;
import java.awt.*;
import java.awt.event.MouseEvent;
public interface Tool {
	void mousePressed(Point p);
	void mouseReleased(Point p);
	void mouseDragged(Point p);
}
