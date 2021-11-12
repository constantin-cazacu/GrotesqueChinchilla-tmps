package tale_simulation.composite;

import java.util.List;

public class Sentence extends LetterComposite {

    public Sentence(List<Word> words) {
        for (Word w : words) {
            this.add(w);
        }
    }

    @Override
    protected void printBefore() {
    }

    @Override
    protected void printAfter() {
        System.out.print(".");
    }
}
