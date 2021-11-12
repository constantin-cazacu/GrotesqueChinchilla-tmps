package tale_simulation.flyweight;

public class HealingPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("You are being healed. (Potion=" + System.identityHashCode(this) + ")");
    }
}
