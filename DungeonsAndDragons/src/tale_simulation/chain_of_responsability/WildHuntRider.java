package tale_simulation.chain_of_responsability;

import tale_simulation.chain_of_responsability.abstractions.RequestHandler;
import tale_simulation.chain_of_responsability.enums.RequestType;

public class WildHuntRider extends RequestHandler {

    public WildHuntRider(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.READY_THE_HORSES)) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Wild Hunt Rider";
    }
}
