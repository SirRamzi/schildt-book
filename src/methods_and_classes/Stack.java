package methods_and_classes;

public class Stack {
    private char[] stack;
    private int index = 0;

    public Stack(int legth) {
        stack = new char[legth];
    }

    public void push(char ch) {
        if (index < stack.length) {
            stack[index] = ch;
            index++;
        } else {
            System.out.println("Stack переполнен");
        }
    }

    public char pop() {
        if (index > 0) {
            index--;
            return stack[index];
        } else {
            System.out.println("Stack пуст");
        }
        return 0;
    }
}
