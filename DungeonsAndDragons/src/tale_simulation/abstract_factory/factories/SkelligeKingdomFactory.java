package tale_simulation.abstract_factory.factories;

import tale_simulation.abstract_factory.SkelliganArmy;
import tale_simulation.abstract_factory.SkelligeCapital;
import tale_simulation.abstract_factory.SkelligeRuler;
import tale_simulation.abstract_factory.interfaces.Army;
import tale_simulation.abstract_factory.interfaces.Capital;
import tale_simulation.abstract_factory.interfaces.KingdomFactory;
import tale_simulation.abstract_factory.interfaces.Ruler;

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
