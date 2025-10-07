package Uppgift1OOPJ;

public class Palm extends Växt {

    private static final VätskeTyp VÄTSKE_TYP = VätskeTyp.VATTEN;
    private static final double VätskeMängd = 0.5;

    Palm() {
    }

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
}
