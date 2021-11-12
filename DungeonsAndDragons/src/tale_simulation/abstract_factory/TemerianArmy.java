package tale_simulation.abstract_factory;

import tale_simulation.abstract_factory.interfaces.Army;

public class TemerianArmy implements Army {

    static final String DESCRIPTION = "This is the Temerian Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
