import java.util.Arrays;
public class InterLeave {
    public static int[] interleave(int[] arrEins, int[] arrZwei) {
        if (arrEins.length != arrZwei.length) {
            return null;
        }
        int[] result = new int[arrEins.length + arrZwei.length];
        int countA = 0, countB = 0;
        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0) {
                result[i] = arrEins[countA++];
            } else {
                result[i] = arrZwei[countB++];
            }
        }
        return result;
    }

    public static int[] interleave2(int[] arrEins, int[] arrZwei) {
        int[] result = new int[arrEins.length + arrZwei.length];
        if (arrEins.length == arrZwei.length) {
            for (int i = 0; i < arrEins.length; i++) {
                result[2 * i] = arrEins[i];
                result[(2 * i) + 1] = arrZwei[i];
            }
        } else {
            return null;
        }
        return result;
    }

    public static void main(String[] args){
        int[] test4 = {0, 1, 2, 1, 0};
        int[] test5 = {0, 1, 2};
        int[] test6 = {3, 4, 5};
        System.out.println(Arrays.toString(interleave(test5, test6)));
        System.out.println(Arrays.toString(interleave(test4, test6)));
        System.out.println(Arrays.toString(interleave2(test5, test6)));
        System.out.println(Arrays.toString(interleave2(test4, test6)));
    }
}
