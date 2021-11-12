package tale_simulation.flyweight;

import tale_simulation.flyweight.interfaces.Potion;

public class NightVisionPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("You can see in the dark. (Potion=" + System.identityHashCode(this) + ")");
    }
}
