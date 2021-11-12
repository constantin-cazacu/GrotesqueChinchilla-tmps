package tale_simulation.flyweight;

import tale_simulation.flyweight.interfaces.Potion;

public class HealingPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("You are being healed. (Potion=" + System.identityHashCode(this) + ")");
    }
}
