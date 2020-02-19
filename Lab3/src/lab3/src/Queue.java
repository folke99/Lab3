

public interface Queue {

	public void add(Object item);
	
	public Object first();
	
	public boolean isEmpty();
	
	public int maxSize();
	
	public void removeFirst();
	
	public int size();
	
	public boolean equals(Object f);
	
	public String toString();
}