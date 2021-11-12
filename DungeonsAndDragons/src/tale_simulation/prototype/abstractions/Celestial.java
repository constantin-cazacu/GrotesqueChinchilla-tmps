package tale_simulation.prototype.abstractions;

public abstract class Celestial extends Prototype {

    @Override
    public abstract Celestial clone() throws CloneNotSupportedException;
}
