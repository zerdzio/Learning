import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Glowny extends JFrame
{
	double liczba1,liczba2,wyn;
	JTextField pole1,pole2;
	JLabel wynik; //gotowe
	JRadioButton pdodawanie,podejmowanie,pmnozenie,pdzielenie; //gotowe
	JPanel opcje,panelwynik,panelradio,tekstpanel;//gotowe
	JButton oblicz;//prawie gotowe
	public Glowny()
	{
		this.setTitle("Prosty Kalkulator");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(400, 225);
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
		//panel z radio buttonami
		panelradio=new JPanel();
		panelradio.setVisible(true);
		Border ramka3=BorderFactory.createTitledBorder("Wybierz");
		panelradio.setBorder(ramka3);
		//panel z tekstami
		tekstpanel=new JPanel();
		tekstpanel.setVisible(true);
		Border ramka4=BorderFactory.createTitledBorder("Wprowadz");
		tekstpanel.setBorder(ramka4);
		
		
		//radio button dodawanie
		pdodawanie=new JRadioButton("Dodawanie");
		pdodawanie.setVisible(true);
		pdodawanie.setSize(60,40);
		panelradio.add(pdodawanie);
		//radio button dodawanie
		podejmowanie=new JRadioButton("Odejmowanie");
		podejmowanie.setVisible(true);
		podejmowanie.setSize(60,40);
		panelradio.add(podejmowanie);
		//radio button mnozenie
		pmnozenie=new JRadioButton("Mno¿enie");
		pmnozenie.setVisible(true);
		pmnozenie.setSize(60,40);
		panelradio.add(pmnozenie);
		//radio button dzielenie
		pdzielenie=new JRadioButton("Dzielenie");
		pdzielenie.setVisible(true);
		pdzielenie.setSize(60,40);
		panelradio.add(pdzielenie);
		//konfiguracja zeby tylko jeden byl zaznaczony
		ButtonGroup dzialania=new ButtonGroup();
		dzialania.add(pdodawanie);
		dzialania.add(pdzielenie);
		dzialania.add(pmnozenie);
		dzialania.add(podejmowanie);
		pdodawanie.setSelected(true);
		
		//Pole tekstowe nr1
		pole1=new JTextField("",5);
		pole1.setToolTipText("Tu wpisz liczbê nr1");
		pole1.setVisible(true);
		tekstpanel.add(pole1);
		
		//Pole tekstowe nr1
		pole2=new JTextField("",5);
		pole2.setToolTipText("Tu wpisz liczbê nr2");
		pole2.setVisible(true);
		tekstpanel.add(pole2);
		
		
		//panel opcji
		opcje=new JPanel();
		opcje.setVisible(true);
		
		//panel wynikow
		panelwynik=new JPanel();
		panelwynik.setVisible(true);
		
		//label wynik
		wynik=new JLabel("--Wynik--");
		wynik.setVisible(true);
		wynik.setSize(60,40);
		panelwynik.add(wynik);
		//Ramki
		Border ramka = BorderFactory.createTitledBorder("Prosty Kalkulator by Maciej R");
		opcje.setBorder(ramka);
		opcje.setToolTipText("Prosty Kalkulator napisany w Javie przez Macieja R");
		Border ramka2 = BorderFactory.createTitledBorder("Wynik");
		panelwynik.setBorder(ramka2);

		//przycisk
		oblicz = new JButton("Oblicz");
		oblicz.setVisible(true);
		oblicz.setToolTipText("Upewnij siê ¿e wprowadzi³eœ liczby");
		klik k1=new klik();
		oblicz.addActionListener(k1);
		oblicz.setSize(60,40);
		opcje.add(oblicz);
		
		//ostatnie ustawienia
		opcje.add(tekstpanel);
		opcje.add(panelradio);
		opcje.add(panelwynik);
		
		this.add(opcje);
		this.setResizable(false);
		
		/*opcje.add(tekstpanel);
		opcje.add(panelwynik);
		opcje.add(panelradio);*/
		
		
	}
	public static void main(String[]args)
	{
		Glowny okno=new Glowny();
	}
	private class klik implements ActionListener
	{

		
		public void actionPerformed(ActionEvent a) 
		{
			if(a.getSource()==oblicz)
			{
				try
				{
					String wynfix;
					liczba1=Double.parseDouble(pole1.getText());
					liczba2=Double.parseDouble(pole2.getText());
					
					
					if(pdodawanie.isSelected())
					{
						wyn=liczba1+liczba2;
						wynfix="   "+wyn+"   ";
						wynik.setText(wynfix);
					}
					else if(podejmowanie.isSelected())
					{
						wyn=liczba1-liczba2;
						wynfix="   "+wyn+"   ";
						wynik.setText(wynfix);
					}
					else if(pmnozenie.isSelected())
					{
						wyn=liczba1*liczba2;
						wynfix="   "+wyn+"   ";
						wynik.setText(wynfix);
					}
					else if(pdzielenie.isSelected())
					{
						if(liczba2==0)
						{
							wynik.setText("   B³¹d   ");
						}
						else
						{
							wyn=liczba1/liczba2;
							wynfix="   "+wyn+"   ";
							wynik.setText(wynfix);
						}
					}
				}
					
				
				catch(NumberFormatException e)
				{
					wynik.setText("   B³¹d   ");
				}
			}
			
		}
		
	}
}