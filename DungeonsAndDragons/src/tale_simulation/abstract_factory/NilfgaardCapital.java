package tale_simulation.abstract_factory;

import tale_simulation.abstract_factory.interfaces.Capital;

public class NilfgaardCapital implements Capital {

    static final String DESCRIPTION = "This is City of Golden Towers, the capital of Nilfgaard!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
