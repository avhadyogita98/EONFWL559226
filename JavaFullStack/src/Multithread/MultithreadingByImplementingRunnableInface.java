package thread;

class A1 extends Thread
{
	public void run()
	{
		System.out.println("Thread A");
		for (int i=1;i<=10;i++)
		{
			System.out.println("value of i thread A"+i);
		}
		System.out.println("exit A");
		
	}
}
class B1 extends Thread
{
	public void run()
	{
		System.out.println("Thread B started");
		for (int j=1; j<=10; j++)
		{
			System.out.println("value of j thread B"+j);
			
		}
		System.out.println("exit B");
	}
}
 class C1 extends Thread
 {
	 public void run()
	 {
		 System.out.println("Thread C started");
		 for (int K=1; K<=10; K++)
		 {
			 System.out.println("value of K thread C "+K);
		 }
		 System.out.println("exit C");
	 }
 }
 
 	public class MultithreadingByImplementingRunnableInface
 	{

 		public static void main(String[] args) 
 		
 		{
			A1 obj1 = new A1(); 
			B1 obj2 = new B1(); 
			C1 obj3 = new C1(); 
			
			Thread t1 = new Thread(obj1);
			Thread t2 = new Thread(obj2);
			Thread t3 = new Thread(obj3);
			
			
			t1.start();  //here we call the thread
			t2.start();
			t3.start();
	}

}
