package com.driver;
public class Main {
  public static void main(String[] args) {

      B test1 = new B();
      test1.meth();
  }
}
class A{
    String meth(){
        System.out.println("Invoking method from class A");
        return "Invoking method from class A";
    }
}
class B extends A{
    String meth(){
        System.out.println("Method is overridden in Extendend class B");
        return "Method is overridden in Extendend class B";
    }
}