package stacklinkedlist;

public class stackLinkedListDemo {
    public static void main(String[] args) {
        stackLinkedList<String> stack = new stackLinkedList<String>();
        stack.pop();
        stack.push("h3h3");
        stack.push("waedawe");
        stack.push("waedawe");
        stack.push("waedawe");
        stack.push("waedawe");
        while(stack.pop()!= null) {
            System.out.println(stack.pop());

        }


    }

}
