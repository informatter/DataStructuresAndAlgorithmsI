public class Queue<T>{

    private T [] _array;
    private Integer _capacity;
    private Integer _frontIndex;
    private Integer _backIndex;
    private Integer _size=0;

    public Queue(Integer capacity){

        _capacity = capacity;

        _array = (T[]) new Object [_capacity];
    }

    // Adds the element to the back 
    // of this Queue
    public void enqueue(T element){


        if(_size ==0){

            _frontIndex = 0;

            _backIndex = 0;

            _array[_backIndex] = element;

            _size++;

            _backIndex = _frontIndex +_size;

            return;
        }

      

        if(_size <_capacity ){

            _backIndex = _frontIndex +_size;

            _size++;

           // if(_frontIndex>0) _backIndex = _backIndex+_frontIndex;

            _array[_backIndex] = element;

    
        }

        if(_size ==_capacity){

            _backIndex = _size % _size; // wraps back index to 0

        }

    }

    // Removes the element at the front
    // of this Queue
    public void dequeue(){

        _size--;

        if(_size==0) return;

        if(_size ==_capacity){

            _backIndex = _size % _size; // wraps back index to 0

            _array[_backIndex] = (T)new Object();

            _frontIndex++;

            return;

        }

        if(_size <_capacity ){

            _array[_frontIndex] = (T)new Object();

            _frontIndex++;
           
        }

    }

    // Returns the data at the front
    // of this Queue
    public T peek(){

        return _array[_frontIndex];

    }


    public boolean isEmpty(){

        return _size ==0;

    }

    public void clear(){

        _array = (T[]) new Object [_capacity];
    }

}