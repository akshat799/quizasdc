public class Task {
	private String teamMember;
	private String status;



	public void assignTo(String name){
		this.teamMember = name;
		System.out.println("Updated teamMember successfully!");
	}

	public void updateStatus(String status){
		this.status = status;
		System.out.println("Updated status successfully!");
	}

	public String getTeamMember() {
		return teamMember;
	}

	public String getStatus() {
		return status;
	}
}
