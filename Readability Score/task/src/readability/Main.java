package readability;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        String str = args[0];
        File file = new File(str);
        try (Scanner sc = new Scanner(file)) {
            String s1 = "";
            while (sc.hasNext()) {
                String s = sc.nextLine();
                s1 += s;
            }
            double characters = charactersIn(s1);
            double sentences = s1.split("[.!?]").length;
            double words = wordIn(s1);
            double syllables = syllables(s1, false);
            double polysyllables = syllables(s1, true);
            output(words, sentences, characters, syllables, polysyllables);

            System.out.print("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): ");
            System.out.println();

            Scanner console = new Scanner(System.in);

            String choice = console.nextLine();
            choice(words, sentences, characters, syllables, choice, polysyllables);

        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + args[0]);
        }
    }

    public static void choice(double words, double sentences, double characters, double syllables, String choice, double polysyllables) {
        String[] choises = {"ARI", "FK", "SMOG", "CL"};
        double score = 0;
        String age = "";
        String method = "";
        switch (choice) {
            case "ARI": {
                score = getScore(words, characters, sentences);
                age = years(score);
                method = "Automated Readability Index: ";
                break;
            }
            case "FK": {
                score = gradeFleshKincaid(syllables, sentences, words);
                age = years(score);
                method = "Flesch–Kincaid readability tests: ";
                break;
            }
            case "SMOG": {
                score = gradeSMOG(polysyllables, sentences);
                age = years(score);
                method = "Simple Measure of Gobbledygook: ";
                break;
            }
            case "CL": {
                score = clIndex(words, characters, sentences);
                age = years(score);
                method = "Coleman–Liau index: ";
                break;
            }
            case "all": {
                for (String ch : choises) {
                    choice(words, sentences, characters, syllables, ch, polysyllables);
                }
                break;
            }
        }
        System.out.println(String.format(method + "%.2f" + " (about " + age + " year olds).", score));
    }

    public static void output(double words, double sentences, double characters, double syllables, double polysyllables) {
        System.out.println("Words: " + (int) words + '\n'
                + "Sentences: " + (int) sentences + '\n'
                + "Characters: " + (int) characters + '\n'
                + "Syllables: " + syllables + '\n'
                + "Polysyllables: " + polysyllables);
    }

    public static String years(double score) {
        String years = "";
        switch ((int) Math.round(score)) {
            case 1:
                years = "6";
                break;
            case 2:
                years = "7";
                break;
            case 3:
                years = "9";
                break;
            case 4:
                years = "10";
                break;
            case 5:
                years = "11";
                break;
            case 6:
                years = "12";
                break;
            case 7:
                years = "13";
                break;
            case 8:
                years = "14";
                break;
            case 9:
                years = "15";
                break;
            case 10:
                years = "16";
                break;
            case 11:
                years = "17";
                break;
            case 12:
                years = "18";
                break;
            case 13:
                years = "24";
                break;
            case 14:
                years = "24+";
                break;
        }
        return years;
    }

    public static double syllables(String data, boolean poly) {
        String[] sentences = data.toLowerCase().split("[.!?]");
        int countOfSyllables = 0;
        String vowels = "aeiouy";
        //String consonants = "[q+w+r+t+p+s+d+f+g+h+j+k+l+z+x+c+v+b+n+m+]";
        for (int i = 0; i < sentences.length; i++) {
            String[] words = sentences[i].trim().split("[\\t+\\n+\\s+]");
            for (int j = 0; j < words.length; j++) {
                int syllablesInWord = 0;
                String word = words[j];
                if (word.charAt(word.length() - 1) == 'e') {
                    word = word.substring(0, word.length() - 1);
                }
                String[] array = word.split("");
                for (int k = 0; k < array.length - 1; k++) {
                    if (vowels.indexOf(array[k]) >= 0 && vowels.indexOf(array[k + 1]) < 0
                            || k == array.length - 2 && vowels.indexOf(array[k + 1]) >= 0) {
                        syllablesInWord++;
                    }
                }
                if (poly) {
                    if (syllablesInWord > 2) {
                        countOfSyllables++;
                    }
                } else if (syllablesInWord == 0) {
                    countOfSyllables++;
                } else {
                    countOfSyllables += syllablesInWord;
                }
            }
        }
        return countOfSyllables;
    }

    public static double gradeSMOG(double polysyllables, double sentences) {
        return 1.043 * Math.sqrt(polysyllables * (30 / sentences)) + 3.1291;
    }

    public static double gradeFleshKincaid(double syllables, double sentences, double words) {
        return 0.39 * (words / sentences) + 11.8 * (syllables / words) - 15.59;
    }

    public static double clIndex(double words, double characters, double sentences) {
        double l = characters / words * 100;
        double s = sentences / words * 100;
        return 0.0588 * l - 0.296 * s - 15.8;
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
