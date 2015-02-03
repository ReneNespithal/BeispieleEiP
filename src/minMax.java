import java.util.Arrays;
public class minMax {
    public static int[] minMax(int[] array){
        if(array.length == 0){
            return null;
        }
        int[] result = new int[]{array[0],array[0]};
        //result[0] = array[0];
        //result[1] = array[0];
        for(int i = 1; i < array.length; i++){
            if(result[0]>=array[i]){
                result[0] = array[i];
            } else {
                result[1] = array[i];
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] test1 = {};
        int[] test2 = {1,2,4,8,-1};
        int[] test3 = {1,0};
        System.out.println(Arrays.toString(minMax(test1)));
        System.out.println(Arrays.toString(minMax(test2)));
        System.out.println(Arrays.toString(minMax(test3)));
    }


}
