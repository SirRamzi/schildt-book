package multithreaded_programming;

public class MyThread implements Runnable {
    String threadName;

    public MyThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName + " - запущен");
        for (int i = 0; i < 10; i++) {
            System.out.println(threadName + " поток. Счетчик " + i);
        }
        System.out.println(threadName + " - завершен");
    }

}
