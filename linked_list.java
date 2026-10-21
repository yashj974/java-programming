class LinkedListDemo {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    void insertBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void delete(int data) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == data) {
            head = head.next;
            System.out.println(data + " deleted");
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println(data + " not found");
        } else {
            temp.next = temp.next.next;
            System.out.println(data + " deleted");
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {
        LinkedListDemo list = new LinkedListDemo();

        list.insertBeginning(20);
        list.insertBeginning(10);
        list.insertEnd(30);

        System.out.println("Linked List:");
        list.display();

        list.delete(20);

        System.out.println("After deletion:");
        list.display();
    }
}
