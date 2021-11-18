package DemoStack;

import java.util.Arrays;

public class MyStack<E> {
    private int size;
    private E[] elements;
    private int top;

    public MyStack(int s) {
        size = s;
        elements = (E[]) new Object[size];
        top = -1;
    }

    public int getSize() {
        return size;
    }

    public int getTop() {
        return top;
    }

    public void add(E e) {
        if (isFull()) {
            ensureCapacity();
        }
        top++;
        elements[top] = e;
    }

    public void ensureCapacity() {
        int newSize = elements.length * 2;
        size = newSize;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E pop() {
        if (!isEmpty()) {
            E e = elements[top];
            elements[top] = null;
            top--;
            return e;
        } else
            return null;
    }

    public void show() {
        for (int i = top; i >= 0; i--) {
            System.out.println(elements[i]);
        }
    }

    public E get() {
        return elements[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == size - 1);
    }
}
