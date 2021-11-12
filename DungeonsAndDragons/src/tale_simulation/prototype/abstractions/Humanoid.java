package tale_simulation.prototype.abstractions;

public abstract class Humanoid extends Prototype {

    @Override
    public abstract Humanoid clone() throws CloneNotSupportedException;
}
