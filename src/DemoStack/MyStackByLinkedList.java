package DemoStack;

public class MyStackByLinkedList<E> {
    Node<E> topNode;

     class Node<E> {
        Node next;
        E value;

        Node(E v) {
            value = v;
            next = null;
        }
    }

    public E getTopNodeValue() {
        return topNode.value;
    }

    public void add(E e) {
        Node newNode = new Node(e);
        if (!isEmpty()){
            newNode.next = topNode;
        }
        topNode = newNode;
    }

    public E pop() {
        E value = topNode.value;
        topNode = topNode.next;
        return value;
    }

    public boolean isEmpty() {
        return topNode == null;
    }

    public void show() {
        Node temp = topNode;
        while(temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}
