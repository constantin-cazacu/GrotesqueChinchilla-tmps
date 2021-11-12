package tale_simulation.abstract_factory;

import tale_simulation.abstract_factory.interfaces.Army;

public class AedirnianArmy implements Army {

    static final String DESCRIPTION = "This is the Aedirnian Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
