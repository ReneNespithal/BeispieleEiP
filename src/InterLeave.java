import java.util.Arrays;
public class InterLeave {
    public static int[] interleave(int[] werte1, int[] werte2) {
        int[] array = new int[werte1.length+werte2.length];
        if (werte1.length != werte2.length) {
            return null;
        } else {
            int count1 = 0;
            int count2 = 0;
            for (int i = 0; i < array.length; i++){
                if (i%2 == 0){
                    array[i] = werte1[count1];
                    count1++;
                } else {
                    array[i] = werte2[count2];
                    count2++;
                }
            }
            return array;
        }
    }
    public static void main(String[] args){
        int[] werte1 = {1,2,3,4};
        int[] werte2 = {5,6,7,8};
        int[] werteTest = {0};
        System.out.println(Arrays.toString(interleave(werte1, werte2)));
        System.out.println(Arrays.toString(interleave(werte1, werteTest)));
    }
}
