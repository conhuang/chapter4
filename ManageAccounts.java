// ****************************************************************
//   ManageAccounts.java
//
//   Use Account class to create and manage Sally and Joe's 
//   bank accounts       
// ****************************************************************

public class ManageAccounts
{
    public static void main(String[] args)
    {
        System.out.print("\f");
        Account acct1, acct2;
        acct1 = new Account(1000, "Sally", 1111); //create account1 for Sally with $1000

        acct2 = new Account(500, "Joe", 1234); //create account2 for Joe with $500

        acct2.deposit(100);//deposit $100 to Joe's account

        System.out.printf("Joe's balance: $%.2f",acct2.getBalance());
        System.out.println();//print Joe's new balance (use getBalance())

        acct2.withdraw(1000);//withdraw $1000 from Joeís account

        acct1.withdraw(50);//withdraw $50 from Sally's account

        System.out.printf("Sally's balance: $%.2f",acct1.getBalance());//print Sally's new balance (use getBalance())
        System.out.println();
        acct1.chargeFee();
        System.out.printf ("\nService fee charged. Sally's balance: $%.2f",
                            acct1.getBalance());
                     
        acct2.chargeFee();
        System.out.printf ("\n\nService fee charged. Joe's balance: $%.2f", 
                            acct2.getBalance());
         //charge fees to both accounts

        acct2.changeName("Joseph");//change the name on Joe's account to Joseph

        System.out.println ("\n\n"+acct1);
        System.out.println ("\n"+acct2);

                //print summary for both accounts

    }
}
