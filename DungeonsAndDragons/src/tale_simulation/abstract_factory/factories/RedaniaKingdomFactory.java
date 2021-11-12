package tale_simulation.abstract_factory.factories;

import tale_simulation.abstract_factory.RedaniaCapital;
import tale_simulation.abstract_factory.RedaniaRuler;
import tale_simulation.abstract_factory.RedanianArmy;
import tale_simulation.abstract_factory.interfaces.Army;
import tale_simulation.abstract_factory.interfaces.Capital;
import tale_simulation.abstract_factory.interfaces.KingdomFactory;
import tale_simulation.abstract_factory.interfaces.Ruler;

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
