package Chapterfour;

public class DistanceBetween {


    public static boolean isPerpendicular (int x1, int x2, int y1, int y2) {
        if ((x1 == x2 || y1 == y2) && !(x1 == x2 && y1 == y2)) return true;
        return false;
    }
}


