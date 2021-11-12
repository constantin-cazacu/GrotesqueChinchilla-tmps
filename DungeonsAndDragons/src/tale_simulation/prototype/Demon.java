package tale_simulation.prototype;

import tale_simulation.prototype.abstractions.Fiend;

public class Demon extends Fiend {

    public Demon() {}

    @Override
    public Fiend clone() throws CloneNotSupportedException {
        return new Demon();
    }

    @Override
    public String toString() {
        return "Some men have got good reason to fear their own demons.";
    }
}
