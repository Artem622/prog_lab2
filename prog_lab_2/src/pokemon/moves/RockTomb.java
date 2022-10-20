package pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove{
    public RockTomb(){
        super(Type.ROCK,60,95);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP,-1);
        pokemon.setMod(Stat.SPEED,-1);
    }

    @Override
    protected String describe(){

        return "Use Rocktomb";
    }
}
