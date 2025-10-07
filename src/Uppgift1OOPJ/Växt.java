package Uppgift1OOPJ;

public abstract class Växt implements VätskaBeräkning {

    private String namn;
    private double höjd;

    Växt() {
    }

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

}
