package view;

import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import model.Loader;

public class StartGame extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ArrayList<ImageGame> listButton= new ArrayList<>();
	public StartGame() {
		// TODO Auto-generated constructor stub
		JLabel label=new JLabel();
		label.setIcon(new ImageIcon(Loader.loadImage("startgame.png")));
		ImageGame btnPlay, btnExit;
		
		label.add(btnPlay = new ImageGame(new JButton(),ImageGame.IMG_PLAY));
		label.add(btnExit = new ImageGame(new JButton(),ImageGame.IMG_EXIT));
		
		listButton.add(btnPlay);
		listButton.add(btnExit);
		
		add(label);
		setSize(1024, 576);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		}
	
	public ArrayList<ImageGame> getListBtn() {
		return listButton;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StartGame();

	}

}
