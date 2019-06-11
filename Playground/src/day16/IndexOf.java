package day16;

public class IndexOf {

	public static void main(String[] args) {
		            //0123456789
		String str = "Ahmet Omer Al UygarDelParat NoMatter SeenUPDown ";
		System.out.println(str.indexOf("A"));         //first one at 0
		
		System.out.println(str.indexOf("A", 1));       // 
		
		System.out.println(str.indexOf("A", 11));
		
		System.out.println(str.indexOf("A", 12));
		System.out.println(str.substring(6, 10));  //omer
		
		
		int space1 = str.indexOf(" ");     //finding first space
		int space2 = str.indexOf(" "+1);
		int space3 = str.indexOf(" "+space2+1);
		
		

	}

}
