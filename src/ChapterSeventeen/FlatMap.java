package ChapterSeventeen;

import com.sun.source.doctree.SeeTree;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
//        System.out.println(Stream.iterate(1, (n)-> n+2)
//                .allMatch((n)-> n %2 != 0));

        List<String> words = List.of(
                "ABBA", "BOO", "QWETY", "NEIGH", "YOBOYOBO"
        );
        System.out.println(words.stream()
                .flatMap(s->Stream.of(s.split("")))
                .collect(Collectors.toList()));
//                .forEach(System.out::println);
//        Stream<Integer> s1 = words.stream()
//                .flatMap((word) -> Stream.of(word.length()));
//
//        s1.forEach(System.out::println);

//        Map<Boolean, Set<String>> map1 = words.stream()
//                .collect(Collectors.partitioningBy((w)->w.length()%2==0), Collectors.toSet());



    }
}

