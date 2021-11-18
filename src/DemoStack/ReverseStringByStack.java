package DemoStack;

public class ReverseStringByStack {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>(1);
        String string = "hello everybody!";

        String[] newString = string.split("");

        System.out.println("Ok so now we have an Array of String like:");
        for (String x : newString
             ) {
            System.out.println(x);
        }

        System.out.println("Let's add all elements to the Stack");
        for (String x : newString
        ) {
            myStack.add(x);
        }
        myStack.show();

        System.out.println("String array after reverse is:");
        for (int i = 0; i < newString.length; i++) {
            newString[i] = myStack.pop();
        }
        for (String x : newString
        ) {
            System.out.println(x);
        }

    }
}
