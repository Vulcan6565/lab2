package moves.nosepass;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class DazzlingGleam extends SpecialMove {
    public DazzlingGleam(int power, int accuracy) {
        super(Type.FAIRY, power, accuracy);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "uses " + pieces[pieces.length - 1];
    }
}
