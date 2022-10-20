package pokemon.moves;

import ru.ifmo.se.pokemon.*;

public class BulletPunch extends PhysicalMove{
    public BulletPunch(){
        super(Type.STEEL,40,100);
    }

    @Override
    protected String describe(){

        return "Use BulletPunch";
    }
}
