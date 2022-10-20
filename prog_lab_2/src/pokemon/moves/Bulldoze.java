package pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove{
    public Bulldoze(){
        super(Type.GROUND,60,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP,-1);
        pokemon.setMod(Stat.SPEED,-1);
    }

    @Override
    protected String describe(){

        return "Use Bulldoze";
    }
}
