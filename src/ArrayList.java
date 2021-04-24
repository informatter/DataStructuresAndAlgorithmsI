package src;
public class ArrayList<T>
{
    public static final int INITIAL_CAPACITY = 9;

    private T[] backingArray;
    
    private int size;

    public ArrayList() {
      
        backingArray = (T[]) new Object[INITIAL_CAPACITY];
    }

    public void addToBack(T data) {
        
    }

    public T removeFromFront() {
        
        return null;
    }

    public T removeFromBack() {

        return null;
    }

    public T[] getBackingArray() {

        return backingArray;
    }

    public int size() {
        return size;
    }


}
