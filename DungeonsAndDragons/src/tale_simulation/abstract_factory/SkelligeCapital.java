package tale_simulation.abstract_factory;

public class SkelligeCapital implements Capital {

    static final String DESCRIPTION = "This is Kaer Trolde, the capital of Skellige!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
