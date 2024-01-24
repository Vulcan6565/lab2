package moves.kangaskhan;

import ru.ifmo.se.pokemon.*;

public class HammerArm extends PhysicalMove {
    public HammerArm(double pow, double acc) {
        super(Type.FIGHTING, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon attacker) {
        super.applySelfEffects(attacker);
        attacker.addEffect(new Effect().stat(Stat.SPEED, -1));
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "uses " + pieces[pieces.length - 1] + " and may cause additional effects";
    }
}