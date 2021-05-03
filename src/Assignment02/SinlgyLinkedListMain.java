package src.Assignment02;

public class SinlgyLinkedListMain {

    public static void main(String[] args) 
    {
       var sll = new SinglyLinkedList<Integer>();

       for (int i = 0; i < 5; i++) {
           
        sll.addToFront(i);
       }

       sll.addToBack(10);

       sll.removeFromBack();

    
    }
    
}
