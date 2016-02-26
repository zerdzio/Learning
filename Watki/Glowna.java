public class Glowna
{
	public static void main(String[]args)
	{
		Runnable w1=new Watek1();
		Runnable w2=new Watek2();
		new Thread(w1).start();
		new Thread(w2).start(); //ZAWSZE URUCHAMIA SIE ZA POM .start();
	}
}