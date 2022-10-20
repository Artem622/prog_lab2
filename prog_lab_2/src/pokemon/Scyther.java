package pokemon;

import pokemon.moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Scyther extends Pokemon {
    public Scyther(String name, int level) {
        super(name, level);
        this.addType(Type.BUG);
        this.addType(Type.FLYING);
        this.addMove(new Roost());
        this.addMove(new Agility());
        this.addMove(new Slash());
        this.setStats(70,110,80,55,80,105);
    }
}
