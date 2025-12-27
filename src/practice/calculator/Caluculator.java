package practice.calculator;
import java.util.*;
class Caluculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number..");
		int num1 = sc.nextInt();
		System.out.println("Enter the Second number..");
		int num2 = sc.nextInt();
	    System.out.println("Enter the Any Operatoor [+,-,*,/]");
	    char operator = sc.next().charAt(0);
	    sc.close();
	   // caluculatorOperation(num1,num2,operator);
	
	 // }
	/*static  void caluculatorOperation(int x,int y,char operator) {
		
		  switch(operator) {
		
	      case '+':
		       int  result = x+y;
		        System.out.println(num1+" + "+num2+"="+result);
		          break;
		  case '-':
			  int  result1 = x-y;
				System.out.println("num1 - num2:"+result1);
				  break;
			        
		  case '*':
		          int  result2 = x*y;
		     		System.out.println("num1 * num2:"+result2);
					 break;
						        
		  case '/':
				 int  result3 = x/y;
				System.out.println("num1 / num2:"+result3);
				  break;
			default:
				System.out.println("cant match the operator");
				break;		  		  
	     }
	}*/
	switch(operator) {
	
    case '+':
	       int  result = num1+num2;
	        System.out.println(num1+" + "+num2+" = "+result);
	          break;
	  case '-':
		  int  result1 = num1-num2;
			System.out.println(num1+" - "+num2+" = "+result1);
			  break;
		        
	  case '*':
	          int  result2 = num1*num2;
	     		System.out.println(num1+" * "+num2+" = "+result2);
				 break;
					        
	  case '/':
			 int  result3 = num1/num2;
			System.out.println(num1+" / "+num2+" = "+result3);
			  break;
		default:
			System.out.println("cant match the operator");
			break;		  		  
   }
	}
	    }
	