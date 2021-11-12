package tale_simulation.adapter;

public class HorseRider implements Cavalry {

    private Cavalry cavalry;

    public HorseRider() {
    }

    public HorseRider(Cavalry cavalry) {
        this.cavalry = cavalry;
    }

    public void setCavalry(Cavalry cavalry) {
        this.cavalry = cavalry;
    }

    @Override
    public void charge() {
        cavalry.charge();
    }

    @Override
    public void gallop() {
        cavalry.gallop();
    }
}
