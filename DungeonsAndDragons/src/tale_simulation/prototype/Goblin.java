package tale_simulation.prototype;

import tale_simulation.prototype.abstractions.Humanoid;

public class Goblin extends Humanoid {

    public Goblin() {}

    @Override
    public Humanoid clone() throws CloneNotSupportedException {
        return new Goblin();
    }

    @Override
    public String toString() {
        return "The iconic Goblin! Nasty, brutish, and short, but sneaky.";
    }
}
