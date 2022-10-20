
import pokemon.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Flygon flygon = new Flygon("Дракоша",15);
        Scizor scizor = new Scizor("Богомол",15);
        Scyther scyther = new Scyther("Зеленый",10);
        Trapinch trapinch = new Trapinch("Питомец",15);
        Vibrava vibrava = new Vibrava("Комар",15);
        Virizion virizion = new Virizion("Олень",15);
        b.addAlly(flygon);
        b.addAlly(scizor);
        b.addAlly(scyther);
        b.addFoe(trapinch);
        b.addFoe(vibrava);
        b.addFoe(virizion);
        b.go();
    }
}