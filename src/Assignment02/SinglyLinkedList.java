package src.Assignment02;

public class SinglyLinkedList<T>{

    private Node<T> head;

   
    /** 
     * @param data The data to create the new node from.
     */
    public void addToFront(T data)
	{
		var newNode = new Node<T>(data);
		
		newNode.Next = head;
		
		head = newNode;
		
	}

    
    /** 
     * @param data The data to create the new node from.
     */
    public void addToBack(T data){

		Node<T> current = head;
		
		while(current.Next!=null)		
			current = current.Next;			
		

        if(current.Next ==null)
		{
			var newNode = new Node<T>(data);
			
			current.Next = newNode;
		}
	}

    
    
    /** 
     * 
     * @param data The data to create the new node from.
     * @param index the index to add the data at.
     * @throws throws and index out of range exception.
     */
    public void add(T data, int index){

        // TODO: Needs different implementation.
        int count = this.count();

        if(index > count || count == 0 && index > 0)
            throw new IllegalArgumentException("index out of range. Index is larger than the size of the collection.");

        Node<T> current = head;

        int indexCount=0;

        /*
        while(current.Next!=null)
        {
            if(indexCount==index-1)
            {
               var newNode = new Node<T>(data);

               var temp = current.Next;

               current.Next = newNode;

               newNode.Next = temp;

                //return;

            }

            current = current.Next;

            indexCount++;

        }
        */

        if(count == 0 && index== 0)       
            this.addToFront(data);
       
    }


    
    /** 
     * returns the total number of nodes in this
     * Singly Linked List.
     * @return int
     */
    public int count()
	{
		Node<T> current = head;

        int count=0;

        if (this.head == null)
            return count;
        
        count++;
			
		while(current.Next!=null)
		{
			current = current.Next;
			
			count++;
		}
		
		return count;
	}

      /** 
     * Removes the current head and the heads' next element
     * will be the new head.
     */
    public void removeFromFront(){
        int count = this.count();

        if(count == 0)
            throw new IllegalArgumentException("can't remove an element from an empty collection.");

        Node<T> current = head;

        head = current.Next;
    }

    public void removeFromBack(){

        int count = this.count();

        int currentIndexCount =0;

        if(count > 0)
            currentIndexCount = 1;

        Node<T> current = head;

        while(current.Next!=null)
		{
			current = current.Next;

            currentIndexCount++;

            if(currentIndexCount== count-1){

                current.Next = null;
            }

		}

    



    }

}