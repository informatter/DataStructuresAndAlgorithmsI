/* Queue data structure with a circular
* array as backing. All operations are O(1)
* Resizing is considered to be ab amortized O(1)
* in this implementation
*/
public class ArrayQueue<T> {

    /*
     * The initial capacity of the ArrayQueue.
     */
    public static final int INITIAL_CAPACITY = 9;

    private T[] backingArray;
    private int front;
    private int size;

    /**
     * Construct a new ArrayQueue
     */
    public ArrayQueue() {

        backingArray = (T[]) new Object[INITIAL_CAPACITY];
    }

    /**
     * Resizes the backing array to twice
     * the current size.
     */
    private void resize() {

        front = 0;

        int backingArrayLength = backingArray.length;

        var tempArray = (T[]) new Object[2 * size];

        for (int i = 0; i < backingArrayLength; i++) {

            tempArray[i] = backingArray[i];
        }

        backingArray = tempArray;

    }

    /**
     * Adds an element to he back of this ArrayQueue
     * 
     * @param data the data to add to the back of the queue
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void enqueue(T data) {

        if (data == null)
            throw new java.lang.IllegalArgumentException("data can be null!");

        // (front + size) % backingArray.length.

        if (size >= backingArray.length) {

            this.resize();
        }

        int indexToInstertAt = (front + size) % backingArray.length;

        backingArray[indexToInstertAt] = data;

        size++;

    }

    /**
     * Removes and returns the element at the front of this ArrayQueue
     * 
     * @return the data formerly located at the front of the queue
     * @throws java.util.NoSuchElementException if this ArrauQueue is empty
     */
    public T dequeue() {

        if (size == 0)
            throw new java.util.NoSuchElementException("Cant remove from an empy ArrayQueue!");

        var tempFront = backingArray[front];

        backingArray[front] = null;

        front++;

        size--;

        return tempFront;

    }

    /**
     * Returns the element at the front of this ArrayQueue
     * 
     * @return the data formerly located at the front of the queue
     * @throws java.util.NoSuchElementException if this ArrauQueue is empty
     */
    public T peek() {

        if(size==0) 
            throw new java.util.NoSuchElementException("Cant peek from an empy ArrayQueue!");

        return backingArray[front];

    }

    /**
     * Checks whether this ArrayQueue is empty.
     * 
     * @return true of this ArrayQueue is empty
     */
    public boolean isEmpty() {

        return size == 0;

    }

    /**
     * Clears all the elements stored in this ArrayQueue.
     * creates a new ArrayQueue with its default initial capacity.
     */
    public void clear() {

        backingArray = (T[]) new Object[INITIAL_CAPACITY];
    }

}