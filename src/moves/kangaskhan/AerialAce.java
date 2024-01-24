package moves.kangaskhan;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove {
    public AerialAce(double pow, double acc) {
        super(Type.FLYING, pow, acc);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "uses " + pieces[pieces.length - 1];
    }
}