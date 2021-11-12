package tale_simulation.builder.enums;

public enum Race {
    DRAGONBORN("dragonborn"),
    DWARF("dwarf"),
    ELF("elf"),
    GNOME("gnome"),
    HALF_ELF("half-elf"),
    HALFLING("halfling"),
    HALF_ORC("half-orc"),
    HUMAN("human"),
    TIEFLING("tiefling");

    private String raceType;

    Race(String raceType) {
        this.raceType = raceType;
    }

    @Override
    public  String toString() {
        return raceType;
    }
}
