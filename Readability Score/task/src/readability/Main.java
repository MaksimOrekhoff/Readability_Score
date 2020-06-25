package readability;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) {
      /*  Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        String[] sign = s.split("[.?!]");
        for (int i = 0; i < sign.length; i++) {
            String[] s1 = sign[i].split("\\s+");
            count += s1.length;
        }
        double ariphm = count / sign.length;
        System.out.println((ariphm > 10) ? "HARD" : "EASY");*/
        File file = new File(args[0]);

        try (Scanner sc = new Scanner(file)) {
            String s1 = "";
            while (sc.hasNext()) {
                String s = sc.nextLine();
                s1 += s;
            }
            double characters = charactersIn(s1);
            double sentences = s1.split("[.!?]").length;
            double words = wordIn(s1);
            double score = getScore(words, characters, sentences);
            String years = "";
            switch ((int) Math.ceil(score)) {
                case 1:
                    years = "5-6";
                    break;
                case 2:
                    years = "6-7";
                    break;
                case 3:
                    years = "7-9";
                    break;
                case 4:
                    years = "9-10";
                    break;
                case 5:
                    years = "10-11";
                    break;
                case 6:
                    years = "11-12";
                    break;
                case 7:
                    years = "12-13";
                    break;
                case 8:
                    years = "13-14";
                    break;
                case 9:
                    years = "14-15";
                    break;
                case 10:
                    years = "15-16";
                    break;
                case 11:
                    years = "16-17";
                    break;
                case 12:
                    years = "17-18";
                    break;
                case 13:
                    years = "18-24";
                    break;
                case 14:
                    years = "24+";
                    break;
            }

            System.out.print("Words: " + (int) words + '\n'
                    + "Sentences: " + (int) sentences + '\n'
                    + "Characters: " + (int) characters + '\n'
                    + "The score is: ");
            System.out.printf("%.2f"+ '\n', score);
            System.out.println("This text should be understood by " + years + " year olds.");


        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + args[0]);
        }
    }

    public static double getScore(double words, double characters, double sentences) {
        return 4.71 * (characters / words) + 0.5 * (words / sentences) - 21.43;
    }


    public static int wordIn(String s1) {
        String[] array = s1.split("[.!?]");
        int word = 0;
        for (int i = 0; i < array.length; i++) {
            String[] words = array[i].trim().split("[\\t+\\n+\\s+]");
            word += words.length;
        }
        return word;
    }

    public static int charactersIn(String array) {
        String s = array.replaceAll("[\\t+\\n+\\s+]", "");
        return s.length();
    }
}
