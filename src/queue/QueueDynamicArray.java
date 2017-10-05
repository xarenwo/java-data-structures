package queue;


import java.util.Arrays;

public class QueueDynamicArray<T> {
    Object[] ArrayQueue;
    int Rear;
    int Front;
    int size;

    public QueueDynamicArray(int size) {
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
        ensureCapability(Rear+2);
        Rear = Rear+1;
        ArrayQueue[Rear] = newItem;
        if(Front == -1) {
            Front = 0;
        }
    }
    public void ensureCapability(int minCapacity) {
        int oldCapacity=getSize();
        if(minCapacity>oldCapacity) { // check if there is space for new data or double it
            int newCapacity=oldCapacity*2; // double the capacity of data array
            if(newCapacity<minCapacity)
                newCapacity=minCapacity;
            ArrayQueue= Arrays.copyOf(ArrayQueue,newCapacity); // copy all elements from old array to new array
        }
    }

    public int getSize () {
        return ArrayQueue.length;
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
