package tale_simulation.chain_of_responsability;

//King of the Wild Hunt makes requests that are handled by the chain

import tale_simulation.chain_of_responsability.abstractions.RequestHandler;

public class KingOfTheWildHunt {

    RequestHandler chain;

    public KingOfTheWildHunt() {
        buildChain();
    }

    private void buildChain() {
        chain = new WildHuntCommander(new WildHuntNavigator(new WildHuntRider(null)));
    }

    public void makeRequest(Request req) {
        chain.handleRequest(req);
    }


}
