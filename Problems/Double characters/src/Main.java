import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] doubleChar = sc.nextLine().toCharArray();
        for (int i = 0; i < doubleChar.length; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(doubleChar[i]);
            }
        }
    }
}