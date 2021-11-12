package tale_simulation.flyweight;

public class SlownessPotion implements Potion {

    @Override
    public void drink() {
        System.out.println("You are mooooving soooo sloooow. (Potion=" + System.identityHashCode(this) + ")");
    }
}
