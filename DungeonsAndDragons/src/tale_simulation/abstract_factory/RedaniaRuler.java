package tale_simulation.abstract_factory;

import tale_simulation.abstract_factory.interfaces.Ruler;

public class RedaniaRuler implements Ruler {

    static final String DESCRIPTION = "This is the Ruler of Redania!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
