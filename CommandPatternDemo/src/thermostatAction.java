
public class thermostatAction implements Action{
	private double temperture;
	
	public thermostatAction() {
		temperture=0;
	}
	
	public void execute(String strTemp) {
		this.setTemperture(Double.parseDouble(strTemp));
	}
	
	public double getTemperture() {
		return temperture;
	}

	public void setTemperture(double temperture) {
		this.temperture = temperture;
	}
	
	public String confirmMessage() {
		return "Thermostat  is set to "+this.getTemperture()+" degree";
	}
}
