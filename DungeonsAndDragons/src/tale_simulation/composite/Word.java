package tale_simulation.composite;

import java.util.List;

public class Word extends LetterComposite {

    public Word(List<Letter> letters) {
        for (Letter l : letters) {
            this.add(l);
        }
    }

    @Override
    protected void printBefore() {
        System.out.print(" ");
    }

    @Override
    protected void printAfter() {
    }
}
