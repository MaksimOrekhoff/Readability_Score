import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ticket = sc.next();
        int sum1 = 0;
        int sum2 = 0;
        String[] num = ticket.split("");

        for (int i = 0; i < num.length; i++) {
            if (i > 2) {
                sum2 += Integer.parseInt(num[i]);
            } else {
                sum1 += Integer.parseInt(num[i]);
            }
        }
        System.out.println(sum1==sum2 ? "Lucky" : "Regular");


    }

}