import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int a = s.length()/2;
        if (s.length() % 2 == 0) {
            System.out.print(s.substring(0, s.length() / 2 - 1) + "" +
                    s.substring(s.length() / 2 + 1));
        } else {
            System.out.print(s.substring(0, s.length() / 2) + "" +
                    s.substring(s.length() / 2 + 1));
        }
    }
}