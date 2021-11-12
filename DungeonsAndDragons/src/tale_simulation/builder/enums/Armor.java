package tale_simulation.builder.enums;

public enum Armor {
    LEATHER("leather"),
    SCALE_MAIL("scale mail"),
    CHAIN_MAIL("chain mail"),
    SPLINT_MAIL("splint mail"),
    BANDED_MAIL("banded mail"),
    PLATE_MAIL("plate mail");

    private String armorType;

    Armor(String armorType) {
        this.armorType = armorType;
    }

    @Override
    public  String toString() {
        return armorType;
    }
}
