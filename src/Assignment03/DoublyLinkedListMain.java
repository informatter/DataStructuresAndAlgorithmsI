
public class DoublyLinkedListMain {

    public static void main(String[] args) {

        var dll = new DoublyLinkedList<Integer>();

        for (int i = 0; i < 5; i++) {

            dll.addToFront(i);
        }

        dll.addToBack(10);
        dll.addToBack(11);
        dll.addToBack(12);

        dll.addAt(100, 3);

        dll.removeFromBack();

    }

}
