package stack;



public class stackArray<T> {
    Object[] arrayStack;
    int size;
    int top;
    public stackArray(int size) {
        this.size=size;
        arrayStack = new Object[this.size];
        top = -1;
    }

    public void push(Object newItem) {
        if(isFull()) {
            System.out.println("Sorry, stack is full !");
            return;
        }
        top = top+1;
        arrayStack[top]=newItem;

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


    public Boolean isFull() {
        return(top==size-1);
    }
    public Boolean isEmpty() {
        return(top==-1);
    }

}
