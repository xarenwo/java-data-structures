package queue;
import java.util.Arrays;



    public class QueueLinkedList<T>{
        NodeD Rear;
        NodeD Front;
        public QueueLinkedList() {
           Rear = null;
           Front = null;
        }
        public void queue(Object value) {
            NodeD newNode = new NodeD(value,null,null);
            if(Rear==null) {
                Rear=newNode;
                Front=newNode;
            } else {
                newNode.next = null;
                newNode.previous = Rear;
                Rear.next = newNode;
                Rear = newNode;
            }
        }

        public T dequeue() {
            if(Rear==null || Front == null) {
                System.out.println("Queue is empty, sorry");
                return null;
            }
            T value = (T) Front.value;
            Front = Front.next; // move the pointer to the next
            if(Front != null) {
                Front.previous = null; // remove the connection
            }
            return value;

        }



    }
