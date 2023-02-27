package ChapterEight;

import java.util.Arrays;
/**
(Set of Integers) Create class IntegerSet. Each IntegerSet object can hold integers in the
range 0–100. The set is represented by an array of booleans. Array element a[i] is true if integer i
is in the set. Array element a[j] is false if integer j is not in the set. The no-argument constructor
initializes the array to the “empty set” (i.e., all false values).
*/

public class SetIntegers {

    boolean [] integerSet = new boolean[101];

    public SetIntegers(){
        Arrays.fill(integerSet, false);
    }
    public void addElement(int i) {
        if (i >= 0 && i <= 100) {
            integerSet[i] = true;
        }
    }

    public void deleteElement(int i) {
        if (i >= 0 && i <= 100) {
            integerSet[i] = false;
        }
    }

    public boolean isInSet(int i) {
        if (i >= 0 && i <= 100) {
            return integerSet[i];
        }

        return false;
    }
}
