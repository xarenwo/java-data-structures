package stacklinkedlist;


public class stackLinkedList<T>{
    Node top;
    public stackLinkedList() {
        top=null;

    }
    public void push(Object value) {
        Node newNode = new Node(value,null);
        if(top==null) {
            top=newNode;
        } else {
            newNode.next = top;
            top=newNode;
        }
    }

    public T pop() {
        if(top==null) {
            System.out.println("Stack is empty ");
            return null;
        }
        T value = (T)top.value;
        top = top.next;
        return value;
    }



}
