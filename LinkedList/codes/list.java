public class list {
    
    private static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }

    private static class myLinkedList{

        private Node head, tail;
        private int size;

        myLinkedList(){
            head = tail = null;
            size=0;
        }
    }

    public static void main(String[] args) {

    }
}
