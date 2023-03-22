
public class lightsAction implements Action{
	private String lightStat;
	
	public lightsAction() {
		lightStat="Un-Set";
	}
	
	public void execute(String lightNewStat) {
		if(lightStat.equalsIgnoreCase(lightNewStat))
			System.out.println("the lights are already "+this.lightStat);
		else
			this.setLightStat(lightNewStat);
	}
	public String getLightStat() {
		return lightStat;
	}
	public void setLightStat(String lightStat) {
		this.lightStat = lightStat;
	}
	
	public String confirmMessage() {
		return "Lights are "+this.getLightStat();
	}
}

