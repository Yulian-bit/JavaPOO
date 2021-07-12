import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Button;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.List;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextPane;
import java.awt.TextArea;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JToggleButton;
import javax.swing.JDesktopPane;
import java.awt.TextField;
import javax.swing.JCheckBox;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.Box;
import javax.swing.JTabbedPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DispozitiveGUI {

	private JFrame frame;
	static Test t=new Test();
	String brands[]= {"Selecteaza brand","Apple","Samsung","Huawei","Google","Sonny","Honor","Nokia","BlackBerry","LG","Motorola",
						"Oppo","Alcatel","Xiaomi","Lenovo"};
	String colors[]= {"Selecteaza culoarea","Negru","Argintiu","Alb","Rosu","Albastru"};
	String tipecran[]= {"Selecteaza tipul de ecran","LCD","IPS","LED","OLED","AMOLED"};
	String tipbaterie[]= {"Selecteaza tipul bateriei","Li-Ion","Li-Po"};
	String conectivitate[]= {"Selecteaza conectivitatea","Wi-Fi","Bluetooth","Bluetooth/Wi-Fi"};
	String frecv[]= {"Selecteaza frecventa","<1Gh","1 - 1.5","1.5 - 2","2 - 2.5","3 - 3.2"};
	String ram[]= {"Selecteaza memoria Ram","<1GB","1 - 4Gb","4 - 6Gb","8- 12Gb"};
	String stocare[]= {"Selecteaza stocarea","<8Gb","8 - 16Gb","32 - 64Gb","64 - 128Gb","128 - 512Gb",">521Gb"};
	String capacitate[]= {"Selecteaza capacitatea bateriei", "<500mh","500 - 1000mh","1000 - 1500mh","1500 - 2000mh",
							"2000 - 2500mh","2500 - 3000mh","3000 - 3500mh","3500 - 4000mh","4500 - 5000mh",">5000mh"};
	String autonomie[]= {"Selecteaza autonomia","<24h","24 - 48h","48 -72h","73 - 96h",">96h"};
	
	String sisoper[] = {"Selecteaza ","Android ","Ios"};
	String tipincar[] = {"Selecteza","Magnetic" , "Wireless"};
	String sensori[] = {"Selecteaza ","60.2","64.3"};
	String[] activitate = {"Selecteaza","<10 activitati","10 - 20 activitati","20 - 30 activitati",">30 activitati"};
	String activ[] = {"Selecteaza", "", " "};
	
	private JTextField textField;
	private final JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	private JTextField textField_1;
	/**
	 * @wbp.nonvisual location=254,154
	 */
	
	/**
	 * Launch the application.
	 */
	
		
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DispozitiveGUI window = new DispozitiveGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public boolean validString(String str) {boolean v=true;
    str = str.toLowerCase();
    char[] charArray = str.toCharArray();
    for (int i = 0; i < charArray.length; i++) {
       char ch = charArray[i];
       if ((ch >= '0' && ch <= '9')) {
          
      	 v = false;
      	 
       }
       else if(!v && ch == '.')
       {
      	 v = false;
       }
       else if(!v)
       {
      	 v = true;
       }
    }
    return v;
	}

	public boolean checkPrice(String p,float a) {boolean t=false; 
		switch(p)
		{
		case "<500":
			if(a<=500)
				t=true;
			break;
			
		case "500 - 1000":
			if(a>=500 && a<=1000)
				t=true;
			break;
			
		case "1000 - 1500":
			if(a>=1000 && a<=1500)
				t=true;
			break;
			
		case "1500 - 2000":
			if(a>=1500 && a<=2000)
				t=true;
			break;
		
		case "2000 - 2500":
			if(a>=2000 && a<=2500)
				t=true;
			break;
			
		case ">2500":
			if(a>=2500)
				t=true;
			break;
		
			
	}
		return t;}
	public void extractNumbers(String s,int nr[])
    {
        String s1[]=new String[2];
        int j=0;
         Pattern p = Pattern.compile("\\d+");
         Matcher m = p.matcher(s);
         while(m.find()) {
             s1[j]=m.group();
             j++;
        }
      for(int i=0;i<j;i++)
             nr[i]=Integer.parseInt(s1[i]);

    }


    public boolean checkIndex1(String s)
    {boolean v=false;
        if(s.equals(brands[0]) || s.equals(colors[0]) || s.equals(tipecran[0])|| s.equals(tipbaterie[0]) || s.equals(conectivitate[0]) || s.equals(frecv[0]) ||s.equals(ram[0]) || s.equals(stocare[0]) || s.equals(capacitate[0]) || s.equals(autonomie[0]));
            v=true;
        return v;
    }

    public boolean checkItem(String b,String b1,String filtru[]) {boolean v=false;
        if(checkIndex1(b))
            return true;
        for(String s : filtru)
    {
        if((s.equals(b) ||   s.indexOf(b) != -1)&&s.equals(b1))
        {
            v=true;
            break;
        }
    }
    return v;
    }

    public boolean checkInterval(String b,float c,String interval[]) {boolean v=false;
    if(checkIndex1(b))
        return true;
        for(String s: interval)
        {
            if(s.equals(b)&&!s.equals(interval[0]))
                {
                int nr[]=new int[2];
                extractNumbers(s, nr);
                if(nr[0]>0&&nr[1]>0)
                    {if(nr[0]<=c&&nr[1]>=c)

                        v=true;break;
                    }
                else if(s.indexOf("<")!=-1)
                    {if(nr[0]>=c)
                        {v=true;break;}
                    }
                else if(s.indexOf(">")!=-1)
                {
                    if(nr[0]<=c)
                        v=true;break;
                }
            }
        }
        return v;

    }
	
	/**
	 * Create the application.
	 */
	public DispozitiveGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.BLACK);
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 1162, 644);

		
		
		
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(469, 151, 667, 408);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		frame.getContentPane().add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setForeground(Color.BLACK);
		scrollPane.setViewportView(textArea);
		textArea.setBackground(Color.WHITE);
		textArea.setFont(new Font("Consolas", Font.PLAIN, 13));
		textArea.setColumns(2);
		textArea.setEditable(false);
	
		
		JButton btnNewButton = new JButton("Select");
		btnNewButton.setFont(new Font("Microsoft Sans Serif", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(6, 570, 466, 20);
		
	
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("DISPOZITIVE");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel.setForeground(Color.MAGENTA);
		lblNewLabel.setBounds(147, 6, 273, 26);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setForeground(Color.GREEN);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setText("0.0");
		textField.setEditable(false);
		textField.setEnabled(false);
		textField.setVisible(false);
		textField.setBounds(6, 89, 71, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Introduceti pretul");
		chckbxNewCheckBox.setBackground(Color.LIGHT_GRAY);
		
		chckbxNewCheckBox.setBounds(6, 61, 132, 21);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Rezistenta apa");
		chckbxNewCheckBox_1.setBackground(Color.LIGHT_GRAY);
		chckbxNewCheckBox_1.setBounds(6, 33, 132, 20);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sunt Disponibile");
		lblNewLabel_2.setFont(new Font("Sitka Small", Font.PLAIN, 26));
		lblNewLabel_2.setForeground(Color.MAGENTA);
		lblNewLabel_2.setToolTipText("Sunt Disponibile");
		lblNewLabel_2.setBackground(Color.RED);
		lblNewLabel_2.setBounds(121, 105, 250, 50);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Guzanu\\Desktop\\ProjectDispozitibeMobile\\images.jpg"));
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(6, 155, 225, 217);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Guzanu\\Desktop\\ProjectDispozitibeMobile\\download.jpg"));
		lblNewLabel_4.setBounds(6, 383, 50, 50);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\Guzanu\\Desktop\\ProjectDispozitibeMobile\\download (1).jpg"));
		lblNewLabel_5.setBounds(66, 383, 50, 50);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setIcon(new ImageIcon("C:\\Users\\Guzanu\\Desktop\\ProjectDispozitibeMobile\\download (2).jpg"));
		lblNewLabel_6.setBounds(121, 383, 50, 50);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setIcon(new ImageIcon("C:\\Users\\Guzanu\\Desktop\\ProjectDispozitibeMobile\\download (3).jpg"));
		lblNewLabel_7.setBounds(181, 383, 50, 50);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setIcon(new ImageIcon("C:\\Users\\Guzanu\\Desktop\\ProjectDispozitibeMobile\\images (2).jpg"));
		lblNewLabel_8.setBounds(237, 151, 222, 221);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setIcon(new ImageIcon("C:\\Users\\Guzanu\\Desktop\\ProjectDispozitibeMobile\\8-2-ukraine-flag-free-png-image.png"));
		lblNewLabel_9.setBounds(248, 511, 200, 48);
		frame.getContentPane().add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\Guzanu\\Desktop\\ProjectDispozitibeMobile\\ro-flag.png"));
		lblNewLabel_10.setBounds(6, 509, 232, 50);
		frame.getContentPane().add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Made in ");
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
		lblNewLabel_11.setForeground(Color.MAGENTA);
		lblNewLabel_11.setBackground(Color.BLUE);
		lblNewLabel_11.setBounds(131, 450, 200, 50);
		frame.getContentPane().add(lblNewLabel_11);
		tabbedPane.setBounds(469, 10, 667, 130);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Filtre generale", null, panel, null);
		panel.setLayout(null);
		
		JComboBox comboBox_3 = new JComboBox(conectivitate);
		comboBox_3.setBounds(147, 15, 149, 20);
		panel.add(comboBox_3);
		
		JComboBox comboBox_6 = new JComboBox(tipecran);
		comboBox_6.setBounds(306, 46, 141, 20);
		panel.add(comboBox_6);
		
		JComboBox comboBox_4 = new JComboBox(colors);
		comboBox_4.setBounds(308, 77, 139, 20);
		panel.add(comboBox_4);
		
		JComboBox comboBox_2 = new JComboBox(brands);
		comboBox_2.setBounds(453, 15, 144, 21);
		panel.add(comboBox_2);
		comboBox_2.setBackground(Color.WHITE);
		
		JComboBox comboBox_8 = new JComboBox(ram);
		comboBox_8.setBounds(306, 15, 141, 20);
		panel.add(comboBox_8);
		
		JComboBox comboBox_10 = new JComboBox(capacitate);
		comboBox_10.setBounds(147, 46, 149, 20);
		panel.add(comboBox_10);
		
		
		
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(147, 77, 149, 20);
		panel.add(comboBox_1);
		comboBox_1.addItem("Selecteza pretul");
		comboBox_1.addItem("<500");
		comboBox_1.addItem("500 - 1000");
		comboBox_1.addItem("1000 - 1500");
		comboBox_1.addItem("1500 - 2000");
		comboBox_1.addItem("2000 - 2500");
		comboBox_1.addItem(">2500");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(chckbxNewCheckBox.isSelected())
				{	comboBox_1.setVisible(false);
					comboBox_1.setEnabled(false);
					textField.setVisible(true);
					textField.setEnabled(true);
					textField.setEditable(true);;
				}
				else
				{
					comboBox_1.setVisible(true);
					comboBox_1.setEnabled(true);
					textField.setVisible(false);
					textField.setEnabled(false);
					textField.setEditable(false);;
				}
			}
		});
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(453, 46, 144, 20);
		panel.add(comboBox);
		
		comboBox.addItem("Selecteaza");
		comboBox.addItem("Dispozitiv Mobil");
		
		
		comboBox.addItem("Telefon");
		comboBox.addItem("Tableta");
		
		
		comboBox.addItem("Smartwatch");
		comboBox.addItem("Accesorii Smartwatch");
		
		
		comboBox.addItem("Bratara Fitness");
		comboBox.addItem("Accesorii Bratara Fitness");
		
		JComboBox comboBox_11 = new JComboBox(autonomie);
		comboBox_11.setBounds(5, 77, 132, 20);
		panel.add(comboBox_11);
		
		JComboBox comboBox_9 = new JComboBox(stocare);
		comboBox_9.setBounds(453, 77, 144, 20);
		panel.add(comboBox_9);
		
		JComboBox comboBox_7 = new JComboBox(tipbaterie);
		comboBox_7.setBounds(5, 46, 132, 20);
		panel.add(comboBox_7);
		
		JComboBox comboBox_5 = new JComboBox(frecv);
		comboBox_5.setBounds(5, 15, 132, 20);
		panel.add(comboBox_5);
		comboBox_5.setBackground(Color.WHITE);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Filtre", null, panel_1, null);
		panel_1.setLayout(null);
		
		JComboBox comboBox_12 = new JComboBox(sisoper);
		comboBox_12.setBounds(10, 10, 136, 27);
		panel_1.add(comboBox_12);
		
		JComboBox comboBox_13 = new JComboBox(tipincar);
		comboBox_13.setBounds(10, 47, 136, 32);
		panel_1.add(comboBox_13);
		
		JComboBox comboBox_14 = new JComboBox(activitate);
		comboBox_14.setBounds(165, 10, 144, 27);
		panel_1.add(comboBox_14);
		
		JComboBox comboBox_15 = new JComboBox(activ);
		comboBox_15.setBounds(165, 47, 144, 32);
		panel_1.add(comboBox_15);
		
		JComboBox comboBox_16 = new JComboBox();
		comboBox_16.setBounds(319, 10, 160, 27);
		panel_1.add(comboBox_16);
		
		JButton btnNewButton_1 = new JButton("Reset\r\n");
		btnNewButton_1.setBounds(479, 570, 657, 20);
		frame.getContentPane().add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(6, 120, 71, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StringBuffer s = new StringBuffer("");
				if(comboBox.getSelectedItem().toString().equals("Dispozitiv Mobil"))
				
				{	textArea.setText(null); // Sterge tot textul din zona de text
					for(int i=0;i<t.dsp.length;i++) {
					{s.append(t.dsp[i].toString());
					s.append("\n\n");}
					}
					textArea.setText(s.toString());
					}
					
					
				else if(comboBox.getSelectedItem().toString().equals("Telefon"))
				{	textArea.setText(null);
					s.append(t.dm[0].toString());
					textArea.setText(s.toString());
				}
				
			
				else if(comboBox.getSelectedItem().toString().equals("Tableta"))
				{	textArea.setText(null);
					s.append(t.dm[1].toString());
					textArea.setText(s.toString());
				}
				
					
				else if(comboBox.getSelectedItem().toString().equals("Smartwatch"))
				{	textArea.setText(null);
					s.append(t.dm[2].toString());
					textArea.setText(s.toString());
				}
				
				
				else if(comboBox.getSelectedItem().toString().equals("Accesorii Smartwatch"))
				{	
					textArea.setText(null);
					s.append(t.asw1.toString());
					textArea.setText(s.toString());
				}
				
				else if(comboBox.getSelectedItem().toString().equals("Bratara Fitness"))
				{	
					textArea.setText(null);
					s.append(t.dm[3].toString());
					textArea.setText(s.toString());
				}
				
				else if(comboBox.getSelectedItem().toString().equals("Accesorii Bratara Fitness"))
				{	
					textArea.setText(null);
					s.append(t.abf1.toString());
					textArea.setText(s.toString());
				}
				
			}
		});
		
		
		btnNewButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {					
				int rezultate=0; 
				StringBuffer s=new StringBuffer();
				 String d=comboBox.getSelectedItem().toString();
				textArea.setText(null);
				if(chckbxNewCheckBox.isSelected())
					{
					float pret1,pret2;
					if(textField.getText().isBlank() || validString(textField.getText()))
						{if(textField_1.getText().isBlank() || validString(textField_1.getText()))
						{
							pret1=0.0f;pret2=0.0f;
						}
						else 
						{
							pret1=0.0f;pret2=Float.parseFloat(textField_1.getText());
						}}
				
					else if(textField_1.getText().isBlank() || validString(textField_1.getText()))
					{
						pret1=Float.parseFloat(textField.getText());pret2=0.0f;
					}					
			
					else 
					{	
						pret1=Float.parseFloat(textField.getText());
				    pret2=Float.parseFloat(textField_1.getText());}
				
						
				    
					switch(d)
				    {
				    case "Dispozitiv Mobil":
				    	for(DispozitivMobil i : t.dsp)
				    		if(i.getPret() >= pret1 && i.getPret() <= pret2)
				    			{s.append(i.toString()+"\n\n");
				    			rezultate++;
				    			}
				    		else if(pret2==0.0f && i.getPret() >= pret1)
				    		{
				    			s.append(i.toString()+"\n\n");
				    			rezultate++;
				    		}
				    		else if(pret1==0.0f && i.getPret() <= pret2)
				    		{
				    			s.append(i.toString()+"\n\n");
				    			rezultate++;
				    		}
				    	break;
				    
				    case "Telefon":
				    	for(Telefon i : t.tln)
				    		if(i.getPret() >= pret1 && i.getPret() <= pret2)
			    			{s.append(i.toString()+"\n\n");
			    			rezultate++;
			    			}
			    		else if(pret2==0.0f && i.getPret() >= pret1)
			    		{
			    			s.append(i.toString()+"\n\n");
			    			rezultate++;
			    		}
			    		else if(pret1==0.0f && i.getPret() <= pret2)
			    		{
			    			s.append(i.toString()+"\n\n");
			    			rezultate++;
			    		}
				    		
				    	break;
				 
				    case "Tableta":
				    	for(Tableta i : t.tbl)
				    		if(i.getPret() >= pret1 && i.getPret() <= pret2)
			    			{s.append(i.toString()+"\n\n");
			    			rezultate++;
			    			}
			    		else if(pret2==0.0f && i.getPret() >= pret1)
			    		{
			    			s.append(i.toString()+"\n\n");
			    			rezultate++;
			    		}
			    		else if(pret1==0.0f && i.getPret() <= pret2)
			    		{
			    			s.append(i.toString()+"\n\n");
			    			rezultate++;
			    		}
				    	break;
				    	
				    case "Smartwatch":
				    	for(SmartWatch i : t.sh)
				    		if(i.getPret() >= pret1 && i.getPret() <= pret2)
			    			{s.append(i.toString()+"\n\n");
			    			rezultate++;
			    			}
			    		else if(pret2==0.0f && i.getPret() > pret1)
			    		{
			    			s.append(i.toString()+"\n\n");
			    			rezultate++;
			    		}
			    		else if(pret1==0.0f && i.getPret() <= pret2)
			    		{
			    			s.append(i.toString()+"\n\n");
			    			rezultate++;
			    		}
				    	break;
			
				    case "Bratara Fitness":
				    	for(SmartWatch i : t.sh)
				    		if(i.getPret() >= pret1 && i.getPret() <= pret2)
			    			{s.append(i.toString()+"\n\n");
			    			rezultate++;
			    			}
			    		else if(pret2==0.0f && i.getPret() >= pret1)
			    		{
			    			s.append(i.toString()+"\n\n");
			    			rezultate++;
			    		}
			    		else if(pret1==0.0f && i.getPret() <= pret2)
			    		{
			    			s.append(i.toString()+"\n\n");
			    			rezultate++;
			    		}
				    	
				    	
				    	break;
				    }
					
				
				    	
				if(s==null || s.length()==0)
		    	{
		    		s.append("Nu s-a gasit nicun rezultat");
		    	}
			    }
			else
			
			{	
				switch(d)
			    {
			    case "Dispozitiv Mobil":
			    	for(DispozitivMobil i : t.dsp)
			    		if(checkPrice(comboBox_1.getSelectedItem().toString(),i.getPret()))
			    			{s.append(i.toString()+"\n\n");
			    			rezultate++;
			    			}
			    		break;
			  
			    case "Telefon":
			    	for(Telefon i : t.tln)
			    		if(checkPrice(comboBox_1.getSelectedItem().toString(),i.getPret()))
			    			{s.append(i.toString()+"\n\n");
			    			rezultate++;
			    			}
			    		break;
			    		
			    case "Tableta":
			    	for(Tableta i : t.tbl)
			    		if(checkPrice(comboBox_1.getSelectedItem().toString(),i.getPret()))
			    			{s.append(i.toString()+"\n\n");
			    			rezultate++;
			    			}
			    		break;
			    	
			    case "Smartwatch":
			    	for(SmartWatch i : t.sh)
			    		if(checkPrice(comboBox_1.getSelectedItem().toString(),i.getPret()))
			    			{s.append(i.toString()+"\n\n");
			    			rezultate++;
			    			}
			    	break;
			    	
			    case "Bratara Fitness":
			    	for(SmartWatch i : t.sh)
			    		if(checkPrice(comboBox_1.getSelectedItem().toString(),i.getPret()))
			    			{s.append(i.toString()+"\n\n");
			    			rezultate++;
			    			}
			    	break;						

			   }
				}
					
				switch(d)
				{
				case "Dispozitiv Mobil":
					if(s==null || s.length()==0)
					{for(DispozitivMobil i : t.dsp)
						if(checkItem(comboBox_2.getSelectedItem().toString(),i.getBrand(),brands))
							if(checkItem(comboBox_3.getSelectedItem().toString(),i.getConectivitate(),conectivitate))
								if(checkItem(comboBox_4.getSelectedItem().toString(),i.getCuloare(),colors))
									if(checkInterval(comboBox_5.getSelectedItem().toString(),i.getFrecventaProcesor(),frecv))
										if(checkItem(comboBox_6.getSelectedItem().toString(),i.getTipEcran(),tipecran))
											if(checkItem(comboBox_7.getSelectedItem().toString(),i.getTipBaterie(),tipbaterie))
												if(checkInterval(comboBox_8.getSelectedItem().toString(), i.getMemorieRam(),ram))
													if(checkInterval(comboBox_9.getSelectedItem().toString(), i.getstocare(),stocare))
														if(checkInterval(comboBox_10.getSelectedItem().toString(), i.getCapacitateBaterie(),capacitate))
															if(checkInterval(comboBox_11.getSelectedItem().toString(), i.getAutonomie(),autonomie))
																if(chckbxNewCheckBox_1.isSelected())
																	{if(i.getRezistentaApa())
																		{s.append(i.toString()+"\n\n");
																		rezultate++;}
																		}
																else {
																	s.append(i.toString()+"\n\n");rezultate++;
																}
						
						}
					else if(s!=null || s.length()>0)
					{for(DispozitivMobil i : t.dsp)
						if(s.indexOf(i.toString())!=-1)
							if(!checkItem(comboBox_2.getSelectedItem().toString(),i.getBrand(),brands))
								{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
							
							else if(!checkItem(comboBox_3.getSelectedItem().toString(),i.getConectivitate(),conectivitate))
								{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
							
							else if(!checkItem(comboBox_4.getSelectedItem().toString(),i.getCuloare(),colors))
								{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
							
							else if(!checkInterval(comboBox_5.getSelectedItem().toString(), i.getFrecventaProcesor(),frecv))
								{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
							
							else if(!checkItem(comboBox_6.getSelectedItem().toString(),i.getTipEcran(),tipecran))
								{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
							
							else if(!checkItem(comboBox_7.getSelectedItem().toString(),i.getTipBaterie(),tipbaterie))
								{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
							
							else if(!checkInterval(comboBox_8.getSelectedItem().toString(), i.getMemorieRam(),ram))
								{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
							
							else if(!checkInterval(comboBox_9.getSelectedItem().toString(), i.getstocare(),stocare))
								{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
							
							else if(!checkInterval(comboBox_10.getSelectedItem().toString(), i.getCapacitateBaterie(),capacitate))
								{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
							
							else if(!checkInterval(comboBox_11.getSelectedItem().toString(), i.getAutonomie(),autonomie))
								{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
							
							else if(chckbxNewCheckBox_1.isSelected())
								if(!i.getRezistentaApa())
									{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
							
					 }
					break;
					
				
				case "Telefon":
					if(s==null || s.length()==0)
					{for(Telefon i : t.tln)
						if(checkItem(comboBox_2.getSelectedItem().toString(),i.getBrand(),brands))
							if(checkItem(comboBox_3.getSelectedItem().toString(),i.getConectivitate(),conectivitate))
								if(checkItem(comboBox_4.getSelectedItem().toString(),i.getCuloare(),colors))
									if(checkInterval(comboBox_5.getSelectedItem().toString(),i.getFrecventaProcesor(),frecv))
										if(checkItem(comboBox_6.getSelectedItem().toString(),i.getTipEcran(),tipecran))
											if(checkItem(comboBox_7.getSelectedItem().toString(),i.getTipBaterie(),tipbaterie))
												if(checkInterval(comboBox_8.getSelectedItem().toString(), i.getMemorieRam(),ram))
													if(checkInterval(comboBox_9.getSelectedItem().toString(), i.getstocare(),stocare))
														if(checkInterval(comboBox_10.getSelectedItem().toString(), i.getCapacitateBaterie(),capacitate))
															if(checkInterval(comboBox_11.getSelectedItem().toString(), i.getAutonomie(),autonomie))
																if(chckbxNewCheckBox_1.isSelected())
																	{if(i.getRezistentaApa())
																		{s.append(i.toString()+"\n\n");
																		rezultate++;}
																		}
																else {
																	s.append(i.toString()+"\n\n");rezultate++;}
					}
					
					else if(s!=null || s.length()>0)
					{for(Telefon i : t.tln)
						if(s.indexOf(i.toString())!=-1)
							if(!checkItem(comboBox_2.getSelectedItem().toString(),i.getBrand(),brands))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkItem(comboBox_3.getSelectedItem().toString(),i.getConectivitate(),conectivitate))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkItem(comboBox_4.getSelectedItem().toString(),i.getCuloare(),colors))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_5.getSelectedItem().toString(), i.getFrecventaProcesor(),frecv))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkItem(comboBox_6.getSelectedItem().toString(),i.getTipEcran(),tipecran))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkItem(comboBox_7.getSelectedItem().toString(),i.getTipBaterie(),tipbaterie))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_8.getSelectedItem().toString(), i.getMemorieRam(),ram))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_9.getSelectedItem().toString(), i.getstocare(),stocare))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_10.getSelectedItem().toString(), i.getCapacitateBaterie(),capacitate))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_11.getSelectedItem().toString(), i.getAutonomie(),autonomie))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(chckbxNewCheckBox_1.isSelected())
							if(!i.getRezistentaApa())
								{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
					 }
					break;							
					
				
				case "Tableta":
					if(s==null || s.length()==0)
					{for(Tableta i : t.tbl)
						if(checkItem(comboBox_2.getSelectedItem().toString(),i.getBrand(),brands))
							if(checkItem(comboBox_3.getSelectedItem().toString(),i.getConectivitate(),conectivitate))
								if(checkItem(comboBox_4.getSelectedItem().toString(),i.getCuloare(),colors))
									if(checkInterval(comboBox_5.getSelectedItem().toString(),i.getFrecventaProcesor(),frecv))
										if(checkItem(comboBox_6.getSelectedItem().toString(),i.getTipEcran(),tipecran))
											if(checkItem(comboBox_7.getSelectedItem().toString(),i.getTipBaterie(),tipbaterie))
												if(checkInterval(comboBox_8.getSelectedItem().toString(), i.getMemorieRam(),ram))
													if(checkInterval(comboBox_9.getSelectedItem().toString(), i.getstocare(),stocare))
														if(checkInterval(comboBox_10.getSelectedItem().toString(), i.getCapacitateBaterie(),capacitate))
															if(checkInterval(comboBox_11.getSelectedItem().toString(), i.getAutonomie(),autonomie))
																if(chckbxNewCheckBox_1.isSelected())
																	{if(i.getRezistentaApa())
																		{s.append(i.toString()+"\n\n");
																		rezultate++;}
																		}
																else {
																	s.append(i.toString()+"\n\n");rezultate++;}
			     	}
					
					else if(s!=null || s.length()>0)
					{for(Tableta i : t.tbl)
						if(s.indexOf(i.toString())!=-1)
							if(!checkItem(comboBox_2.getSelectedItem().toString(),i.getBrand(),brands))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkItem(comboBox_3.getSelectedItem().toString(),i.getConectivitate(),conectivitate))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkItem(comboBox_4.getSelectedItem().toString(),i.getCuloare(),colors))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_5.getSelectedItem().toString(), i.getFrecventaProcesor(),frecv))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkItem(comboBox_6.getSelectedItem().toString(),i.getTipEcran(),tipecran))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkItem(comboBox_7.getSelectedItem().toString(),i.getTipBaterie(),tipbaterie))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_8.getSelectedItem().toString(), i.getMemorieRam(),ram))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_9.getSelectedItem().toString(), i.getstocare(),stocare))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_10.getSelectedItem().toString(), i.getCapacitateBaterie(),capacitate))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_11.getSelectedItem().toString(), i.getAutonomie(),autonomie))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(chckbxNewCheckBox_1.isSelected())
							if(!i.getRezistentaApa())
								{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
					 }
					break;		
					
				
				case "Smartwatch":
					if(s==null || s.length()==0)
						{for(SmartWatch i : t.sh)
							if(checkItem(comboBox_2.getSelectedItem().toString(),i.getBrand(),brands))
								if(checkItem(comboBox_3.getSelectedItem().toString(),i.getConectivitate(),conectivitate))
									if(checkItem(comboBox_4.getSelectedItem().toString(),i.getCuloare(),colors))
										if(checkInterval(comboBox_5.getSelectedItem().toString(),i.getFrecventaProcesor(),frecv))
											if(checkItem(comboBox_6.getSelectedItem().toString(),i.getTipEcran(),tipecran))
												if(checkItem(comboBox_7.getSelectedItem().toString(),i.getTipBaterie(),tipbaterie))
													if(checkInterval(comboBox_8.getSelectedItem().toString(), i.getMemorieRam(),ram))
														if(checkInterval(comboBox_9.getSelectedItem().toString(), i.getstocare(),stocare))
															if(checkInterval(comboBox_10.getSelectedItem().toString(), i.getCapacitateBaterie(),capacitate))
																if(checkInterval(comboBox_11.getSelectedItem().toString(), i.getAutonomie(),autonomie))
																	if(chckbxNewCheckBox_1.isSelected())
																		{if(i.getRezistentaApa())
																			{s.append(i.toString()+"\n\n");
																			rezultate++;}
																			}
																	else {
																		s.append(i.toString()+"\n\n");rezultate++;}}
					
					else if(s!=null || s.length()>0)
					  {for(SmartWatch i : t.sh)
						if(s.indexOf(i.toString())>-1)
							if(!checkItem(comboBox_2.getSelectedItem().toString(),i.getBrand(),brands))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkItem(comboBox_3.getSelectedItem().toString(),i.getConectivitate(),conectivitate))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkItem(comboBox_4.getSelectedItem().toString(),i.getCuloare(),colors))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_5.getSelectedItem().toString(), i.getFrecventaProcesor(),frecv))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkItem(comboBox_6.getSelectedItem().toString(),i.getTipEcran(),tipecran))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkItem(comboBox_7.getSelectedItem().toString(),i.getTipBaterie(),tipbaterie))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_8.getSelectedItem().toString(), i.getMemorieRam(),ram))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_9.getSelectedItem().toString(), i.getstocare(),stocare))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_10.getSelectedItem().toString(), i.getCapacitateBaterie(),capacitate))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_11.getSelectedItem().toString(), i.getAutonomie(),autonomie))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(chckbxNewCheckBox_1.isSelected())
							if(!i.getRezistentaApa())
								{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
					  }
					  break;
				
				case "Bratara Fitness":
					if(s==null || s.length()==0)
						{for(BrataFitness i : t.bs)
							if(checkItem(comboBox_2.getSelectedItem().toString(),i.getBrand(),brands))
								if(checkItem(comboBox_3.getSelectedItem().toString(),i.getConectivitate(),conectivitate))
									if(checkItem(comboBox_4.getSelectedItem().toString(),i.getCuloare(),colors))
										if(checkInterval(comboBox_5.getSelectedItem().toString(),i.getFrecventaProcesor(),frecv))
											if(checkItem(comboBox_6.getSelectedItem().toString(),i.getTipEcran(),tipecran))
												if(checkItem(comboBox_7.getSelectedItem().toString(),i.getTipBaterie(),tipbaterie))
													if(checkInterval(comboBox_8.getSelectedItem().toString(), i.getMemorieRam(),ram))
														if(checkInterval(comboBox_9.getSelectedItem().toString(), i.getstocare(),stocare))
															if(checkInterval(comboBox_10.getSelectedItem().toString(), i.getCapacitateBaterie(),capacitate))
																if(checkInterval(comboBox_11.getSelectedItem().toString(), i.getAutonomie(),autonomie))
																	if(chckbxNewCheckBox_1.isSelected())
																		{if(i.getRezistentaApa())
																			{s.append(i.toString()+"\n\n");
																			rezultate++;}
																			}
																	else {
																		s.append(i.toString()+"\n\n");rezultate++;}}
					
					else if(s!=null || s.length()>0)
					  {for(BrataFitness i : t.bs)
						if(s.indexOf(i.toString())>-1)
							if(!checkItem(comboBox_2.getSelectedItem().toString(),i.getBrand(),brands))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkItem(comboBox_3.getSelectedItem().toString(),i.getConectivitate(),conectivitate))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkItem(comboBox_4.getSelectedItem().toString(),i.getCuloare(),colors))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_5.getSelectedItem().toString(), i.getFrecventaProcesor(),frecv))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkItem(comboBox_6.getSelectedItem().toString(),i.getTipEcran(),tipecran))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkItem(comboBox_7.getSelectedItem().toString(),i.getTipBaterie(),tipbaterie))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_8.getSelectedItem().toString(), i.getMemorieRam(),ram))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_9.getSelectedItem().toString(), i.getstocare(),stocare))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_10.getSelectedItem().toString(), i.getCapacitateBaterie(),capacitate))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(!checkInterval(comboBox_11.getSelectedItem().toString(), i.getAutonomie(),autonomie))
							{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
						
						else if(chckbxNewCheckBox_1.isSelected())
							if(!i.getRezistentaApa())
								{s.delete(s.indexOf(i.toString()), s.indexOf(i.toString())+i.toString().length()+2);rezultate--;}
					  }
					  break;
				}
		
				
				if(validString(textField.getText()) || validString(textField_1.getText()))
					{	
						textArea.setText(null);
						textArea.setText("Introduceti doar numere");
					}
				else if(rezultate==1)
					textArea.setText("S-a gasit "+rezultate+" rezultat:\n\n"+s.toString());
				else if(rezultate>1)
					textArea.setText("S-au gasit "+rezultate+" rezultate:\n\n"+s.toString());
				else
					textArea.setText("Nu s-a gasit niciun rezultat.");
			
			
				}
			
			
			
		
			
			});//Sfarsitul Ascultatorului
		
		
			
		}
		
		
		

	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}
