package model;

import java.util.Random;

public class SkyFactory {
	public static Sky createSky() {
		Random sc = new Random();
		int random = sc.nextInt(3);
		switch (random) {
			case 1:
				return new DaySky();
			case 2:
				return new NightSky();
			default:
				return new DefaultSky();
		}
	}

}
