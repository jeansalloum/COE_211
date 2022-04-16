import java.util.Scanner;


public class Skeleton {
    public static void main(String[] args) {
       	Scanner scan = new Scanner(System.in);
		
		
		int Grades[]=new int[5];
		int add = 0;
	for(int idx = 1; idx <= 5; idx++) {
		System.out.println("Input the grade for assignment " + idx + ": ");
		int Assignments = scan.nextInt();
		Grades[idx-1] = Assignments;
	}
		
	System.out.println("Input the number of attended labs: ");
		int Attendances = scan.nextInt();
	System.out.println("Input the midterm grade: ");
		int Midterm = scan.nextInt();
	
	for(int i = 0; i < 5; i++) {
		add += Grades[i];
	}

	double Average = ((double)add/5) * 0.3;
	double LabPercentage = ((Attendances/7)* 100) * 0.05;
	double MidPercentage = Midterm * 0.3;
	
	System.out.println("Assignments (30%): " + Average);
	System.out.println("Attendance (5%): " + LabPercentage);
	System.out.println("Midterm (30%): " + MidPercentage);


    }
}