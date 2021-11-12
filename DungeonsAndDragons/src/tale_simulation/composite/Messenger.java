package tale_simulation.composite;

import tale_simulation.composite.abstractions.LetterComposite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Messenger {

    LetterComposite messageFromAedirn() {

        List<Word> words = new ArrayList<>();

//        Let my deeds be the flame that lights up your darkness

        words.add(new Word(Arrays.asList(new Letter('L'), new Letter('e'), new Letter('t'))));
        words.add(new Word(Arrays.asList(new Letter('m'), new Letter('y'))));
        words.add(new Word(Arrays.asList(new Letter('d'), new Letter('e'), new Letter('e'), new Letter('d'), new Letter('s'))));
        words.add(new Word(Arrays.asList(new Letter('b'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('t'), new Letter('h'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('f'), new Letter('l'), new Letter('a'), new Letter('m'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('t'), new Letter('h'), new Letter('a'), new Letter('t'))));
        words.add(new Word(Arrays.asList(new Letter('l'), new Letter('i'), new Letter('g'), new Letter('h'), new Letter('t'), new Letter('d'))));
        words.add(new Word(Arrays.asList(new Letter('u'), new Letter('p'))));
        words.add(new Word(Arrays.asList(new Letter('y'), new Letter('o'), new Letter('u'), new Letter('r'))));
        words.add(new Word(Arrays.asList(new Letter('d'), new Letter('a'), new Letter('r'), new Letter('k'), new Letter('n'), new Letter('e'), new Letter('s'), new Letter('s'))));

        return new Sentence(words);

    }

    LetterComposite messageFromKaedwen() {

        List<Word> words = new ArrayList<>();

//        Men of Kaedwen, attack

        words.add(new Word(Arrays.asList(new Letter('M'), new Letter('e'), new Letter('n'))));
        words.add(new Word(Arrays.asList(new Letter('o'), new Letter('f'))));
        words.add(new Word(Arrays.asList(new Letter('K'), new Letter('a'), new Letter('e'), new Letter('d'), new Letter('w'), new Letter('e'), new Letter('n'), new Letter(','))));
        words.add(new Word(Arrays.asList(new Letter('a'), new Letter('t'), new Letter('t'), new Letter('a'), new Letter('c'), new Letter('k'))));

        return new Sentence(words);

    }

    public LetterComposite messageFromNilfgaard() {

        List<Word> words = new ArrayList<>();

//        The North shall tuck tail and beg for mercy, that is its destiny

        words.add(new Word(Arrays.asList(new Letter('T'), new Letter('h'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('N'), new Letter('o'), new Letter('r'), new Letter('t'), new Letter('h'))));
        words.add(new Word(Arrays.asList(new Letter('s'), new Letter('h'), new Letter('a'), new Letter('l'), new Letter('l'))));
        words.add(new Word(Arrays.asList(new Letter('t'), new Letter('u'), new Letter('c'), new Letter('k'))));
        words.add(new Word(Arrays.asList(new Letter('t'), new Letter('a'), new Letter('i'), new Letter('l'))));
        words.add(new Word(Arrays.asList(new Letter('a'), new Letter('n'), new Letter('d'))));
        words.add(new Word(Arrays.asList(new Letter('b'), new Letter('e'), new Letter('g'))));
        words.add(new Word(Arrays.asList(new Letter('f'), new Letter('o'), new Letter('r'))));
        words.add(new Word(Arrays.asList(new Letter('m'), new Letter('e'), new Letter('r'), new Letter('c'), new Letter('y'), new Letter(','))));
        words.add(new Word(Arrays.asList(new Letter('t'), new Letter('h'), new Letter('a'), new Letter('t'))));
        words.add(new Word(Arrays.asList(new Letter('i'), new Letter('s'))));
        words.add(new Word(Arrays.asList(new Letter('i'), new Letter('t'), new Letter('s'))));
        words.add(new Word(Arrays.asList(new Letter('d'), new Letter('e'), new Letter('s'), new Letter('t'), new Letter('i'), new Letter('n'), new Letter('y'))));

        return new Sentence(words);

    }

    LetterComposite messageFromOfiri() {

        List<Word> words = new ArrayList<>();

//        In risk there is honor

        words.add(new Word(Arrays.asList(new Letter('I'), new Letter('n'))));
        words.add(new Word(Arrays.asList(new Letter('r'), new Letter('i'), new Letter('s'), new Letter('k'))));
        words.add(new Word(Arrays.asList(new Letter('t'), new Letter('h'), new Letter('e'), new Letter('r'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('i'), new Letter('s'))));
        words.add(new Word(Arrays.asList(new Letter('h'), new Letter('o'), new Letter('n'), new Letter('o'), new Letter('r'))));

        return new Sentence(words);

    }

    public LetterComposite messageFromRedania() {

        List<Word> words = new ArrayList<>();

//        A king should be merciless towards his enemies and generous to his friends

        words.add(new Word(Arrays.asList(new Letter('A'))));
        words.add(new Word(Arrays.asList(new Letter('k'), new Letter('i'), new Letter('n'), new Letter('g'))));
        words.add(new Word(Arrays.asList(new Letter('s'), new Letter('h'), new Letter('o'), new Letter('u'), new Letter('l'), new Letter('d'))));
        words.add(new Word(Arrays.asList(new Letter('b'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('m'), new Letter('e'), new Letter('r'), new Letter('c'), new Letter('i'), new Letter('l'), new Letter('e'), new Letter('s'), new Letter('s'))));
        words.add(new Word(Arrays.asList(new Letter('t'), new Letter('o'), new Letter('w'), new Letter('a'), new Letter('r'), new Letter('d'), new Letter('s'))));
        words.add(new Word(Arrays.asList(new Letter('h'), new Letter('i'), new Letter('s'))));
        words.add(new Word(Arrays.asList(new Letter('e'), new Letter('n'), new Letter('e'), new Letter('m'), new Letter('i'), new Letter('e'), new Letter('s'))));
        words.add(new Word(Arrays.asList(new Letter('a'), new Letter('n'), new Letter('d'))));
        words.add(new Word(Arrays.asList(new Letter('g'), new Letter('e'), new Letter('n'), new Letter('e'), new Letter('r'), new Letter('o'), new Letter('u'), new Letter('s'))));
        words.add(new Word(Arrays.asList(new Letter('t'), new Letter('o'))));
        words.add(new Word(Arrays.asList(new Letter('h'), new Letter('i'), new Letter('s'))));
        words.add(new Word(Arrays.asList(new Letter('f'), new Letter('r'), new Letter('i'), new Letter('e'), new Letter('n'), new Letter('d'), new Letter('s'))));

        return new Sentence(words);

    }

    LetterComposite messageFromSkellige() {

        List<Word> words = new ArrayList<>();

//        For Skellige's glory

        words.add(new Word(Arrays.asList(new Letter('F'), new Letter('o'), new Letter('r'))));
        words.add(new Word(Arrays.asList(new Letter('S'), new Letter('k'), new Letter('e'), new Letter('l'), new Letter('l'), new Letter('i'), new Letter('g'), new Letter('e'), new Letter('\''), new Letter('s'))));
        words.add(new Word(Arrays.asList(new Letter('g'), new Letter('l'), new Letter('o'), new Letter('r'), new Letter('y'))));

        return new Sentence(words);

    }

    LetterComposite messageFromTemeria() {

        List<Word> words = new ArrayList<>();

//        For Temeria, men! To die for Temeria is to die a good death

        words.add(new Word(Arrays.asList(new Letter('F'), new Letter('o'), new Letter('r'))));
        words.add(new Word(Arrays.asList(new Letter('T'), new Letter('e'), new Letter('m'), new Letter('e'), new Letter('r'), new Letter('i'), new Letter('a'), new Letter(','))));
        words.add(new Word(Arrays.asList(new Letter('m'), new Letter('e'), new Letter('n'), new Letter('!'))));
        words.add(new Word(Arrays.asList(new Letter('T'), new Letter('o'))));
        words.add(new Word(Arrays.asList(new Letter('d'), new Letter('i'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('f'), new Letter('o'), new Letter('r'))));
        words.add(new Word(Arrays.asList(new Letter('T'), new Letter('e'), new Letter('m'), new Letter('e'), new Letter('r'), new Letter('i'), new Letter('a'))));
        words.add(new Word(Arrays.asList(new Letter('i'), new Letter('s'))));
        words.add(new Word(Arrays.asList(new Letter('t'), new Letter('o'))));
        words.add(new Word(Arrays.asList(new Letter('d'), new Letter('i'), new Letter('e'))));
        words.add(new Word(Arrays.asList(new Letter('a'))));
        words.add(new Word(Arrays.asList(new Letter('g'), new Letter('o'), new Letter('o'), new Letter('d'))));
        words.add(new Word(Arrays.asList(new Letter('d'), new Letter('e'), new Letter('i'), new Letter('t'), new Letter('h'))));

        return new Sentence(words);

    }
}
