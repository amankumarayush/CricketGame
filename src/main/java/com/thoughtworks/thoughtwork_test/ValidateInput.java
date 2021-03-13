package com.thoughtworks.thoughtwork_test;

public class ValidateInput {
	
	public static boolean isValidScore(int input, int overs){
		if(input < 1)
			return false;
		if(input > (overs * 6))
			return false;
		return true;
	}

	public static boolean isValidbatsmanType(int batsmanType) {
		if(batsmanType == 0 || batsmanType == 1 || batsmanType == 2)
			return true;
		return false;
	}

}
