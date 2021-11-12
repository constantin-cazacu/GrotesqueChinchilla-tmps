package tale_simulation.prototype.abstractions;

public abstract class Beast extends Prototype {

    @Override
    public abstract Beast clone() throws CloneNotSupportedException;
}
