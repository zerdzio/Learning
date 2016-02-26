public class Watek2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<15;i++)
		{
			System.out.println("Watek 2 dzia³a");
			try
			{
				Thread.sleep(20);
			}
			catch(InterruptedException e)
			{
				System.out.println("Coœ posz³o nie tak w w¹tku nr2");
			}
		}
		
		
		
		
		System.out.println("Watek 2 konczy dzialanie");
	}
}