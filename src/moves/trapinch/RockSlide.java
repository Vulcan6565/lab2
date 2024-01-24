package moves.trapinch;

import ru.ifmo.se.pokemon.*;
import java.lang.Math;

public class RockSlide extends DamageMove {
    public RockSlide() {
        super(Type.ROCK, 75, 90);
    }

    @Override
    protected double calcAttDefFactor(Pokemon attacker, Pokemon defender) {
        double typeEffectiveness = 1.0;

        for (Type defenderType : defender.getTypes()) {
            if (defenderType == Type.BUG || defenderType == Type.FLYING) {
                typeEffectiveness *= 2.0;
            } else if (defenderType == Type.FIGHTING) {
                typeEffectiveness *= 0.5;
            }
        }

        return typeEffectiveness;
    }

    @Override
    protected void applyOppEffects(Pokemon target) {
        super.applyOppEffects(target);

        if (Math.random() <= 0.3) {
            Effect.flinch(target);
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "uses " + pieces[pieces.length - 1] + " to attack with a rock slide!";
    }
}
