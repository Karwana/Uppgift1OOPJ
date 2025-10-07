package Uppgift1OOPJ;

import javax.swing.*;
import java.util.ArrayList;

public class Huvudprogram {
    public static void main(String[] args) {

        Växt igge = new Kaktus("Igge", 0.2);
        Växt laura = new Palm("Laura", 5);
        Växt meatloaf = new KöttätandeVäxt("Meatloaf", 0.7);
        Växt olof = new Palm("Olof", 1);

        ArrayList<Växt> växtLista = new ArrayList<>();
        växtLista.add(igge);
        växtLista.add(laura);
        växtLista.add(meatloaf);
        växtLista.add(olof);

        String växtNamn = JOptionPane.showInputDialog("Vilken växt ska få vätska?");

        for (Växt växt : växtLista) {
            if (växt.getNamn().equalsIgnoreCase(växtNamn)) {
                double vätskeMängd = växt.getVätskemängd();
                String enhet = "liter";

                // Kaktus visas i cl
                if (växt.getVätskeTyp() == VätskeTyp.MINERALVATTEN) {
                    vätskeMängd = vätskeMängd * 100;
                    enhet = "cl";
                }

                String meddelande = växt.getNamn() + " behöver " +
                        vätskeMängd + " " + enhet + " " +
                        växt.getVätskeTyp() + "/dag";

                JOptionPane.showMessageDialog(null, meddelande);
                break; // avsluta loopen
            }
        }
    }
}
