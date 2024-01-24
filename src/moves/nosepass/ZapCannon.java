package moves.nosepass;

import ru.ifmo.se.pokemon.*;

public class ZapCannon extends SpecialMove {
    private static final double PARALYSIS_CHANCE = 0.25;

    public ZapCannon() {
        super(Type.ELECTRIC, 120, 50);
    }

    @Override
    protected void applyOppEffects(Pokemon target) {
        super.applyOppEffects(target);

        paralyze(target);
    }

    private void paralyze(Pokemon pokemon) {
        if (!pokemon.hasType(Type.ELECTRIC)) {
            Effect paralyzeEffect = (new Effect()).condition(Status.PARALYZE).attack(0.75).turns(-1);
            paralyzeEffect.stat(Stat.SPEED, -2);
            pokemon.setCondition(paralyzeEffect);
        }
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "uses " + pieces[pieces.length - 1] + " and may cause paralysis";
    }
}