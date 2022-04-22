package nl.delphinity.pokemon.model.area;

import nl.delphinity.pokemon.model.general.Pokemon;

import java.io.Serializable;
import java.util.List;

public class Pokecenter implements Serializable{

    private final String name;

    public Pokecenter(String name) {
        this.name = name;
    }

    //TODO: US-PKM-O-12
    public void healPokemon(List<Pokemon> pokemonToHeal) {
    	for(Pokemon p : pokemonToHeal) {
    		int maxHp = p.getMaxHp();
    		p.setCurrentHp(maxHp);
    }
}
}