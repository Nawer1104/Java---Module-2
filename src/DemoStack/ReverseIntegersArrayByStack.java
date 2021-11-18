package DemoStack;

public class ReverseIntegersArrayByStack {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>(1);
        Integer[] integers = new Integer[5];
        for (int i = 0, j = 1; i < integers.length;j++, i++) {
            integers[i] = j;
        }

        System.out.println("Integer Array is: ");
        for (Integer x : integers
             ) {
            System.out.println(x);
        }
        System.out.println();

        System.out.println("Let's add all elements to the Stack");
        for (Integer x : integers
             ) {
            myStack.add(x);
        }
        myStack.show();
        System.out.println();

        System.out.println("Integer array after reverse is:");
        for (int i = 0; i < integers.length; i++) {
            integers[i] = myStack.pop();
        }
        for (Integer x : integers
        ) {
            System.out.println(x);
        }
    }
}
