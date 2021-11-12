package tale_simulation.prototype;

import tale_simulation.prototype.abstractions.Aberration;

public class Beholder extends Aberration {

    public Beholder() {}

    @Override
    public Aberration clone() throws CloneNotSupportedException {
        return new Beholder();
    }

    @Override
    public String toString() {
        return "Every beholder thinks it is the epitome of beholderkind, and the only thing it fears is that it might be wrong.";
    }
}
