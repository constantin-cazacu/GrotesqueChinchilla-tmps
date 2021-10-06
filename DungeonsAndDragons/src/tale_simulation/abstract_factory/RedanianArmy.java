package tale_simulation.abstract_factory;

public class RedanianArmy implements Army {

    static final String DESCRIPTION = "This is the Redanian Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
