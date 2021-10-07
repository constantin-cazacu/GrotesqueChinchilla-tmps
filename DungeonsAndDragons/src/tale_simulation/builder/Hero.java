package tale_simulation.builder;

public final class Hero {

    private final String name;
    private final HeroClass heroClass;
    private final Race race;
    private final HeroAlignment alignment;
    private final Armor armor;
    private final Weapon weapon;

    private Hero(Builder builder) {
        this.name = builder.name;
        this.heroClass = builder.heroClass;
        this.race = builder.race;
        this.alignment = builder.alignment;
        this.armor = builder.armor;
        this.weapon = builder.weapon;

    }

    public String getName() {
        return name;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }

    public Race getRace() {
        return race;
    }

    public HeroAlignment getAlignment() {
        return alignment;
    }

    public Armor getArmor() { return armor; }

    public Weapon getWeapon() {
        return weapon;
    }

    @Override
    public String toString() {

        StringBuilder stringBuild = new StringBuilder();
        stringBuild.append("This is a ")
                .append(alignment)
                .append(race)
                .append(" called ")
                .append(name);
        if (armor != null) {
            stringBuild.append(" wearing ").append(armor);
        }
        if (weapon != null) {
            stringBuild.append(" and wielding a ").append(weapon);
        }
        stringBuild.append('.');
        return stringBuild.toString();
    }

//    Builder class

    public static class Builder {

        private final String name;
        private final HeroClass heroClass;
        private  Race race;
        private  HeroAlignment alignment;
        private  Armor armor;
        private  Weapon weapon;

        public Builder(String name, HeroClass heroClass) {
            if (name == null || heroClass == null) {
                throw new IllegalArgumentException("class and name cannot be null");
            }
            this.name = name;
            this.heroClass = heroClass;
        }

        public Builder heroRace(Race race) {
            this.race = race;
            return this;
        }

        public Builder heroAlignment(HeroAlignment alignment) {
            this.alignment = alignment;
            return this;
        }

        public Builder heroArmor(Armor armor) {
            this.armor = armor;
            return this;
        }

        public Builder heroWeapon(Weapon weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }
}
