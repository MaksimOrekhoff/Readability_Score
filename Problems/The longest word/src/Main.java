import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxStr = 0;
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        for (int i = 0; i < s1.length; i++) {
            if (s1[i].length() > s1[maxStr].length()){
                maxStr = i;
            }
        }
        System.out.println(s1[maxStr]);
    }
}