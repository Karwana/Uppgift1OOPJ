package Uppgift1OOPJ;

public class KöttätandeVäxt extends Växt {

    private static final VätskeTyp VÄTSKE_TYP = VätskeTyp.PROTEIN;
    private static final double VätskeBasNivå = 0.1;
    private static final double VätskeMängd = 0.2;


    KöttätandeVäxt() {
    }

    public KöttätandeVäxt(String namn, double höjd) {
        super(namn, höjd);
    }

    @Override
    public double getVätskemängd() {
        return VätskeBasNivå + (VätskeMängd * getHöjd());
    }

    @Override
    public VätskeTyp getVätskeTyp() {
        return VÄTSKE_TYP;
    }
}