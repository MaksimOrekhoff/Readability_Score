public boolean areSiblings(File f1, File f2) {

//import java.io.File;
//import java.io.FileNotFoundException;

//import java.util.Scanner;

 return f1.getParent().equals(f2.getParent());
}

/*class V {
    public static void main(String[] args) {
        String way = new String("C:\\Users\\Maxim\\Downloads\\dataset_91065.txt");
        File file = new File(way);
        int sum = 0;
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                String array = scanner.next();
                if(Integer.parseInt(array) == 0) {
                    break;
                }

                    if(Integer.parseInt(array) % 2 == 0 ) {
                        sum ++;

                }

                        //sum += Integer.parseInt(array);
                    }
                }
        catch (FileNotFoundException e) {
            System.out.println("No file found: " + way);
        }
        System.out.println(sum);

            }
        }


/*import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
class ReadingFileDemo {
    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void main(String[] args) {
        String pathToHelloWorldJava = "C:\\Users\\Maxim\\Downloads\\dataset_91069.txt";
        try {

            String[] s = readFileAsString(pathToHelloWorldJava)
                    .split("[\\\\s+] | [\\\\n+] | [\\\\t+] | [\\\\r+]");
            int index = 0;
            long max = 0;

            for (int i = 3; i < s.length - 2; i++) {
                if (Long.parseLong(s[i]) -  Long.parseLong(s[i + 2]) > max) {
                    index = i;
                    max = Long.parseLong(s[i]);
                }
            }
            if (s.length != 1) {
                System.out.println(s[index - 1]);
            }
        } catch (IOException e) {
            System.out.println("Cannot read file: " + e.getMessage());
        }

    }
}*/