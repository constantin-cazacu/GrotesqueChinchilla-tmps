package tale_simulation.abstract_factory;

import tale_simulation.abstract_factory.interfaces.Capital;

public class RedaniaCapital implements Capital {

    static final String DESCRIPTION = "This is Tretogor, the capital of Redania!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
