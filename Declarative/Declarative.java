package Declarative;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Declarative {
    public static void main(String[] args) {
        int increment = incrementByOne(0);
        System.out.println(increment);
        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        // chain function
        int multiply = mulitplyByTenFcn.apply(2);
        int combined = incrementByOneFunction.andThen(mulitplyByTenFcn).apply(2);

        System.out.println(multiply);
        System.out.println(combined);

        System.out.println("BiFunction Called");
        System.out.println(incrementByOneAndMulitplyBiFunc.apply(2, 100));

        // BiFunctions

    }

    // New Declarative Ways
    /// Chain function
    static Function<Integer, Integer> incrementByOneFunction = number -> ++number;

    static Function<Integer, Integer> mulitplyByTenFcn = number -> number * 10;

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMulitplyBiFunc = (numToIncrement,
            numToMulitplyBy) -> (numToIncrement + 1) * numToMulitplyBy;

    // Imperative ways
    static int incrementByOne(int number) {
        return ++number;
    }

}
