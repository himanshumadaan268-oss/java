import java.util.Scanner;
class A{
	public static void main(String args[]){
		int bal=10000;
		Scanner sc=new Scanner(System.in);
		int ch;
	    
	    System.out.println("-----ATM MENU-----"+"\n1.CHECK BALANCE"+"\n2.DEPOSIT MONEY"+"\n3.withdraw money"+"\n4.EXIT");
		ch=sc.nextInt();
		switch(ch){
		case (1):
			System.out.println("your balance is:"+bal);
			break;
			
		case(2):
			int dep;
			System.out.println("enter deposit amount:");
			dep=sc.nextInt();
			if(dep>0){
			
			bal=bal+dep;
			System.out.println("your balance is:"+bal);
		}
		else{
			System.out.println("you entered invalid amount");

		}

			break;
		case(3):
			int with;
			System.out.println("enter withdrawl amount:");
			with=sc.nextInt();			
			if(with<=bal){
			bal=bal-with;
			System.out.println("your balance is:"+bal);}
			else{
				System.out.println("insufficient balance");

			}
			break;

		case(4):
			System.out.println("thank you for using our atm");
			break;
	
	    default:
			System.out.println("invalid choice");
			break;
			






		}

	}
}