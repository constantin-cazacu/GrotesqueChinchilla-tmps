package tale_simulation.abstract_factory;

import tale_simulation.abstract_factory.interfaces.Army;

public class SkelliganArmy implements Army {

    static final String DESCRIPTION = "This is the Skelligan Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
