package tale_simulation.abstract_factory;

public class TemerianArmy implements Army {

    static final String DESCRIPTION = "This is the Temerian Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
