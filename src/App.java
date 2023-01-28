import multithreaded_programming.RunnableThread;

public class App {
    public static void main(String[] args) throws Exception {
        Thread thread1 = new Thread(new RunnableThread("thread1"));
        Thread thread2 = new Thread(new RunnableThread("thread2"));
        thread1.start();
        thread2.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Основной поток. Счетчик: " + i);
        }
        System.out.println("Основной поток. Завершен");
    }
}
