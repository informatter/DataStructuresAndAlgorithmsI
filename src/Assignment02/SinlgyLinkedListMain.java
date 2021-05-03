package src.Assignment02;

public class SinlgyLinkedListMain {

    public static void main(String[] args) 
    {
       var sll = new SinglyLinkedList<Integer>();

       for (int i = 0; i < 5; i++) {
           
        sll.addToFront(i);
       }

       sll.addToBack(10);
       sll.addToBack(11);
       sll.addToBack(12);

       sll.addAt(50,1);

       sll.removeAt(sll.count()-1);

    
    }
    
}
