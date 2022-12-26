package Bridgelabz;

public class B extends A {
    public void demo(){

        System.out.println("B class DemoFunction");
    }

    public static void main(String[] args) {
        B b=new B();
        b.demo();
        b.msg();
        System.out.println(b.age);
    }
}
