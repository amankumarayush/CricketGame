package com.thoughtworks.thoughtwork_test;

import java.util.Random;

public class Defender extends Batsman {

	int arr[] = { 0, 1, 2, 3 };

	Defender(Random random) {
		super(random);
	}

	public int getRun() {
		runs.add(arr[random.nextInt(4)]);
		sum += runs.get(runs.size() - 1);
		return runs.get(runs.size() - 1);
	}
}
