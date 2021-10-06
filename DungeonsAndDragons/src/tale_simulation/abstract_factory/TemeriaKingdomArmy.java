package tale_simulation.abstract_factory;

public class TemeriaKingdomArmy implements KingdomFactory {
    @Override
    public Capital createCapital() {
        return new TemeriaCapital();
    }

    @Override
    public Ruler createRuler() {
        return new TemeriaRuler();
    }

    @Override
    public Army createArmy() {
        return new TemerianArmy();
    }
}
