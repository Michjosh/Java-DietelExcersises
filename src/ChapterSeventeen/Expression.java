package ChapterSeventeen;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Expression {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Ann", "Andrew");
        List<String> filteredNames = names.stream()
                .filter(s -> s.startsWith("A")).collect(Collectors.toList());

        System.out.println(filteredNames);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squares = numbers.stream()
                .map(x -> x * x).collect(Collectors.toList());

        System.out.println(squares);

//        MathOperation add = (int x, int y) -> x + y;
        MathOperation add = Integer::sum;
        int result = add.operate(3, 4);
        System.out.println(result);

    }
}
