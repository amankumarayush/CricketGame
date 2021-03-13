package com.thoughtworks.thoughtwork_test;

import java.util.Random;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Batsman type (0 or 1) \n 0 : Normal \n 1 : Hitter \n 2: Defender");
		
		
		int batsmanType = sc.nextInt();
		while (!ValidateInput.isValidbatsmanType(batsmanType)) {
			System.out.println("Enter Batsman type (0 or 1) \n 0 : Normal \n 1 : Hitter \n 2: Defender");
			sc = new Scanner(System.in);
			batsmanType = sc.nextInt();
		}
		
		System.out.println("Enter bumber of overs");
		int overs = sc.nextInt();

		System.out.println("Enter a number between 1 to " + overs * 6);
		int input = sc.nextInt();

		while (!ValidateInput.isValidScore(input, overs * 6)) {
			System.out.println("Enter a number between 1 to " + overs * 6);
			sc = new Scanner(System.in);
			input = sc.nextInt();
		}

		CricketGame game = new CricketGame(input, overs, batsmanType);

		System.out.println(game.playGame());
		
	}
}
