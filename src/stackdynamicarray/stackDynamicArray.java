package stackdynamicarray;


import java.util.Arrays;

public class stackDynamicArray<T> {
    Object[] arrayStack;
    int size;
    int top;
    public stackDynamicArray(int size) {
        this.size=size;
        arrayStack = new Object[this.size];
        top = -1;
    }

    public void push(Object newItem) {
       ensureCapability(top+2);
        top = top+1;
        arrayStack[top]=newItem;

    }

    public void ensureCapability(int minCapacity) {
        int oldCapacity=arrayStack.length;
        if(minCapacity>oldCapacity) { // check if there is space for new data or double it
            int newCapacity=oldCapacity*2; // double the capacity of data array
            if(newCapacity<minCapacity)
                newCapacity=minCapacity;
            arrayStack= Arrays.copyOf(arrayStack,newCapacity); // copy all elements from old array to new array
        }
    }


    public T pop() {
        if(isEmpty()) {
            System.out.println("Sorry, stack is empty !");
            return null;
        }
        T item = (T) arrayStack[top];
        top = top-1;
        return item;
    }

    public int getSize() {
        return arrayStack.length;
    }


    public Boolean isFull() {
        return(top==size-1);
    }
    public Boolean isEmpty() {
        return(top==-1);
    }

}
