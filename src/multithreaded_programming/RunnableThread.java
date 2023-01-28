package multithreaded_programming;

public class RunnableThread implements Runnable {
    String threadName;

    public RunnableThread(String threadName) {
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
