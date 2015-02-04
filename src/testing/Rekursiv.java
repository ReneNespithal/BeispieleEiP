package testing;

public class Rekursiv {
    private static boolean hlfsfkt(int i, int zahl) {
        while (i * i < zahl) {
            hlfsfkt(++i, zahl);
        }
        if (i * i == zahl) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isQuadrat(int zahl) {
        if (zahl == 0) {
            return false;
        } else {
            return hlfsfkt(0, zahl);
        }
    }

    public static void main(String[] args) {
        System.out.println(isQuadrat(0));
        System.out.println(isQuadrat(1));
        System.out.println(isQuadrat(3));
        System.out.println(isQuadrat(4));
        System.out.println(isQuadrat(25));

    }
}
