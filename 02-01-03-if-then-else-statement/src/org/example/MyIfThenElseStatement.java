package org.example;

import java.util.Scanner;

public class MyIfThenElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// E3.01 �rjunk programot, amely meg�llp�tja, hogy a sz�m p�ros vagy p�ratlan!
	
		// E3.02 Bek�rj�k a sz�mot
		System.out.println("Meg�llap�tom, hogy a sz�m p�ros-e vagy p�ratlan!");
		System.out.print("Adja meg a sz�mot: ");
		Scanner input=new Scanner(System.in);
		int number;
		number=input.nextInt();
		
		// E3.03 meg�llap�tjuk, hogy a sz�m kett�vel osztva milyen marad�kot ad
		if (number%2==0) {
			// E3.04 Ha a marad�k nulla, akkor a sz�m p�ros
			System.out.println(number+" p�ros sz�m.");
		} else {
			// E3.05 Hamis �g. Akkor fut le ez a k�d, ha a number%2==0 kifejez�s hamis.
			System.out.println(number+" p�ratlan sz�m.");
		}  
	}
}
