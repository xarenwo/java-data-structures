package hashtable;

public class HashTable<T> {

    Entry[] arrayHash;
    int size;

    public HashTable(int size) {
        this.size = size;
        arrayHash = new Entry[size]; // initialize a new array with the size provided
        for(int i=0;i<size;i++) {
            arrayHash[i] = new Entry(); // initialize every entry with null
        }

    }

    int getHash(int key) {
        return key%size; // return the hash for specific index
    }

    public void put(int key,Object value) {
        // hash for the key
        int hashIndex = getHash(key);
        // now we have the array and understand where the key should be located based on hashing.
        Entry arrayValue = arrayHash[hashIndex]; // get me the location in the array where to put the linked list and see if there is already an element or this is the first.
        Entry newItem = new Entry(key,value); // define new entry with key and value and i already know in which index to put it.
        newItem.next = arrayValue.next;
        arrayValue.next=newItem;
    }
    public T get(int key) {
        T value = null; // i don't know the value yet.
        int hashIndex = getHash(key); // understand where in the array is this key located
        Entry arrayValue = arrayHash[hashIndex]; // i now have the array at the index specified by the key and take the address of the first element
        while(arrayValue !=null) {
            if(arrayValue.getKey()==key) {
                value = (T) arrayValue.getValue();
                break;
            }
            arrayValue=arrayValue.next;
        }

        return value;
    }
}
