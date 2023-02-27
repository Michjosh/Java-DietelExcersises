//package ChapterFive;
//
//import java.util.Scanner;
//
//public class MP3Server {
//
//    public String name;
//    public String model;
//    public int year;
//    public int color;
//    public int batteryLife;
//    public int memorySize;
//    public String OperatingSystem;
//    public static boolean repeat;
//
//
//    public static String MediaPlayer() {
//        String MediaPlayer = ("""
//                Media Player;
//                1: Playlist
//                2: Pause
//                3: Play
//                4: Stop
//                5: Shuffle
//                6: Repeat
//                7: Power off
//                """);
//        Scanner entry = new Scanner(System.in);
//        int media = entry.nextInt();
//        switch (media) {
//            case 1 -> playList();
//            case 2 -> pause();
//            case 3 -> play();
//            case 4 -> stopSong();
//            case 5 -> shuffle();
//            case 6 -> repeatSong();
//            case 7 -> powerOff();
//            default -> System.out.println("Enter a valid key");
//        }
//    }
//
//
//    private static void powerOff() {
//        System.out.println("""
//                Power Off
//                Hope you enjoyed the songs""");
//        System.exit(1);
//    }
//
//    public static void repeatSong() {
//        System.out.println("Song is on repeat");
//        playList();
//    }
//
//    public static void shuffle() {
//        System.out.println("Songs shuffled");
//        playList();
//    }
//
//    public static void stopSong() {
//        System.out.println("""
//                Song Stopped
//                1: Play
//                2 Media player""");
//        Scanner entry = new Scanner(System.in);
//        int stop = entry.nextInt();
//        switch (stop) {
//            case 1 -> play();
//            case 2 -> playList();
//            default ->
//                    System.out.println("Enter the right key");
//        }
//    }
//
//    public static void play() {
//        System.out.println("""
//                Song Playing
//                1: Pause
//                2: Playlist
//                3: Media player""");
//        Scanner entry = new Scanner(System.in);
//        int play = entry.nextInt();
//        switch (play) {
//            case 1 -> pause();
//            case 2 -> playList();
//            case 3 -> MediaPlayer();
//            default -> System.out.println("Enter a valid key");
//        }
//
//    }
//
//    public static String pause() {
//        String pause =("""
//                Song Paused
//                1: Play
//                2: Media Player""");
//        Scanner entry = new Scanner(System.in);
//        int pausee = entry.nextInt();
//        switch (pausee) {
//            case 1 -> play();
//            case 2 -> MediaPlayer();
//            default -> System.out.println("Enter a valid key");
//        }
//        return pause();
//    }
//
//    public static void playList() {
//        System.out.println("""
//                Playlist
//                1: Rush
//                2: Jireh
//                3: Goodness
//                4: Media player
//                """);
//        Scanner entry = new Scanner(System.in);
//        int playlist = entry.nextInt();
//        switch (playlist) {
//            case 1:
//                System.out.println("""
//                        Rush by Ayra Star
//                        Now playing
//                        1: Pause
//                        2: Playlist""");
//                Scanner in = new Scanner(System.in);
//                int song = in.nextInt();
//                switch (song) {
//                    case 1 -> pause();
//                    case 2 -> playList();
//                    default -> System.out.println("Enter a valid key");
//                }
//            case 2:
//                System.out.println("""
//                        Jireh by Maverick City
//                        Now Playing
//                        1: Pause
//                        2: Playlist""");
//                Scanner inp = new Scanner(System.in);
//                int jireh = inp.nextInt();
//                switch (jireh) {
//                    case 1 -> pause();
//                    case 2 -> playList();
//                    default -> System.out.println("Enter a valid key");
//                }
//            case 3:
//                System.out.println("""
//                        Goodness by Michael Joshua
//                        Now Playing
//                        1: Pause
//                        2: Playlist""");
//                Scanner input = new Scanner(System.in);
//                int goodness = input.nextInt();
//                switch (goodness) {
//                    case 1 -> pause();
//                    case 2 -> playList();
//                    default -> System.out.println("Enter a valid key");
//                }
//            case 4:
//                MediaPlayer();
//                break;
//            default:
//                System.out.println("Enter a valid key");
//        }
//
//    }
//}
