package stack;

public class stackDemo {

    public static void main(String[] args) {

        stackArray<Integer> stack = new stackArray<Integer>(5);
        stack.push(5);
        stack.push(2);
        stack.push(6);
        stack.push(1);
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

}

