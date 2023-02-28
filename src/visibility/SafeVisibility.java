package visibility;

public class SafeVisibility {
  private static volatile boolean ready;

  public static void main(String[] args) throws InterruptedException {
    new Thread(() -> {
      while (true) {
        if (ready) {
          System.out.println("Flag was changed. Finishing...");
          break;
        }
      }
    }).start();

    Thread.sleep(5000);
    System.out.println("From main: changing flag!");
    ready = true;
  }
}


