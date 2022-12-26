package Bridgelabz;

import java.util.concurrent.Callable;

public class C  extends B{
    public void test(){

        System.out.println("We are in Class C");
    }

    public static void main(String[] args) {
        C c=new C();
        c.test();
        c.demo();
        c.msg();
        System.out.println(c.age);
           }
        }


