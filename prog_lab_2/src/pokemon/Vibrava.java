package pokemon;

import pokemon.moves.BugBuzz;
import pokemon.moves.Bulldoze;
import pokemon.moves.DoubleTeam;
import pokemon.moves.RockTomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Vibrava extends Pokemon {
    public Vibrava(String name, int level) {
        super(name, level);
        this.addType(Type.GROUND);
        this.addType(Type.DRAGON);
        this.addMove(new RockTomb());
        this.addMove(new DoubleTeam());
        this.addMove(new BugBuzz());
        this.setStats(50,70,50,50,50,70);
    }
}
