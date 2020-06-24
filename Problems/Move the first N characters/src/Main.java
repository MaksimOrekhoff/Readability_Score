import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int num = sc.nextInt();
        if (word.length() < num) {
            System.out.println(word);
        } else {
            String word12 = word.substring(0, num);
            String word22 = word.substring(num);
            System.out.println(word22 + word12);
        }

    }
}