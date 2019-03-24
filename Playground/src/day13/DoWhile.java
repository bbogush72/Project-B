package day13;

public class DoWhile {

	public static void main(String[] args) {
	
		int i = 10;
		
		do
		{
		   System.out.println(i);
		   i--;
		   
		} while(i>0);
		//--------------------------------------------------------------
		
		
		int num[]={2,11,45,9};
        //i starts with 0 as array index starts with 0
        int n=0;
        do{
             System.out.println(num[n]);
             n++;
             
        }while(n<4);
		
	}

}
