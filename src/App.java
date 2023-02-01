import multithreaded_programming.MyThread;
import multithreaded_programming.TickTock;

public class App {
    public static void main(String[] args) {
        TickTock clock = new TickTock();
        MyThread tickThread = MyThread.createAndStart("Tick", clock);
        MyThread tockThread = MyThread.createAndStart("Tock", clock);
        try {
            tickThread.thread.join();
            tockThread.thread.join();
        } catch (InterruptedException e) {
            System.out.println("Прерывание основного потока");
            System.out.println("Git test");
        }
    }
}
