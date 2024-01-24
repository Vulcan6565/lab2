package moves.vibrava;

import ru.ifmo.se.pokemon.*;

public class BugBuzz extends SpecialMove {
    public BugBuzz() {
        super(Type.BUG, 90, 100);
    }

    @Override
    protected double calcTypeEffect(Pokemon attacker, Pokemon defender) {
        Type attackerType = attacker.getTypes()[0];
        Type defenderType = defender.getTypes()[0];

        return 1.0;
    }

    @Override
    protected String describe() {
        String[] pieces = this.getClass().toString().split("\\.");
        return "uses " + pieces[pieces.length - 1] + " to attack with Bug Buzz!";
    }
}
