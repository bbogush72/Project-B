package day15;

public class SearchResult {

	public static void main(String[] args) {
	
		
		String str = "About 813,000,000 results (0.56 seconds)";
		//if(str.substring(0,5))
		//if(str.substring(0,5).equals("About") && str.contains("results"))
		
		
		if(str.indexOf("About")==0) {
			
			System.out.println("starts with About");
		}else {
			System.out.println("dont start with About");
		}
		
		if((str.indexOf("results")>=0)) {
			System.out.println("contains result");
		}

	}

}
