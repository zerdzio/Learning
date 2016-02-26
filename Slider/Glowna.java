import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Glowna extends JFrame
{
	//int stC,kelwiny,stF;
	JSlider stopnie;
	JLabel wyniklabel,clabel,wynF,wynK;
	JPanel panel1; //,panelwyniki;
	public Glowna()
	{
		this.setSize(300, 75);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("Przelicznik Stopni");
		this.setVisible(true);
		//Panel
		panel1=new JPanel();
		panel1.setVisible(true);
		
		//Slider
		suwaklistener l1=new suwaklistener();
		stopnie=new JSlider(-273,1000,0);
		stopnie.setMinorTickSpacing(1);
		stopnie.setMajorTickSpacing(10);
		stopnie.setPaintTicks(false);
		stopnie.setPaintLabels(false);
		stopnie.setVisible(true);
		stopnie.setToolTipText("Klikaj na krañcach suwaka aby dok³adniej wybraæ");
			//stopnie.setSize(400, 400);
		stopnie.addChangeListener(l1);
		panel1.add(stopnie);
		
		//clabel
		clabel=new JLabel("U¿yj suwaka");
		clabel.setToolTipText("Klikaj na krañcach suwaka aby dok³adniej wybraæ");
		clabel.setSize(60,40);
		clabel.setVisible(true);
		panel1.add(clabel);
		
		//panelwyniki
		//panelwyniki=new JPanel();
		//panelwyniki.setVisible(true);
		
		//wynF
		wynF=new JLabel("Stopnie Fahrenheita=");
		wynF.setSize(60,40);
		wynF.setVisible(true);
		panel1.add(wynF);
		
		//wynK
		wynK=new JLabel("Kelwiny=");
		wynK.setSize(60,40);
		wynK.setVisible(true);
		panel1.add(wynK);
		
		//Ostatni config
		this.add(panel1);
		//this.add(panelwyniki);
		this.setResizable(false);
	}
	
	
	public static void main(String[]args)
	{
		Glowna okienko=new Glowna();
	}
	
	private class suwaklistener implements ChangeListener
	{

		
		public void stateChanged(ChangeEvent e) 
		{
			if(e.getSource()==stopnie)
			{
				String fixC=""+stopnie.getValue();
				clabel.setText(fixC);
				double wartoscC=stopnie.getValue(),wartoscF,wartoscK;
				wartoscF=(9*wartoscC)/5+32;
				wartoscK=wartoscC+273.15;
				wynF.setText("S Fahrenheita= "+(int)wartoscF);
				wynK.setText("Kelwiny= "+(int)wartoscK);
				
				
				
			}
			
		}
		
	}
	
	
}