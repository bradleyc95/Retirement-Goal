import java.util.*;
public class RetirementGoal1 {
	// Bradley Cox

	public static void main(String[] args) {
		
		int yearsUntilRetirement = 0;
		double savedAnually = 0;
		Scanner sc = new Scanner(System.in);
		
		while (yearsUntilRetirement < 1) {
			System.out.println("Please enter the number of years until your retirement (number must be greater than 0) >>");
			yearsUntilRetirement = sc.nextInt();
		}
		
		System.out.println("Please enter the amount of money you will save anually >>");
		savedAnually = sc.nextDouble();
		
		System.out.println("When you retire in " + yearsUntilRetirement + " years, you will have saved $" + (yearsUntilRetirement * savedAnually) + ".");

	}

}
