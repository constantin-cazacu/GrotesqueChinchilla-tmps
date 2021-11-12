package tale_simulation.abstract_factory.factories;

import tale_simulation.abstract_factory.TemeriaCapital;
import tale_simulation.abstract_factory.TemeriaRuler;
import tale_simulation.abstract_factory.TemerianArmy;
import tale_simulation.abstract_factory.interfaces.Army;
import tale_simulation.abstract_factory.interfaces.Capital;
import tale_simulation.abstract_factory.interfaces.KingdomFactory;
import tale_simulation.abstract_factory.interfaces.Ruler;

public class TemeriaKingdomFactory implements KingdomFactory {
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
