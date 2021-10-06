package tale_simulation.abstract_factory;

public class TemeriaRuler implements Ruler {

    static final String DESCRIPTION = "This is the Ruler of Temeria!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
