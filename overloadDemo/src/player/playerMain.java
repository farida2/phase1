package player;

public class playerMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Team t1 = new Team(101, "FCB", "RONALD KOEMAN");
		Player p1 = new Player(1, "MESSI", t1);
		Player p2 = new Player(2, "suarez", t1);
		Player p3 = new Player(1, "Cristiano Ronaldo",new Team(202, "JUVENTUS","DUNNO"));
		
		System.out.println("The player one ");
		p1.printPlayer();
		
		System.out.println("\nThe player two ");
		p2.printPlayer();
		
		System.out.println("\nThe player three ");
		p3.printPlayer();
		
		
		

	}

}
