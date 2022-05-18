package model;

import java.awt.Image;

public class DefaultSky extends Sky {

	@Override
	public Image createBird() {
		// TODO Auto-generated method stub
		return Loader.loadImage("backgroundgame.png");
	}

}
