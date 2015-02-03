public class Raute {
    private double x, y;
    private Punkt origin;

    public Raute(Punkt origin, double x, double y) {
        /*
        Falls
            public class Raute extends Punkt {
        Dann
            public Raute(Punkt origin, double x, double y) {
                super(x, y);
                ...
            }
         */
        this.origin = origin;
        this.x = x;
        this.y = y;
    }

    public void verschiebeX(double betrag) {
        origin.verschiebeX(betrag);
    }

    public void verschiebeY(double betrag) {
        origin.verschiebeY(betrag);
    }

    public Punkt getP1() {
        return new Punkt(origin.getX() - (this.x/2), origin.getY());
    }


    public Punkt getP2() {
        return new Punkt(origin.getX(), origin.getY() + (this.y/2));
    }


    public Punkt getP3() {
        return new Punkt(origin.getX() + (this.x/2), origin.getY());
    }


    public Punkt getP4() {
        return new Punkt(origin.getX(), origin.getY() - (this.y/2));
    }


    public static void main(String[] args) {
        Punkt test = new Punkt(0.0, 0.0);
        Raute test2 = new Raute(test, 2.0, 4.0);
        System.out.println(test2.getP1().getX() + " " + test2.getP1().getY());
        System.out.println(test2.getP2().getX() + " " + test2.getP2().getY());
        System.out.println(test2.getP3().getX() + " " + test2.getP3().getY());
        System.out.println(test2.getP4().getX() + " " + test2.getP4().getY());
        test2.verschiebeY(20.0);
        System.out.println("");
        System.out.println(test2.getP1().getX() + " " + test2.getP1().getY());
        System.out.println(test2.getP2().getX() + " " + test2.getP2().getY());
        System.out.println(test2.getP3().getX() + " " + test2.getP3().getY());
        System.out.println(test2.getP4().getX() + " " + test2.getP4().getY());
        test2.verschiebeX(10.0);
        System.out.println("");
        System.out.println(test2.getP1().getX() + " " + test2.getP1().getY());
        System.out.println(test2.getP2().getX() + " " + test2.getP2().getY());
        System.out.println(test2.getP3().getX() + " " + test2.getP3().getY());
        System.out.println(test2.getP4().getX() + " " + test2.getP4().getY());
    }
}