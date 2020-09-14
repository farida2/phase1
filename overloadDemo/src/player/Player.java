package player;

public class Player {
	private int id;
	private String name;
	private Team team; // has -a relationship
	
	public Player() {
		
	}

	public Player(int id, String name, Team team) {
		
		this.id = id;
		this.name = name;
		this.team = team;
	}
	
	public void printPlayer() {
		System.out.println("	The player Id : " +id);
		System.out.println("	The player name : " +name);
		team.printTeam();
		
	}
	
	
	

}
