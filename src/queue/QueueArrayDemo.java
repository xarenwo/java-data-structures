package queue;

public class QueueArrayDemo {
    public static void main(String[] args) {
        QueueArray<String> list = new QueueArray<String>(5);
        list.Queue("h3h3");
        list.Queue("h3h22222331");
        list.Queue("h3h2222232");
        list.Queue("h3h2222233");

        while(list.Dequeue() != null) {
            System.out.println(list.Dequeue());
        }
    }
}
