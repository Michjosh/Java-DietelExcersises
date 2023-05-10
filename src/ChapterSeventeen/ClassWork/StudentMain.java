package ChapterSeventeen.ClassWork;

import java.util.*;
import java.util.stream.Collectors;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Michael", 20));
        studentList.add(new Student("Aen", 20));
        studentList.add(new Student("Zoe", 10));
        studentList.add(new Student("Josh", 40));
        studentList.add(new Student("Nike", 30));

//        studentList.sort(new Student.MyComparator());
        studentList.sort(Comparator.comparingInt(Student::getAge).thenComparing(Student::getName));
//        System.out.println(studentList.stream().max(Comparator.comparingInt(Student::getAge).thenComparing(Student::getName)));


//        studentList.forEach(System.out::println);


        List<String> names = List.of("Michael", "Chi", "Jen", "Minu");

//        System.out.println(names.stream()
//                .collect(Collectors.toMap(String::toString,String::length))
//                .entrySet());


        Map <String, Integer> nameAndAge = new TreeMap<>();

        nameAndAge.put("Michael", 23);
        nameAndAge.put("Mike", 14);
        nameAndAge.put("Jen", 29);
        nameAndAge.put("Pina", 83);
        nameAndAge.put("Tayo", 83);
        nameAndAge.put("Zillow", 63);

        Map<String, Integer> sortedNameAndAge = nameAndAge.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.
                        toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

        System.out.println(sortedNameAndAge);

    }
}