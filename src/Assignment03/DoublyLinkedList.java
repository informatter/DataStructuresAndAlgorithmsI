
public class DoublyLinkedList<T> {

    Node<T> head;

    Node<T> tail;

    int size;

    /**
     * @param index
     */
    private void canModifyAt(int index) {

        if (index < 0 || index > size)
            throw new IllegalArgumentException("Index out of range. ");

    }

    private void canAddAtBack() {

        if (size == 0)
            throw new IllegalArgumentException("can't add an element to the back of an empty SLL.");
    }

    private void canRemove() {

        if (head == null || head.Next.Next == null)
            throw new IllegalArgumentException("can't remove an element from an empty collection.");
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

    public void addToFront(T data) {

        var newNode = new Node<T>(data);

        if (size == 0) {
            head = newNode;

            tail = head;

            size++;

            return;
        }

        newNode.Next = head;

        head.Previous = newNode;

        head = newNode;

        size++;
    }

    /**
     * @param data The data to create the new node from.
     */
    public void addToBack(T data) {

        this.canAddAtBack();

        var newNode = new Node<T>(data);

        newNode.Previous = tail;

        tail.Next = newNode;

        tail = newNode;

        size++;
    }

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

            if (indexCount == index) {

                var newNode = new Node<T>(data);

                current.Previous.Next = newNode;

                newNode.Next = current;

                newNode.Previous = current.Previous;

                size++;

                return;

            }

            indexCount++;

            current = current.Next;

        }

    }

    public void removeFromBack() {

        this.canRemove();

        var tailPrevious = tail.Previous;

        tail = null;

        tail = tailPrevious;

        size--;

    }

}
