package JavaLesson11.ImplementQueueByArray;

public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isFull() {
        return (currentSize == capacity);
    }

    public boolean isEmpty() {
        return (currentSize == 0);
    }

    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("Unable too add more elements");
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = value;
            currentSize++;
            System.out.println("Element " + value + " is pushed to Queue !");
        }
    }

    public void deQueue() {
        if(isEmpty()) {
            System.out.println("Queue are empty");
        } else {
            head++;
            if (head == capacity-1) {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            currentSize--;
        }
    }

    public void show() {
        for (int x : queueArr
             ) {
            System.out.println(x);
        }
    }
}
