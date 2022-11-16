public class Sent {

    public static void main(String[] args)
    {
        int smallest = 0; int largest = 0; int integer;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        System.out.println("Enter -99 when finished.");
        System.out.println();

        int n = input.nextInt();
        integer = input.nextInt();
        smallest = integer;

        while (integer != -99)
        {
            for(int i = 2; i < n; i++)
            {
                integer = input.nextInt();
                if(integer > largest)
                {
                    largest = integer;
                }
                if(integer < smallest)
                {
                    smallest = integer;
                }
            }
        }
        System.out.println("The largest number is:" + largest);
        System.out.println("The smallest number is : "  + smallest);
    }
}
}
