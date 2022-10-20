package pokemon;

import pokemon.moves.BugBuzz;
import pokemon.moves.Bulldoze;
import pokemon.moves.DoubleTeam;
import pokemon.moves.RockTomb;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Trapinch extends Pokemon {
    public Trapinch(String name, int level) {
        super(name, level);
        this.addType(Type.GROUND);
        this.addMove(new RockTomb() );
        this.addMove(new DoubleTeam());
        this.setStats(45,100,45,45,45,10);
    }
}
