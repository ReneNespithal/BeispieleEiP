/**
 * Created by ellw on 02.02.15.
 */
public class FindeSubarray {
    public static boolean findeSubarray(int[] werte, int[] subarray) {
        boolean test = false;
        int var = 0;
        for (int i = 0; i < werte.length && var < subarray.length; i++) {
            if (werte[i] == subarray[var] && (werte.length - i) >= (subarray.length - var)) {
                test = true;
                var++;
            } else {
                test = false;
                var = 0;
            }

        }
        return test;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 4, 5, 6, 7, 10, 6, 7, 8, 9, 10, 100};
        int[] test2 = {6, 7, 8};
        int[] test3 = {10, 100, 2};
        System.out.println(findeSubarray(test1, test2));
        System.out.println(findeSubarray(test1, test3));
    }
}
