package com.gyx.thread;

public class PrintThread extends Thread {
  private String message;

  public PrintThread(String message) {
      this.message=message;
      //this引用成员变量message
      //把PrintThread方法的参数message赋值给成员变量
  }

  @Override
  public void run() {
    for (int i = 0; i < 1000; i++) {
      System.out.println(message);
    }
  }
}
