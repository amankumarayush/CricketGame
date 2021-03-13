package com.thoughtworks.thoughtwork_test;

import java.util.Random;

public class Hitter extends Batsman {

	int arr[] = { 0, 4, 6 };

	Hitter(Random random) {
		super(random);
	}

	public int getRun() {
		runs.add(arr[random.nextInt(3)]);
		sum += runs.get(runs.size() - 1);
		return runs.get(runs.size() - 1);
	}
}
