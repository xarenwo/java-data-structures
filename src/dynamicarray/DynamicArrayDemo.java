package dynamicarray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray<Integer> da = new DynamicArray<Integer>();
        da.put(11);
        System.out.println("Size : "+ da.getSize());
        da.put(20);
        System.out.println("Size : "+ da.getSize());
        da.put(3);
        System.out.println("Size : "+ da.getSize());
        da.put(57);
        System.out.println("Size : "+ da.getSize());
        da.put(53);
        System.out.println("Size : "+ da.getSize());
        da.put(51);
        System.out.println("Size : "+ da.getSize());
        da.put(51);
        System.out.println("Size : "+ da.getSize());
        da.put(51);
        System.out.println("Size : "+ da.getSize());
        da.put(51);
        System.out.println("Size : "+ da.getSize());
        System.out.println("Elements saved are : ");
        for(int i=0; i<da.getSize();i++) {
            if(da.get(i) != null)
                System.out.println(da.get(i) + "\t");

        }
    }
}
