package repl.it;

public class r225_TV {
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	String brand = "undefined";

	public r225_TV() {
		System.out.println("Creating TV object using no Args- constructor");
	}

	public r225_TV(String brand) {
		this.brand = brand;
		System.out.println("Creating TV object using 1 arg - constructor");
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if (!on || channel < 1 || channel > 120) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		} else {
			this.channel = channel;
		}
	}

	public int getVolumeLevel() {
		return volumeLevel;
	}

	public void setVolumeLevel(int volumeLevel) {
		if (!on || volumeLevel < 1 || volumeLevel > 7) {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		} else {
			this.volumeLevel = volumeLevel;
		}

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void channelUp() {

		if (!on || channel == 120) {
			System.out.println("ERROR: TV is either OFF or invalid Channel");
		} else {
			channel += 1;
		}

	}

	public void channelDown() {
		channel -= 1;
	}

	public void volumeUp() {
		if (!on || volumeLevel == 7) {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		} else {
			volumeLevel += 1;
		}
	}

	public void volumeDown() {
		if (!on || volumeLevel == 1) {
			System.out.println("ERROR: TV is either OFF or invalid Volume level");
		} else {
			volumeLevel -= 1;
		}
	}

	public boolean isOn() {
		return on;
	}

	public void turnOn() {
		if (on) {
			System.out.println("TV is already ON");
		} else {
			on = true;
		}

	}

	public void turnOff() {
		if (!on) {
			System.out.println("TV is already OFF");
		} else {
			on = false;
		}
	}
}

//+ Generate getters/setters for volumeLevel (getVolumeLevel/setVolumeLevel), channel (getChannel/setChannel) and brand (getBrand/setBrand) instance variables.
//
//+ Declare methods channelUp() to increase variable channel by one, and channelDown() to decrease variable channel by one.
//
//+ Create isOn() method that will check tv status. (getter for on instance variable)
//      It should return the value of on instance variable as is.
//
//+ Declare methods volumeUp() to increase variable volume by one, and volumeDown() to decrease variable volume by one.
//
//+Create isOn(), turnOn() and turnOff() methods for "on" instance variable. 
//+If the tv is already on, 
//      no need to turn it on again, display the message: "TV is already ON". 
//+If the tv is already off, 
//    then no need to turn it off again, display the message: "TV is already OFF". 
//
//+The value of a variable channel cannot be negative or zero, and cannot be higher than 120. If the user will try to set an invalid channel, 
//display the message: "ERROR: TV is either OFF or invalid Channel".
//
//+Volume can be only in the range between 1 and 7. 
//+You may change volume only if TV is on. 
//+If it was off, display a message: "ERROR: TV is either OFF or invalid Volume level". 