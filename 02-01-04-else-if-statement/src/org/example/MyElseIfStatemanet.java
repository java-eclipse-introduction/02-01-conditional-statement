package org.example;

import java.util.Scanner;

public class MyElseIfStatemanet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// E4.01 Írjon programot, amely megállapítja, hogy a szám pozitív, negatív vagy nulla
		
		// E4.02 Bekérjük a számot
		System.out.println("Megállapítom, hogy a szám pozitív, nulla, vagy negatív.");
		System.out.print("Adja meg a számot: ");
		Scanner input=new Scanner(System.in);
		int number;
		number=input.nextInt();

		// E4.03 Eldönjük, hogy a szám nullánál nagyobb, kisebb, vagy egyenlõ
		if (number>0) {
			// E4.04 A szám nullánál nagyobb
			System.out.print("A szám pozitív.");			
		}
	}
}
