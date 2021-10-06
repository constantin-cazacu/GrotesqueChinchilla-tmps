package tale_simulation.abstract_factory;

public class KaedwenKingdomFactory implements KingdomFactory {
    @Override
    public Capital createCapital() {
        return new KaedwenCapital();
    }

    @Override
    public Ruler createRuler() {
        return new KaedwenRuler();
    }

    @Override
    public Army createArmy() {
        return new KaedwenianArmy();
    }
}
