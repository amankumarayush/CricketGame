package com.thoughtworks.thoughtwork_test;

import java.util.Random;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class DefenderTest extends TestCase {

	public DefenderTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(DefenderTest.class);
	}

	public void testGetRun() {
		Random random = new Random();
		Batsman batsman = new Batsman(random);
		assertEquals(true, (batsman.getRun() == 0 || batsman.getRun() == 1 || batsman.getRun() == 2 || batsman.getRun() == 3));
	}

}
