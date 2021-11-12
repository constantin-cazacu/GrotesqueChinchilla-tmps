package tale_simulation.flyweight;

public class WeaknessPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("You feel weak. (Potion=" + System.identityHashCode(this) + ")");
    }
}
