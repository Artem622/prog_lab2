package pokemon;

import pokemon.moves.Agility;
import pokemon.moves.BulletPunch;
import pokemon.moves.Roost;
import pokemon.moves.Slash;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Scizor extends Pokemon {
    public Scizor(String name, int level){
        this.addType(Type.BUG);
        this.addType(Type.STEEL);
        this.addMove(new Roost());
        this.addMove(new Agility());
        this.addMove(new Slash());
        this.addMove(new BulletPunch());
        this.setStats(70,130,100,55,80,65);
    }
}
