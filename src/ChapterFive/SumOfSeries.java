package ChapterFive;

/*The Sum of a Series; Find the summation of the sequence of numbers 1, 2, 3 … n, where
n ranges from 1 to 100. Use type long. Display the results in a tabular format that shows n and the
corresponding sum. If this were a product instead of a sum, what difficulty might you encounter
with the variable that accumulates the product?*/

public class SumOfSeries {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        for ( n = 1; n <= 100; n++) {
            sum += n;
            System.out.println(n +"   +  "+ n +" = " + sum);
        }
    }
}
