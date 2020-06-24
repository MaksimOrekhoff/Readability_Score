import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char x = s.charAt(0);
        boolean a = true;

        for (int i = 0; i < s.length(); i++) {
            if (x != s.charAt(i)) {
                a = false;
                break;
            }
            x++;
        }


        System.out.println(a);
    }
}