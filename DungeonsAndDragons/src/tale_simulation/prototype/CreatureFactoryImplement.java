package tale_simulation.prototype;

public class CreatureFactoryImplement implements CreatureFactory {

    private Aberration aberration;
    private Beast beast;
    private Celestial celestial;
    private Construct construct;
    private Dragon dragon;
    private Elemental elemental;
    private Fey fey;
    private Fiend fiend;
    private Giant giant;
    private Humanoid humanoid;
    private Monstrosity monstrosity;
    private Oooze oooze;
    private Plant plant;
    private Undead undead;

//    Constructor

    public CreatureFactoryImplement(Aberration aberration, Beast beast,
                                    Celestial celestial, Construct construct,
                                    Dragon dragon, Elemental elemental,
                                    Fey fey, Fiend fiend,
                                    Giant giant, Humanoid humanoid,
                                    Monstrosity monstrosity, Oooze oooze,
                                    Plant plant, Undead undead) {
        this.aberration = aberration;
        this.beast = beast;
        this.celestial = celestial;
        this.construct = construct;
        this.dragon = dragon;
        this.elemental = elemental;
        this.fey = fey;
        this.fiend = fiend;
        this.giant = giant;
        this.humanoid = humanoid;
        this.monstrosity = monstrosity;
        this.oooze = oooze;
        this.plant = plant;
        this.undead = undead;
    }

//    Create Aberration
    @Override
    public Aberration createAberration() {
        try {
            return aberration.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

//    Create Beast
    @Override
    public Beast createBeast() {
        try {
            return beast.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

//    Create Celestial
    @Override
    public Celestial createCelestial() {
        try {
            return celestial.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

//    Create Construct
    @Override
    public Construct createConstruct() {
        try {
            return construct.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

//    Create Dragon
    @Override
    public Dragon createDragon() {
        try {
            return dragon.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

//    Create Elemental
    @Override
    public Elemental createElemental() {
        try {
            return elemental.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

//    Create Fey
    @Override
    public Fey createFey() {
        try {
            return fey.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

//    Create Fiend
    @Override
    public Fiend createFiend() {
        try {
            return fiend.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

//    Create Giant
    @Override
    public Giant createGiant() {
        try {
            return giant.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

//    Create Humanoid
    @Override
    public Humanoid createHumanoid() {
        try {
            return humanoid.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

//    Create Monstrosity
    @Override
    public Monstrosity createMonstrosity() {
        try {
            return monstrosity.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

//    Create Ooze
    @Override
    public Oooze createOooze() {
        try {
            return oooze.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

//    Create Plant
    @Override
    public Plant createPlant() {
        try {
            return plant.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

//    Create Undead
    @Override
    public Undead createUndead() {
        try {
            return undead.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
