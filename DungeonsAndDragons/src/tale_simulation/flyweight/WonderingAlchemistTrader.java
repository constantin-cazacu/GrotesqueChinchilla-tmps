package tale_simulation.flyweight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WonderingAlchemistTrader {

    private List<Potion> topCartShelf;
    private List<Potion> bottomCartShelf;

    public WonderingAlchemistTrader() {
        topCartShelf = new ArrayList<>();
        bottomCartShelf = new ArrayList<>();
        fillCartShelves();
    }

    private void fillCartShelves() {

        PotionFactory factory = new PotionFactory();

        topCartShelf.add(factory.createPotion(PotionType.INVISIBILITY));
        topCartShelf.add(factory.createPotion(PotionType.NIGHT_VISION));
        topCartShelf.add(factory.createPotion(PotionType.STRENGTH));
        topCartShelf.add(factory.createPotion(PotionType.HEALING));
        topCartShelf.add(factory.createPotion(PotionType.INVISIBILITY));
        topCartShelf.add(factory.createPotion(PotionType.STRENGTH));
        topCartShelf.add(factory.createPotion(PotionType.HEALING));
        topCartShelf.add(factory.createPotion(PotionType.SWIFTNESS));

        bottomCartShelf.add(factory.createPotion(PotionType.POISON));
        bottomCartShelf.add(factory.createPotion(PotionType.WEAKNESS));
        bottomCartShelf.add(factory.createPotion(PotionType.POISON));
        bottomCartShelf.add(factory.createPotion(PotionType.SLOWNESS));
        bottomCartShelf.add(factory.createPotion(PotionType.SLOWNESS));
    }

    public final List<Potion> getTopCartShelf() {
        return Collections.unmodifiableList(this.topCartShelf);
    }

    public final List<Potion> getBottomCartShelf() {
        return Collections.unmodifiableList(this.bottomCartShelf);
    }

    public void count() {

        System.out.println("Counting top shelf potions\n");

        for (Potion p : topCartShelf) {
            p.drink();
        }

        System.out.println("\nCounting bottom shelf potions\n");

        for (Potion p : bottomCartShelf) {
            p.drink();
        }
    }
}
