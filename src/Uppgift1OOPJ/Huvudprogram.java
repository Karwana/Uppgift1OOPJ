package Uppgift1OOPJ;

import javax.swing.*;
import java.util.ArrayList;

public class Huvudprogram {

    private static final String OPENING_PROMPT = "Vilken växt ska få vätska?";
    private static final String FEL_VÄXT = "Varning, växten finns inte i hotellet!";
    private static final String CANCEL_PROMPT = "Programmet avslutas";
    private static final String FEL_TOMT = "Skriv en växt som finns i hotellet";

    public Huvudprogram() {
        // polymorfism
        Växt igge = new Kaktus("Igge", 0.2);
        Växt laura = new Palm("Laura", 5);
        Växt meatloaf = new KöttätandeVäxt("Meatloaf", 0.7);
        Växt olof = new Palm("Olof", 1);

        ArrayList<Växt> växtLista = new ArrayList<>();
        växtLista.add(igge);
        växtLista.add(laura);
        växtLista.add(meatloaf);
        växtLista.add(olof);

        String växtInput = JOptionPane.showInputDialog(OPENING_PROMPT);

        if (växtInput == null) {
            JOptionPane.showMessageDialog(null, CANCEL_PROMPT);
            return;
        }

        while (växtInput.isBlank()) { //isBlank istället för isEmpty
            JOptionPane.showMessageDialog(null, FEL_TOMT);
            växtInput = JOptionPane.showInputDialog(OPENING_PROMPT);

            if (växtInput == null) {
                JOptionPane.showMessageDialog(null, CANCEL_PROMPT); // för "Cancel" igen, NullPointerException
                return;
            }
        }

        boolean hittadVäxt = false;
        växtInput = växtInput.trim(); // ta bort mellanrum från input så "Laura   " funkar
        for (Växt växt : växtLista) {
            if (växt.getNamn().equalsIgnoreCase(växtInput)) {
                String VäxtInformation = växt.getInstruktioner();    // polymorfism
                JOptionPane.showMessageDialog(null, VäxtInformation);
                hittadVäxt = true;
                break; // avsluta loopen
            }
        }
        if (!hittadVäxt) {
            JOptionPane.showMessageDialog(null, FEL_VÄXT);
        }
    }

    public static void main(String[] args) {
        Huvudprogram huvudprogram = new Huvudprogram();
    }
}
