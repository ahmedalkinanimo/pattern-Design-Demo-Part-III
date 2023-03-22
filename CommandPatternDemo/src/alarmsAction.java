
public class alarmsAction implements Action{
	private String alarmStat;
	
	public alarmsAction() {
		alarmStat="Un-set";
	}
	
	public void execute(String alarmNewStat) {
		if(alarmStat.equalsIgnoreCase(alarmNewStat)) {
			System.out.println("the Alarm is already "+this.alarmStat);
		}else {
			this.setAlarmStat(alarmNewStat);
		}
	}
	public String getAlarmStat() {
		return alarmStat;
	}
	public void setAlarmStat(String alarmNewStat) {
		this.alarmStat = alarmNewStat;
	}
	
	public String confirmMessage() {
		return "Alarms are "+this.getAlarmStat();
	}
}
