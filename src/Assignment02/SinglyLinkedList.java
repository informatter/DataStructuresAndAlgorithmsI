package src.Assignment02;

public class SinglyLinkedList<T>{

    private Node<T> head;

    private Node<T> tail;

    private int size;


    private void canRemove(){

        if(head == null || head.Next.Next == null)
            throw new IllegalArgumentException("can't remove an element from an empty collection.");
    }

    private void canAddToBack(){

        if(size == 0)
            throw new IllegalArgumentException("can't add an element to the back of an empty SLL.");
    }

    private boolean hasOneElement(){

        if(head.Next == null)        
            return true;

     return false;
    }


   
    /** 
     * @param data The data to create the new node from.
     */
    public void addToFront(T data)
	{
		var newNode = new Node<T>(data);
		
		newNode.Next = head;
		
		head = newNode;		

        if(this.hasOneElement())
            tail = head;

        size++;
            
	}

    
    /** 
     * @param data The data to create the new node from.
     */
    public void addToBack(T data){

        this.canAddToBack();

        var newNode = new Node<T>(data);

        tail.Next = newNode;

        tail = newNode;

        size++;
	}

    
    /** 
     * returns the total number of nodes in this
     * Singly Linked List.
     * @return int
     */
    public int count(){
        return size;
	}

   
      /** 
     * Removes the current head and the head's next element
     * will be the new head.
     */
    public void removeFromFront(){
        
        this.canRemove();
        
        Node<T> current = head;

        head = current.Next;

        size--;
    }


    public void removeFromBack(){

        this.canRemove();

        Node<T> current = head;

        while(current.Next.Next!=null){

            current = current.Next;
        }		
					
        if(current.Next.Next == null){

            current.Next = null;  

            tail = current;

            size--;
        }  

    }

}