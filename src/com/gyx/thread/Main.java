package com.gyx.thread;

public class Main {
  public static void main(String[] args) {
     PrintThread t= new PrintThread("Good!");
     t.start();
    PrintThread x= new PrintThread("Nice!");
    x.start();
  }
}
