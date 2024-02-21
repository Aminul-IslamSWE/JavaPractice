//Synchronization Modifiers
package mypackage;

public class SynchronizedExample {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}

