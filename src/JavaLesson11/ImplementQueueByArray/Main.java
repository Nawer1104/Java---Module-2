package JavaLesson11.ImplementQueueByArray;

public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(5);
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        myQueue.enQueue(4);
        myQueue.show();


        myQueue.deQueue();
//        myQueue.deQueue();
//        myQueue.deQueue();
        myQueue.show();

    }
}
