package tale_simulation.abstract_factory;

import tale_simulation.abstract_factory.interfaces.Army;

public class RedanianArmy implements Army {

    static final String DESCRIPTION = "This is the Redanian Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
