package Uppgift1OOPJ;

import javax.swing.*;
import java.util.ArrayList;

public class Huvudprogram {

    public Huvudprogram() {

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

        if (växtNamn == null) {
            JOptionPane.showMessageDialog(null, "Programmet avslutas");
            return;
        }

        while (växtNamn.isBlank()) { //isBlank istället för isEmpty
            JOptionPane.showMessageDialog(null, "Skriv en växt som finns i hotellet.");
            växtNamn = JOptionPane.showInputDialog("Vilken växt ska få vätska?");

            if (växtNamn == null) {
                JOptionPane.showMessageDialog(null, "Programmet avslutas"); // för "Cancel" igen
                return;
            }
        }

        boolean hittadVäxt = false;
        växtNamn = växtNamn.trim(); // ta bort mellanrum från t.ex. "Laura    "
        for (Växt växt : växtLista) {
            if (växt.getNamn().equalsIgnoreCase(växtNamn)) {
                String meddelande = växt.getInstruktioner();
                JOptionPane.showMessageDialog(null, meddelande);
                hittadVäxt = true;
                break; // avsluta loopen
            }
        }
        if (!hittadVäxt) {
            JOptionPane.showMessageDialog(null, "Varning, växten finns inte i hotellet!");
        }
    }

    public static void main(String[] args) {
        Huvudprogram huvudprogram = new Huvudprogram();
    }
}
