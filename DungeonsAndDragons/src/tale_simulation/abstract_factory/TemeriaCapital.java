package tale_simulation.abstract_factory;

public class TemeriaCapital implements Capital {

    static final String DESCRIPTION = "This is Vizima, the capital of Temeria!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
