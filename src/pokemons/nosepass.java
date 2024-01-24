package pokemons;

import moves.nosepass.DazzlingGleam;
import moves.nosepass.StoneEdge;
import moves.nosepass.ZapCannon;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class nosepass extends Pokemon {
    public nosepass(String name, int level) {
        super(name, level);
        super.setType(Type.ROCK);
        super.setStats(30, 45, 135, 45, 90, 30);

        DazzlingGleam dazzlingGleam = new DazzlingGleam(80, 100);
        ZapCannon zapCannon = new ZapCannon();
        StoneEdge stoneEdge = new StoneEdge(100, 80);

        super.setMove(dazzlingGleam, zapCannon, stoneEdge);
    }
}
