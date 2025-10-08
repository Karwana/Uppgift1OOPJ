package Uppgift1OOPJ;
// arv
public class Palm extends Växt {
    // enum för VätskeTyp && Enhet
    private static final VätskeTyp VÄTSKE_TYP = VätskeTyp.VATTEN;
    private static final Enhet ENHET = Enhet.LITER;
    private static final double VätskeMängd = 0.5;

    public Palm(String namn, double höjd) {
        super(namn, höjd);
    }

    @Override
    public double getVätskemängd() {
        return VätskeMängd * getHöjd();
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
