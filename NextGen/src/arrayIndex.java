
public class arrayIndex {

	public static void main(String[] args) {
		int[] values = { 3, 7, 2342 };

		System.out.println(values[2]);

		int[][] grid = { 
				{ 3, 5, 2343, }, 
				{ 2, 49999 }, 
				{ 1, 2, 3, 40000009 } 
			};
				System.out.println(grid[0][1]);
				System.out.println(grid[0][0]);
				System.out.println(grid[0][2]);
				System.out.println(grid[1][0]);
				System.out.println(grid[1][1]);
				System.out.println(grid[2][0]);
				System.out.println(grid[2][1]);
				System.out.println(grid[2][2]);
				System.out.println(grid[2][3]);
		
					
				for(int row=0; row<grid.length; row++) {
					for(int col=0; col < grid[row].length; col++) {
						System.out.print(grid[row][col] + "\t");
						
					}
					
					System.out.println();
					
}
	}
}	

