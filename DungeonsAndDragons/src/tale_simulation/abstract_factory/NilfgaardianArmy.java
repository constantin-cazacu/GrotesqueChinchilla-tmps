package tale_simulation.abstract_factory;

import tale_simulation.abstract_factory.interfaces.Army;

public class NilfgaardianArmy implements Army {

    static final String DESCRIPTION = "This is the Nilfgaardian Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
