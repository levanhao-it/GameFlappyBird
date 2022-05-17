package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Score {
	int score;
	int bestScore = read();

	public Score() {
		super();
		this.score = 0;
		this.bestScore = read();
	}

	public void writeScore(int score) throws IOException {
		File file = new File("src/score.txt");
		PrintWriter print = new PrintWriter(file);
		print.print("");
		print.print(Integer.valueOf(bestScore));
		print.close();
	}

	public static int read() {
		int best = 0;
		try {
			Scanner sc = new Scanner(new File("src/score.txt"));
			best = sc.nextInt();
			sc.close();
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		return best;
	}

	public void addScore(int score) {
		if (score > bestScore) {
			bestScore = score;
			try {
				writeScore(bestScore);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public int getScore() {
		return score;
	}

	public int getBestScore() {
		return bestScore;
	}

}
