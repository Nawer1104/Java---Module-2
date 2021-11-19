package DemoStack;

public class MyStackByLinkedListTest {
    public static void main(String[] args) {
        MyStackByLinkedList<Integer> myStackByLinkedList = new MyStackByLinkedList<>();
        myStackByLinkedList.add(1);
        myStackByLinkedList.add(2);
        myStackByLinkedList.add(3);

        System.out.println("Stack now have these elements: ");
        myStackByLinkedList.show();

        System.out.println("Let's try to pop out several times!");
        myStackByLinkedList.pop();
        myStackByLinkedList.pop();
        myStackByLinkedList.pop();


        System.out.println("Stack now is: ");
        myStackByLinkedList.show();
        System.out.println("Checkout if stack is empty or not");
        System.out.println(myStackByLinkedList.isEmpty());

    }
}
