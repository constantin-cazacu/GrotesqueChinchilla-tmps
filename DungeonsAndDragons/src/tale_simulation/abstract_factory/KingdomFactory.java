package tale_simulation.abstract_factory;

public interface KingdomFactory {
    Capital createCapital();
    Ruler createRuler();
    Army createArmy();
}
