package tale_simulation.abstract_factory;

import tale_simulation.abstract_factory.interfaces.Capital;

public class SkelligeCapital implements Capital {

    static final String DESCRIPTION = "This is Kaer Trolde, the capital of Skellige!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
