package stackdynamicarray;

public class stackDynamicDemo {

    public static void main(String[] args) {

        stackDynamicArray<Integer> stack = new stackDynamicArray<Integer>(5);
        stack.push(5);
        stack.push(2);
        System.out.println("SIZE : " + stack.getSize());
        stack.push(6);
        stack.push(1);
        System.out.println("SIZE : " + stack.getSize());
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        while(!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("SIZE : " + stack.getSize());
    }

}

