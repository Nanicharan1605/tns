package main;


import application.GSNormalAcc;
import application.GSPrimeAcc;

public class MainFactory {

	public static void main(String[] args) {
		GSPrimeAcc gsprime = new GSPrimeAcc(1,"shiva",900,true);
		GSNormalAcc gsnormal = new GSNormalAcc(2,"charan",350,36.3f);

		gsprime.bookProduct(30.4f);
		gsnormal.bookProduct(465.3f);
		
	}
}