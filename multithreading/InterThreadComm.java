package multithreading;

class Customer{ 
	private int amount = 10000; 
	synchronized void withdraw(int amount) 
	{
	 System.out.println("going to withdraw Rs. "+amount); 
	if(this.amount<amount) 
	System.out.println("Less Balance.Waiting for deposit... ");
			try { wait(); }
		 catch (InterruptedException e) {
			 e.printStackTrace(); }
			this.amount -=amount;
			System.out.println("withdraw completes");
	}
			
			synchronized void deposit (int amount) 
			{
			System.out.println("going to deposit Rs. "+amount);
			this.amount+=amount;
			System.out.println("Deposit completes.Balance : Rs. "+this.amount);
			notify();
			}
}
			public class InterThreadComm {
				
			
	public static void main(String[] args) {
		Customer c = new Customer();
		new Thread("Raj") 
		{
			public void run() {c.withdraw(15000);}
		}.start();
		new Thread("Riya") 
		{
			public void run() {c.deposit(10000);}
		}.start();
	}

}
