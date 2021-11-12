package tale_simulation.flyweight;

import tale_simulation.flyweight.interfaces.Potion;

public class WeaknessPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("You feel weak. (Potion=" + System.identityHashCode(this) + ")");
    }
}
