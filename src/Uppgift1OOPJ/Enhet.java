package Uppgift1OOPJ;

public enum Enhet {
    LITER("liter"),
    CL("cl");

    private final String namn;

    Enhet(String namn) {
        this.namn = namn;
    }

    @Override
    public String toString() {
        return namn;
    }
}
