package CommandPattern;

import java.util.Stack;
import java.util.Vector;

public class Push implements PerformAction{
	VStack v;
	String pushstring;
	
	Push(Object push, String pushstring)
	{
		this.v=(VStack)push;
		this.pushstring=pushstring;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		v.push(pushstring);
	}
	@Override
	public void undo(Stack st) {
		// TODO Auto-generated method stub
		st.pop();
		v.pop();
	}

}
