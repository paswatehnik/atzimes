package atzimes;

public class main228 {

	public static void main(String[] args) {
		
		
		int studSk = metodes228.stSk();
		
		String[] studenti = new String[studSk];
		
	    int kritSk = metodes228.krtSK();
						
		String[] kriteriji = new String[kritSk];
		int[] kriterijuSvars = new int[kritSk];
		int[][] kritVertejums = new int[studSk][kritSk];
		double[] semVertejums = new double[studSk];

		metodes228.ievVards(studenti);
		
		metodes228.krNosUnSv(kriteriji, kriterijuSvars);
		
		metodes228.ievVert(kritVertejums, studenti, kriteriji);
		
		metodes228.rezult(semVertejums, kritVertejums, studenti, kriteriji, kriterijuSvars);
		
		metodes228.rezIzv(semVertejums, kritVertejums, studenti, kriteriji, kriterijuSvars);
	}

}
