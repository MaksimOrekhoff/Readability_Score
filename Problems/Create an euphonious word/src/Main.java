import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split("");
        String s1 = "aeiouy";
        String s2 = "qwrtpsdfghkljzxcvbnm";
        boolean isContain1 = false;

        int count = 0;
        int answer = 0;
        int a = 0;
        int b = 0;
        for (int i = 0; i < s.length; i++) {
            isContain1 = s1.contains(s[i]);

            if (isContain1) {
                count++;
                if (count != 1 && count % 2 != 0) {
                    answer++;
                    a = answer;
                    continue;
                }
            }
            else {
                count = 0;
            }
        }
        answer = 0;
        for (int i = 0; i < s.length; i++) {
            isContain1 = s2.contains(s[i]);

            if (isContain1) {
                count++;
                if (count != 1 && count % 2 != 0) {
                    answer++;
                    b = answer;
                    continue;
                }
            }
            else {
                count = 0;
            }
        }

        System.out.println(a + b);
    }
}