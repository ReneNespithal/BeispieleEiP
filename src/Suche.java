public class Suche {
    public static boolean sucheLineare(int[] array, int wert) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == wert) {
                return true;
            }
        }
        return false;
    }

    public static boolean sucheBinaer(int[] array, int wert) {
        // Leeres Array
        if (array.length <= 1) {
            return false;

        }
        int mitte = array.length/2;
        // Falls Mitte gleich Wert return true
        if (array[mitte] == wert) {
            return true;
        }
        // Falls Mitte größer als der Wert ist
        if (array[mitte] > wert) {
            int[] test = new int[mitte];
            for (int i = 0; i < mitte; i++) {
                test[i] = array[i];
            }
            sucheBinaer(test, wert);
        }
        // Falls Mitte kleiner als der Wert
        if (array[mitte] < wert) {
            int[] test2 = new int[array.length - mitte];
            for (int i = 0; i < array.length - mitte; i++) {
                test2[i] = array[mitte+i];
            }
            sucheBinaer(test2, wert);
        }
        return false;
    }

    /*
    private static boolean hilfsfkt(int a, int[] array, int start, int end) {
        if (start >= end) {
            return array[start] == a;
        }
        int mitte = (start + end) / 2;
        return array[mitte] == a
                || hilfsfkt(a, array, start, mitte - 1)
                || hilfsfkt(a, array, mitte + 1, end);
    }

    public static boolean sucheBinaer(int[] array, int a) {
        if (array.length == 0) {
            return false;
        }
        return hilfsfkt(a, array, 0, array.length - 1);
    }
     */

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
