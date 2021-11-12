package tale_simulation.abstract_factory;

import tale_simulation.abstract_factory.interfaces.Capital;

public class OfiriCapital implements Capital {

    static final String DESCRIPTION = "This is Kabbalah, the capital of Ofiri!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
