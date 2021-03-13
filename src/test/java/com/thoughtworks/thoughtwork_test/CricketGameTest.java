package com.thoughtworks.thoughtwork_test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class CricketGameTest extends TestCase {

	public CricketGameTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(CricketGameTest.class);
	}

	public void testGetBatsman() {
		CricketGame game = new CricketGame(12, 2, 0);
		assertEquals(true, game.playGame().equalsIgnoreCase("Batsman") || game.playGame().equalsIgnoreCase("Bowler"));
	}

}
