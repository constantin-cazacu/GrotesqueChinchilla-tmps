package tale_simulation.abstract_factory;

import tale_simulation.abstract_factory.interfaces.Army;

public class OfiriArmy implements Army {

    static final String DESCRIPTION = "This is the Ofiri Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
