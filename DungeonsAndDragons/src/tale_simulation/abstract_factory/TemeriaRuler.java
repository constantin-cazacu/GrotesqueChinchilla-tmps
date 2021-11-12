package tale_simulation.abstract_factory;

import tale_simulation.abstract_factory.interfaces.Ruler;

public class TemeriaRuler implements Ruler {

    static final String DESCRIPTION = "This is the Ruler of Temeria!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
