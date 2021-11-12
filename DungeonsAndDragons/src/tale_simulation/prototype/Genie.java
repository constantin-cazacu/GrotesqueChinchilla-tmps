package tale_simulation.prototype;

import tale_simulation.prototype.abstractions.Elemental;

public class Genie extends Elemental {

    public Genie() {}

    @Override
    public Elemental clone() throws CloneNotSupportedException {
        return new Genie();
    }

    @Override
    public String toString() {
        return "The pitcher emitted a puff of glowing red smoke. The smoke pulsated, then gathered up into an irregular sphere floating in front of the poet's head...";
    }
}
