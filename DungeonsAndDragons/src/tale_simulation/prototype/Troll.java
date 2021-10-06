package tale_simulation.prototype;

public class Troll extends Giant {

    public Troll() {}

    @Override
    public Giant clone() throws CloneNotSupportedException {
        return new Troll();
    }

    @Override
    public String toString() {
        return "According to legend, trolls are creatures born of earth and their body is made of rock. They hate sunlight, which kills them by turning them into inanimate stone, so they subsist only at night. That's much for legends. And the reality? Well...";
    }
}
