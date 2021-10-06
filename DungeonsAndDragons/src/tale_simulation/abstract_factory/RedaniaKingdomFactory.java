package tale_simulation.abstract_factory;

public class RedaniaKingdomFactory implements KingdomFactory {
    @Override
    public Capital createCapital() {
        return new RedaniaCapital();
    }

    @Override
    public Ruler createRuler() {
        return new RedaniaRuler();
    }

    @Override
    public Army createArmy() {
        return new RedanianArmy();
    }
}
