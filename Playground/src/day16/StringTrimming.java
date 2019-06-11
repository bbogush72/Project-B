package day16;

public class StringTrimming {

	public static void main(String[] args) {
		
		
		  String str = "Goo Java Heroes";
		  System.out.println(str);
	        
	       String a=str.trim();
	        
	        int b=a.indexOf(" ")+1;
	        
	        System.out.println(b);
	        
	       System.out.println(a.substring(b, a.length()));
	       
	       
	       
	       
	       String str1 = "         GOO  JAVA  SPARTAN          ";
	        
	        System.out.println(str1);
	        
	        System.out.println(str1.trim());
	        
	        System.out.println(str1.indexOf("JAVA"));
	        
	        System.out.println(str1.substring(14));
	}

}
