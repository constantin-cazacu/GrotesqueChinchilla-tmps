package tale_simulation.abstract_factory;

public class NilfgaardianArmy implements Army {

    static final String DESCRIPTION = "This is the Nilfgaardian Army!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
