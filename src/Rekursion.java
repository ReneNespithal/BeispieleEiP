public class Rekursion {

    public static double exp(double x, int y) {
        if(y==0)
            return 0;
        else if(y==1)
            return y;
        else
            return x*exp(x,y-1);
    }

    public static int fakultaet(int x) {
        if(x==0)
            return 1;
        else
            return x*fakultaet(x-1);
    }

    public static int t = 2;
    public static boolean istPrim(int x) {
        if(x==0||x==1)
            return false;
        else if(x==2)
            return true;
        if(x%t==0)
            return false;
        else if(t>x/t)
            return true;
        else
            t++;
        return istPrim(x);
    }

    // Implementieren Sie hier die Methode ggt(m,n)
    public static int ggt(int x, int y) {
        if(x==y)
            return(x);
        else
        if(x>y)
            return(ggt(x - y, y));
        else
            return(ggt(y - x, x));
    }

    static String txt;
    public static String rebase(int x, int y) {
        txt = "";
        if(y<=2){
            if(x<2){
                txt = ""+x;
                return txt;}
            else{
                if(x!=0){
                    rebase(x/2,y);}}
            txt += ""+x%2;
            return txt;}
        else if(y<=8){
            int k;
            if(x!=0){
                k = x%8;
                rebase(x/8,y);
                txt += ""+k;}
            return txt;}
        else{
            String txttwo = "";
            int r = x % 16;
            if (x == 0) {
                return "";}
            else{
                switch (r) {
                    case 10: txttwo = "A"; break;
                    case 11: txttwo = "B"; break;
                    case 12: txttwo = "C"; break;
                    case 13: txttwo = "D"; break;
                    case 14: txttwo = "E"; break;
                    case 15: txttwo = "F"; break;
                    default: txttwo = r+txttwo; break;}
                return rebase((x/16),y)+txttwo;}}}

    public static void main(String[] args) {
        double exp = exp(4.2, 3);
        System.out.println(exp);
        int fak = fakultaet(4);
        System.out.println(fak);
        boolean prim = istPrim(893);
        System.out.println(prim);
        int ggttest = ggt(42,154);
        System.out.println(ggttest);
        String rebasetest = rebase(10,2);
        System.out.println(rebasetest);
        String rebasetest2 = rebase(237,16);
        System.out.println(rebasetest2);
    }
}
