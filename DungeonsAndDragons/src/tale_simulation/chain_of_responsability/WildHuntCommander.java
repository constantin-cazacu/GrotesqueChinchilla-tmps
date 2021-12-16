package tale_simulation.chain_of_responsability;

import tale_simulation.chain_of_responsability.abstractions.RequestHandler;
import tale_simulation.chain_of_responsability.enums.RequestType;

public class WildHuntCommander extends RequestHandler {

    public WildHuntCommander(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.PREPARE_NAGLFAR)) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Wild Hunt Commander";
    }
}
