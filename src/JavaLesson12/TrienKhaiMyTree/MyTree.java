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

        while (true) {
            if (e > temp.data) {
                if (temp.right == null) {
                    temp.right = newNode;
                    return;
                }
            } else if ( e < temp.data) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return;
                }
            } else return;
        }

    }
}
