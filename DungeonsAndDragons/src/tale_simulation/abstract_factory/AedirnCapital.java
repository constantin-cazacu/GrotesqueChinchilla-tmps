package tale_simulation.abstract_factory;

import tale_simulation.abstract_factory.interfaces.Capital;

public class AedirnCapital implements Capital {

    static final String DESCRIPTION = "This is Vengerberg, the capital of Aedirn!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
