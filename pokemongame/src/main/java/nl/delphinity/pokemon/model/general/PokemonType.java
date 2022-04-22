package nl.delphinity.pokemon.model.general;

import nl.delphinity.pokemon.model.battle.Attack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum PokemonType {

    BUG,
    DRAGON,
    ICE,
    FIGHTING,
    FIRE,
    FLYING,
    GRASS,
    GHOST,
    GROUND,
    ELECTRIC,
    NORMAL,
    POISON,
    PSYCHIC,
    ROCK,
    WATER;

    static {
        BUG.strongAgainst.addAll(Arrays.asList(GRASS, PSYCHIC));
        DRAGON.strongAgainst.addAll(Collections.singletonList(DRAGON));
        ICE.strongAgainst.addAll(Arrays.asList(FLYING, GROUND, GRASS, DRAGON));
        FIGHTING.strongAgainst.addAll(Arrays.asList(NORMAL, ROCK, ICE));
        GRASS.strongAgainst.addAll(Arrays.asList(GROUND, ROCK, WATER));
        GHOST.strongAgainst.addAll(Arrays.asList(GHOST, PSYCHIC));
        GROUND.strongAgainst.addAll(Arrays.asList(POISON, ROCK, FIRE, ELECTRIC));
        ELECTRIC.strongAgainst.addAll(Arrays.asList(FLYING, WATER));
        NORMAL.strongAgainst.addAll(Collections.emptyList());
        POISON.strongAgainst.addAll(Collections.singletonList(GRASS));
        PSYCHIC.strongAgainst.addAll(Arrays.asList(FIGHTING, POISON));
        ROCK.strongAgainst.addAll(Arrays.asList(FLYING, BUG, FIRE, ICE));
        WATER.strongAgainst.addAll(Arrays.asList(GROUND, ROCK, FIRE));

        BUG.weakAgainst.addAll(Arrays.asList(FIGHTING, FLYING, POISON, GHOST, FIRE));
        DRAGON.weakAgainst.addAll(Collections.emptyList());
        ICE.weakAgainst.addAll(Arrays.asList(FIRE, WATER, ICE));
        FIGHTING.weakAgainst.addAll(Arrays.asList(FLYING, POISON, PSYCHIC, BUG));
        GRASS.weakAgainst.addAll(Arrays.asList(FLYING, POISON, BUG, FIRE, GRASS, DRAGON));
        GHOST.weakAgainst.addAll(Collections.singletonList(NORMAL));
        GROUND.weakAgainst.addAll(Arrays.asList(FLYING, BUG, GRASS));
        ELECTRIC.weakAgainst.addAll(Arrays.asList(GROUND, GRASS, ELECTRIC, DRAGON));
        NORMAL.weakAgainst.addAll(Arrays.asList(ROCK, GHOST));
        POISON.weakAgainst.addAll(Arrays.asList(POISON, GROUND, ROCK, GHOST));
        PSYCHIC.weakAgainst.addAll(Collections.singletonList(PSYCHIC));
        ROCK.weakAgainst.addAll(Arrays.asList(FIGHTING, GROUND));
        WATER.weakAgainst.addAll(Arrays.asList(WATER, GRASS, DRAGON));

        BUG.typeAttacks.addAll(Arrays.asList(
                new Attack("Bug Bite", 10, 100),
                new Attack("Pin Missile", 25, 100),
                new Attack("Twineedle", 25, 100),
                new Attack("Leech Life", 80, 100)));

        NORMAL.typeAttacks.addAll(Arrays.asList(
                new Attack("Quick attack", 40, 100),
                new Attack("Fury attack", 15, 100)));

        FIRE.typeAttacks.addAll(Arrays.asList(
                new Attack("Flamethrower", 90, 100),
                new Attack("Fire Spin", 35, 100),
                new Attack("Fire Blast", 110, 100),
                new Attack("Ember", 40, 100)));

        WATER.typeAttacks.addAll(Arrays.asList(
                new Attack("Bubble", 40, 100),
                new Attack("Hydro Pump", 110, 100),
                new Attack("Water Gun", 40, 100)));

        GRASS.typeAttacks.addAll(Arrays.asList(
                new Attack("Petal Dance", 120, 100),
                new Attack("Vine Whip", 45, 100),
                new Attack("Solar Beam", 120, 100)));

        ROCK.typeAttacks.addAll(Arrays.asList(
                new Attack("Rock Slide", 75, 100),
                new Attack("Rock Throw", 50, 100)));

        GROUND.typeAttacks.addAll(Arrays.asList(
                new Attack("Dig", 80, 100),
                new Attack("Earthquake", 100, 100),
                new Attack("Bone Club", 65, 100)));

        ICE.typeAttacks.addAll(Arrays.asList(
                new Attack("Blizzard", 110, 100),
                new Attack("Ice Beam", 90, 100),
                new Attack("Ice Punch", 75, 100)));

        ELECTRIC.typeAttacks.addAll(Arrays.asList(
                new Attack("Thunder", 110, 100),
                new Attack("Thunderbolt", 90, 100),
                new Attack("Thunder Punch", 75, 100),
                new Attack("Thunder Shock", 40, 100)));

        PSYCHIC.typeAttacks.addAll(Arrays.asList(
                new Attack("Confusion", 50, 100),
                new Attack("Psybeam", 65, 100),
                new Attack("Psychic", 90, 100)));

        DRAGON.typeAttacks.addAll(Collections.singletonList(
                new Attack("Dragon Rage", 130, 100)));

        POISON.typeAttacks.addAll(Arrays.asList(
                new Attack("Acid", 40, 100),
                new Attack("Poison Sting", 15, 100),
                new Attack("Sludge", 65, 100)));

        FLYING.typeAttacks.addAll(Arrays.asList(
                new Attack("Gust", 40, 100),
                new Attack("Sky Attack", 140, 100),
                new Attack("Wing Attack", 60, 100)));

        FIGHTING.typeAttacks.addAll(Arrays.asList(
                new Attack("Double Kick", 30, 100),
                new Attack("Submission", 80, 100),
                new Attack("High Jump Kick", 130, 100)));

        GHOST.typeAttacks.addAll(Arrays.asList(
                new Attack("Lick", 30, 100),
                new Attack("Night Shade", 65, 100)));
    }

    public final List<PokemonType> weakAgainst = new ArrayList<>();
    public final List<PokemonType> strongAgainst = new ArrayList<>();
    public final List<Attack> typeAttacks = new ArrayList<>();
}
