// Demonstrate a program for method overloading. Consider the different type of transaction mode used for transferring money(debit card, //credit card, netbanking ).
class transaction
{
	void transfer(String CreditcardNumber, int amount)
	{
		System.out.println("Tranferred money "+amount+" using Credit card "+CreditcardNumber);
	}
	void transfer(String DebitCardNumber, int pin, int amount)
	{
		System.out.println("Tranferred money "+amount+" using Debit card "+DebitCardNumber);
	}
	void transfer(String username, String password, String bankname, int amount)
	{
		System.out.println("Transferred money "+amount+" from bank "+bankname+" by user "+username);
	}
}
class MethodOverloading
{
	public static void main(String args[])
	{
		transaction t = new transaction();
		t.transfer("1234-5678-1234-5678",3000);
		t.transfer("5678-1234-5678-1234",1234,3000);
		t.transfer("tarun@1234","password@1234","ABC Bank",4000);
	}
}
