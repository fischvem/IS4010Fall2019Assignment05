/*
 * IS4010 Fall 2019
 * Assignment 05
 * Emily Fischvogt
 * fischvem@mail.uc.edu
 */
package footballFun;

public class FootballFun {

	public static void main(String[] args) {
		int correctCount = 0;
		if (translateScore(2).equals("safety") == true) { correctCount++;}
		if (translateScore(3).equals("field goal") == true) { correctCount++;}
		if (translateScore(6).equals("touchdown") == true) { correctCount++;}
		if (translateScore(7).equals("touchdown and extra point") == true) { correctCount++;}
		if (translateScore(8).equals("touchdown and 2-point conversion") == true) { correctCount++;}
		if (translateScore(-1).equals("") == true) { correctCount++;}
		if (translateScore(1).equals("invalid") == true) { correctCount++;}
		if (translateScore(10).equals("you must be playing Quidditch ") == true) { correctCount++;}
		
		if (correctCount == 8) {
			System.out.println("All tests passed");
		} else {
			System.out.println("At least one test failed"); 
		}
	}
	/**
	 * 
	 * Returning string that describes score number input
	 * @param score
	 * @return describes the score
	 */
	public static String translateScore (int score) {
		
		if (score == 2) //if the integer score equals 2, then the string describes the score as safety
			return ("safety");
		else if (score == 3) //if the integer score equals 3, then the string describes the score as field goal
			return ("field goal");
		else if (score == 6) //if the integer score equals 6, then the string describes the score as touchdown
			return ("touchdown");
		else if (score == 7) //if the integer score equals 7, then the string describes the score as touchdown and extra point
			return ("touchdown and extra point");
		else if (score == 8) //if the integer score equals 8, then the string describes the score as touchdown and 2-point conversion
			return ("touchdown and 2-point conversion");
		else if (score == -1) //if the integer score equals -1, then the string describes the score as a blank space
			return ("");
		else if (score == 1) //if the integer score equals 1, then the string describes the score as invalid
			return ("invalid");
		else if (score == 10) //if the integer score equals 10, then the string describes the score as you must be playing Quidditch
			return ("you must be playing Quidditch ");
		//Checking strings to see if they are exactly the same object
		return "";
	}
}
