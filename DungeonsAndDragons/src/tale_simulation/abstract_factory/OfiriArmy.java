package tale_simulation.abstract_factory;

public class OfiriArmy implements Army {

    static final String DESCRIPTION = "This is the Ofiri Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
