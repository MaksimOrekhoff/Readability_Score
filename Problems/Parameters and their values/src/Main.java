import java.util.Scanner;

class Problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < args.length - 1; ) {
            System.out.println(args[i] + "=" + args[i + 1]);
            i += 2;
        }
    }
}