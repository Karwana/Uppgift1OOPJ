package Uppgift1OOPJ;

public class Kaktus extends Växt {

    private static final VätskeTyp VÄTSKE_TYP = VätskeTyp.MINERALVATTEN;
    private static final double VätskeMängd = 0.02;

    public Kaktus(String namn, double höjd) {
        super(namn, höjd);
    }

    @Override
    public double getVätskemängd() {
        return VätskeMängd * 100;
    }

    @Override
    public VätskeTyp getVätskeTyp() {
        return VÄTSKE_TYP;
    }
}

