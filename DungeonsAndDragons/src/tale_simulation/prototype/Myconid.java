package tale_simulation.prototype;

public class Myconid extends Plant{

    public Myconid() {}

    @Override
    public Plant clone() throws CloneNotSupportedException {
        return new Myconid();
    }

    @Override
    public String toString() {
        return "Myconids, also known as fungus ones, and fungus folk.";
    }
}
