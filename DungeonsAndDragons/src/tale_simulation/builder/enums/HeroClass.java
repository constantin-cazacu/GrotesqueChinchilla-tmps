package tale_simulation.builder.enums;

public enum HeroClass {
    BARBARIAN("barbarian"),
    BARD("bard"),
    CLERIC("barbarian"),
    DRUID("cleric"),
    FIGHTER("fighter"),
    MONK("monk"),
    PALADIN("paladin"),
    RANGER("ranger"),
    ROGUE("rogue"),
    SORCERER("sorcerer"),
    WARLOCK("warlock"),
    WIZARD("wizard");

    private String classType;

    HeroClass(String classType) {
        this.classType = classType;
    }

    @Override
    public  String toString() {
        return classType;
    }
}
