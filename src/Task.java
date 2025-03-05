public class Task {
	private String teamMember;
	private String status;

	public void assignTo(String name){
		this.teamMember = name;
	}

	public void updateStatus(String status){
		this.status = status;
	}

	public String getTeamMember() {
		return teamMember;
	}

	public String getStatus() {
		return status;
	}
}
