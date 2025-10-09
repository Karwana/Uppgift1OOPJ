package Uppgift1OOPJ;
// subklass
public class KöttätandeVäxt extends Växt {  // arv
    // enum för VätskeTyp && Enhet
    private static final VätskeTyp VÄTSKE_TYP = VätskeTyp.PROTEIN;
    private static final Enhet ENHET = Enhet.LITER;

    private static final double VätskeBasNivå = 0.1;
    private static final double VätskeMängd = 0.2;

    public KöttätandeVäxt(String namn, double höjd) {
        super(namn, höjd);
    }

    @Override   // interface
    public double getVätskemängd() {
        return VätskeBasNivå + (VätskeMängd * getHöjd());
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