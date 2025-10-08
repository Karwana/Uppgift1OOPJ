package Uppgift1OOPJ;

import org.w3c.dom.ls.LSOutput;

public enum VätskeTyp {
    PROTEIN("proteindryck"),
    VATTEN("kranvatten"),
    MINERALVATTEN("mineralvatten");

    private final String vätskeTypNamn;

    VätskeTyp(String vätskeTypNamn) {
        this.vätskeTypNamn = vätskeTypNamn;
    }
    @Override
    public String toString() {
        return vätskeTypNamn;
    }
}