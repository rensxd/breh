
public class MainClass {

	public static void main(String[] args) {
		
		AppMenu appmenu = new AppMenu();
		
		PhoneApp app1 = new PhoneApp("RensApp", 12, 1.02);
		PhoneApp app2 = new PhoneApp("RensApp", 12, 1.01);
		PhoneApp app3 = new PhoneApp("Google", 22, 1.01);
		
		appmenu.addApp(app1);
		appmenu.addApp(app2);
		appmenu.addApp(app3);
		
		appmenu.printAppMenu();
	}

}
