package atzimes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class metodes228 {
	public static Scanner scan = new Scanner(System.in);
	static DecimalFormat df = new DecimalFormat("0.#");

	
	public static int stSk() {
		int studSk;
        do {
            System.out.println("Cik studentiem aprekinat gala vertejumu");
            while(!scan.hasNextInt()) {
                System.out.println("Ievadiet skaitli!");
                scan.next();
            }
            studSk = scan.nextInt();
        } while(studSk < 1);
        return studSk;
    }	

	
	public static int krtSK() {
	int kritSk;
	do {
		System.out.println("Kads bus kriteriju skaits?");
		while(!scan.hasNextInt()) {
			System.out.println("Kads bus kriteriju skaits?");
			scan.next();
		}
		kritSk=scan.nextInt();
	} while(kritSk<1);
	return kritSk;
}
	
	public static void ievVards(String[] studenti) {
	  scan.nextLine();
	       for (int i = 0; i < studenti.length; i++) {
	           do {
	              System.out.println("Ievadi " + (i + 1) + ". studenta vardu");
	              studenti[i] = scan.nextLine().trim();
	          } while(!studenti[i].matches("^[\\p{L} ]+$"));
	      }
	 }
	
	public static void krNosUnSv(String[] kriteriji, int[] kriterijuSvars) { 
		for (int i=0; i<kriteriji.length;i++) {
			do {
				System.out.println("Ievadi "+(i+1)+". kriteriju");
				kriteriji[i] = scan.nextLine().trim();
			} while(!kriteriji[i].matches("^[\\p{L} ]+$"));
			
			System.out.println("Ievadi "+(i+1)+". kriterija svaru");
			while(!scan.hasNextInt()) {
				System.out.println("Ievadi "+(i+1)+". kriterija svaru");
				scan.next();
			}
			kriterijuSvars[i] = scan.nextInt();
			scan.nextLine();
		}
	}
	
	public static void ievVert(int[][] kritVertejums, String[] studenti, String[] kriteriji) {
		for (int i=0; i<kritVertejums.length; i++) {
			for (int j=0; j<kritVertejums[i].length; j++) {
				do {
					System.out.print("Ievadi "+studenti[i]+" vertejumu par kriteriju "+kriteriji[j]);
				while(!scan.hasNextInt()) {
					System.out.print("Ievadi "+studenti[i]+" vertejumu par kriteriju "+kriteriji[j]);
					scan.next();
				}
				kritVertejums[i][j] = scan.nextInt();
			} while(kritVertejums[i][j]<0 || kritVertejums[i][j]>10);
		}
	}
	}
	
	public static void rezult(double[] semVertejums, int[][] kritVertejums, String[] studenti, String[] kriteriji, int[] kriterijuSvars) {
		double rezult;
		for(int i=0; i<studenti.length; i++) {
			rezult = 0;
			for(int j=0; j<kriteriji.length; j++) {
				rezult += ((double)kriterijuSvars[j]/100) * kritVertejums[i][j];
			}
			semVertejums[i] = rezult;
		}
	}
	
	
	public static void rezIzv(double[] semVertejums, int[][] kritVertejums, String[] studenti, String[] kriteriji, int[] kriterijuSvars) {
		for (int i=0; i<studenti.length; i++) {
			for (int j=0; j<kriteriji.length; j++) {
				System.out.println("Studenta "+studenti[i]+
				" vertejums par kriteriju "+kriteriji[j]+" ir "+
				kritVertejums[i][j]+", kura svars ir "+kriterijuSvars[j]);
			}
			System.out.println("Semestra vertejums it "
			+df.format(semVertejums[i])+" balles\n");
		}
		scan.close();
	}
	
}
