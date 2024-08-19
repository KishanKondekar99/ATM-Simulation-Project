package com.a;
	
	import java.util.Scanner ;
	public class Atm {

		public static void main(String[] args) {
			int withdraw , balance = 55000; 
			System .out .println("Kishan ATM Machine ");
			System .out .println();
			Scanner sc = new Scanner(System .in);

			System.out .println("Enter your PIN"); 

			int PIN = sc.nextInt();

			if (PIN == 143) {
				System.out.println("PIN is correct ");
			}

			else {

				System.out.println("InCorrect PIN plz Try Again .....");

				System .exit(0);
			}

			int n  =  4 ;
			for (int i = 1; i <= n ; i++) {
				System.out.println("	"); 
				System .out .println("1.cash Withdraw");
				System .out .println("2.cash Deposit"); 
				System .out .println("3.Mini Statment");
				System .out .println("4.Balance Inquiry");
				System .out .println("Enter choice ");

				int choice = sc.nextInt();
				
				switch (choice) {
				////
				case 1:
					System. out.println("Enter amount for withdraw "); 
					withdraw = sc.nextInt();

					if (balance >= withdraw) {
						balance = balance - withdraw ;
						System.out.println("Collect your cash: " + withdraw );
					}
					else { 
						System.out.println("Insufficent Balance");
					}
					break ; 

					//*//

				case 2:
					System.out.println("Enter amount for deposite "); 
					int Deposit = sc.nextInt(); 
					balance = balance + Deposit; 
					System.out.println(Deposit + "is deposit to your account:");
					break;
					//// 

				case 3:
					System.out.println(" Statement "); 
					System.out.println("Name=ALICE	XXXXX "); 
					System.out.println("Mobile  no=XXXXXXXX ");
					System.out.println("Email=XXXXXXX@gmail .com");
					System.out.println("Balance " + balance );
					////

				case 4:System.out.println("	"); 
					System.out.println("Total balance " + balance); 
					
				}
				}
					System.out.println("	"); 
					System.out.println("************* Thank you ************* ");
					System.out.println(" Visit again");
				}
			}


