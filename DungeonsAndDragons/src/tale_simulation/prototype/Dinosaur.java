package tale_simulation.prototype;

import tale_simulation.prototype.abstractions.Beast;

public class Dinosaur extends Beast {

    public Dinosaur() {}

    @Override
    public Beast clone() throws CloneNotSupportedException {
        return new Dinosaur();
    }

    @Override
    public String toString() {
        return "Dinosaur?! thought the last of their kind perished back in Eberron";
    }
}
