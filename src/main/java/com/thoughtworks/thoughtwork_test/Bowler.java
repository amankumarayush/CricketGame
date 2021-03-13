package com.thoughtworks.thoughtwork_test;

import java.util.Random;

public class Bowler {

	Random random;
	
	Bowler(Random random){
		this.random = random;
	}
	
	public int getRun(){
		return random.nextInt(7);
	}

}
