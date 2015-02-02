public class Algorithmen {
    public static boolean istQuadratzahl(int zahl) {
        int i = 0;
        while (i * i < zahl) i++;
        if (i * i == zahl) return true;
        else return false;
    }

    public static int[] fib(int n) {
        int valA = 0;
        int valB = 1;
        int[] test = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = valA;
            valA = valB;
            valB = temp + valA;
            test[i] = temp;
        }
        return test;
    }

    public static int[] countElements(int[] werte, int max, int numBuckets) {
        int x = (max - numBuckets) / (numBuckets);
        int[] intTeilA = new int[numBuckets];
        int[] intTeilB = new int[numBuckets];
        int[] result = new int[numBuckets];
        int var1 = 0;
        while (var1 < numBuckets) {
            intTeilA[var1] = var1 + x * (var1);
            intTeilB[var1] = var1 + (var1 + 1) * (x);
            var1++;
        }
        for (int var2 = 0; var2 < numBuckets; var2++) {
            for (int var3 = 0; var3 < werte.length; var3++) {
                if ((werte[var3] >= intTeilA[var2] && werte[var3] <= intTeilB[var2])) result[var2]++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("istQuadratzahl(1337): " + istQuadratzahl(1337)); // false

        System.out.print("fib(6): { ");
        int[] fibonacci = fib(6);
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println("}"); // { 0 1 1 2 3 5 }

        System.out.print("countElements({0,9,2,3,4,5,7,8,1}, 10, 2): { ");
        int[] werte = {0, 9, 2, 3, 4, 5, 7, 8, 1};
        int max = 10;
        int numBuckets = 2;
        int[] counted = countElements(werte, max, numBuckets);
        for (int i = 0; i < counted.length; i++) {
            System.out.print(counted[i] + " ");
        }
        System.out.println("}"); // { 5 4 }
    }
}
