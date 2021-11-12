package tale_simulation.abstract_factory.interfaces;

public interface KingdomFactory {
    Capital createCapital();
    Ruler createRuler();
    Army createArmy();
}
