package tale_simulation.abstract_factory.factories;

import tale_simulation.abstract_factory.OfiriArmy;
import tale_simulation.abstract_factory.OfiriCapital;
import tale_simulation.abstract_factory.OfiriRuler;
import tale_simulation.abstract_factory.interfaces.Army;
import tale_simulation.abstract_factory.interfaces.Capital;
import tale_simulation.abstract_factory.interfaces.KingdomFactory;
import tale_simulation.abstract_factory.interfaces.Ruler;

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
