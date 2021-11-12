package tale_simulation.abstract_factory;

import tale_simulation.abstract_factory.interfaces.Capital;

public class KaedwenCapital implements Capital {

    static final String DESCRIPTION = "This is Ard Carraigh, the capital of Kaedwen!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
