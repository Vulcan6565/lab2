package pokemons;

import moves.nosepass.DazzlingGleam;
import moves.probopass.FlashCannon;
import moves.nosepass.StoneEdge;
import moves.nosepass.ZapCannon;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class probopass extends Pokemon {
    public probopass(String name, int level) {
        super(name, level);
        super.setType(Type.ROCK);
        super.setStats(60, 55, 145, 75, 150, 40);

        DazzlingGleam dazzlingGleam = new DazzlingGleam(80, 100);
        ZapCannon zapCannon = new ZapCannon();
        StoneEdge stoneEdge = new StoneEdge(100, 80);
        FlashCannon flashCannon = new FlashCannon(80, 100);

        super.setMove(dazzlingGleam, zapCannon, stoneEdge, flashCannon);
    }
}