import java.util.Scanner;

public class Calculator {
    private int one;
    private int two;
    private String operator;

    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
        System.out.println("Input the first number: ");
        one = scanCalc.nextInt();
	System.out.println("Input the operator: ");
	operator= scanCalc.nextLine();
        System.out.println("Input the second number: ");
        two = scanCalc.nextInt();
	
	switch(operator){
	case "+":
		add(one,two);
		System.out.println(add(one,two));
		break;
	case "-":
		sub(one,two);
		System.out.println(sub(one,two));
		break;
	case "*":
		mul(one,two);
		System.out.println(mul(one,two));
		break;
	case "/":
		div(one,two);
		System.out.println(div(one,two));
		break;


       } 
    }

    public String add(int one,int two) {
        int add=one+two;
        return one+"+"+two+"="+add;
    }

    public String sub(int one, int two) {
        int sub=one-two;
        return one+"-"+two+"="+sub;
    }

    public String mul(int one,int two) {
        int mul=one*two;
        return one+"x"+two+"="+mul;
    }

    public String div(int one,int two) { 
        return one+"/"+two+"="+(one/two);
       
    }
}