package tale_simulation.prototype;

public class Vampire extends Undead {

    public Vampire() {}

    @Override
    public Undead clone() throws CloneNotSupportedException {
        return new Vampire();
    }

    @Override
    public String toString() {
        return "The moon shines bright,\n" +
                "The vampire alights\n" +
                "Swish, swish goes his cloak...\n" +
                "Maiden, are you not afeared?";
    }
}
