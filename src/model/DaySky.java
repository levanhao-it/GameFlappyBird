package model;

import java.awt.Image;

public class DaySky extends Sky {

	@Override
	public Image createBird() {
		// TODO Auto-generated method stub
		return Loader.loadImage("sky.png");
	}

}
