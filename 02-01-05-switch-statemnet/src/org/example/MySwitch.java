package org.example;

import java.util.Scanner;

public class MySwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// E5.01 �rjon programot, amely meg�llap�tja a h�t napj�t!

		// E5.02 Bek�rj�k, hogy a h�t hanyaik napj�r�l van sz�.
		System.out.println("Meg�llap�tom, a h�t napj�t sz�vegesen!");
		System.out.print("Adja meg, a h�t hanyadik napj�r�l van sz�: ");
		Scanner input=new Scanner(System.in);
		int dayNumber;
		dayNumber=input.nextInt();
		
		// E5.03 A sz�mt�l f�gg�en t�rt�nik az el�gaz�s.
		switch (dayNumber) {	
			  case 1:
				  // E5.04 A h�t els� napja. "1"-es eset.
				  System.out.println("H�tf�");
				  break;
			  // E5.05 T�bbi eset.
			  case 2:
			    System.out.println("Kedd");
			    break;
			  case 3:
			    System.out.println("Szerda");
			    break;
			  case 4:
			    System.out.println("Cs�t�rt�k");
			    break;
			  case 5:
			    System.out.println("P�ntek");
			    break;
			  case 6:
			    System.out.println("Szombat");
			    break;
			  case 7:
			    System.out.println("Vas�rnap");
			    break;
			  // E5.06 Alap�rtelmezett eset
			  default:
				   System.out.print("Ilyen sorsz�m� nap nincs a h�ten!");
		}
	}

}
