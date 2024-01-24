package moves.kangaskhan;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public class CometPunch extends PhysicalMove {
    public CometPunch(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon target, double damage) {
        super.applyOppDamage(target, damage);
        if (Math.random() <= 0.3) {
            target.addEffect(new Effect().stat(Stat.HP, (int) -damage / 2));
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length - 1] + " and may cause additional effects";
    }
}