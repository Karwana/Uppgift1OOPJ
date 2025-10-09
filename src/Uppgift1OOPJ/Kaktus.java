package Uppgift1OOPJ;
// subklass
public class Kaktus extends Växt {  // arv
    // enum för VätskeTyp && Enhet
    private static final VätskeTyp VÄTSKE_TYP = VätskeTyp.MINERALVATTEN;
    private static final Enhet ENHET = Enhet.CL;
    private static final double VätskeMängd = 2;  //kaktus 2 cl = 0.02 liter

    public Kaktus(String namn, double höjd) {
        super(namn, höjd);
    }

    @Override   // interface
    public double getVätskemängd() {
        return VätskeMängd;
    }

    @Override   // enum
    public VätskeTyp getVätskeTyp() {
        return VÄTSKE_TYP;
    }

    @Override   // enum
    public String getEnhet() {
        return ENHET.name();
    }
}

