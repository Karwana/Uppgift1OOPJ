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
                JOptionPane.showMessageDialog(null,
                        växt.getNamn() + " behöver " +
                                växt.getVätskemängd() + " liter " +
                                växt.getVätskeTyp() + "/dag");
                break;
            }
        }
    }
}
