package atzimes;

import java.util.Scanner;

public class metodes228 {
	public static void stSk(int studSk) {
		Scanner scan = new Scanner(System.in);
	do {
		System.out.println("Cik studentiem aprekinat gala vertejumu");
		while(!scan.hasNextInt()) {
			System.out.println("Cik studentiem aprekinat gala vertejumu?");
			scan.close();
		}
		studSk = scan.nextInt();
	} while(studSk<1);
	String[] studenti = new String[studSk];
	}
	
	
}
