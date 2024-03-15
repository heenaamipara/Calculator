import java.util.Scanner;
public class Operatiors_cal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
    
    Scanner sc = new Scanner(System.in);
    int option;
    option = 0;
    while (option !=5) {
    System.out.println("Enter First Number:");
    int num1=sc.nextInt();
    
    System.out.println("Enter Second Number:");
    int num2=sc.nextInt();
    Clc c1 =new Clc();     //creating an object5
    
    System.out.println("Arithmatic operators");
    System.out.println("1. Sum");
    System.out.println("2. Sub");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    System.out.println("5.Quit");
    System.out.println("Enter your choice");
    option=sc.nextInt();
    
  
    switch(option)
    {
    case 1:System.out.println("Sum of given numbers is :" + c1.sum(num1, num2));
    break;
    
    case 2:System.out.println("Sub of given Numbers is:" + c1.sub(num1, num2));
    break;
    
    case 3:System.out.println("Multiplication of given Numbers is :" + c1.Mul(num1, num2));
    break;
    
    case 4:System.out.println("Division of given Numbers is" + c1.Div(num1, num2));
    break;
    
    default: System.out.println("Invalid Operator");
    break;
   
    }
}
	}
}
	

