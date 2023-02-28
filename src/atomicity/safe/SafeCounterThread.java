package atomicity.safe;

public class SafeCounterThread extends Thread{
  private final SafeCounter counter;

  public SafeCounterThread(SafeCounter counter) {
    this.counter = counter;
  }

  @Override
  public void run() {
    for (int i = 0; i < 500; i++) {
      counter.increment();
    }
  }
}
