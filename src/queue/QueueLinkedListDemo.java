package queue;

public class QueueLinkedListDemo {
    public static void main(String[] args) {
        QueueLinkedList<String>  linkedl = new QueueLinkedList<String>();
        linkedl.queue("h3h3h3h33");
        linkedl.queue("421421421");
        linkedl.queue("h3h3gsdgsdd32r32h3h33");
        linkedl.queue("h3hfdsgsd3h3h33");
        linkedl.queue("h3hvsdg2423h3h33");
        linkedl.queue("h3h21421s2d3qw2r233h3h33");

            System.out.println(linkedl.dequeue()); // pop the first item (FIFO)

    }
}
