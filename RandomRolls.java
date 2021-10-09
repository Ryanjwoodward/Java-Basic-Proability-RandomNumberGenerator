//Author: Ryan Woodward
//Class: MAT-374 - Schoonover
//Probaility: Random Number Generator

package app;

import java.util.Random;
import java.util.ArrayList;

public class RandomRolls {

	public static void main(String[] args) {

		// Creates new ArrayList to hold all the randomly Generated values
		// ***Adjust the size of the arrayList from 20 to 1000 or 10000 for small and
		// large samples
		ArrayList<Integer> rdmList = new ArrayList<Integer>(1000);

		// Creates new Random object that is used to generate random values
		Random rdm = new Random();

		// this array is used to hold the quantity of each outcome that occurred in
		// generation
		// ***Adjust the size of the array from 20 to 1000 or 10000 for small and large
		// samples
		int[] outComeArr = new int[21];

		int idx = 0;// variable is for holding the indexes of the arrays.
		//-------------------------------------------------------------------------------
	
		// For Loop to add randomly generated numbers to the ArrayList object "rdmList"
		// adjust the condition to the size of the sample (1000, 10000).
		for (idx = 0; idx < 1000; idx++) {

			// generates a new random number between 1 and 20 then stores it in rdmNum
			int rdmNum = rdm.nextInt(20) + 1;

			// adds the previously generated random number 'rdmNum' to the ArrayList 'rdmList'
			rdmList.add(rdmNum);

		}

		// For-each loop sorts the array and determines the quantity of each outcome (1-20)
		for (Integer i : rdmList) {

			//stores the current value of the array 'i' in variable 'idx'
			idx = (i.intValue());

			//as the loop runs through each of the randomValues contained in the ArrayList
			//this adds 1 to represent an occurrence of that value.
			outComeArr[idx] += 1;

		}

		idx = 0;
		double probPercent = 0.0;
		//This for loop is used just to print the quantity of each of the outcomes of the d20
		for (int i : outComeArr) {
			
			//this expression is used in printing the probability in percent form
			probPercent = (double)i / rdmList.size();
			
			if (idx != 0)
				System.out.println("Dice Value: " + idx + "...Qty: " + i + "...P(X)frac: " + i + "/" + rdmList.size() + "...P(X)deci: " + probPercent);

			idx++;
		}

	}// main
}// RandomRolls
