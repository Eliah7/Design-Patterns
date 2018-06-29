public class IteratorEmeration implements Enumerator{
	Iterator iterator;

	public IteratorEmeration(Iterator iterator){
		this.iterator = iterator;
	} 

	public boolean hasMoreElements(){
		return iterator.hasNext();
	}

	public Object nextElement(){
		return iterator.next();
	}
}
