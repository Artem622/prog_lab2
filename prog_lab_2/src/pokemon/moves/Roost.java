package pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class Roost extends StatusMove {
    public Roost(){
        super(Type.FLYING,0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.setMod(Stat.HP, ((int)(pokemon.getStat(Stat.HP) - pokemon.getHP()))/2);
    }

    @Override
    protected String describe(){

        return "Use Roost";
    }
}
