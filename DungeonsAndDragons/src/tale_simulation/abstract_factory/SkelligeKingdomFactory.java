package tale_simulation.abstract_factory;

public class SkelligeKingdomFactory implements KingdomFactory {
    @Override
    public Capital createCapital() {
        return new SkelligeCapital();
    }

    @Override
    public Ruler createRuler() {
        return new SkelligeRuler();
    }

    @Override
    public Army createArmy() {
        return new SkelliganArmy();
    }
}
