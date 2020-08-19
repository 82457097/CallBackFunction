
public class Test {
	public static void main(String [] args) {
		Service service = new Service();
		service.addListener(new MyListener());

		service.setInfo("Hello callback!");
	}
}
