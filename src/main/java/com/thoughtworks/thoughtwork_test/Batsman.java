package com.thoughtworks.thoughtwork_test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Batsman {

	Random random;
	int sum = 0;
	// int overs;
	// int totalRuns;
	List<Integer> runs;

	Batsman(Random random) {
		this.random = random;
		// this.overs = overs;
		// this.totalRuns = totalRuns;
		runs = new ArrayList<Integer>();
	}

	public int getRun() {
		runs.add(random.nextInt(7));
		sum += runs.get(runs.size() - 1);
		return runs.get(runs.size() - 1);
	}

	public int discardLastRun() {
		int lastRun = 0;
		if (runs.size() > 0) {
			lastRun = runs.remove(runs.size() - 1);
			sum -= lastRun;
		}
		return lastRun;
	}
}
