package tale_simulation.abstract_factory;

import tale_simulation.abstract_factory.interfaces.Ruler;

public class AedirnRuler implements Ruler {

    static final String DESCRIPTION = "This is the Ruler of Aedirn!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
