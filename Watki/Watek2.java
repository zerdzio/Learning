public class Watek2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<15;i++)
		{
			System.out.println("Watek 2 dzia�a");
			try
			{
				Thread.sleep(20);
			}
			catch(InterruptedException e)
			{
				System.out.println("Co� posz�o nie tak w w�tku nr2");
			}
		}
		
		
		
		
		System.out.println("Watek 2 konczy dzialanie");
	}
}