import java.util.Scanner;
public class Switchcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int num1,num2,num3;
    String cal;
    
    Scanner input =new Scanner(System.in);
    
    System.out.println("Enter First Number");
    num1 = input.nextInt();
    System.out.println("Enter second Number");
    num2 = input.nextInt();
    System.out.println("Operatoers");
    System.out.println("1.Addition");
    System.out.println("2.Subtraction");
    System.out.println("3.Multipication");
    System.out.println("4.Division");
    System.out.println("Enter your choice");
    cal=input.next();
    switch(cal)
    {
    case "1":
    	num3=num1+num2;
    	System.out.println(num3);
    	break;
    	
    case "2":
    	num3=num1-num2;
    	System.out.println(num3);
	break;
	
    case "3" :
    	num3=num1*num2;
    	System.out.println(num3);
	break;
	
    case "4":
    	num3=num1/num2;
    	System.out.println(num3);
	break;
	
	default:System.out.println("Invalid");
	break;
    }
    
	}

}
