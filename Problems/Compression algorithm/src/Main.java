import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arrayDna = (sc.nextLine() + "#").split("");
        String outDna = "";
        int count = 0;
        for (int i = 0, j = 1; j < arrayDna.length; i++, j++) {
            count++;
            if (!arrayDna[i].equals(arrayDna[j])) {
                outDna += arrayDna[i] + count;
                count = 0;
            }
            if (arrayDna[j].equals("#")) {
                break;
            }
        }
        System.out.println(outDna);
    }
}
