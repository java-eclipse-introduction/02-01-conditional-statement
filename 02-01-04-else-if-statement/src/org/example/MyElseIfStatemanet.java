package org.example;

import java.util.Scanner;

public class MyElseIfStatemanet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// E4.01 �rjon programot, amely meg�llap�tja, hogy a sz�m pozit�v, negat�v vagy nulla
		
		// E4.02 Bek�rj�k a sz�mot
		System.out.println("Meg�llap�tom, hogy a sz�m pozit�v, nulla, vagy negat�v.");
		System.out.print("Adja meg a sz�mot: ");
		Scanner input=new Scanner(System.in);
		int number;
		number=input.nextInt();

		// E4.03 Eld�nj�k, hogy a sz�m null�n�l nagyobb, kisebb, vagy egyenl�
		if (number>0) {
			// E4.04 A sz�m null�n�l nagyobb
			System.out.print("A sz�m pozit�v.");			
		} else if (number<0) {
			// E4.05 A sz�m null�n�l kisebb
			System.out.print("A sz�m negat�v.");
		} else {
			// E4.06 M�r csak egy eset maradt (else), a sz�m nulla
			System.out.print("A sz�m nulla.");
		}
	}
}
