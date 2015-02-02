public class Mittelwert {
    public static double mittelwert(double[] array) {
        double sum = 0.0;
        //for(int i = 0; i<array.length; i++){
        for(double n : array){
            sum += n;
        }
        return sum/array.length;
    }

    public static void main(String[] args) {
        double[] testArray = {1.0,2.0,3.0,4.0,5.0,6.0};
        System.out.print(mittelwert(testArray));
    }
}
