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
	}

}
