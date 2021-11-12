package tale_simulation.prototype;

import tale_simulation.prototype.abstractions.Dragon;

public class RedDragon extends Dragon {

    public RedDragon() {}

    @Override
    public Dragon clone() throws CloneNotSupportedException {
        return new RedDragon();
    }

    @Override
    public String toString() {
        return "Dragons are feared everywhere, and with good reason, we are dealing here with RED DRAGON !!!";
    }
}
