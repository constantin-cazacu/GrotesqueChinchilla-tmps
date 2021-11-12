package tale_simulation.flyweight;

public class PoisonPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("Oh no! You got poisoned. (Potion=" + System.identityHashCode(this) + ")");
    }
}
