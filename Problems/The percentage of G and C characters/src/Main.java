import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String c = "C";
        String g = "G";
        String[] genom = sc.nextLine().toUpperCase().split("");
        double count = 0;
        for (int i = 0; i < genom.length; i++) {
            if (genom[i].equals(c) || genom[i].equals(g)) {
                count++;
            }
        }
        double result = count / genom.length * 100;
        System.out.println(result);
    }
}