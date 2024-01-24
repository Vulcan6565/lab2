package pokemons;

import moves.trapinch.RockSlide;
import moves.trapinch.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class trapinch extends Pokemon {
    public trapinch(String name, int level) {
        super(name, level);
        super.setType(Type.GROUND);
        super.setStats(45, 100, 45, 45, 45, 10);

        Swagger swagger = new Swagger();
        RockSlide rockSlide = new RockSlide();

        super.setMove(swagger, rockSlide);
    }
}
