package com.thoughtworks.thoughtwork_test;

import java.util.Random;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class BatsmanTest extends TestCase {

	public BatsmanTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(BatsmanTest.class);
	}

	public void testGetRun() {
		Random random = new Random();
		Batsman batsman = new Batsman(random);
		assertEquals(true, batsman.getRun() <= 6);
	}

}
