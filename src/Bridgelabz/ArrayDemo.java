package Bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element:");
        int n = sc.nextInt();
        for (int a : list){
            if (a == n){
                System.out.println("Element found");

            }else {
                System.out.println("Element not found");
            }
        }
    }
}
