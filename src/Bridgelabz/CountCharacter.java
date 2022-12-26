package Bridgelabz;

public class CountCharacter {
    public static void main(String[] args) {
        String string="the best of both worlds";
        int count=0;
        char len=string.charAt(0);
        for (int i=0;i<string.length();i++){
            if (string.charAt(i)!=' '){
                count++;

            }
        }
        System.out.println(string);
        System.out.println(len);
        System.out.println("Total number of Characters in a string:"+count);
    }
}
