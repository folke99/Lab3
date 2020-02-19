package lab3;
import java.util.ArrayList;
import java.util.NoSuchElementException;

public class FIFO implements Queue {
	
	ArrayList<Object> lst = new ArrayList<Object>();
	public static int arrayMaxSizeTracker = 0;

	public void add(Object item) {
		this.lst.add(item);
		if(this.lst.size()>arrayMaxSizeTracker)
			arrayMaxSizeTracker++;
		
	}
	
	public Object first() throws NoSuchElementException {
		if(lst.isEmpty())
			throw new NoSuchElementException();
		else
			return this.lst.get(0);
	}
	
	public boolean isEmpty() {
		return this.lst.isEmpty();
	}
	
	public int maxSize() {
		return arrayMaxSizeTracker;
	}
	
	public void removeFirst() {
		if(lst.isEmpty())
			throw new NoSuchElementException();
		else
			this.lst.remove(0);
	}
	
	public int size() {
		return this.lst.size();
	}
	
	public boolean equals(Object f) throws ClassCastException{
		if(((FIFO) f).size() == this.size()){
			for(int i = 0; i < this.lst.size(); i++){
				if(((FIFO) f).lst.get(i) == null && this.lst.get(i) == null)
					continue;				
				else if(((FIFO) f).lst.get(i) == this.lst.get(i))
					continue;
				else 
					return false;
			}		
			return true;
		}
		else
			return false;
	}
	
	public String toString() {
		String printObjects="";
		for(int i=0;i<this.lst.size();i++){
			printObjects += "(" + String.valueOf(this.lst.get(i)) + ") ";
		}
		return "Queue: "+ printObjects;
	}
}
