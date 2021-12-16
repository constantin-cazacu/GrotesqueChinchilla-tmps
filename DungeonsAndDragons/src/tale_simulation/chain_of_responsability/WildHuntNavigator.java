package tale_simulation.chain_of_responsability;

import tale_simulation.chain_of_responsability.abstractions.RequestHandler;
import tale_simulation.chain_of_responsability.enums.RequestType;

public class WildHuntNavigator extends RequestHandler {

    public WildHuntNavigator(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.OPEN_PORTAL)) {
            printHandling(req);
            req.markHandled();
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Wild Hunt Navigator";
    }
}
