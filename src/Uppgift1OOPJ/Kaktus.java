package Uppgift1OOPJ;

public class Kaktus extends Växt {

    private static final VätskeTyp VÄTSKE_TYP = VätskeTyp.MINERALVATTEN;
    private static final Enhet ENHET = Enhet.CL;
    private static final double VätskeMängd = 2;  //kaktus 2 cl = 0.02 liter

    public Kaktus(String namn, double höjd) {
        super(namn, höjd);
    }

    @Override
    public double getVätskemängd() {
        return VätskeMängd;
    }

    @Override
    public VätskeTyp getVätskeTyp() {
        return VÄTSKE_TYP;
    }

    @Override
    public String getEnhet() {
        return ENHET.name();
    }
}

