package TestPckage;

import java.util.Scanner;

public class StringsTest {
    public static void smallestString(String s, int k){
        String result = "";
        int startIndex = 0;
        result = s.substring(startIndex,k);
        startIndex = startIndex + k;
        System.out.println(startIndex);
        System.out.println(result);


    }

    public static void main(String[] args){
       // smallestString("Hello World",3);


        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        scan.nextLine();
        String str = scan.nextLine();
        double d = scan.nextDouble();

        System.out.println(x);
        System.out.println(str);
        System.out.println(d);
    }
}
