
public class DoublyLinkedList<T> {

    Node<T> head;

    Node<T> tail;


    /**
     * Determines if this SLL has a single node or not.
     * 
     * @return boolean
     */
    private boolean hasOneElement() {

        if (head.Next == null)
            return true;

        return false;
    }

    public void addToFront(T data) {

        var newNode = new Node<T>(data);

        Node<T> headTemp = head;

        newNode.Next = headTemp;

        headTemp.Previous = newNode;

        head = newNode;

        if (this.hasOneElement())
            tail = head;
    }

    public void addToBack(T data){
        
    }

}
