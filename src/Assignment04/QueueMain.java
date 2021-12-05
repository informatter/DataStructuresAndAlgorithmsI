public class QueueMain{

    public static void main(String[] args) {

        var queue = new ArrayQueue<Integer>();

        queue.enqueue(0);

        queue.enqueue(1);

        queue.enqueue(2);

        queue.enqueue(44);

        queue.dequeue();

        var frontValue = queue.peek();

        queue.enqueue(50);
        queue.enqueue(51);

        queue.dequeue();   
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        queue.enqueue(44);
        queue.enqueue(2);

    }
}