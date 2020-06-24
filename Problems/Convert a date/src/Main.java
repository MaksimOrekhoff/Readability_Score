import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstData = sc.nextLine();
        String[] secondData = firstData.split("-");
        System.out.print(secondData[1] + "/"
                + secondData[2] + "/"
                + secondData[0]);

    }
}