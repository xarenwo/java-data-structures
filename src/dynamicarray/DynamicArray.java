package dynamicarray;

import java.util.Arrays;

public class DynamicArray<T> {

    Object[] data;
    int size;

    public DynamicArray() {
        size=0;
        data=new Object[1];

    }

    public int getSize() {
        return data.length;
    }

    public T get(int index) {
        return (T) data[index];
    }
    public void put(Object element) {
        ensureCapability(size+1);
        data[size++]=element;
    }
    public void ensureCapability(int minCapacity) {
        int oldCapacity=getSize();
        if(minCapacity>oldCapacity) { // check if there is space for new data or double it
            int newCapacity=oldCapacity*2; // double the capacity of data array
            if(newCapacity<minCapacity)
                newCapacity=minCapacity;
            data= Arrays.copyOf(data,newCapacity); // copy all elements from old array to new array
        }
    }



}
