package testing;

public class Fakultaet {
    public static int fak(int i){
        if(i==0){
            return 1;
        } else if(i ==1){
            return 1;
        }
        return i*fak(i-1);
    }

    public static void main(String[] args){
        System.out.println(fak(2));
        System.out.println(fak(3));
        System.out.println(fak(4));
    }
}
