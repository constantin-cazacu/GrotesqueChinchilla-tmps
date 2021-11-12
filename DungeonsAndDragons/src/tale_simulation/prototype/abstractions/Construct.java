package tale_simulation.prototype.abstractions;

public abstract class Construct extends Prototype {

    @Override
    public abstract Construct clone() throws CloneNotSupportedException;
}
