import java.util.stream.DoubleStream;

public class Calculator {

    static double add(double... operands) {
        return DoubleStream.of(operands)
                .sum();
    }

    static double multiply(double... operands) {
        return DoubleStream.of(operands)
                .reduce(1, (a, b) -> a * b);
    }

    static int myMin(int value1, int value2) {
        return Math.min(value1, value2);
    }

    static int myMax(int value1, int value2) {
        return Math.max(value1, value2);
    }

    static void countTo(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println(i);
        }
    }
}