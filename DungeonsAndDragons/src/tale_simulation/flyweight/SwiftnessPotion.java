package tale_simulation.flyweight;

public class SwiftnessPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("You feel fast as the wind. (Potion=" + System.identityHashCode(this) + ")");
    }
}
