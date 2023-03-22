/***
 * 
 * @author ahmedAlkinani
 * Build a smart home system that uses the Command Pattern to encapsulate different 
 * actions such as turning on/off lights, adjusting thermostat, locking/unlocking 
 * doors, and setting alarms.
 */

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smartHomeSystem HSS=new smartHomeSystem();
		
		alarmsAction alarm=new alarmsAction();
		String actionResult=HSS.set(alarm, "ON");
		System.out.println(actionResult);
		
		doorsAction doors=new doorsAction();
		actionResult=HSS.set(doors, "Open");
		System.out.println(actionResult);
		
		lightsAction lights=new lightsAction();
		actionResult=HSS.set(lights, "ON");
		System.out.println(actionResult);
		
		thermostatAction temperture=new thermostatAction();
		actionResult=HSS.set(temperture, "72");
		System.out.println(actionResult+"\nThanks");
	}

}