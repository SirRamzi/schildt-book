package multithreaded_programming;

public class ExtendThread extends Thread{
    ExtendThread(String name) {
        super(name);
    }
    
    @Override
    public void run() {
        System.out.println(getName() + " запущен.");
        super.run();
    }
}