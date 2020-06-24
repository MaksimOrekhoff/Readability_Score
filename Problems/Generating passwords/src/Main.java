import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int regA = sc.nextInt();
        int regB = sc.nextInt();
        int num = sc.nextInt();
        int sum = sc.nextInt();
        int count = 0;
        if (regA == 0 && regB == 0 && num == 0) {
            for (int i = 0; i < sum; i++) {
                System.out.print((count % 2 == 0) ? "." : "/");
                count++;
            }
        } else {
            do {
                for (int i = 0; i < regA; i++) {
                    if (count == sum) {
                        break;
                    }
                    System.out.print((count % 2 == 0) ? "A" : "N");
                    count++;
                }
                for (int i = 0; i < regB; i++) {
                    if (count == sum) {
                        break;
                    }
                    System.out.print((count % 2 == 0) ? "s" : "v");
                    count++;
                }
                for (int i = 0; i < num; i++) {
                    if (count == sum) {
                        break;
                    }
                    System.out.print((count % 2 == 0) ? "1" : "2");
                    count++;
                }
            }
            while (count != sum);
        }
    }
}