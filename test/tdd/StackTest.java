import DataStructures.Stack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class StackTest {
        Stack nedStark;

        @BeforeEach
        public void setUP(){
            nedStark = new Stack(5);
        }

        @Test
        public void newStack_isEmptyTest(){
            Stack nedStark = new Stack(5);
            assertTrue(nedStark.isEmpty());
        }

        @Test
        public void pushX_stackIsNotEmpty(){
            nedStark.push(3);
            assertFalse(nedStark.isEmpty());
        }

        @Test
        public void pushX_popX_stackIsEmptyTest(){
            nedStark.push(34);
            nedStark.pop();
            assertTrue(nedStark.isEmpty());
        }

        @Test
        public void pushXandY_popY_stackIsNotEmptyTest(){
            nedStark.push(23);
            nedStark.push(45);
            nedStark.pop();
            assertFalse(nedStark.isEmpty());
        }


        @Test
        public void pshX_popX_valueShouldBeXTest(){
            nedStark.push(34);
            int result = nedStark.pop();
            assertEquals(34, result);

        }

        @Test
        public void pushXY_popXY_valueShouldBeYXTest(){
            nedStark.push(54);
            nedStark.push(32);
            int Y =nedStark.pop();
            int X = nedStark.pop();
            assertEquals(32, Y);
            assertEquals(54, X);
        }

        @Test
        public void fillUpStack_pushShouldThrowStackOverflowException(){
            nedStark.push(34);
            nedStark.push(34);
            nedStark.push(34);
            nedStark.push(34);
            nedStark.push(34);
            assertTrue(nedStark.isFull());
            assertThrows(StackOverflowError.class, ()-> nedStark.push(24));
        }

        @Test
        public void pushX_peekShouldReturnXTest(){
            nedStark.push(46);
            nedStark.peek();
            assertEquals(46,nedStark.peek());
            System.out.println(nedStark.peek());

        }
    }