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

    static int min(int value1, int value2) {
        return Math.min(value1, value2);
    }

    static int max(int value1, int value2) {
        return Math.max(value1, value2);
    }
}