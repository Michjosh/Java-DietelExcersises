package ChapterEight;

public class IntegerSetTest {
    public static void main(String[] args) {
        var set1 = new IntegerSet();
        set1.insertElement(5);
        set1.insertElement(4);
        set1.insertElement(3);

        IntegerSet set2 = new IntegerSet();
        set2.insertElement(8);
        set2.insertElement(7);
        set2.insertElement(6);

        IntegerSet unionSet = IntegerSet.union(set1, set2);
        System.out.println("Union set: " + unionSet.toString());

        IntegerSet intersectionSet = IntegerSet.intersection(set1, set2);
        System.out.println("Intersection set: " + intersectionSet.toString());

        set1.deleteElement(2);
        System.out.println("Set 1 after deletion: " + set1.toString());

        boolean equal = set1.isEqualTo(set2);
        System.out.println("Set 1 and Set 2 are equal: " + equal);
    }
}
