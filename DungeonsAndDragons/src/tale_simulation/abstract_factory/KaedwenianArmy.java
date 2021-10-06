package tale_simulation.abstract_factory;

public class KaedwenianArmy implements Army {

    static final String DESCRIPTION = "This is the Kaedwenian Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
