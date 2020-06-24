import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        String the = "the";
        int indexThe = str.indexOf(the);
        System.out.println(indexThe);
    }
}