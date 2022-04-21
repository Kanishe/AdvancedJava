package oop;

public class OverRide {
  public static void main(String[] args) {
    A var = new B();
    var.say();

  }

  public static class A {
    public void say() {
      System.out.println("I am class A");
    }
  }

  public static class B extends A {
    @Override
    public void say() {
      System.out.println("I am class B");
    }
  }
}