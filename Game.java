package main;

import java.util.Scanner;

import monsters.GiantWurm;
import monsters.IMonster;
import monsters.Monster;

public class Game {

	// Keeps track of when we should abort main loop
	private boolean lostGame, wonGame;
	// Handles input
	private Scanner sc;
	// Keep track of current player
	private Player player;
	private static RandomHelper r = new RandomHelper();

	/**
	 * Creates a new Game. Start it by calling startGame()
	 */
	public Game() {
		sc = new Scanner(System.in);
	}
	
	public void startGame() {
		System.out.println("************************");
		System.out.println("* Welcome to The Game! *");
		System.out.println("************************");
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		// TODO create a new player using name,
		// and assign to our instance variable!
			Player player = new Player(name);
		
		System.out.println();
		
		int input = -1;
		while (!wonGame && !lostGame) {
			printMainMenu();
			System.out.print("> ");
			input = sc.nextInt();
			sc.nextLine();
			switch(input) {
				case 1:
					goAdventure(player);
					break;
				case 2:
					goCharacter(player);
					break;
				case 3:
					System.out.println("Bye!");
					lostGame = true;
					break;
			}
		}
		
		if (wonGame) {
			System.out.println("Congratulations! You won The Game!");
		}

		if (lostGame) {
			System.out.println("You have died - Game over!");
		}

	}
	
	/**
	 * Prints all menu options
	 */
	private void printMainMenu() {
		System.out.println("1. Go adventuring");
		System.out.println("2. Show details about your character");
		System.out.println("3. Exit game");
	}
	
	/**
	 * First menu option - fighting monsters
	 */
	private void goAdventure(Player player) {
		if (r.getBigChance()) {
			//generate random monster and user battle(monster)
			System.out.println("Monster!");

		} else {
			System.out.println("You enjoy a nice peaceful walk.");
		}

		/* TODO first menu option. May result in:
		 * 1. nothing
		 * 2. battle with random monster
		 * based on randomness
		 */
	}
	
	/**
	 * Initiates a battle between the player and the given monster
	 * @param monster - the monster to fight
	 */
	private void battle(Monster monster) {
		/* TODO
		 * simulate a battle.
		 * Must also handle all side effects, like death, leveling up to 10 and so on 
		 */
	}
	
	/**
	 * Second menu option - show details about character
	 */
	private void goCharacter(Player player) {
		// TODO print player
		System.out.println("***********");
		System.out.println("* Name: " + player.getName());
		System.out.println("* Level: " + player.getLevel());
		System.out.println("* Hp: " + player.getHp());
		System.out.println("* Exp: " + player.getExp());
		System.out.println("***********");
	}

	/**
	 * Pauses the game, waiting for an enter keypress
	 * Helper method
	 */
	private void pause() {
		// TODO
	}

	private boolean wonGame() {
		if (player.getLevel() >= 10)
			return true;
		return false;
	}

	private boolean lostGame() {
		if (player.isDead()) {
			return true;
		}
		return false;
	}
}
