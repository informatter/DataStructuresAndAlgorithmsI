package src.Assignment02;


public class SinglyLinkedList<T> {

    private Node<T> head;

    private Node<T> tail;

    private int size;

    /**
     * @param index
     */
    private void canModifyAt(int index) {

        if (index < 0 || index > size)
            throw new IllegalArgumentException("Index out of range. ");

    }

    private void canRemove() {

        if (head == null || head.Next.Next == null)
            throw new IllegalArgumentException("can't remove an element from an empty collection.");
    }

    private void canAddAtBack() {

        if (size == 0)
            throw new IllegalArgumentException("can't add an element to the back of an empty SLL.");
    }

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

    /**
     * @param data The data to create the new node from.
     */
    public void addToFront(T data) {
        
        var newNode = new Node<T>(data);

        newNode.Next = head;

        head = newNode;

        if (this.hasOneElement())
            tail = head;

        size++;
    }

    /**
     * @param data The data to create the new node from.
     */
    public void addToBack(T data) {

        this.canAddAtBack();

        var newNode = new Node<T>(data);

        tail.Next = newNode;

        tail = newNode;

        size++;
    }

    /**
     * Adds a new node at the given index.
     * 
     * @param data  The data to create the node from.
     * @param index The index to insert the new node at.
     */
    public void addAt(T data, int index) {

        this.canModifyAt(index);

        Node<T> current = head;

        int indexCount = 0;

        if (index == 0) {

            this.addToFront(data);

            return;
        }

        if (index == size - 1) {

            this.addToBack(data);

            return;
        }

        while (current.Next != null) {

            if (indexCount == index - 1) {
                
                var newNode = new Node<T>(data);

                var temp = current.Next;

                newNode.Next = temp;

                current.Next = newNode;

                size++;

                return;

            }

            indexCount++;

            current = current.Next;

        }

    }

    /**
     * returns the total number of nodes in this Singly Linked List.
     * 
     * @return int
     */
    public int count() {
        return size;
    }

    /**
     * Clears all the nodes in this SLL. the head will no be bull.
     */
    public void clear() {

        head = null;
    }

    /**
     * Removes the current head and the head's next element will be the new head.
     */
    public void removeFromFront() {

        this.canRemove();

        Node<T> current = head;

        head = current.Next;

        size--;
    }

    /**
     * Removes the current tail and the previous element from the current tail will
     * be the new tail.
     */
    public void removeFromBack() {

        this.canRemove();

        Node<T> current = head;

        while (current.Next.Next != null) {

            current = current.Next;
        }

        if (current.Next.Next == null) {

            current.Next = null;

            tail = current;

            size--;
        }

    }

    /**
     * @param index
     */
    public void removeAt(int index) {

        this.canModifyAt(index);

        if (index == 0) {

            this.removeFromFront();

            return;
        }

        if (index == size - 1) {

            this.removeFromBack();

            return;
        }

        Node<T> current = head;

        Node<T> previousRef = null;

        int indexCount = 0;

        while (current.Next != null) {

            if (indexCount == index - 1) {

                previousRef = current;
            }

            if (indexCount == index) {

                previousRef.Next = current.Next;

                size--;

                return;
            }

            indexCount++;

            current = current.Next;

        }
    }


      /**
     * Removes nodes with duplicate values.
     */
    public void removeDuplicates(){
        head = removeDuplicateValues(head);
    }

    private  Node<T> removeDuplicateValues(Node<T> current){

        if(current == null)
            return null;

        current.Next = removeDuplicateValues(current.Next);

        if(current.Next!=null && current.Data.equals(current.Next.Data))
            return current.Next;

        return current;

    }
}