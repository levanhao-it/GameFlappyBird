package model;

import java.awt.Image;

public class NightSky extends Sky {

	@Override
	public Image createBird() {
		// TODO Auto-generated method stub
		return Loader.loadImage("nightSky.png");
	}

}
