import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double distance = scanner.nextDouble();
        double hours = scanner.nextDouble();
        double speed = distance / hours;
        System.out.println(speed);
    }
}