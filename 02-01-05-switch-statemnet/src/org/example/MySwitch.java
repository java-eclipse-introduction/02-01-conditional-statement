package org.example;

import java.util.Scanner;

public class MySwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// E5.01 Írjon programot, amely megállapítja a hét napját!

		// E5.02 Bekérjük, hogy a hét hanyaik napjáról van szó.
		System.out.println("Megállapítom, a hét napját szövegesen!");
		System.out.print("Adja meg, a hét hanyadik napjáról van szó: ");
		Scanner input=new Scanner(System.in);
		int dayNumber;
		dayNumber=input.nextInt();
		
		// E5.03 A számtól függõen történik az elágazás.
		switch (dayNumber) {	
			  case 1:
				  // E5.04 A hét elsõ napja. "1"-es eset.
				  System.out.println("Hétfõ");
				  break;
			  // E5.05 Többi eset.
			  case 2:
			    System.out.println("Kedd");
			    break;
			  case 3:
			    System.out.println("Szerda");
			    break;
			  case 4:
			    System.out.println("Csütörtök");
			    break;
			  case 5:
			    System.out.println("Péntek");
			    break;
			  case 6:
			    System.out.println("Szombat");
			    break;
			  case 7:
			    System.out.println("Vasárnap");
			    break;
		}
	}

}
