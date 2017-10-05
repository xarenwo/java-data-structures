package hashtable;

public class HashDemo {
    public static void main(String[] args) {
        HashTable<String> users= new HashTable<String>(10);
        HashTable<String> houses = new HashTable<String>(3);
        users.put(0,"h3h3");
        users.put(1,"xarenwo");
        users.put(2,"foxy");
        users.put(3,"pax");
        System.out.println(users.get(3));

        houses.put(0,"good house");
        houses.put(1,"bad house");
        houses.put(2,"h3h3 house");
        System.out.println(houses.get(1));
        System.out.println(users.get(2));
    }
}
