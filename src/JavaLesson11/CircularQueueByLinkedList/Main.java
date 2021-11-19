package JavaLesson11.CircularQueueByLinkedList;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution.Queue queue = new Solution.Queue();

        solution.enQueue(queue, 1);
        solution.enQueue(queue, 2);
        solution.enQueue(queue, 3);

        solution.displayQueue(queue);
        solution.deQueue(queue);
        solution.displayQueue(queue);
    }
}
