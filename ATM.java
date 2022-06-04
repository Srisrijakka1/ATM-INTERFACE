import java.util.*;
class ATM{
	public static void main(String[] args){
		int balance=10000;
		String userId="12345",password="12345";
		System.out.print("<<<<<<<<<<<<<<<<<<<<<<<<WELCOME TO ATM>>>>>>>>>>>>>>>>>>>>>>>>\nEnter User Id:");
		Scanner in=new Scanner(System.in);
		String id=in.next();
		if(id.equals(userId)){
			System.out.print("Enter User Password:");
			String pin=in.next();
			if(pin.equals(password)){
				while(true){
					System.out.println("ATM INTERFACE :\n 	1.Checking Current Balance\n 	2.Balance Withdraw \n 	3.Balance Deposite\n 	4.Exit\n");
					System.out.print("Enter Your Option: ");
					int n=in.nextInt();
					if(n==1){
						System.out.println("Your Current Account Balance is:"+balance);
					}
					else if(n==2){
						System.out.print("Please Enter valid Amount to Withdraw:");
						int amt=in.nextInt();
						if(amt<=balance){
							balance-=amt;
							System.out.println("Your Transation is Successful.\nPlease Collect Your amount in ATM");
							System.out.println("Your Current Account Balance is:"+balance);
						}
						else{
							System.out.println("Your Entered Amount is Greater than Your Current Balance.\nYour Transation is Failed.\n");
							
						}
					}
					else if(n==3){
						System.out.print("Please Enter valid Amount to Deposite:");
						int amt=in.nextInt();
						balance+=amt;
						System.out.println("Please Deposite Your amount in ATM");
						System.out.println("Your Deposition is Successful.\nNow Your Current Balance Becomes:"+balance);
					}
					else if(n==4){
						System.exit(0);
					}
					else{
						System.out.println("Please Enter correct Option.You entered Invalid Option.");
						System.exit(0);
					}	
				}
			}
			else{
				System.out.println("Invalid User ID.\nplease Try to recheck.\n");
			}
		}
		else{
			System.out.println("Invalid User ID.\nplease Try to recheck.\n");
		}
	}
}