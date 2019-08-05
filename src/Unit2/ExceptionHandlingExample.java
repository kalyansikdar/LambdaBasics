package Unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int[] someNumbers = {1,2,3,4};
        int key = 0;

//  *** Try-catch block can be introduced in lambda functions ***
//        process(someNumbers, key, (v , k) -> {
//            try {
//                System.out.println(v / k);
//            }
//            catch (ArithmeticException e) {
//                System.out.println("An arithmetic exception is caught");
//            }
//        });

// *** Instead of modifying this crisp lambda function, try-catch block can be set in a wrapper lambda which will be wrapping the actual lambda
        process(someNumbers, key, wrapperLambda((v , k) -> System.out.println (v/k)));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : someNumbers)
            consumer.accept(i, key);
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {

        return (v, k) -> {
            try {
                consumer.accept(v, k);
            }
            catch (ArithmeticException e) {
                System.out.println("Exception caught in the wrapper");
            }
        };
    }
}