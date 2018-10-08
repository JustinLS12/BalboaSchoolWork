import java.util.*;
public class PokemonProject {
    static String n1;
	public static void main(String[] args) {
		battleStart();
		damage();
		statsTable("Alakazam", 40, 96, 52, 51, 121, 81, 107, "Thunder Wave", "Hidden Power", "Psycho Cut", "Recover");
	}
	public static void battleStart(){
		Scanner scan = new Scanner(System.in);
		System.out.println("Another trainer is issuing a challenge!");
		System.out.println("Which Pokemon do you choose?");
		String name = scan.nextLine();
		System.out.println("Zebstrika has appeared!");
		System.out.println("It's a Pokemon battle between " + name + " and Zebstrika.");
        n1 = name;
	}
	public static void damage(){
	    Scanner scan = new Scanner(System.in);
        System.out.println("Zebstrika used Thunderbolt!");
        System.out.println("Trainer, what are your " + n1 + "'s stats?");
		System.out.print("Level: ");
		double level = scan.nextDouble();
		System.out.print("Attack: ");
		double attack = scan.nextDouble();
		System.out.print("Defense: ");
		double defense = scan.nextDouble();
		System.out.print("Base: ");
		double base = scan.nextDouble();
		System.out.print("Stab: ");
		double stab = scan.nextDouble();
		System.out.print("HP: ");
		double HP = scan.nextDouble();
		double damage2 = ((((2 * level) + 10)/250) * (attack/defense) * base + 2) * (stab * Math.random());
		System.out.println(n1 + " sustained " + damage2 + " points of damage. HP are now " + (HP - damage2) + ".");
	}
	public static void statsTable(String n2, int level, int hp, int attack, int defense, int spatk, int spdef, int speed, String move1, String move2, String move3, String move4){
	    System.out.println("NAME " +n2);
	    System.out.println("LEVEL " +level);
	    System.out.println("------------------------------");
	    System.out.println("HP " +hp);
	    System.out.println("ATTACK " +attack);
	    System.out.println("DEFENSE " +defense);
	    System.out.println("SP. ATK " +spatk);
	    System.out.println("SP. DEF " +spdef);
	    System.out.println("SPEED " +speed);
        System.out.println("------------------------------");
        System.out.println("Moves Learned: " + move1 + ", " + move2 + ", " + move3 + ", " + move4);
	}
}
