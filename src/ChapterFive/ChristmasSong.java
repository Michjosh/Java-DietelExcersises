package ChapterFive;

import java.util.Scanner;

public class ChristmasSong {
        public static void main(String[] args) {
            Scanner entry = new Scanner(System.in);
            for (int song = 0; song != -1; ) {
                System.out.println("\nEnter any number from '1 to 12' to listen to a Christmas song 'Enter -1 to exit'.");
                song = entry.nextInt();

                switch (song) {
                    case 1 -> System.out.println("On the first day of Christmas, my love sent to me " +
                            "\nA partridge in a peer tree.");
                    case 2 -> System.out.println("""
                        On the second day of Christmas, my true love sent to me
                        Two turtle doves, and
                        A partridge in a peer tree.""");
                    case 3 -> System.out.println("""
                        On the third day of Christmas, my love sent to me
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree.""");
                    case 4 -> System.out.println("""
                        On the fourth day of Christmas, my love sent to me,
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree.""");
                    case 5 -> System.out.println("""
                        On the fifth day of Christmas, my love sent to me,
                        Five Golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree.""");
                    case 6 -> System.out.println("""
                        On the Sixth day of Christmas, my love sent to me,
                        Six geese a-laying
                        Five Golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree.""");
                    case 7 -> System.out.println("""
                        On the Seventh day of Christmas, my love sent to me,
                        Seven swans a-swimming
                        Six geese a-laying
                        Five Golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree.""");
                    case 8 -> System.out.println("""
                        On the Eight day of Christmas, my love sent to me,
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five Golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree.""");
                    case 9 -> System.out.println("""
                        On the Ninth day of Christmas, my love sent to me,
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five Golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree.""");
                    case 10 -> System.out.println("""
                        On the Tenth day of Christmas, my love sent to me,
                        Ten lords a-leaping
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five Golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree.""");
                    case 11 -> System.out.println("""
                        On the Eleventh day of Christmas, my love sent to me,
                        Eleven pipers piping
                        Ten lords a-leaping
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five Golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree.""");
                    case 12 -> System.out.println("""
                        On the Twelfth day of Christmas, my love sent to me,
                        Twelve drummers drumming
                        Eleven pipers piping
                        Ten lords a-leaping
                        Nine ladies dancing
                        Eight maids a-milking
                        Seven swans a-swimming
                        Six geese a-laying
                        Five Golden rings
                        Four calling birds
                        Three french hens
                        Two turtle doves, and
                        A partridge in a pear tree.""");
                }
            }
            System.out.println("Thank you for listening to my song");
        }
    }

