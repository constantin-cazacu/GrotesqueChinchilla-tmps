package tale_simulation.adapter;

import tale_simulation.adapter.intrfaces.Cavalry;

public class HeavyCavalry implements Cavalry {

    private HeavyKnight heavyKnight;

    public HeavyCavalry() {
        heavyKnight = new HeavyKnight();
    }

    @Override
    public void charge() {
        System.out.println("Charge! Break the enemy line!");
    }

    @Override
    public void gallop() {
        heavyKnight.move();
    }
}
