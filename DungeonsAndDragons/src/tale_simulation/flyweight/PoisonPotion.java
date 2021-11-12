package tale_simulation.flyweight;

import tale_simulation.flyweight.interfaces.Potion;

public class PoisonPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("Oh no! You got poisoned. (Potion=" + System.identityHashCode(this) + ")");
    }
}
