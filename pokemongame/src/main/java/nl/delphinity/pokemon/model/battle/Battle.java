package nl.delphinity.pokemon.model.battle;

import nl.delphinity.pokemon.model.general.Game;
import nl.delphinity.pokemon.model.general.Pokemon;
import nl.delphinity.pokemon.model.menu.BattleMenu;
import nl.delphinity.pokemon.model.trainer.Trainer;

public class Battle {

    private final Trainer trainer;
    private Pokemon myPokemon;
    private final Pokemon enemy;
    private Pokemon winner;
    private boolean battleComplete = false;

    public Battle(Pokemon myPokemon, Pokemon enemy, Trainer trainer) {
        this.myPokemon = myPokemon;
        this.enemy = enemy;
        this.trainer = trainer;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public Pokemon getMyPokemon() {
        return myPokemon;
    }

    public void setMyPokemon(Pokemon myPokemon) {
        this.myPokemon = myPokemon;
    }

    public Pokemon getEnemy() {
        return enemy;
    }

    public void setBattleComplete(boolean battleComplete) {
        this.battleComplete = battleComplete;
    }

    public Pokemon getWinner() {
        return winner;
    }

    public void setWinner(Pokemon winner) {
        this.winner = winner;
    }

    public void start() {
        if(!trainer.canBattle()) {
            Game.gameOver("You have no Pokemon to fight with...");
        }
        System.out.println(myPokemon.getPokedata().name() +
                "(" + myPokemon.getLevel() + ")" +
                " VS " + enemy.getPokedata().name() +
                "(" + enemy.getLevel() + ")");
        while (!battleComplete) {
            BattleMenu.battleMenu(this);
        }
    }

    public void attackTurn(Attack attack) {
        myPokemon.attack(enemy, attack);
        if (checkBattleComplete()) {
            postBattle();
            return;
        }
        enemy.attack(myPokemon, enemy.getRandomAttack());
        if (checkBattleComplete()) {
            postBattle();
        }
    }

    private void postBattle() {
        System.out.println(winner.getPokedata().name() + " won!");

        //gain xp
        if (winner.equals(myPokemon)) {
            myPokemon.gainXp(enemy.getLevel() * enemy.getLevel());
        }
    }

    private boolean checkBattleComplete() {
        if(!trainer.canBattle()) {
            Game.gameOver("You have no Pokemon to battle with...");
        }
        if (battleComplete) {
            return true;
        }
        if (myPokemon.getCurrentHp() <= 0) {
            winner = enemy;
            battleComplete = true;
            return true;
        } else if (enemy.getCurrentHp() <= 0) {
            winner = myPokemon;
            battleComplete = true;
            return true;
        }
        return false;
    }
}
