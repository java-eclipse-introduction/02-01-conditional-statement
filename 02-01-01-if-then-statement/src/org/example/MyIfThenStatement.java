package org.example;

import java.util.Scanner;

public class MyIfThenStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// E1.01 Egyágú elágazás
		//		Írjon programot, amely megállapítja, hogy a megadott szám páros-e!
		
		// E1.02 A feladatot kisebb részekre (szekvenciákra) bontjuk.
		//		 Megfogalmazzuk saját szavainkkal a kisebb részek algoritmusát. Ezt leprogramozzuk.

		// E1.03 Bekérjük a számot.		
		System.out.println("Megállapítom, hogy a szám páros-e!");
		System.out.print("Adja meg a számot: ");
		Scanner input=new Scanner(System.in);
		int number;
		number=input.nextInt();

		// E1.04 Eldöntjük, hogy a megadott szám páros-e.
		//		 Egy állítást fogalmazunk meg, amely vagy igaz vagy hamis.
		//		 "A szám kettõvel osztva nulla maradékot ad."
		if (number%2==0)		
	}

}
