package com.brokilone.preview;

public class ThreadDemo {
  public void printInfo(){
    for (int i = 0; i < 10; i++) {
      System.out.println(Thread.currentThread().getName() + " - " + i);
    }
  }

  public static void main(String[] args) {
    final ThreadDemo demo = new ThreadDemo();

    Runnable task = new Runnable() {
      @Override
      public void run() {
        demo.printInfo();
      }
    };

    new Thread(task, "Simple thread1").start();
    new Thread(task, "Simple thread2").start();
  }
}

