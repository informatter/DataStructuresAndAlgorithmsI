package src.Assignment01;

public class ArrayList<T>
{
    public static final int INITIAL_CAPACITY = 9;

    private T[] backingArray;
    
    private int size;


    public ArrayList() {
      
        backingArray = (T[]) new Object[INITIAL_CAPACITY];

    }

    public void addToBack(T data) throws Exception {
        

        if(data ==null)
            throw new Exception("Cant add a null item!");
      // int totalCurrentItems =  backingArray.length; => total capacity of array.

       if(size==INITIAL_CAPACITY)
       {        
           
           T [] temp = (T[]) new  Object[INITIAL_CAPACITY*2];

           for(int i=0;i<=size;i++)
           {   
               if(i<size)
                    temp[i] = backingArray[i];

                if(i==size)                
                    temp[i]=data;
                
           }

           backingArray = temp;

           size++;

       }

       else
       {
            size++;

            backingArray[size-1]=data;
       }  
    }

    public T removeFromFront() {
        
        T removed =null;

        for(int i=0;i<=size;i++)
        {

            if(i==0) 
            {
                removed = backingArray[i];

                size--;
            }

            if(i==size)
                backingArray[i] = null;

            else            
                backingArray[i] = backingArray[i+1];
            
        
        }

        return removed;
    }

    public T removeFromBack() {

        T removed = backingArray[size-1];

        backingArray[size-1] = null;

        size--;

        return removed;

    }

    public T[] getBackingArray() {

        return backingArray;
    }

    public int size() {
        return size;
    }


}
