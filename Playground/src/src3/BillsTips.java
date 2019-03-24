package src3;

public class BillsTips {

	public static void main(String[] args) {
		double bill = 100.36;
		double tip =(int) bill * 0.20; 
		double total = bill+ tip;
		
		// in other countries 
		double bill2 =100.36;
		bill2 +=5;
		double totalbill2 =bill2;
		
				
		System.out.println(total);
		System.out.println (totalbill2)	;

	}

}
