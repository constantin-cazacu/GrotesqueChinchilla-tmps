package tale_simulation.prototype;

import tale_simulation.prototype.abstractions.Monstrosity;

public class Owlbear extends Monstrosity {

    public Owlbear() {}

    @Override
    public Monstrosity clone() throws CloneNotSupportedException {
        return new Owlbear();
    }

    @Override
    public String toString() {
        return "Owlbears are vicious creatures, like bears, they can \"hug\" their prey, gnawing on them with their beaks the entire time.";
    }
}
