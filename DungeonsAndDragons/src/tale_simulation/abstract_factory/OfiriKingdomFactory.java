package tale_simulation.abstract_factory;

public class OfiriKingdomFactory implements KingdomFactory {
    @Override
    public Capital createCapital() {
        return new OfiriCapital();
    }

    @Override
    public Ruler createRuler() {
        return new OfiriRuler();
    }

    @Override
    public Army createArmy() {
        return new OfiriArmy();
    }
}
