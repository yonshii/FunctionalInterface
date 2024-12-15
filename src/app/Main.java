package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Addition result: " + addition.operate(34, 12)); // Наприклад: 7 + 5

        // 2. Лямбда-вираз для StringManipulator
        StringManipulator toUpperCase = (String s) -> s.toUpperCase();
        System.out.println("Upper case: " + toUpperCase.manipulate("Functional Interfaces"));

        // 3. Метод countUppercase у StringListProcessor
        Function<String, Integer> countUppercaseFunction = StringListProcessor::countUppercase;
        System.out.println("Number of capital letters: " + countUppercaseFunction.apply("FunCtioNAl iNterFacEs"));

        // 4. Постачальник випадкових чисел за допомогою Supplier
        Supplier<Integer> randomNumberSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        System.out.println("Random number: " + randomNumberSupplier.get());
    }
}

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

@FunctionalInterface
interface StringManipulator {
    String manipulate(String s);
}