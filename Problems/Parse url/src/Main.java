import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] url = sc.nextLine().split("[?]");
        String[] data = url[1].split("[&]");
        String password = "";
        for (int i = 0; i < data.length; i++) {

            int index = data[i].lastIndexOf("=");
            String key = data[i].substring(0, index);
            String parameter = data[i].substring(index + 1).isEmpty() ? "not found" : data[i].substring(index + 1);
            System.out.println(key + " : " + parameter);
            if (key.equals("pass")) {
                password = "password : " + parameter;
            }

        }

        System.out.println(password);
    }
}