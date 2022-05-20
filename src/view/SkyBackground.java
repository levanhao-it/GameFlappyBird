package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.ControllerStart;
import model.Model;;

public class SkyBackground extends JFrame {

	Font font = new Font("Times New Roman", Font.PLAIN, 60);
	Font normalFont = new Font("Georgia", Font.PLAIN, 20);
	Model flappyBird;

	public SkyBackground() {

		// jframe
		setSize(800, 600);
		setLayout(null);
		setTitle("Settings");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		// labelbackground

		ImageIcon icon1 = new ImageIcon("src/picture/nenUI.jpg");
		JLabel lb2 = new JLabel();
		lb2.setIcon(icon1);
		lb2.setBounds(0, 0, 800, 600);
		add(lb2);

		JLabel lb1 = new JLabel("SETTINGS", JLabel.CENTER);
		lb1.setForeground(Color.WHITE);
		lb1.setBounds(85, 20, 500, 60);
		lb1.setFont(font);
		lb2.add(lb1);

		ImageIcon icon2 = new ImageIcon("src/images/sky.png");
		JLabel lb3 = new JLabel();
		lb3.setIcon(icon2);
		lb3.setBounds(20, 100, 350, 300);
		lb2.add(lb3);

		ImageIcon icon3 = new ImageIcon("src/images/nightSky.png");
		JLabel lb4 = new JLabel();
		lb4.setIcon(icon3);
		lb4.setBounds(390, 100, 350, 300);
		lb2.add(lb4);
		// label 2
		JButton bt1 = new JButton("START");
		bt1.setBounds(70, 400, 200, 50);
		bt1.setBackground(Color.green);
		bt1.setForeground(Color.BLACK);
		bt1.setFont(normalFont);
		lb2.add(bt1);

		JButton bt3 = new JButton("Back");
		bt3.setBounds(300, 500, 200, 50);
		bt3.setBackground(Color.green);
		bt3.setForeground(Color.BLACK);
		bt3.setFont(normalFont);
		bt3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// new UI();
				new ControllerStart();
				setVisible(false);

			}
		});
		lb2.add(bt3);

		JButton bt2 = new JButton("START");
		bt2.setBounds(460, 400, 200, 50);
		bt2.setBackground(Color.green);
		bt2.setForeground(Color.BLACK);
		bt2.setFont(normalFont);
		lb2.add(bt2);

		bt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				flappyBird = new Model();
				flappyBird.setStyleSky("morning");
				flappyBird.getStyleSky();
				setVisible(false);

			}
		});

		bt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				flappyBird = new Model();
				flappyBird.setStyleSky("night");
				flappyBird.getStyleSky();
				setVisible(false);

			}
		});

	}

}
