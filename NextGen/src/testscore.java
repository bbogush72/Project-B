import java.util.Scanner;

class testscore {
    public static void main(String[] args) {

    	Scanner input  = new Scanner(System.in);
    	
        int testscore = 91;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Your Grade is = " + grade);
        
    }
        
			
			
    }