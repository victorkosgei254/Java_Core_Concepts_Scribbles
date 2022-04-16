package CommandLine;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        for (String x : args) {
            System.out.println(x);
        }

        try {
            Process pr = Runtime.getRuntime().exec("./Main.py results.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (String x : args) {
            System.out.println(x);
        }

    }
}
