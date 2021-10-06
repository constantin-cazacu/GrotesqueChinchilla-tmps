package tale_simulation.abstract_factory;

public class RedaniaRuler implements Ruler {

    static final String DESCRIPTION = "This is the Ruler of Redania!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
