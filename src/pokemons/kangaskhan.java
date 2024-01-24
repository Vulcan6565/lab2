package pokemons;

import moves.kangaskhan.AerialAce;
import moves.kangaskhan.CometPunch;
import moves.kangaskhan.DoubleEdge;
import moves.kangaskhan.HammerArm;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class kangaskhan extends Pokemon {
    public kangaskhan(String name, int level) {
        super(name, level);
        super.setType(Type.NORMAL);
        super.setStats(105, 95, 80, 40, 80, 90);

        DoubleEdge doubleEdge = new DoubleEdge(120, 100);
        CometPunch cometPunch = new CometPunch(18, 85);
        HammerArm hammerArm= new HammerArm(100, 90);
        AerialAce aerialAce = new AerialAce(60, -1);  // Replace -1 with the appropriate value

        super.setMove(doubleEdge, cometPunch, hammerArm, aerialAce);
    }
}