package pokemon;

import pokemon.moves.BugBuzz;
import pokemon.moves.Bulldoze;
import pokemon.moves.DoubleTeam;
import pokemon.moves.RockTomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Flygon extends Pokemon {

    public Flygon(String name, int level) {
        super(name, level);
        this.addType(Type.DRAGON);
        this.addType(Type.GROUND);
        this.addMove(new RockTomb());
        this.addMove(new DoubleTeam());
        this.addMove(new BugBuzz());
        this.addMove(new Bulldoze());
        this.setStats(80,100,80,80,80,100);
    }
}
