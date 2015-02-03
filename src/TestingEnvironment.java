import java.util.Arrays;

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

    public static void invertieren(int[] array) {
        System.out.println(Arrays.toString(array));
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[(array.length - 1) - i];
        }
        System.out.println(Arrays.toString(newArray));
    }

    public static boolean isPalindrom(int[] array) {
        boolean result = false;
        for(int i = 0; i < array.length/2; i++){
            if(array[i]==array[(array.length-1)-i]){
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    public static int[] interleave(int[] arrEins, int[] arrZwei){
        if(arrEins.length!=arrZwei.length){
            return null;
        }
        int[] result = new int[arrEins.length+arrZwei.length];
        int countA = 0, countB = 0;
        for(int i = 0; i < result.length; i++){
            if(i%2 == 0){
                result[i]=arrEins[countA++];
            } else {
                result[i]=arrZwei[countB++];
            }
        }
        return result;
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
        int[] test3 = {0, 1, 2};
        invertieren(test3);
        int[] test4 = {0, 1, 2, 1, 0};
        System.out.println(isPalindrom(test3));
        System.out.println(isPalindrom(test4));

        int[] test5 = {0,1,2};
        int[] test6 = {3,4,5};
        System.out.println(Arrays.toString(interleave(test5,test6)));
        System.out.println(Arrays.toString(interleave(test4,test6)));
    }
}
