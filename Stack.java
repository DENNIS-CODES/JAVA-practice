//Using an Inner Class to Implement an Adapter
import java.util.Enumeration;
import java.util.NoSuchElementException;
public class Stack {
    private java.util.Vector items;
    //..code for Stacks methods and constructors not showing
    public Enumeration enumerator() {
        return new StackEnum();
    }
    class StackEnum implements Enumeration {
        int currentItem = items.size() -1;
        public boolean hasMoreElements() {
            return (currentItem >=0);
        }
        public Object nextElemnt() {
            if (!hasMoreElements())
            throw new NoSuchElementException();
            else 
            return items.elementAt(currentItem--); 
        }
    }
    
}
