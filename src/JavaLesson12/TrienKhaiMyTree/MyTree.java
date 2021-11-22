package JavaLesson12.TrienKhaiMyTree;

public class MyTree {
    private int size = 0;
    private Node root;

    class Node {
        private int data;
        private Node left;
        private Node right;

        public Node(int data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public MyTree(int data) {
        root = new Node(data);
        size++;
    }

    public void add (int e) {
        Node newNode = new Node(e);
        Node temp = root;

        if (root == null) {
            root = newNode;
            return;
        }

        while (temp != null) {
            if (e > temp.data) {
                temp = temp.right;
            } else if ( e < temp.data) {
                temp = temp.left;
            } else return;
        }
        temp = newNode;
    }
}
