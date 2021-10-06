package tale_simulation.abstract_factory;

public class OfiriRuler implements Ruler {

    static final String DESCRIPTION = "This is the Ruler of Ofiri!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
