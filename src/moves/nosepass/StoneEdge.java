package moves.nosepass;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends DamageMove {
    private static final double increased_critical_hit_ratio = 1.0 / 8.0;

    public StoneEdge(int power, int accuracy) {
        super(Type.ROCK, power, accuracy);
    }

    @Override
    protected double calcAttDefFactor(Pokemon attacker, Pokemon defender) {
        return 1.0;
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "uses " + pieces[pieces.length - 1] + " and may cause critical hits";
    }
}
