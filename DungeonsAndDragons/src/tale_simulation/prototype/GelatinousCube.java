package tale_simulation.prototype;

import tale_simulation.prototype.abstractions.Oooze;

public class GelatinousCube extends Oooze {

    public GelatinousCube() {}

    @Override
    public Oooze clone() throws CloneNotSupportedException {
        return new GelatinousCube();
    }

    @Override
    public String toString() {
        return "A gelatinous cube, classic...";
    }
}
