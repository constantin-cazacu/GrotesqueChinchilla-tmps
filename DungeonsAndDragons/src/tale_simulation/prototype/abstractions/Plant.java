package tale_simulation.prototype.abstractions;

public abstract class Plant extends Prototype {

    @Override
    public abstract Plant clone() throws CloneNotSupportedException;
}
