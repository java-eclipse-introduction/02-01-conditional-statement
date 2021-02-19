package org.example;

import java.util.Scanner;

public class MyIfThenElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// E3.01 Írjunk programot, amely megállpítja, hogy a szám páros vagy páratlan!
	
		// E3.02 Bekérjük a számot
		System.out.println("Megállapítom, hogy a szám páros-e vagy páratlan!");
		System.out.print("Adja meg a számot: ");
		Scanner input=new Scanner(System.in);
		int number;
		number=input.nextInt();
		
		// E3.03 megállapítjuk, hogy a szám kettõvel osztva milyen maradékot ad
		if (number%2==0) {
			// E3.04 Ha a maradék nulla, akkor a szám páros
			System.out.println(number+" páros szám.");
		}  
	}
}
