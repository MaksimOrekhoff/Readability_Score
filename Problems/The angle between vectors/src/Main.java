import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double scal = x1 * x2 + y1 * y2;
        double mod1 = Math.sqrt(x1 * x1 + y1 * y1);
        double mod2 = Math.sqrt(x2 * x2 + y2 * y2);

        System.out.println(Math.toDegrees(Math.acos(scal / (mod1 * mod2))) );
    }
}