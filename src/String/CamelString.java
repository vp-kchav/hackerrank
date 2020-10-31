package String;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class CamelString {
    static int camelcase(String s) {
        return s.length() - s.replaceAll("[A-Z]","").length()+1;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {


        String s = scanner.nextLine();

        int result = camelcase(s);

        System.out.println(result);

        scanner.close();
    }
}
