package Uppgift1OOPJ;
// subklass
public class Palm extends Växt {    // arv
    // enum för VätskeTyp && Enhet
    private static final VätskeTyp VÄTSKE_TYP = VätskeTyp.VATTEN;
    private static final Enhet ENHET = Enhet.LITER;
    private static final double VätskeMängd = 0.5;

    public Palm(String namn, double höjd) {
        super(namn, höjd);
    }

    @Override   //interface
    public double getVätskemängd() {
        return VätskeMängd * getHöjd();
    }

    @Override   //enum
    public VätskeTyp getVätskeTyp() {
        return VÄTSKE_TYP;
    }

    @Override   //enum
    public String getEnhet() {
        return ENHET.name();
    }
}
