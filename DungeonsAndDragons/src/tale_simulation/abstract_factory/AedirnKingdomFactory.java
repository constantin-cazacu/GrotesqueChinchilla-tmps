package tale_simulation.abstract_factory;

public class AedirnKingdomFactory implements KingdomFactory {
    @Override
    public Capital createCapital() {
        return new AedirnCapital();
    }

    @Override
    public Ruler createRuler() {
        return new AedirnRuler();
    }

    @Override
    public Army createArmy() {
        return new AedirnianArmy();
    }
}
