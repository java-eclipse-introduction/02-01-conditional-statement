package org.example;

import java.util.Scanner;

public class MyDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// E2.01 Boolean változó használata
		//       Ha a debug változó értéke igaz, debug üzeneteket írjunk a konzolra

		// E2.02 A boolen változó vagy true vagy false értéket vehet fel
		boolean debug=true;
		
		// E2.03 A boolen változó true kiírjuk a debug szöveget, ha nem, nem írjuk ki a debug szöveget
		if (debug) {
			System.out.println("Bekérjük a számot.");
		}
		
		// E2.04 Bekérjük a számot		
		System.out.println("Megállapítom, hogy a szám páros-e!");
		System.out.print("Adja meg a számot: ");
		Scanner input=new Scanner(System.in);
		int number;
		number=input.nextInt();

		// E2.05 Eldöntjük, hogy a megadott szám páros-e.
		if (debug) {
			System.out.println("Eldöntjük, hogy a szám páros-e.");
		}
		if (number%2==0) {	
			// E2.06 Ha páros, kiírjuk a megfelelõ szöveget.
			if (debug) {
				System.out.println("Ha páros, kiírjuk az eredményt.");
			}
			System.out.println(number+" páros szám.");
		}
	}
}
