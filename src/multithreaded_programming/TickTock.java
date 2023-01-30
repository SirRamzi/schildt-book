package multithreaded_programming;

public class TickTock {
    String state;

    synchronized void tick(boolean isEnabled) {
        if (!isEnabled) {
            state = "ticked";
            notify();
            return;
        }
        System.out.print("Tick ");
        state = "ticked";
        notify();
        try {
            while (state.equals("ticked")) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("Прерывание потока");
        }
    }

    synchronized void tock(boolean isEnabled) {
        if (!isEnabled) {
            state = "tocked";
            notify();
            return;
        }
        System.out.println("Tock");
        state = "tocked";
        notify();
        try {
            while (state.equals("tocked")) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println("Прерывание потока");
        }
    }
}
