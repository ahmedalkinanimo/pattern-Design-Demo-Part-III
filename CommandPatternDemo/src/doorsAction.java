
public class doorsAction implements Action{
	private String doorStat;
	
	public doorsAction() {
		doorStat="un-Set";
	}
	
	public void execute(String doorNewStat) {
		if(doorStat.equalsIgnoreCase(doorNewStat))
			System.out.println("the door is already "+this.doorStat);	
		else
			this.setDoorStat(doorNewStat);
	}
	public String getDoorStat() {
		return doorStat;
	}
	public void setDoorStat(String doorStat) {
		this.doorStat = doorStat;
	}
	public String confirmMessage() {
		return "Doors are "+this.getDoorStat();
	}
}