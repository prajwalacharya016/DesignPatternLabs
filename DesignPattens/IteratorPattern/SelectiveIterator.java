package IteratorPattern;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
public class SelectiveIterator implements Iterator{
	List<Swimmer> Mylist;
	int counter;
	SelectiveIterator(List list)
	{
		Mylist=list;
		counter=-1;
	}
	@Override
	public boolean hasNext() {
		if(counter<Mylist.size()){
			return true;	
		}
		else  
			return false;
	}
	public Object next(Predicate<Swimmer> myPred) {
		counter++;
		int i=0;
		Swimmer retswim=null;
		for( i=counter; i<Mylist.size(); i++){
			if(myPred.test(Mylist.get(i))){
				retswim=Mylist.get(counter);
				break;
			}
		}
		counter = i;
		return retswim;
	}
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

}
