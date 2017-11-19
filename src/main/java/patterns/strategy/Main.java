package patterns.strategy;

import patterns.strategy.heroes.Character;
import patterns.strategy.heroes.King;
import patterns.strategy.heroes.Queen;
import patterns.strategy.heroes.Troll;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Character> heroes = Arrays.asList(new King(), new Queen(), new Troll());
        heroes.forEach(c -> {
            c.talk();
            c.fight();
        });
    }
}
