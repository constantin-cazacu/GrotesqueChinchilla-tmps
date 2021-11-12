package tale_simulation.builder.enums;

public enum Weapon {
    CLUB("club"),
    DAGGER("dagger"),
    BATTLE_AXE("battle axe"),
    JAVELIN("javelin"),
    WAR_HAMMER("war hammer"),
    QUARTERSTAFF("quarterstaff"),
    SICKLE("sickle"),
    SPEAR("spear"),
    FLAIL("flail"),
    GLAIVE("glaive"),
    SWORD("sword"),
    GREAT_SWORD("great sword"),
    HALBERD("halberd"),
    LANCE("lance"),
    MAUL("maul"),
    MORNINGSTAR("morningstar"),
    PIKE("pike"),
    RAPIER("rapier"),
    SCIMITAR("scimitar"),
    SHORT_SWORD("short sword"),
    TRIDENT("trident"),
    WHIP("whip"),
    BLOW_DART("blow dart"),
    CROSSBOW("crossbow"),
    LONGBOW("longbow"),
    SLINGSHOT("slingshot");

    private String weaponType;

    Weapon(String weaponType) {
        this.weaponType = weaponType;
    }

    @Override
    public  String toString() {
        return weaponType;
    }
}
