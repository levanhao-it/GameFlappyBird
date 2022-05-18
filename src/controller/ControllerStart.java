package controller;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import model.Loader;
import view.ImageGame;
import view.StartGame;

public class ControllerStart {
	StartGame view;

	public ControllerStart() {
		// TODO Auto-generated constructor stub
		super();
		this.view = new StartGame();
		action();
	}

	private void action() {
		// TODO Auto-generated method stub
		for (ImageGame button : view.getListBtn()) {
			setButtonAction(button);
		}

	}

	private void setButtonAction(ImageGame button) {
		// TODO Auto-generated method stub
		switch (button.getNumButton()) {
		case 1:

			button.getBtn().addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					button.setBounds(405, 365, 198, 68);
					button.getBtn().setIcon(new ImageIcon(Loader.loadImage("play11.png")));
				}

				public void mouseExited(MouseEvent e) {

					button.setBounds(410, 370, 170, 60);
					button.getBtn().setIcon(new ImageIcon(Loader.loadImage("play1.png")));

				}

				public void mouseClicked(MouseEvent e) {
					new ControllerGame().startGame();
					;
					view.setVisible(false);

				}

			});
			break;

		case 5:
			button.getBtn().addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e) {
					button.setBounds(405, 505, 198, 68);
					button.getBtn().setIcon(new ImageIcon(Loader.loadImage("exit1.png")));
				}

				public void mouseExited(MouseEvent e) {

					button.setBounds(410, 510, 175, 60);
					button.getBtn().setIcon(new ImageIcon(Loader.loadImage("exit.png")));

				}

				public void mouseClicked(MouseEvent e) {

					if (button.getBtn() == e.getSource()) {

						int kq = JOptionPane.showConfirmDialog(null, "Do you want to exit the game?", "Confirm",
								JOptionPane.YES_NO_OPTION);
						if (kq == 0) {
							System.exit(0);
						}
					}

				}

			});
			break;
		}
	}

}
