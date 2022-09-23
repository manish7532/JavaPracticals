package designpatterns;

interface Iterator{
	public boolean hasNext();
	public Object next();	
}

interface Container{
	public Iterator getIterator();
}
class CollectionOfNames implements Container{
	
	public String name[]= {"Raj","Ajay","Tahir","Meera","Meena","Paras"};
	
	@Override
	public Iterator getIterator() {
		return null;	
	}

	private class CollectionNamesIterate implements Iterator{ 
		int i;
	@Override
	public boolean hasNext() {
	if(i<name.length)
	return true;
	else
	return false;
	}

	@Override
	public Object next() { 
		if(this.hasNext()) 
		{ return name[i++];
	}
	return null;
		}
	}
}

public class IteratorPattern {
public static void main(String[] args) {
	CollectionOfNames coOfNames = new CollectionOfNames();
	
	for(Iterator iterator=coOfNames.getIterator();iterator.hasNext() ;) { 
		String name = (String) iterator.next();
	     System.out.println(name);
	}
}
}
