package view;

import java.awt.Insets;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import model.Loader;

public class ImageGame extends DecorateButton{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numButton;
	public static final int IMG_PLAY = 1;
	public static final int IMG_EXIT = 5;
	
	public ImageGame(AbstractButton c, int numButton) {
		super(c);

		this.numButton = numButton;
		setImage();
	}
	private void setImage() {
		switch (numButton) {
		case 1:
			button.setIcon(new ImageIcon(Loader.loadImage("play1.png")));
			button.setMargin(new Insets(0, 0, 0, 0));
			button.setBorderPainted(false);
			button.setContentAreaFilled(false);
			button.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
			
			setBounds(410, 370, 170, 60);
			break;

		case 5:
			button.setIcon(new ImageIcon(Loader.loadImage("exit.png")));
			button.setMargin(new Insets(0, 0, 0, 0));
			button.setBorderPainted(false);
			button.setContentAreaFilled(false);
			button.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
			setBounds(410, 510, 175, 60);

			break;
		}
		
	}
	public int getNumButton() {
		return numButton;
	}

}
