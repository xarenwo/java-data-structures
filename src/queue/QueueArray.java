package queue;

import java.lang.reflect.Array;

public class QueueArray<T> {
    Object[] ArrayQueue;
    int Rear;
    int Front;
    int size;

    public QueueArray(int size) {
        this.size=size;
        ArrayQueue = new Object[this.size];
        Front=-1;
        Rear=-1;
    }

    public Boolean isFull() {
        return Rear == size-1;
    }
    public Boolean isEmpty() {
        return Front == -1 || Front > Rear;
    }

    public void Queue(Object newItem) {
        if(isFull()) {
            System.out.println("Queue is already full, sorry.");
            return;
        }
        Rear = Rear+1;
        ArrayQueue[Rear] = newItem;
        if(Front == -1) {
            Front = 0;
        }
    }

    public T Dequeue() {
        if(isEmpty()) {
            System.out.println("Queue already empty, sorry !");
            return null;
        }
        T ObjectOut =(T) ArrayQueue[Front];
        Front = Front + 1;
        return ObjectOut;
    }

}
