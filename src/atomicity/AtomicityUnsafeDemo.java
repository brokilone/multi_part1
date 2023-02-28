package atomicity;

public class AtomicityUnsafeDemo {

  public static void main(String[] args) throws InterruptedException {
    Counter counter = new Counter();
    CounterThread[] threads = new CounterThread[10];

    for (int i = 0; i < threads.length; i++) {
      threads[i] = new CounterThread(counter);
      threads[i].start();
    }

    for (CounterThread thread : threads) {
      thread.join();
    }

    System.out.println("Значение счетчика (ожидаем 5_000): " + counter.getCount());
  }
}
