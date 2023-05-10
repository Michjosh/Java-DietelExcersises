package ChapterSeventeen;

import java.security.SecureRandom;
import java.util.Random;
import java.util.function.*;

public class FunctionalInterfaceClas {
    public static void main(String[] args) {
//        predicate
//        System.out.println(stringPredicate.test("hello")); // true
//        System.out.println(stringPredicate.test("")); // false
//
////        biPredicate
//        System.out.println(lessThanPredicate.test(3, 4)); // true
//
////        consumer
//        stringConsumer.accept("HELLO"); // prints "hello"
//
////        biConsumer
//        concatConsumer.accept("Hello, ", "world!"); // prints "Hello, world!"
//
////        supplier
//        System.out.println(integerSupplier.get()); // 42
//
////        function
//        System.out.println(stringLengthFunction.apply("hello")); // 5
//
////        function
//        System.out.println(sumFunction.apply(3, 4)); // 7
//
////        unaryOperator
//        System.out.println(doubleOperator.apply(5)); // 10
//
////        doubleOperator
//        System.out.println(sumOperator.apply(3, 4)); // 7

       ints.accept(1, 2);
        IntConsumer intConsumer = System.out::println;
        intConsumer.accept(1000);


    }
    static Predicate<String> stringPredicate = s -> s.length() > 0;
    static BiPredicate<Integer, Integer> lessThanPredicate = (a, b) -> a < b;
    static Consumer<String> stringConsumer = s -> System.out.println(s.toLowerCase());
    static BiConsumer<String, String> concatConsumer = (s1, s2) -> System.out.println(s1 + s2);

    static BiConsumer<Integer, Integer> ints = (x, y) -> System.out.println(x * y);
    static Supplier<Integer> integerSupplier = () ->{
        SecureRandom random = new  SecureRandom();
        return random.nextInt(1, 100);
    };
    static Function<String, Integer> stringLengthFunction = String::length;
    static BiFunction<Integer, Integer, Integer> sumFunction = Integer::sum;
    static UnaryOperator<Integer> doubleOperator = (n) -> n * 2;
    static BinaryOperator<Integer> sumOperator = (x, y) -> x * y;

}

