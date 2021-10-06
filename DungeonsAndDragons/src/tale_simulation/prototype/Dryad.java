package tale_simulation.prototype;

public class Dryad extends Fey {

    public Dryad() {}

    @Override
    public Fey clone() throws CloneNotSupportedException {
        return new Dryad();
    }

    @Override
    public String toString() {
        return "It is common knowledge that among dryads – known also as eerie wives – you will find only women. They require human men for reproduction, which begs the question... What are they really? What is their origin?";
    }
}
