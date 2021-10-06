package tale_simulation.abstract_factory;

public class KaedwenCapital implements Capital {

    static final String DESCRIPTION = "This is Ard Carraigh, the capital of Kaedwen!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
