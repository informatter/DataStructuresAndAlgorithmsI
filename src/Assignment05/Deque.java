public class Deque<T>{

    private T [] _array;
    private int _capacity;
    private int _size;
    private int _front;

    public Deque(int capacity){

        _front = 0;
        _size = 0;
        _capacity = capacity;
        _array= new T[_capacity];
    }

      /**
     * Adds the element at the front
     */
    public void addFirst(T element){

        if(_size==0){

            _array[0] = element;

            _size++;

            return;
        }
           
        if(_size<_capacity){

            _front++;

            _size++;

            _array[_front] = element;
        }
        

    }

    public void addLast(){

        if(_size==0){

            _array[_capacity-1] = element;

            _size++;

            return;
        }

    }
}