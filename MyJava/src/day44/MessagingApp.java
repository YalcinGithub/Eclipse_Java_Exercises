package day44;

public abstract class MessagingApp {

	public String name;
	protected boolean isFree;
	boolean allOSCompatible;
	private static int count;
	public static final String APP_TYPE = "Messenger";
	
	public MessagingApp() {
		System.out.println("No-arg constructer run here");
	}
	
	abstract void sendMessage (String msg);
	
	void launch() {
		System.out.println("app is launched");
	}

	static void close() {
		System.out.println("app is closing");
	}
	
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		MessagingApp.count = count;
	}	

}
