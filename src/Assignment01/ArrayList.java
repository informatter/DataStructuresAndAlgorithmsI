package src.Assignment01;

public class ArrayList<T>
{
    // ALL THE ADDED FIELDS CAME WITH THE EXERCISE TEMPLATE
    // AND COULD NOT BE CHANGED. NEW FILEDS COULD ALSO NOT BE ADDED!

    public static final int INITIAL_CAPACITY = 9;

    private T[] backingArray;
    
    private int size;


    public ArrayList() {
      
        backingArray = (T[]) new Object[INITIAL_CAPACITY];

    }

    private void checkNull(T data) throws Exception{

        if(data ==null)
            throw new IllegalArgumentException("Cant add a null item!");
    }

    public void addToFront(T data) throws Exception{

        this.checkNull(data);
      
        if(size == INITIAL_CAPACITY)
        {
            T [] temp = (T[]) new  Object[INITIAL_CAPACITY*2];
   
            for(int i=0;i<=size;i++)
           {   
               if(i==0)              
                    temp[i] = data;
               

               if(i<size && i!=0)              
                    temp[i+1] = backingArray[i];
                     
           }

           backingArray = temp;

           size++;

           return;

        }

    
        for(int i=size-1;i>=0;i--)
            backingArray[i+1] = backingArray[i];
        
        
        backingArray[0] = data;
        
        size++;
    
    }

    public void addToBack(T data) throws Exception {
        
        this.checkNull(data);   

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
