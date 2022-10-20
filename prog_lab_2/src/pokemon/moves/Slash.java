package pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class Slash extends PhysicalMove{
    public Slash(){
        super(Type.NORMAL,70,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPECIAL_ATTACK,+1);
    }

    @Override
    protected String describe(){

        return "Use Slash";
    }
}
