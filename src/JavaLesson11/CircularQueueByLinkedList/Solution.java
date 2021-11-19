package JavaLesson11.CircularQueueByLinkedList;

public class Solution {

    public Solution() {
    }

    class Node {
        private int data;
        private Node next;

        public Node (int data){
            this.data = data;
        }

        public int getData() {
            return data;
        }
    }

    static class Queue {
        public Node front = null;
        public Node rear = null;

        public Queue () {
        }
    }

    public boolean isEmpty(Queue queue) {
        return (queue.front == null && queue.rear == null);
    }

    public void enQueue(Queue queue, int data) {
        Node newNode = new Node(data);
        if (isEmpty(queue)) {
            queue.front = queue.rear = newNode;
        } else
            queue.rear.next = newNode;
        queue.rear = newNode;
        queue.rear.next = queue.front;
    }

    public void deQueue(Queue queue) {
        if (isEmpty(queue)) {
            System.out.println("Queue now is empty!");
        }

        if (queue.front == queue.rear) {
            queue.front = queue.rear = null;
        } else {
            queue.front = queue.front.next;
            queue.rear.next = queue.front;
        }
    }

    public void displayQueue(Queue queue) {
        Node temp = queue.front;
        while (temp.next != queue.front) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(queue.rear.data);
    }
}
