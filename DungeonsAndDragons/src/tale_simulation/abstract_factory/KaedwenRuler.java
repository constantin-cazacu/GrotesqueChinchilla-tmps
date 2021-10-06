package tale_simulation.abstract_factory;

public class KaedwenRuler implements Ruler {

    static final String DESCRIPTION = "This is the Ruler of Kaedwen!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
