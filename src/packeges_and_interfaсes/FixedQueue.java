package packeges_and_interfaсes;

public class FixedQueue implements ICharQ {

    private char queue[];
    private int getLoc;
    private int putLoc;

    public FixedQueue(int length) {
        queue = new char[length];
        getLoc = 0;
        putLoc = 0;
    }

    public void put(char ch) {
        if (putLoc < queue.length) {
            queue[putLoc++] = ch;
        } else {
            System.out.println("Очередь переполнена");
        }
    }

    public char get() {
        if (getLoc != putLoc) {
            return queue[getLoc++];
        } else {
            System.out.println("Очередь пуста");
            return (char) 0;
        }
    }
    
}
