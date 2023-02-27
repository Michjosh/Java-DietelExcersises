package ChapterEight;
/**
Provide the following methods: The static method union creates a set that’s the set-theoretic union
of two existing sets (i.e., an element of the new set’s array is set to true if that element
is true in either or both of the existing sets—otherwise, the new set’s element is set to false). The
static method intersection creates a set which is the set-theoretic intersection of two existing sets
(i.e., an element of the new set’s array is set to false if that element is false in either or both of the
existing sets—otherwise, the new set’s element is set to true). Method insertElement inserts a new
integer k into a set (by setting a[k] to true). Method deleteElement deletes integer m (by setting
a[m] to false). Method toString returns a String containing a set as a list of numbers separated
by spaces. Include only those elements that are present in the set. Use --- to represent an empty set.
Method isEqualTo determines whether two sets are equal. Write a program to test class IntegerSet.
Instantiate several IntegerSet objects. Test that all your methods work properly.
*/
    public class IntegerSet {
        boolean[] set;
        // constructor
        public IntegerSet() {
            set = new boolean[101];
        }
        // union method
        public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
            IntegerSet newSet = new IntegerSet();
            for (int i = 0; i < 101; i++) {
                newSet.set[i] = set1.set[i] || set2.set[i];
            }
            return newSet;
        }
        // intersection method
        public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
            IntegerSet newSet = new IntegerSet();
            for (int i = 0; i < 101; i++) {
                newSet.set[i] = set1.set[i] && set2.set[i];
            }
            return newSet;
        }
        // insert method
        public void insertElement(int k) {
            set[k] = true;
        }
        // delete method
        public void deleteElement(int m) {
            set[m] = false;
        }
        // toString method
        public String toString() {
            String result = "";
            boolean empty = true;
            for (int i = 0; i < 101; i++) {
                if (set[i]) {
                    result += i + " ";
                    empty = false;
                }
            }
            if (empty) {
                return "---";
            }
            return result;
        }
        // isEqualTo method
        public boolean isEqualTo(IntegerSet otherSet) {
            for (int i = 0; i < 101; i++) {
                if (set[i] != otherSet.set[i]) {
                    return false;
                }
            }
            return true;
        }
    }

