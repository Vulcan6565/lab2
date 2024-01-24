package pokemons;

import moves.vibrava.BugBuzz;
import moves.flygon.Rest;
import moves.trapinch.RockSlide;
import moves.trapinch.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class flygon extends Pokemon {
    public flygon(String name, int level) {
        super(name, level);
        super.setType(Type.GROUND, Type.DRAGON);
        super.setStats(80, 100, 80, 80, 80, 100);

        Swagger swagger = new Swagger();
        RockSlide rockSlide = new RockSlide();
        BugBuzz bugBuzz = new BugBuzz();
        Rest rest = new Rest();

        super.setMove(swagger, rockSlide, bugBuzz, rest);
    }
}
