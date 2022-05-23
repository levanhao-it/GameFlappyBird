package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;

import model.Loader;
import view.About;
import view.ImageGame;
import view.MenuGame;

public class ControllerAbout {
	About about;
	MenuGame menuGame;

	public ControllerAbout(MenuGame startGame) {
		// TODO Auto-generated constructor stub
		super();
		this.about = new About();
		this.menuGame= startGame;
		action();
	}

	private void action() {
		// TODO Auto-generated method stub
		for (ImageGame button : about.getListBtn()) {
			setButtonAction(button);
		}

	}

	private void setButtonAction(ImageGame button) {
		// TODO Auto-generated method stub

		switch (button.getNumButton()) {
			case 8:

				button.getBtn().addMouseListener(new MouseAdapter() {
					public void mouseEntered(MouseEvent e) {
						button.setBounds(415,515, 200, 65);

						button.getBtn().setIcon(new ImageIcon(Loader.loadImage("back1.png")));
					}

					public void mouseExited(MouseEvent e) {

						button.setBounds(420, 520, 175, 60);
						button.getBtn().setIcon(new ImageIcon(Loader.loadImage("back.png")));

					}

					public void mouseClicked(MouseEvent e) {
						new ControllerStart();
						about.setVisible(false);
						

					}

				});
				break;
		}
	}

}
