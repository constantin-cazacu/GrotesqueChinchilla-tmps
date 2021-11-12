package tale_simulation.flyweight;

import tale_simulation.flyweight.interfaces.Potion;

public class InvisibilityPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("You become invisible. (Potion=" + System.identityHashCode(this) + ")");
    }
}
