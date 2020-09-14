package player;

public class Team {
	private int teamId;
	private String teamName;
	private String coachName;
	
	public Team() {
		
	}
	

	

	public Team(int teamId, String teamName, String coachName) {
		
		this.teamId = teamId;
		this.teamName = teamName;
		this.coachName = coachName;
	}
	
	public void printTeam() {
		System.out.println("The team details :");
		System.out.println("	The team Id : " +teamId);
		System.out.println("	The team name : " +teamName);
		System.out.println("	The coach is  : " +coachName);
		
		
	}
	
	

}
