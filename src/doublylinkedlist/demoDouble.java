package doublylinkedlist;



public class demoDouble {

    public static void main(String[] args) {
        DoublyLinkedList<String> ls = new DoublyLinkedList<>();
        ls.add("Xarenwo");
        ls.add("h3h3");
        ls.add("pwaha");


        ls.display();
        ls.delete();
        ls.display();
    }
}
