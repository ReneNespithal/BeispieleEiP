public class Suche {
    public static boolean sucheLineare(int[] array, int wert) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == wert) {
                return true;
            }
        }
        return false;
    }

    private static boolean hilfsfkt(int wert, int[] array, int start, int end) {
        if (start >= end) {
            return array[start] == wert;
        }
        int mitte = (start + end) / 2;
        return array[mitte] == wert
                || hilfsfkt(wert, array, start, mitte - 1)
                || hilfsfkt(wert, array, mitte + 1, end);
    }

    public static boolean sucheBinaer(int[] array, int wert) {
        if (array.length == 0) {
            return false;
        }
        return hilfsfkt(wert, array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] test1 = {};
        int[] test2 = {1, 2, 3, 4, 5, 6, 7, 10, 11};
        int[] test3 = {1,2,3};
        System.out.println(sucheLineare(test1, 10));
        System.out.println(sucheLineare(test2, 10));
        System.out.println(sucheLineare(test2, 50));
        System.out.println("");
        System.out.println("sucheBinaer");
        System.out.println(sucheBinaer(test1, 10));
        System.out.println(sucheBinaer(test2, 3));
        System.out.println(sucheBinaer(test2, 5));
        System.out.println(sucheBinaer(test2, 50));
        System.out.println(sucheBinaer(test3, 2));
    }
}
