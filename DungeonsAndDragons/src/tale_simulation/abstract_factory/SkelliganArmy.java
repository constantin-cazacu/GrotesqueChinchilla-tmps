package tale_simulation.abstract_factory;

public class SkelliganArmy implements Army {

    static final String DESCRIPTION = "This is the Skelligan Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
