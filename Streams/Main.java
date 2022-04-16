package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // int[] numbers = new int[] { 1, 2, 4, 5, 3, 2, 32, 23, };
        String[] names = { "Kosgei", "Victor", "Kipruto", "Kipruto", "Kipruto" };
        // Stream.of(names).sorted().forEach(System.out::println);
        Stream.of(names).filter(z -> z.startsWith("K")).distinct().forEach(System.out::println);
    }
}
