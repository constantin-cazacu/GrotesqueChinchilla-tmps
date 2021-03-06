package tale_simulation;

import tale_simulation.abstract_factory.factories.NilfgaardKingdomFactory;
import tale_simulation.abstract_factory.factories.RedaniaKingdomFactory;
import tale_simulation.adapter.HeavyCavalry;
import tale_simulation.adapter.HorseRider;
import tale_simulation.builder.*;
import tale_simulation.builder.enums.*;
import tale_simulation.chain_of_responsability.KingOfTheWildHunt;
import tale_simulation.chain_of_responsability.Request;
import tale_simulation.chain_of_responsability.WildHuntNavigator;
import tale_simulation.chain_of_responsability.enums.RequestType;
import tale_simulation.composite.abstractions.LetterComposite;
import tale_simulation.composite.Messenger;
import tale_simulation.flyweight.WonderingAlchemistTrader;
import tale_simulation.prototype.*;
import tale_simulation.prototype.abstractions.*;
import tale_simulation.prototype.interfaces.CreatureFactory;

public class FantasyWorld {
    public static void main(String[] args) {
        var kingdom1 = new RedaniaKingdomFactory();
        var capital1 =  kingdom1.createCapital();
        var ruler1 =  kingdom1.createRuler();
        var army1 = kingdom1.createArmy();

        var kingdom2 = new NilfgaardKingdomFactory();
        var capital2 =  kingdom2.createCapital();
        var ruler2 =  kingdom2.createRuler();
        var army2 = kingdom2.createArmy();

        System.out.println(capital1.getDescription());
        System.out.println(army1.getDescription());
        System.out.println(ruler1.getDescription());

        System.out.println("Message from Redania: ");

        LetterComposite redaniaMessage = new Messenger().messageFromRedania();
        redaniaMessage.print();

        System.out.println(capital2.getDescription());
        System.out.println(army2.getDescription());
        System.out.println(ruler2.getDescription());

        System.out.println("Message from Nilfgaard: ");

        LetterComposite nilfgaardMessage = new Messenger().messageFromNilfgaard();
        nilfgaardMessage.print();

        System.out.println("\n");

        System.out.println("***---------***");

        System.out.println("During a battle...");

        HorseRider horseRider = new HorseRider(new HeavyCavalry());
        horseRider.gallop();
        horseRider.charge();

        System.out.println("***---------***");

        System.out.println("\n");

        System.out.println("***---------***");

        Hero bard = new Hero.Builder("Dandelion", HeroClass.BARD)
                .heroRace(Race.HUMAN).heroAlignment(HeroAlignment.LAWFUL_EVIL)
                .heroArmor(Armor.CHAIN_MAIL).heroWeapon(Weapon.BATTLE_AXE)
                .build();
        System.out.println(bard);

        Hero ranger = new Hero.Builder("Striden", HeroClass.RANGER)
                .heroRace(Race.HALF_ELF).heroAlignment(HeroAlignment.NEUTRAL_GOOD)
                .heroArmor(Armor.BANDED_MAIL).heroWeapon(Weapon.GREAT_SWORD)
                .build();
        System.out.println(ranger);

        System.out.println("***---------***");

        System.out.println("A mysterious cart is approaching, Ah! an alchemist, let us see what has he got in his stock...");
        WonderingAlchemistTrader wonderingAlchemistTrader = new WonderingAlchemistTrader();
        wonderingAlchemistTrader.count();

        System.out.println("***---------***");

        CreatureFactory creatures;
        Aberration beholder;
        Beast dinosaur;
        Celestial angel;
        Construct golem;
        Dragon redDragon;
        Elemental genie;
        Fey dryad;
        Fiend demon;
        Giant troll;
        Humanoid goblin;
        Monstrosity owlbear;
        Oooze gelCube;
        Plant myconid;
        Undead vampire;

        creatures = new CreatureFactoryImplement(new Beholder(), new Dinosaur(), new Angel(), new Golem(), new RedDragon(), new Genie(), new Dryad(), new Demon(), new Troll(), new Goblin(), new Owlbear(), new GelatinousCube(), new Myconid(), new Vampire());
        beholder = creatures.createAberration();
        dinosaur = creatures.createBeast();
        angel = creatures.createCelestial();
        golem = creatures.createConstruct();
        redDragon = creatures.createDragon();
        genie = creatures.createElemental();
        dryad = creatures.createFey();
        demon = creatures.createFiend();
        troll = creatures.createGiant();
        goblin = creatures.createHumanoid();
        owlbear = creatures.createMonstrosity();
        gelCube = creatures.createOooze();
        myconid = creatures.createPlant();
        vampire = creatures.createUndead();
        System.out.println(beholder);
        System.out.println(dinosaur);
        System.out.println(angel);
        System.out.println(golem);
        System.out.println(beholder);
        System.out.println(redDragon);
        System.out.println(genie);
        System.out.println(dryad);
        System.out.println(demon);
        System.out.println(troll);
        System.out.println(goblin);
        System.out.println(owlbear);
        System.out.println(gelCube);
        System.out.println(beholder);
        System.out.println(myconid);
        System.out.println(vampire);

        System.out.println("***---------***");

        KingOfTheWildHunt king = new KingOfTheWildHunt();
        king.makeRequest(new Request(RequestType.PREPARE_NAGLFAR, "prepare the ship, prepare Naglfar, we are heading out!"));
        king.makeRequest(new Request(RequestType.OPEN_PORTAL, "open a portal to the target's location"));
        king.makeRequest(new Request(RequestType.READY_THE_HORSES, "Riders! it is TIME!!!"));



    }
}
