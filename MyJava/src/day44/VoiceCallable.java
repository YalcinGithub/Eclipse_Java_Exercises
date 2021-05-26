package day44;

public interface VoiceCallable {
	
	boolean CAN_CALL=true; // public static final automatically
	
	//abstract method
	void call(String contact); // public abstract automatically
	
	//static method
	public static void decline() {
		System.out.println("Call declined");
	};
	
	//default method
	public default void accept() {
		System.out.println("call accepted");
	};
	
}