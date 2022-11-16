package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest{


        @Test
        public void squareTest(){
            Kata kata = new Kata();

            int result = kata.squareOf(100);
            assertEquals(10_000, result);
        }

        @Test
        public void addTest(){
            Kata kata = new Kata();
            int sum = kata.add(12, 2);
            assertEquals(14, sum);
        }

        @Test public void maxTest() {
            Kata kata = new Kata();
            int maximum = kata.maxOf(23, 12);
            assertEquals(23, maximum);
        }

    }

