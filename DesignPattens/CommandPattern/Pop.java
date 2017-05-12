package CommandPattern;

import java.util.Stack;
import java.util.Vector;

public class Pop implements PerformAction{
	VStack v= new VStack();
	String pushstring="";
	Pop(Object vs){
		this.v=(VStack)vs;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		pushstring=(String)v.pop();	
	}
	@Override
	public void undo(Stack st) {
		// TODO Auto-generated method stub
		Pop pop=(Pop)st.pop();
		String mstring=pop.pushstring;
		v.push(mstring);
	}
	

}
