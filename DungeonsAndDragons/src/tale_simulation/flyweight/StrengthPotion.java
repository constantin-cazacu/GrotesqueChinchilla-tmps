package tale_simulation.flyweight;

import tale_simulation.flyweight.interfaces.Potion;

public class StrengthPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("You are being filled with strength. (Potion=" + System.identityHashCode(this) + ")");
    }
}
