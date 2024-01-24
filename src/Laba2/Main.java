package Laba2;

import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import pokemons.*;

public class Main {
    // https://pokemondb.net/pokedex/kangaskhan
    // https://pokemondb.net/pokedex/nosepass
    // https://pokemondb.net/pokedex/probopass
    // https://pokemondb.net/pokedex/tranpich
    // https://pokemondb.net/pokedex/vibrava
    // https://pokemondb.net/pokedex/flygon
    public static void main(String[] args) {

        Battle b = new Battle();
        kangaskhan kamen = new kangaskhan ("kamen",1);
        nosepass čata = new nosepass("čata", 1);
        probopass zenga = new probopass("zenga", 1);
        trapinch jaje = new trapinch("jaje", 1);
        vibrava više = new vibrava("više", 1);
        flygon isma = new flygon("isma", 1);
        b.addAlly(kamen);
        b.addAlly(zenga);
        b.addAlly(više);
        b.addFoe(čata);
        b.addFoe(jaje);
        b.addFoe(isma);
        b.go();
    }

    public static boolean chance(double d){
        return d > Math.random();
    }
}