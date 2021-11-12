package tale_simulation.abstract_factory.factories;

import tale_simulation.abstract_factory.NilfgaardCapital;
import tale_simulation.abstract_factory.NilfgaardRuler;
import tale_simulation.abstract_factory.NilfgaardianArmy;
import tale_simulation.abstract_factory.interfaces.Army;
import tale_simulation.abstract_factory.interfaces.Capital;
import tale_simulation.abstract_factory.interfaces.KingdomFactory;
import tale_simulation.abstract_factory.interfaces.Ruler;

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
