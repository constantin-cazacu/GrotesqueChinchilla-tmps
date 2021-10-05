package tale_simulation.builder;

public enum HeroAlignment {
    LAWFUL_GOOD("lawful good"),
    NEUTRAL_GOOD("neutral good"),
    CHAOTIC_GOOD("chaotic good"),
    LAWFUL_NEUTRAL("lawful neutral"),
    TRUE_NEUTRAL("true neutral"),
    CHAOTIC_NEUTRAL("chaotic neutral"),
    LAWFUL_EVIL("lawful evil"),
    NEUTRAL_EVIL("neutral evil"),
    CHAOTIC_EVIL("chaotic evil");

    private String alignmentType;

    HeroAlignment(String alignmentType) {
        this.alignmentType = alignmentType;
    }

    @Override
    public  String toString() {
        return alignmentType;
    }
}
