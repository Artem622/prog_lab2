package pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove{
    public Rest(){
        super(Type.PSYCHIC,0,0);
    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        Effect effect = new Effect();
        effect.condition(Status.SLEEP).attack(0.0).turns(2);
        pokemon.setMod(Stat.HP, (int)(pokemon.getStat(Stat.HP) - pokemon.getHP()));
        pokemon.setCondition(effect);
    }

    @Override
    protected String describe(){

        return "Use Rest";
    }
}
