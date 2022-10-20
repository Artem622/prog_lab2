package pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge(){

        super(Type.ROCK, 100 , 80);
    }
    @Override
    protected double calcCriticalHit(Pokemon attack, Pokemon defender){

        return Math.random() < 0.125 ? 2 : 1;
    }
    @Override
    protected String describe(){

        return "Use Stone Edge";
    }
}
