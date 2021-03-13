package com.thoughtworks.thoughtwork_test;

import java.util.Random;

public class CricketGame {

	int totalRuns, overs;
	Batsman batsman;
	Bowler bowler;
	Random random;

	CricketGame(int totalRuns, int overs, int batsmanType) {
		this.overs = overs;
		this.totalRuns = totalRuns;
		random = new Random();
		batsman = getBatsman(batsmanType);
		bowler = new Bowler(random);
	}

	private Batsman getBatsman(int batsmanType) {
		switch (batsmanType) {
		case 0:
			return new Batsman(random);
		case 1:
			return new Hitter(random);
		case 2:
			return new Defender(random);
		default:
			return null;
		}
	}

	public boolean hasWon(int input, int[] arr) {
		Random random = new Random();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(7);
			sum += arr[i];
			if (sum >= input)
				return true;
		}
		return false;
	}

	public boolean hasbowlerWon(int input, int[] arr) {
		Random random = new Random();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(7);
			int bowler = random.nextInt(7);
			if (arr[i] == bowler)
				return true;
			sum += arr[i];
			if (sum >= input)
				return false;
		}
		return false;
	}

	public String playGame() {
		for (int i = 0; i < overs * 6; i++) {
			if (batsman.getRun() == bowler.getRun()) {
				batsman.discardLastRun();
				return "Bowler";
			} else if (batsman.sum > totalRuns) {
				return "Batsman";
			}
		}
		return "Batsman";
	}
}
