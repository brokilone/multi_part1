package atomicity.safe;

import java.util.concurrent.atomic.AtomicInteger;

public class SafeCounter {

  private final AtomicInteger count = new AtomicInteger();

  public void increment() {
    count.incrementAndGet();
  }

  public int getCount() {
    return count.get();
  }
}

