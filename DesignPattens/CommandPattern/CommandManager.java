package CommandPattern;

import java.util.Stack;
import java.util.Vector;

public class CommandManager {

	PerformAction per;
	Stack<PerformAction> st = new Stack();
	Stack<PerformAction> rdst = new Stack();

	CommandManager(PerformAction per) {
		this.per = per;
	}

	void execute() {
		per.execute();
		st.push(per);
	}

	void undo() {
		PerformAction dum = st.pop();
		rdst.push(dum);
		st.push(dum);
		if (!st.isEmpty())
			per.undo(st);

	}

	void redo() {
		if (!rdst.isEmpty()) {
			PerformAction dum = rdst.pop();
			dum.execute();
		}

	}
}
