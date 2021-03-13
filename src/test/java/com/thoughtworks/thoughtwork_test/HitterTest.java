package com.thoughtworks.thoughtwork_test;

import java.util.Random;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class HitterTest extends TestCase {

	public HitterTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(HitterTest.class);
	}

	public void testGetRun() {
		Random random = new Random();
		Batsman batsman = new Batsman(random);
		assertEquals(true, (batsman.getRun() == 0 || batsman.getRun() == 4 || batsman.getRun() == 6));
	}

}
