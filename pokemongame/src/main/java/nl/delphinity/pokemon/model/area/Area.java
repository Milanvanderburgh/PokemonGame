package nl.delphinity.pokemon.model.area;

import nl.delphinity.pokemon.model.general.Pokemon;
import nl.delphinity.pokemon.model.general.PokemonData;
import nl.delphinity.pokemon.model.general.PokemonType;
import nl.delphinity.pokemon.model.trainer.GymLeader;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Area implements Serializable{

    private final String name;
    private final Area nextArea;
    private final Random r = new Random();
    private final Pokecenter pokecenter;
    private List<PokemonType> containsPokemon = new ArrayList<>();
    private boolean isUnlocked;
    private GymLeader gymLeader;

    public Area(String name, GymLeader gymLeader, boolean isUnlocked, Area nextArea,
                Pokecenter pokecenter) {
        this.name = name;
        this.gymLeader = gymLeader;
        this.isUnlocked = isUnlocked;
        this.nextArea = nextArea;
        this.pokecenter = pokecenter;
    }

    public void setContainsPokemon(List<PokemonType> containsPokemon) {
        this.containsPokemon = containsPokemon;
    }

    public String getName() {
        return name;
    }

    public boolean isUnlocked() {
        return isUnlocked;
    }

    public void setUnlocked(boolean unlocked) {
        isUnlocked = unlocked;
    }

    public GymLeader getGymLeader() {
        return gymLeader;
    }

    public void setGymLeader(GymLeader gymLeader) {
        this.gymLeader = gymLeader;
    }

    public Area getNextArea() {
        return nextArea;
    }

    //TODO: US-PKM-O-6
    public Pokemon getRandomPokemonFromArea(int level) {
    	
    	List<PokemonData> Pokedata = Arrays.asList(PokemonData.values());
    	ArrayList<PokemonData> collect = new ArrayList<PokemonData>();
    	
    	for(PokemonData p: Pokedata) {
    		if(containsPokemon.contains(p.pokemonType)) {
    			collect.add(p);
    		}
    	}
    		
    		int randomPokemonIndex = r.nextInt(collect.size());
    		
    		PokemonData randomPokemondata = collect.get(randomPokemonIndex);
    		
    		Pokemon randomPokemon = new Pokemon(randomPokemondata);
    		
    		int lowestlevel = level - 5 > 0? level - 5: level;
    		int highestlevel = lowestlevel + level;
    		
    		int randomlevel = r.nextInt(highestlevel - lowestlevel);
    		
    		randomPokemon.setLevel(level = randomlevel);
    		randomPokemon.setMaxHp(randomPokemon.getLevel() * 10);
    		randomPokemon.setCurrentHp(randomPokemon.getMaxHp());
    	
    		return randomPokemon;
  }

    public Pokecenter getPokecenter() {
        return pokecenter;
    }
}
