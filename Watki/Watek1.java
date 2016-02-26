public class Watek1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<15;i++)
		{
			System.out.println("Watek 1 dzia³a");
			try
			{
				Thread.sleep(200);
			}
			catch(InterruptedException e)
			{
				System.out.println("Coœ posz³o nie tak w w¹tku nr1");
			}
		}
		
		
		
		
		System.out.println("Watek 1 konczy dzialanie");
	}
}