public class Punkt {
    private double xKoordinate; private double yKoordinate;
    public Punkt(double x, double y) { this.xKoordinate = x; this.yKoordinate = y;
    }
    public void verschiebeX(double betrag) { this.xKoordinate += betrag;
    }
    public void verschiebeY(double betrag) { this.yKoordinate += betrag;
    }
    public double getX() { return this.xKoordinate;
    }
    public double getY() { return this.yKoordinate;
    } }