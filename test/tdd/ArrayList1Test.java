
import DataStructures.ArrayList1;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    public class ArrayList1Test {


        ArrayList1 myArrayList1;

        @BeforeEach
        public void startEachTestWith() {
            myArrayList1 =new ArrayList1(3);
        }

        @Test
        public void arrayListCanBeCreatedTest() {
            assertNotNull(myArrayList1);
        }

        @Test
        public void newArrayListIsEmptyTest() {
            assertTrue(myArrayList1.isEmpty());
        }

        @Test
        public void addElement_ArrayListShouldNotBeEmptyTest() {
            //when
            myArrayList1.add(34);
            //assert
            assertFalse(myArrayList1.isEmpty());
        }

        @Test
        public void addXRemoveX_ArrayListShouldBeEmpty() {
            //when
            myArrayList1.add(34);
            myArrayList1.remove(34);
            //assert
            assertTrue(myArrayList1.isEmpty());

        }

        @Test
        public void addXAndY_removeY_arrayShouldNotBeEmpty() {
            //when
            myArrayList1.add(34);
            myArrayList1.add(99);
            myArrayList1.remove(99);
            assertFalse(myArrayList1.isEmpty());
        }

        @Test
        public void removeFromEmptyArrayList_shouldThrowException() {
            assertThrows(IllegalArgumentException.class, () -> myArrayList1.remove(34));
        }

        @Test
        public void addOneElement_arrayListSizeIsOne() {
            myArrayList1.add(34);
            assertEquals(1, myArrayList1.size());
        }

        @Test
        public void addElement_arrayListSizeIncreases() {
            myArrayList1.add(34);
            myArrayList1.add(34);
            assertEquals(2, myArrayList1.size());
        }

        @Test
        public void insertElementInArrayList() {
            myArrayList1.add(34);
            myArrayList1.add(94, 0);
            assertEquals(94, myArrayList1.get(0));
            assertEquals(34, myArrayList1.get(1));
            assertEquals(2, myArrayList1.size());
        }

        @Test
        public void addThreeElement_getSecondByIndex() {
            myArrayList1.add(34);
            myArrayList1.add(32);
            myArrayList1.add(99);

            assertEquals(32, myArrayList1.get(1));
        }

        @Test
        public void getIndexOfElementTest() {
            myArrayList1.add(34);
            myArrayList1.add(32);
            myArrayList1.add(99);
            assertEquals(1, myArrayList1.getIndexOf(32));
        }

        @Test
        public void arrayListIsElasticTest() {
            assertEquals(3, myArrayList1.getCapacity());
            myArrayList1.add(34);
            myArrayList1.add(32);
            myArrayList1.add(99);
            myArrayList1.add(99);
            myArrayList1.add(45);
            assertEquals(6, myArrayList1.getCapacity());
            assertEquals(5, myArrayList1.size());
            myArrayList1.add(43);
            myArrayList1.add(21);
            assertEquals(12, myArrayList1.getCapacity());
            assertEquals(7, myArrayList1.size());
        }

        @Test
        public void addXYZ_removeY_ZShouldBeInPositionOfY() {
            myArrayList1.add(34);
            myArrayList1.add(32);
            myArrayList1.add(99);

            myArrayList1.remove(32);
            assertEquals(99, myArrayList1.get(1));
            assertEquals(2, myArrayList1.size());
//            assertEquals(0, myArrayList1.get(2));
        }


    }

