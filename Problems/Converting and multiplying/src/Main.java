import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while (sc.hasNext()) {
            try {
                s = sc.next();
                int x = Integer.parseInt(s);
                if (x == 0) {
                    break;
                }
                System.out.println(x * 10);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + s);
            }
        }


    }
}