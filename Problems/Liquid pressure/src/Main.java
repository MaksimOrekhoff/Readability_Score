import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gravity = 9.8;
        double density = scanner.nextDouble();
        double height = scanner.nextDouble();
        double pressure = gravity * height * density;
        System.out.println(pressure);
    }
}