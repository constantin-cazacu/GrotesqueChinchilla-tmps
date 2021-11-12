package tale_simulation.abstract_factory.factories;

import tale_simulation.abstract_factory.KaedwenCapital;
import tale_simulation.abstract_factory.KaedwenRuler;
import tale_simulation.abstract_factory.KaedwenianArmy;
import tale_simulation.abstract_factory.interfaces.Army;
import tale_simulation.abstract_factory.interfaces.Capital;
import tale_simulation.abstract_factory.interfaces.KingdomFactory;
import tale_simulation.abstract_factory.interfaces.Ruler;

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
