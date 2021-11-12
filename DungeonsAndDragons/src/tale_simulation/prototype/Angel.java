package tale_simulation.prototype;

import tale_simulation.prototype.abstractions.Celestial;

public class Angel extends Celestial {

    public Angel() {}

    @Override
    public Celestial clone() throws CloneNotSupportedException {
        return new Angel();
    }

    @Override
    public String toString() {
        return "I wonder if this angel ever saw the Upper Planes...";
    }
}
