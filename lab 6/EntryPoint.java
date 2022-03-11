import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
    	Scanner scan = new Scanner (System.in);
		System.out.println("Which service would you like to use?" + '\n' + "[1]: Basic week visualizer" + '\n' + "[2]: Advanced week visualizer" + '\n' + "[3]: Basic calculator" + '\n' + "[4]: Employee repertoire");
        int x = scan.nextInt();
        switch (x){
            case 1:
                BasicWeek basic = new BasicWeek();
                basic.printDays();
                break;
            case 2:
                AdvancedWeek adv = new AdvancedWeek();
                adv.printDays2();
            case 3:
                Calculator calc = new Calculator();
                calc
            case 4: 
                Employee emp = new Employee();
                
        }
 		
    }
}