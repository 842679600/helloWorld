package 多线程;

/*
需求:储户，两个，每个都到银行存钱每次存100，，共存三次。
*/

class Bank
{
	private int sum;
//	private Object obj = new Object();
	public synchronized void add(int num)//同步函数
	{
//		synchronized(obj)
//		{
			sum = sum + num;
	//			-->
			try{Thread.sleep(10);}catch(InterruptedException e){}
			System.out.println("sum="+sum);
//		}
	}
}


class Cus implements Runnable
{
	private Bank b = new Bank();
	public void run()
	{
		for(int x=0; x<3; x++)
		{
			b.add(100);
		}
	}
}


class BankDemo 
{
	public static void main(String[] args) 
	{
		Cus c1 = new Cus();
		Cus c2 = new Cus();
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
	}
}
