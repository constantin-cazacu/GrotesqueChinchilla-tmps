package tale_simulation.abstract_factory;

public class AedirnianArmy implements  Army {

    static final String DESCRIPTION = "This is the Aedirnian Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
