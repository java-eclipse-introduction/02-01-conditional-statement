package org.example;

import java.util.Scanner;

public class MyDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// E2.01 Boolean v�ltoz� haszn�lata
		//       Ha a debug v�ltoz� �rt�ke igaz, debug �zeneteket �rjunk a konzolra

		// E2.02 A boolen v�ltoz� vagy true vagy false �rt�ket vehet fel
		boolean debug=true;
		
		// E2.03 A boolen v�ltoz� true ki�rjuk a debug sz�veget, ha nem, nem �rjuk ki a debug sz�veget
		if (debug) {
			System.out.println("Bek�rj�k a sz�mot.");
		}
		
		// E2.04 Bek�rj�k a sz�mot		
		System.out.println("Meg�llap�tom, hogy a sz�m p�ros-e!");
		System.out.print("Adja meg a sz�mot: ");
		Scanner input=new Scanner(System.in);
		int number;
		number=input.nextInt();

		// E2.05 Eld�ntj�k, hogy a megadott sz�m p�ros-e.
		if (debug) {
			System.out.println("Eld�ntj�k, hogy a sz�m p�ros-e.");
		}
		if (number%2==0) {	
			// E2.06 Ha p�ros, ki�rjuk a megfelel� sz�veget.
			if (debug) {
				System.out.println("Ha p�ros, ki�rjuk az eredm�nyt.");
			}
			System.out.println(number+" p�ros sz�m.");
		}
		// E2.07 V�ge a programnak
		if (debug) {
			System.out.println("Program v�ge.");
		}		
	}
}
