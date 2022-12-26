package Bridgelabz;

public class MyExample implements Printable,Showable {

    @Override
    public void print() {
        System.out.println("welcome");
    }

    @Override
    public void show() {
        System.out.println("To MyInterface");
    }


    public static void main(String[] args) {
        MyExample obj = new MyExample();
        obj.print();
        obj.show();
    }
}