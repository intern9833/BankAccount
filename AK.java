package test1;
 import java.util.Scanner;
	class AmountInsufficient extends Exception //User defined exception created
	{
		 public AmountInsufficient()
		{
			super("Insufficient Amount in Account");//Called the parent class
		}
	}
	class BNK{
			
			public void operation()
			{
				int balance,min_bal=100;
				Scanner s = new Scanner(System.in);				
				System.out.println("Acoount opening:");
				System.out.println("Enter Your Name :");
				String name = s.nextLine();
				System.out.println("Add Amount to be deposited: ");
				balance = s.nextInt();
				System.out.println("Enter Amount to be withdrawn:");
				int withdraw = s.nextInt();
				
				if	(min_bal<withdraw){ //Sufficient balance is to be checked before withdrawal
					try 
					{
						throw new AmountInsufficient(); //Exception thrown
					} 
					
					catch (AmountInsufficient e) //any generated exception is catched 
						{
							System.out.println(e);						
				        }
				}
					else 
					{
						int current_balance = balance - withdraw;
						System.out.println("Success! \n Current balance :"+current_balance);  
				}
			}
		
	}
			
	public class bank{
		public static void main(String args[])
			{
				BNK obj = new BNK();
				obj.operation();// calling method
			}
		}
