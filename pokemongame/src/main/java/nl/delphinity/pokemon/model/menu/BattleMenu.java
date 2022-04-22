package nl.delphinity.pokemon.model.menu;

import nl.delphinity.pokemon.model.battle.Attack;
import nl.delphinity.pokemon.model.battle.Battle;
import nl.delphinity.pokemon.model.general.Pokemon;
import nl.delphinity.pokemon.model.item.ItemType;
import nl.delphinity.pokemon.model.trainer.Trainer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BattleMenu {

    private static final Scanner sc = new Scanner(System.in);

    public static void battleMenu(Battle battle) {
        int index = 1;
        for (BattleOptions option : BattleOptions.values()) {
            System.out.println(index + ") " + option);
            index++;
        }
        int choice = sc.nextInt();
        BattleOptions o = BattleOptions.values()[choice - 1];
        switch (o) {
            case FIGHT:
                if(battle.getTrainer().getActivePokemon().isKnockout()) {
                    System.out.println("Your " + battle.getTrainer().getActivePokemon() + " has fainted..");
                    pokemonMenu(battle);
                }
                Attack attack = fightMenu(battle);
                if (attack != null) {
                    battle.attackTurn(attack);
                }
                break;
            case POKEMON:
                pokemonMenu(battle);
                break;
            case ITEM:
                ItemType item = itemMenu(battle);
                if (item != null) {
                    battle.getTrainer().useItem(item, battle);
                }
                break;
            case RUN:
                battle.setBattleComplete(true);
                System.out.println("You ran away!");
                break;
            default:
                break;
        }
    }

    private static Attack fightMenu(Battle battle) {
        Pokemon pokemon = battle.getTrainer().getActivePokemon();
        int index = 1;
        for (Attack attack : pokemon.getAttacks()) {
            System.out.println(index + ") " + attack.getName());
            index++;
        }

        System.out.println(index + ") Back");
        int choice = sc.nextInt();
        if (choice != index) {
            return pokemon.getAttacks().get(choice - 1);
        } else {
            battleMenu(battle);
            return null;
        }
    }

    private static void pokemonMenu(Battle battle) {
        System.out.println("Choose a pokemon");
        Trainer trainer = battle.getTrainer();
        int index = 1;
        for (Pokemon pokemon : trainer.getPokemonCollection()) {
            if (!pokemon.isKnockout()) {
                System.out.println(index + ") " + pokemon.getPokedata().name());
                index++;
            }
        }
        System.out.println(index + ") Back");
        int choice = sc.nextInt();
        if (choice != index) {
            Pokemon selectedPokemon = trainer.getPokemonCollection().get(choice - 1);
            trainer.setActivePokemon(selectedPokemon);
            battle.setMyPokemon(selectedPokemon);
        }
        battleMenu(battle);
    }

    private static ItemType itemMenu(Battle battle) {
        HashMap<ItemType, Integer> items = battle.getTrainer().getInventory().getItems();
        Set<Map.Entry<ItemType, Integer>> entries = items.entrySet();
        int index = 1;
        for (Map.Entry<ItemType, Integer> entry : entries) {
            System.out.println(index + ") " + entry.getKey() + " " + entry.getValue());
            index++;
        }
        System.out.println(index + ") Back");
        int choice = sc.nextInt();
        if (choice != index) {
            return ItemType.values()[choice - 1];
        } else {
            battleMenu(battle);
            return null;
        }
    }
}
