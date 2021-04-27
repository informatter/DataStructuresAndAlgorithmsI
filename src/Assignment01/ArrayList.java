package src.Assignment01;

public class ArrayList<T> {
    // ALL THE ADDED FIELDS CAME WITH THE EXERCISE TEMPLATE
    // AND COULD NOT BE CHANGED. NEW FILEDS COULD ALSO NOT BE ADDED!

    public static final int INITIAL_CAPACITY = 9;

    private T[] backingArray;

    private int size;

    public ArrayList() {

        backingArray = (T[]) new Object[INITIAL_CAPACITY];

    }

    private void nullElementException(T data) throws Exception {

        if (data == null)
            throw new IllegalArgumentException("Can't add a null item!");
    }

    private void emptyArrayListException() throws Exception {
        if (size == 0)
            throw new IllegalArgumentException("Can't remove an element from an empty ArrayList!");

    }

    private void resizeAndAddToBack(T data) {

        int newArrayLength = size * 2;

        T[] temp = (T[]) new Object[newArrayLength];

        for (int i = 0; i <= size; i++) {
            if (i < size)
                temp[i] = backingArray[i];

            if (i == size)
                temp[i] = data;

        }

        backingArray = temp;

    }

    private void resizeAndAddToFront(T data) {

        int newArrayLength = size * 2;

        T[] temp = (T[]) new Object[newArrayLength];

        temp[0] = data;

        for (int i = 1; i <= size; i++) {

            temp[i] = backingArray[i - 1];
        }

        backingArray = temp;
    }

    public void addToFront(T data) throws Exception {

        nullElementException(data);

        if (size == INITIAL_CAPACITY) {

            resizeAndAddToFront(data);

            size++;

            return;
        }

        if (size == backingArray.length) {

            resizeAndAddToFront(data);

            size++;

            return;
        }

        if (size == 0) {

            backingArray[0] = data;

            size++;

            return;
        }

        for (int i = size - 1; i >= 0; i--)
            backingArray[i + 1] = backingArray[i];

        backingArray[0] = data;

        size++;

    }

    public void addToBack(T data) throws Exception {

        nullElementException(data);

        if (size == INITIAL_CAPACITY) {

            resizeAndAddToBack(data);

            size++;

            return;
        }

        if (size == backingArray.length) {

            resizeAndAddToBack(data);

            size++;

            return;
        }

        size++;

        backingArray[size - 1] = data;
    }

    // Removes the first element in this
    // ArrayList.
    public T removeFromFront() throws Exception {

        emptyArrayListException();

        T removed = null;

        for (int i = 0; i <= size; i++) {

            if (i == 0) {
                removed = backingArray[i];

                size--;
            }

            if (i == size)
                backingArray[i] = null;

            else
                backingArray[i] = backingArray[i + 1];

        }

        return removed;
    }

    // Removes the last element in this
    // ArrayList.
    public T removeFromBack() throws Exception {

        emptyArrayListException();

        T removed = backingArray[size - 1];

        backingArray[size - 1] = null;

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
