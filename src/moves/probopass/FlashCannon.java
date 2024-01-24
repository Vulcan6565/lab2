package moves.probopass;

import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class FlashCannon extends SpecialMove {
    public FlashCannon(int power, int accuracy) {
        super(Type.STEEL, power, accuracy);
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "uses " + pieces[pieces.length - 1];
    }
}
