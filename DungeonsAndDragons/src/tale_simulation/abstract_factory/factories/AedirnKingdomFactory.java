package tale_simulation.abstract_factory.factories;

import tale_simulation.abstract_factory.AedirnCapital;
import tale_simulation.abstract_factory.AedirnRuler;
import tale_simulation.abstract_factory.AedirnianArmy;
import tale_simulation.abstract_factory.interfaces.Army;
import tale_simulation.abstract_factory.interfaces.Capital;
import tale_simulation.abstract_factory.interfaces.KingdomFactory;
import tale_simulation.abstract_factory.interfaces.Ruler;

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
