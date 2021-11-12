package tale_simulation.prototype;

import tale_simulation.prototype.abstractions.Construct;

public class Golem extends Construct {

    public Golem() {}

    @Override
    public Construct clone() throws CloneNotSupportedException {
        return new Golem();
    }

    @Override
    public String toString() {
        return "A golem, the very definition of unaligned";
    }
}
