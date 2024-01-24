package moves.kangaskhan;

import ru.ifmo.se.pokemon.*;

public class DoubleEdge extends PhysicalMove {
    public DoubleEdge(double pow, double acc) {
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfDamage(Pokemon attacker, double damage) {
        super.applySelfDamage(attacker, damage);
        int randomStat = (int) (Math.random() * 6);
        attacker.addEffect(new Effect().stat(Stat.values()[randomStat], -1));
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "does " + pieces[pieces.length - 1] + " and may cause additional effects";
    }
}
