package Bridgelabz;

public class Recursion {
    public static void display(int a) {

        if (a > 0) {
            display(a-1);
            System.out.println(a+" ");

        }
    }

    public static void main(String[] args) {
        display(100);
    }
}