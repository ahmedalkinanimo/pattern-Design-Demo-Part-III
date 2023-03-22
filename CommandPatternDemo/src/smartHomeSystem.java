
public class smartHomeSystem {
	public String set(Action action, String parameter) {
		action.execute(parameter);
		return action.confirmMessage();
	}
}
