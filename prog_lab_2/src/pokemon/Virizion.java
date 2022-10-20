package pokemon;

import pokemon.moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Virizion extends Pokemon {
    public Virizion(String name, int level) {
        super(name, level);
        this.addType(Type.GRASS);
        this.addType(Type.FIGHTING);
        this.addMove(new StoneEdge());
        this.addMove(new Rest());
        this.addMove(new TakeDown());
        this.addMove(new Leer());
        this.setStats(91,90,72,90,129,108);
    }
}
