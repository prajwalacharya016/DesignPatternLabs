package CommandPattern;

import java.util.Stack;
import java.util.Vector;

public interface PerformAction {
	void execute();
	void undo(Stack st);
}
