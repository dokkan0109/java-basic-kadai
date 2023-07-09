package kadai_014;

public class Car_chapter14 {
	private int gear;
	private int speed;

	public int getGear() {
		return this.gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void gearchange(int afterGear) {
		if (gear == 1) {
			speed = 10;
		} else if (gear == 2) {
			speed = 20;
		} else if (gear == 3) {
			speed = 30;
		} else if (gear == 4) {
			speed = 40;
		} else if (gear == 5) {
			speed = 50;
		} else if (gear >= 6) {
			speed = 10;
		}
	}

	public void run() {
		System.out.println(speed);
	}

}
