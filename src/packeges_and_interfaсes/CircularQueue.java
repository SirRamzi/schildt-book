package packeges_and_interfaсes;

public class CircularQueue implements ICharQ {
    private char queue[];
    private int putLoc;
    private int getLoc;

    public CircularQueue(int length) {
        queue = new char[length];
        putLoc = -1;
        getLoc = -1;
    }

    private boolean isFull() {
        if ((putLoc + 1 == getLoc) || (putLoc == queue.length - 1 && getLoc == 0)) {
            return true;
        } else
            return false;
    }

    private boolean isEmpty() {
        if (putLoc == -1 && getLoc == -1) {
            return true;
        } else
            return false;
    }

    private void reset() {
        putLoc = -1;
        getLoc = -1;
    }

    public void put(char ch) {
        if (isFull()) {
            System.out.println("Очередь переполнена");
        } else {
            if (isEmpty()) getLoc = 0;
            putLoc++;
            if (putLoc == queue.length) putLoc = 0;
            queue[putLoc] = ch;

        }
    }

    public char get() {
        char temp;
        if (isEmpty()) {
            System.out.println("Очередь пуста");
            return 0;
        } else {
            temp = queue[getLoc];
        }
        if (putLoc == getLoc) {
            reset();
        } else {
            getLoc++;
            if (getLoc == queue.length)
                getLoc = 0;
        }
        return temp;
    }
}
