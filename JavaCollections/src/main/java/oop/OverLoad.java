package oop;

public class OverLoad {
  public static void main(String[] args) {
    A obj = new A();
    System.out.println(obj.sum(8,3));
    System.out.println(obj.sum(2.1,3.2,3.3));
  }


  public static class A {
    public int sum (int a, int b){
      return a+b;
    }
    public double sum (double a, double b, double c){
      return a+b+c;
    }
  }
}
