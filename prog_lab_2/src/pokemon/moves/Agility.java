package pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class Agility extends StatusMove{
    public Agility(){
        super(Type.PSYCHIC,0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.SPEED,+2);
    }

    @Override
    protected String describe(){

        return "Use Agility";
    }
}
