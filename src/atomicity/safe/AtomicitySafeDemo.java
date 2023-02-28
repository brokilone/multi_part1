package atomicity.safe;

public class AtomicitySafeDemo {

  public static void main(String[] args) throws InterruptedException {
    SafeCounter counter = new SafeCounter();
    SafeCounterThread[] threads = new SafeCounterThread[10];

    for (int i = 0; i < threads.length; i++) {
      threads[i] = new SafeCounterThread(counter);
      threads[i].start();
    }

    for (SafeCounterThread thread : threads) {
      thread.join();
    }

    System.out.println("Значение счетчика (ожидаем 5_000): " + counter.getCount());
  }
}


