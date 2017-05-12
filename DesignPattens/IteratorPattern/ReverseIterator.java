package IteratorPattern;
import java.util.Iterator;
import java.util.List;
public class ReverseIterator implements Iterator {
	List Mylist;
	int counter;
	ReverseIterator(List list)
	{
		Mylist=list;
		counter=Mylist.size();
	}
	@Override
	public boolean hasNext() {
		if(this.counter==0)
		return false;
		
		else  
			return true;
	}

	@Override
	public Object next() {
		counter--;
		return Mylist.get(counter);
	}

}
