package tale_simulation.flyweight;

public class StrengthPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("You are being filled with strength. (Potion=" + System.identityHashCode(this) + ")");
    }
}
