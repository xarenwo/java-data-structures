package queue;

public class QueueDynamicArrayDemo {
    public static void main(String[] args) {
        QueueDynamicArray<Integer> q = new
                QueueDynamicArray<Integer>(2);

        q.Queue(2);
        q.Queue(3);
        q.Queue(4);
        System.out.println("Size :  " + q.getSize());
        q.Queue(7);
        q.Queue(2);
        q.Queue(9);
        System.out.println("Size :  " + q.getSize());
        q.Dequeue();
        System.out.println("Size :  " + q.getSize());
    }
}
