package Bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Sreekanth");
        list.add("25");
        list.add("Ram");
        list.add("24");
        list.add("Ajeet");
        list.add("26");
        System.out.println(list);

        List<String> list1 = list.stream().sorted().collect(Collectors.toList());
        System.out.println(list1);

    }
}
