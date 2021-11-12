package tale_simulation.prototype.interfaces;

import tale_simulation.prototype.abstractions.*;

public interface CreatureFactory {

    Aberration createAberration();
    Beast createBeast();
    Celestial createCelestial();
    Construct createConstruct();
    Dragon createDragon();
    Elemental createElemental();
    Fey createFey();
    Fiend createFiend();
    Giant createGiant();
    Humanoid createHumanoid();
    Monstrosity createMonstrosity();
    Oooze createOooze();
    Plant createPlant();
    Undead createUndead();
}
