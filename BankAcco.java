import java.util.Scanner;

class InsufficientBalance extends Exception
{
	
	
	public InsufficientBalance()
	{
		super("!!! Opps.. You have insufficient Balance In Account !!! ");
	}
}


class Exceptiontest{
		
		public void acc()
		{
			int balance;
			Scanner nt = new Scanner(System.in);
			
			System.out.println("CREATE ACCOUNT");
			System.out.println("Enter Your Name :");
			String name = nt.nextLine();
			System.out.println("Welcome To Our Bank "+name);
			
			System.out.println("Add Amount to yout account: ");
			System.out.println("Enter Amount To Add: ");
			balance = nt.nextInt();
		
			System.out.println("Enter Amount To Withdraw :");
			int withdraw = nt.nextInt();
			
			if	(balance<withdraw){
				try 
				{
					throw new InsufficientBalance();
				} 
				
				catch (InsufficientBalance e)
					{
						System.out.println(e);
						
			        }
			}
				else 
				{
					int remain = balance - withdraw;
					System.out.println("!!! Transaction Successful !!!\n Remain Balance :"+remain);
				
		        
			}
		}
	
}
		
public class BankAcco {
		public static void main(String[] args)
		{
			Exceptiontest obj = new Exceptiontest();
			obj.acc();
		}
	}

			