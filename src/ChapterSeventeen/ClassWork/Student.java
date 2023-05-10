package ChapterSeventeen.ClassWork;
import java.util.Comparator;

public class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static class MyComparator implements Comparator<Student> {
        @Override
        public int compare(Student s1, Student s2) {
            int ageComparison = Integer.compare(s1.getAge(), s2.getAge());
            if (ageComparison != 0) {
                return ageComparison;
            } else {
                return s1.getName().compareTo(s2.getName());
            }
        }
    }
}
