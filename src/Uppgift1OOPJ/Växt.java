package Uppgift1OOPJ;

public abstract class Växt implements VätskaBeräkning {
    // inkapsling
    private String namn;
    private double höjd;

    Växt(String namn, double höjd) {
        this.namn = namn;
        this.höjd = höjd;

    }

    public String getNamn() {
        return namn;
    }

    public double getHöjd() {
        return höjd;
    }
    // polymorfism
    public String getInstruktioner() {
        return getNamn() + " behöver " +
                getVätskemängd() + " " + getEnhet() + " " +
                getVätskeTyp() + "/dag";
    }
}
