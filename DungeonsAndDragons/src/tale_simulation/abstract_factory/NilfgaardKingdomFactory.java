package tale_simulation.abstract_factory;

public class NilfgaardKingdomFactory implements KingdomFactory {
    @Override
    public Capital createCapital() {
        return new NilfgaardCapital();
    }

    @Override
    public Ruler createRuler() {
        return new NilfgaardRuler();
    }

    @Override
    public Army createArmy() {
        return new NilfgaardianArmy();
    }
}
