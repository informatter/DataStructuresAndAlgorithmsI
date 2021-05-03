package src.Assignment02;

public class SinglyLinkedList<T>{

    private Node<T> head;

    public void addToFront(T data)
	{
		var newNode = new Node<T>(data);
		
		newNode.Next = head;
		
		head = newNode;
		
	}

    public void addToBack(T data)
	{
		Node<T> current = head;
		
		if(current.Next ==null)
		{
			var newNode = new Node<T>(data);
			
			current.Next = newNode;
			
			return;
		}
		
		while(current.Next!=null)
		{
			current = current.Next;
			
		}
	}


    public int count()
	{
		Node<T> current = head;
		
		int count=0;
		
		while(current.Next!=null)
		{
			current = current.Next;
			
			count++;
		}
		
		return count;
	}

}