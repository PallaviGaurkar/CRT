public class ReverseLinkedList {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }    
    }

    static Node head = null;

    public static void insertNode(int data) {
       Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
        } else{
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public static void printList(Node head) {
        if(head == null) {
            System.out.println("Empty");
        } else {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        

        while(curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
        
    }

    public static void main(String[] args) {
        printList(head);

        insertNode(10);
        insertNode(20);

        insertNode(30);


        printList(head);
        System.out.println();

        head = reverse(head);

        printList(head);
        
    }
}
