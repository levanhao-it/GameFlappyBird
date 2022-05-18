package model;

import java.awt.Graphics2D;
import java.awt.Image;

public abstract class Sky {
	private int x,y, x1, y1;
	
	public abstract Image createBird();
	
	public Sky() {
		// TODO Auto-generated constructor stub
		x=0;
		y=0;
		x1= x+1024;
		y1=1;
		createBird();
	}
	
	public void draw(Graphics2D g2) {
		g2.drawImage(createBird(), x, y, null);
		g2.drawImage(createBird(),x1,y1,null);
	}
	
	public void update() {
		  x-= 2;
		  x1-= 2;
		  if(x1<0) {
			  x= x1+1024;
		  }
		  if(x<0) {
			  x1= x+1024;
		  }
	  }
	  public int getYGround() {
		  return y;
	  }

}
