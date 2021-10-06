package tale_simulation.prototype;

public abstract class Celestial extends Prototype {

    @Override
    public abstract Celestial clone() throws CloneNotSupportedException;
}
