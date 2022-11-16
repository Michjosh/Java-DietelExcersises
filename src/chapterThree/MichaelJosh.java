package chapterThree;

import java.util.Scanner;

public class MichaelJosh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Michael myIdentity = new Michael();

        System.out.printf("first name: %s%n%n", myIdentity.getName());

        System.out.println("Whats your name");
        String name = input.nextLine();
        myIdentity.setName(name);
        System.out.println();

        System.out.printf("Your name is %n%s%n", myIdentity.getName());




    }
}
