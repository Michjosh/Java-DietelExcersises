import ChapterEight.Student;
import ChapterEight.University;


import org.junit.jupiter.api.Test;

    class StudentTest {
        @Test
        public void universityTest() {
            Student student = new Student();
            student.setName("Toyin");
            student.setSchool(University.LASU);
            University.LASU.setName("Lagos Model College");

            // System.out.println(student.getSchool().getName());
            String fullName = University.LASU.getName();
            System.out.println(fullName);
        }
    }
