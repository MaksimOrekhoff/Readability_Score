import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double answer = x * x * x + x * x + x + 1;
        System.out.println(answer);
    }
}