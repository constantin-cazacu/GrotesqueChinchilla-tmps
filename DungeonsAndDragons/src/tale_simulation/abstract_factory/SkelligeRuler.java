package tale_simulation.abstract_factory;

public class SkelligeRuler implements Ruler {

    static final String DESCRIPTION = "This is the Ruler of Skellige!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
