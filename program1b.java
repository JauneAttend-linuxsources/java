package project1;
import java.util.Scanner;
public class Program1bAllarassemJonathan {

	public static void main(String[] args) {
		
		// Declaration and initialization
		
		double money_total=0;
		double money_rem=0;
		double so_sec=0;
		double fed_inc=0;
		double state_tx=0;
	    double union=10;
	    double health_ins=0;
		
		int hours=0, dependants=0;
		
		
		
		
	    // gathering information
		
		Scanner scan = new Scanner(System.in);
			
		System.out.println("How many hours do you work?");
		hours = scan.nextInt();
		
		System.out.println("How many dependents do you have?");
		dependants= scan.nextInt();
		
		
		
		// Conditions
		
	    if(hours>40) {
	    	money_total = 16.2 * 40 + 16.2*1.5*(hours-40);
	    }else {
	    	money_total= 16.2 * hours;
	    }
		if(dependants>=3) {
			health_ins=35;
		}
		
		// Calculations
		
		
		so_sec = money_total*0.06;
		fed_inc = money_total*0.14;
		state_tx = money_total*0.05;
		money_rem=money_total-(so_sec+ fed_inc + state_tx + union + health_ins);
		
		
		
		//Output
		System.out.println("\n------------------------------------------");
		System.out.printf("\n\t\tReport\n");
		System.out.println("------------------------------------------\n\n");
		System.out.printf("Gross Pay : $%.2f\n\n\n",money_total);
		System.out.printf("\t\tDepenses\n");
		System.out.println("------------------------------------------\n\n");
		System.out.printf("Social security : $%.2f\n",so_sec);
		System.out.printf("Federal income : $%.2f\n",fed_inc);
		System.out.printf("State Income Tax : $%.2f\n",state_tx );
		System.out.printf("Union : $%.2f\n",union);
		if(health_ins!=0) {
		System.out.printf("Health insurance : $%.2f\n",health_ins );
		}
		System.out.printf("\n\n\t\tTake-home Pay\n");
		System.out.println("------------------------------------------\n\n");
		System.out.printf("$%.2f\n\n\n",money_rem);
		System.out.println("------------------------------------------\n\n");
		System.out.println("\t\tThank you!");
		
		
	}
}
