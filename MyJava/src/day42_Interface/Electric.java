package day42_Interface;

public interface Electric {

	public static final boolean HAS_BATTERIES = true;
	boolean HAS_BATTERIES2 = false; // already public static final
	
	public abstract void charge();
	void charge2(); //
	
}
