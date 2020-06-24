package readability;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        String[] sign = s.split("[.?!]");
        for (int i = 0; i < sign.length; i++) {
            String[] s1 = sign[i].split("\\s+");
            count += s1.length;
        }
        double ariphm = count / sign.length;
        System.out.println((ariphm > 10) ? "HARD" : "EASY");
    }
}
