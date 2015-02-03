/**
 * Created by ellw on 03.02.15.
 */
public class TestingEnvironment {
    public static boolean istQuadratzahl(int zahl) {
        if (zahl == 0) {
            return false;
        }
        int i = 0;
        while (i * i < zahl) {
            i++;
        }
        if (i * i == zahl) {
            return true;
        } else {
            return false;
        }
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


    public static void main(String[] args) {
        System.out.println(istQuadratzahl(0));
        System.out.println(istQuadratzahl(1));
        System.out.println(istQuadratzahl(4));
        System.out.println(istQuadratzahl(3));

        System.out.print("fib(6): { ");
        int[] fibonacci = fib(6);
        for (int i = 0; i < fibonacci.length; i++) {
            System.out.print(fibonacci[i] + " ");
        }
        System.out.println("}"); // { 0 1 1 2 3 5 }
    }
}
