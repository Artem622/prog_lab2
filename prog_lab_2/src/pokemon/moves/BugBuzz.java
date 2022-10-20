package pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class BugBuzz extends SpecialMove{
    public BugBuzz(){
        super(Type.BUG,90,100);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        int a = 0 + (int)(Math.random() * 10);
        if (a == 1){
            pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }

    @Override
    protected String describe(){

        return "Use BugBuzz";
    }
}

