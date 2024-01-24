package pokemons;

import moves.trapinch.RockSlide;
import moves.trapinch.Swagger;
import moves.vibrava.BugBuzz;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class vibrava extends Pokemon {
    public vibrava(String name, int level) {
        super(name, level);
        super.setType(Type.GROUND, Type.DRAGON);
        super.setStats(50, 70, 50, 50, 50, 70);

        Swagger swagger = new Swagger();
        RockSlide rockSlide = new RockSlide();
        BugBuzz bugBuzz = new BugBuzz();

        super.setMove(swagger, rockSlide, bugBuzz);
    }
}
