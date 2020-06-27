import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = Math.sqrt(b * b - 4 * a * c);


        double root1 = (-b + d) / (2 * a);
        double root2 = (-b - d) / (2 * a);
        double[] roots = {root1, root2};
        Arrays.sort(roots);

        System.out.println(roots[0] + " " + roots[1]);

    }
}