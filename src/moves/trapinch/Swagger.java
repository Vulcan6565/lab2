package moves.trapinch;

import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.Effect;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon target) {
        super.applyOppEffects(target);
        target.addEffect(new Effect().stat(Stat.ATTACK, 2));
        Effect.confuse(target);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "uses " + pieces[pieces.length - 1] + " to confuse the target and sharply raise its Attack!";
    }
}
