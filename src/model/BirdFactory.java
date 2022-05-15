package model;

import java.util.Random;

public class BirdFactory {
	public static Bird birdFactory() {
		Random sc= new Random();
		int random=sc.nextInt(4);
		switch (random) {
		case 1:
			return new Bird3();
		case 2:
			return new Bird2();
		case 3:
			return new Bird4();
		default:
			return new Bird1();
		}
	}


}
